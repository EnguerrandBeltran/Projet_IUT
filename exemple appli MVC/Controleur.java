public class Controleur
{
	private Metier          metier;
	private FramePrincipale frmPrc;

	public Controleur()
	{
		this.metier = new Metier();
		this.frmPrc = new FramePrincipale ( this );
	}

	public void action ( int numAction )
	{
		if ( numAction == 1 ) this.metier.augmenter();
		if ( numAction == 2 ) this.metier.diminuer ();

		this.frmPrc.majIHM();
	}

	public int getVal()
	{
		return metier.getVal();
	}


	public static void main(String[] a)
	{
		new Controleur();
	}
}
