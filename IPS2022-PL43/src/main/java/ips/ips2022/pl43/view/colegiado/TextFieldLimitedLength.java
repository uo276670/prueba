package ips.ips2022.pl43.view.colegiado;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;
import javax.swing.text.Document;

public class TextFieldLimitedLength extends JTextField {
	private static final long serialVersionUID = 2983348761081086067L;

	public TextFieldLimitedLength(int limit) {
		limitCharacters(limit);
	}

	public TextFieldLimitedLength(String text, int limit) {
		super(text);
		limitCharacters(limit);
	}

	public TextFieldLimitedLength(int columns, int limit) {
		super(columns);
		limitCharacters(limit);
	}

	public TextFieldLimitedLength(String text, int columns, int limit) {
		super(text, columns);
		limitCharacters(limit);
	}

	public TextFieldLimitedLength(Document doc, String text, int columns, int limit) {
		super(doc, text, columns);
		limitCharacters(limit);
	}
	
	private void limitCharacters(int limit) {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (getText().length() >= limit) {
					e.consume();
				}
			}
		});
	}

}
