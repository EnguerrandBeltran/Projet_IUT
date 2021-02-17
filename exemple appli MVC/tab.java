	int ligDep, colDep;		//Ligne colone de depart
	int ligArr, colArr;		//Ligne colone d'arrivé
	char[][] tabDebut;		//Tableau modèle
	char[][] tabJeu;		//Tableau melangé

	char tmp;

	tabDebut = new char[][];
	tabDebut = {{'0','1','2','3','4','5'},
				{'6','7','8','9','A','B'},
				{'C','D','E','F','G','H'},
				{'I','J','K','L','M','N'},
				{'O','P','Q','R','S','T'},
				{'U','V','W','X','Y','Z'}};

	tabJeu = new char[][];
	tabJeu = {	{'0','1','2','3','4','5'},
				{'6','7','8','9','A','B'},
				{'C','D','E','F','G','H'},
				{'I','J','K','L','M','N'},
				{'O','P','Q','R','S','T'},
				{'U','V','W','X','Y','Z'}};



	for(int cpt = 0; cpt < 1000 ; cpt ++)
	{
		ligDep	= (int) (Math.random() * 5 );
		colDep	= (int) (Math.random() * 5 );
		tmp 	= tabJeu[ligDep][colDep];
		ligArr 	= (int) (Math.random() * 5 );
		colArr 	= (int) (Math.random() * 5 );
		tabJeu[ligDep][colDep] = tabJeu[ligArr][colArr];
		tabJeu[ligArr][colArr] = tmp;
	}


public boolean WinCheck(char[][] tabDeb, char[][] tabFin)
{
	for(int i = 0; i < 6; i++)
	{
		for(int y = 0; y < 6; y++)
		{
			if (tabDeb[i][y] != tabFin[i][y]){return false;}
		}
	}
	return true;
}






