import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnimacaoTela extends JFrame {
	private JPanel tela;
	private int fps = 1000/20; // frame do projeto = 50
	private int ct; //xontador
	private boolean anima = true;

	public void iniciaAbimacao() {
		long prxAtualizacao = 0;
		while (anima) {
			if (System.currentTimeMillis() >= prxAtualizacao)
				ct++;
				tela.repaint();

				prxAtualizacao = System.currentTimeMillis() + fps;

			if (ct == 100)
				anima = false;

		}

	}
	
	public Janela() {
		tela = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);


			// A pintura ocorre aqui
				g.setColor(Color.BLUE);
				g.drawLine(0, 240, 640, 240);
				g.drawRect(10, 25, 20, 20);
				g.drawOval(30, 20, 40, 30);

				g.setColor(Color.YELLOW);
				g.drawLine(320, 0, 320, 4800);
				g.fillRect(110, 125, 120, 120);
				g.fillOval(230, 220, 240, 230);

				g.setColor(Color.RED);
				g.drawString("Eu seria um otimo Score!", 5, 10);

			}
		};


		// Configurações da janela
		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(tela);
		setLocationRelativeTo(null);
		setVisible(true);
		//tela.repaint();
	}


	public static void main(String[] args) {
		new Janela();
	}

}
