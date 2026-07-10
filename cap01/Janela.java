import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame {
	private JPanel tela;
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
