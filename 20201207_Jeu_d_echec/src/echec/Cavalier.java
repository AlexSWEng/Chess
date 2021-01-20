package echec;

public class Cavalier extends Piece {
	public Cavalier(Board b, String nom, couleur couleur, int ligne, int colonne) {
		super(b, nom, couleur, ligne, colonne);
		if (couleur == couleur.BLANC) {
			affichage = "C";
		} else affichage = "c";
	}

	public void calcNextMoves(Board b) {
		possibleMoves.add(new Case(ligne - 2, colonne + 1));
		possibleMoves.add(new Case(ligne - 1, colonne + 2));
		possibleMoves.add(new Case(ligne + 1, colonne + 2));
		possibleMoves.add(new Case(ligne + 2, colonne + 1));
		possibleMoves.add(new Case(ligne + 2, colonne - 1));
		possibleMoves.add(new Case(ligne + 1, colonne - 2));
		possibleMoves.add(new Case(ligne - 1, colonne - 2));
		possibleMoves.add(new Case(ligne - 2, colonne - 1));
	}
}
