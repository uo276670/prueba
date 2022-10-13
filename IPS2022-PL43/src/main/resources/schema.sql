drop table Colegiado;

create table Colegiado (
	colegiado_pk int primary key not null auto_increment,
	numeroColegiado varchar(9),
    dni varchar(9) not null unique,
    name varchar(20) not null,
    surname varchar(30) not null,
    city varchar(15) not null,
    tfno varchar(9) not null,
    degree varchar(30) not null,
    center varchar(30) not null,
    year int not null,
    accountNumber varchar(30) not null,
    dateSolicitud date not null,
    state varchar(10) not null
);

create table Curso (
	curso_pk varchar(30) primary key,
	titulo varchar(30),
	numeroPlazas int not null,
	precioColegiado int not null,
    precioPrecolegiado int not null,
    precioOtros int not null,
    fechaInicio date not null,
    fechaFin date not null,
    estado varchar(10) not null
);

