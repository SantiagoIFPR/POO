package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Principal extends JFrame implements ActionListener {

	private JMenuBar jmb = new JMenuBar();

	private JMenu cadastro = new JMenu("Cadastro");
	private JMenu movimento = new JMenu("Movimento");
	private JMenu relatorio = new JMenu("Relatório");

	private JMenuItem estado = new JMenuItem("Estado");
	private JMenuItem Cidade = new JMenuItem("Cidade");
	private JMenuItem Cliente = new JMenuItem("Cliente");

	// modificador de acesso - nome classe
	public Principal() {
		definir("Tela Principal");
	}

	public Principal(String titulo) {
		definir(titulo);
	}

	private void definir(String titulo) {
		setTitle(titulo);
		setSize(800, 600);
		setJMenuBar(jmb);
		jmb.add(cadastro);
		jmb.add(movimento);
		jmb.add(relatorio);

		cadastro.add(estado);
		cadastro.add(Cidade);
		cadastro.add(Cliente);
		setVisible(true);

		estado.addActionListener(this);
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
