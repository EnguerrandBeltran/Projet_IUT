public class Metier
{
	private int val;

	public Metier()
	{
		this.val = 0;
	}

	public void augmenter()
	{
		this.val++;

		if ( this.val == 11 ) this.val = -10;
	}

	public void diminuer()
	{
		this.val--;

		if ( this.val == -11 ) this.val = 10;
	}

	public int getVal(){ return this.val; }

}
