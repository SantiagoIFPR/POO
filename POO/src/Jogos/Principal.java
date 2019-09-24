package Jogos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import principal.TelaEstado;

public class Principal extends JFrame implements ActionListener {

	private JMenuBar jmb = new JMenuBar();

	private JMenu Jogos = new JMenu("Jogos");
	private JMenu Utilitários = new JMenu("Utilitários");
	private JMenu ajuda = new JMenu("ajuda");

	private JMenuItem Fps = new JMenuItem("Jogo da Velha");
	private JMenuItem Rpg = new JMenuItem("Forca");
	
	// modificador de acesso - nome classe
	public Principal() {
		definir("Tela Principal");
	}

	public Principal(String titulo) {
		definir(titulo);
	}

	private void definir(String titulo) {
		setTitle(titulo);
		setSize(800,600);
		setJMenuBar(jmb);
		jmb.add(Jogos);
		jmb.add(Utilitários);
		jmb.add(ajuda);

		Jogos.add(Jogo da Velha);
		Jogos.add(Forma);
		setVisible(true);

		Fps.addActionListener(this);
		setVisible(true);
	}

	public static void main(String[] args) {
		// tipo nome new
		String t = "tela";
		Principal p = new Principal("Tela");

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		TelaEstado te = new TelaEstado();
	}

}
