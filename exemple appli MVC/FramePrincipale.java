import javax.swing.JFrame;
import java.awt.Dimension;


public class FramePrincipale extends JFrame
{
	private PanelJeu panelJeu;


	public FramePrincipale ( Controleur ctrl )
	{
		int       largeurEcran, hauteurEcran;
		Dimension dimEcran;


		this.panelJeu = new PanelJeu(ctrl);


		dimEcran     = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		hauteurEcran = (int) dimEcran.getHeight();
		largeurEcran = (int) dimEcran.getWidth();

		this.setTitle   ( "Spinner");
		this.setSize    ( 400,200  );

		this.setLocation( (largeurEcran/2)-200, (hauteurEcran/2)-100 );
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.add ( this.panelJeu );

		this.setVisible(true);
	}

	public void majIHM()
	{
		this.panelJeu.repaint();
	}


}
