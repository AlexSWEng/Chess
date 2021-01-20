package echec;

public class Pion extends Piece {
	public Pion(Board b, String nom, couleur couleur, int ligne, int colonne) {
		super(b, nom, couleur, ligne, colonne);
		if (couleur == couleur.BLANC) {
			affichage = "●";
		} else
			affichage = "o";

	}

	public void calcNextMoves(Board b) {

		possibleMoves.clear();

		if (couleur == couleur.BLANC) {
			if ((ligne - 1) >= 0 && b.board[ligne - 1][colonne].couleur == couleur.NULL) {
				possibleMoves.add(new Case(ligne - 1, colonne));
			}

			if ((ligne == 6) && (b.board[ligne - 1][colonne].couleur == couleur.NULL)
					&& (b.board[ligne - 2][colonne].couleur == couleur.NULL)) {
				possibleMoves.add(new Case(ligne - 2, colonne));
			}

			if ((ligne - 1) >= 0 && (colonne - 1) >= 0 && b.board[ligne - 1][colonne - 1].couleur == couleur.NOIR) {
				possibleMoves.add(new Case(ligne - 1, colonne - 1, true));
			}

			if ((ligne - 1) >= 0 && (colonne + 1) <= 7 && b.board[ligne - 1][colonne + 1].couleur == couleur.NOIR) {
				possibleMoves.add(new Case(ligne - 1, colonne + 1, true));
			}
		}

		if (couleur == couleur.NOIR) {
			if ((ligne + 1) <= 7 && b.board[ligne + 1][colonne].couleur == couleur.NULL) {
				possibleMoves.add(new Case(ligne + 1, colonne));
			}

			if ((ligne == 1) && (b.board[ligne + 1][colonne].couleur == couleur.NULL)
					&& (b.board[ligne + 2][colonne].couleur == couleur.NULL)) {
				possibleMoves.add(new Case(ligne + 2, colonne));
			}

			if ((ligne + 1) <= 7 && (colonne + 1) <= 7 && b.board[ligne + 1][colonne + 1].couleur == couleur.BLANC) {
				possibleMoves.add(new Case(ligne + 1, colonne + 1, true));
			}

			if ((ligne + 1) <= 7 && (colonne - 1) >= 0 && b.board[ligne + 1][colonne - 1].couleur == couleur.BLANC) {
				possibleMoves.add(new Case(ligne + 1, colonne - 1, true));
			}
		}

//		else {
//			possibleMoves.add(new Case(ligne + 1, colonne));
//			if (ligne == 1) {
//				possibleMoves.add(new Case(ligne + 2, colonne));
//			}
//		}
//		System.out.println(possibleMoves);
	}
}
