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

			// A pintura ocorre aqui
				g.setColor(Color.BLUE);
				g.drawLine(0, 240, 640, 240);

			}
		};

		super.getContentPane().add(tela);

		// Configurações da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setVisible(true);
	}


	public static void main(String[] args) {
		new Janela();
	}

}
