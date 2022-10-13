create procedure if not exists validar_colegiado(in dni_colegiado varchar(9))
begin
	declare last_id varchar(9);
    declare new_id varchar(9);
    declare temp integer;
    
    select c.numeroColegiado into last_id
		from Colegiado c
		where year(curdate()) = substring(c.numeroColegiado, 1, 4)
		order by c.numeroColegiado desc limit 1;

	if isnull(last_id) then
		set new_id := concat(year(curdate()), "-0000");
	else
		set temp := cast(substring(last_id, 6, 9) as unsigned) + 1;
		set new_id := concat(substring(last_id, 1, 4), '-', lpad(temp, 4, '0'));
    end if;
    
    update Colegiado set state='VALIDATED', numeroColegiado=new_id
    where dni = dni_colegiado and state='PENDING';
end