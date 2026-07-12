import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnimacaoTela extends JFrame {
	private JPanel tela;
	private int fps = 1000/20; // frame do projeto = 50
	private int ct; //xontador
	private boolean anima = true;

	public void iniciaAnimacao() {
		long prxAtualizacao = 0;
		while (anima) {
			if (System.currentTimeMillis() >= prxAtualizacao) {
				ct++;
				tela.repaint();

				prxAtualizacao = System.currentTimeMillis() + fps;

			if (ct == 100) 
				anima = false;
			}
		}
	}
	
	public AnimacaoTela() {
		tela = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				//Limpando os desenhos anteriores
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, tela.getWidth(), tela.getHeight());

			// A pintura ocorre aqui
				g.setColor(Color.BLUE);
				g.drawLine(0, 240 + ct, 640, 240 + ct);
				g.drawRect(10, 25 + ct, 20, 20);
				g.drawOval(30 + ct, 20, 40, 30);

				g.setColor(Color.YELLOW);
				g.drawLine(320 - ct, 0, 320 - ct, 4800);
				g.fillRect(110, 125, 120 - ct, 120 - ct);
				g.fillOval(230, 220, 240 + ct, 230);

				g.setColor(Color.RED);
				g.drawString("Eu seria um otimo Score!" + ct, 5, 10);

			}
		};


		// Configurações da janela
		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(tela);
		setLocationRelativeTo(null);
		setVisible(true);
		tela.repaint();
	}


	public static void main(String[] args) {
		AnimacaoTela anima = new AnimacaoTela();
		anima.iniciaAnimacao();
	}
}
