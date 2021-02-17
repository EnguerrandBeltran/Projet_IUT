
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Dimension;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;



public class PanelJeu extends JPanel implements ActionListener
{
	private Controleur ctrl;

	private JButton    btnUp;
	private JButton    btnDown;

	private JLabel     lblValeur;


	public PanelJeu ( Controleur ctrl )
	{
		this.ctrl = ctrl;

		//this.setLayout ( new GridLayout( 1, 3) );

		// Création des Controles
		this.btnUp     = new JButton( "  +  ");
		this.btnDown   = new JButton( "  -  ");
		this.lblValeur = new JLabel ( "" + ctrl.getVal(), JLabel.CENTER );
		this.lblValeur.setPreferredSize( new Dimension( 40,20 ) );

		// Lier les Controles aux événements
		this.btnUp.addActionListener   ( this );
		this.btnDown.addActionListener ( this );


		// Ajout des Controles sur le Panel
		this.add ( this.btnDown   );
		this.add ( this.lblValeur );
		this.add ( this.btnUp     );




	}


	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);

		this.lblValeur.setText ( "" + ctrl.getVal() );
	}


	public void actionPerformed(ActionEvent e)
	{
		if ( e.getSource() == this.btnUp   ) ctrl.action( 1 );
		if ( e.getSource() == this.btnDown ) ctrl.action( 2 );
	}

}
