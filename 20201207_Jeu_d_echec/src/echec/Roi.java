package echec;

public class Roi extends Piece {
	public Roi(Board b, String nom, couleur couleur, int ligne, int colonne) {
		super(b, nom, couleur, ligne, colonne);
		if (couleur == couleur.BLANC) {
			affichage = "K";
		} else
			affichage = "k";
	}

	public void calcNextMoves(Board b) {

		possibleMoves.clear();

		if (couleur == couleur.BLANC) {

			if (colonne - 1 >= 0) {
				if (b.board[ligne][colonne - 1].couleur == couleur.NULL) {
					possibleMoves.add(new Case(ligne, colonne - 1));
				} else if (b.board[ligne][colonne - 1].couleur == couleur.NOIR) {
					possibleMoves.add(new Case(ligne, colonne - 1, true));
				}
			}

			if (colonne + 1 <= 7) {
				if (b.board[ligne][colonne + 1].couleur == couleur.NULL) {
					possibleMoves.add(new Case(ligne, colonne + 1));
				} else if (b.board[ligne][colonne + 1].couleur == couleur.NOIR) {
					possibleMoves.add(new Case(ligne, colonne + 1, true));
				}
			}

			if (ligne - 1 >= 0) {
				if (b.board[ligne - 1][colonne].couleur == couleur.NULL) {
					possibleMoves.add(new Case(ligne - 1, colonne));
				} else if (b.board[ligne - 1][colonne].couleur == couleur.NOIR) {
					possibleMoves.add(new Case(ligne - 1, colonne, true));
				}
			}

			if (ligne + 1 <= 7) {
				if (b.board[ligne + 1][colonne].couleur == couleur.NULL) {
					possibleMoves.add(new Case(ligne + 1, colonne));
				} else if (b.board[ligne + 1][colonne].couleur == couleur.NOIR) {
					possibleMoves.add(new Case(ligne + 1, colonne, true));
				}
			}

			if (ligne - 1 >= 0 && colonne - 1 >= 0) {
				if (b.board[ligne - 1][colonne - 1].couleur == couleur.NULL) {
					possibleMoves.add(new Case(ligne - 1, colonne - 1));
				} else if (b.board[ligne - 1][colonne - 1].couleur == couleur.NOIR) {
					possibleMoves.add(new Case(ligne - 1, colonne - 1, true));
				}
			}

			if (ligne + 1 <= 7 && colonne + 1 <= 7) {
				if (b.board[ligne + 1][colonne + 1].couleur == couleur.NULL) {
					possibleMoves.add(new Case(ligne + 1, colonne + 1));
				} else if (b.board[ligne + 1][colonne + 1].couleur == couleur.NOIR) {
					possibleMoves.add(new Case(ligne + 1, colonne + 1, true));
				}
			}

			if (ligne - 1 >= 0 && colonne + 1 <= 7) {
				if (b.board[ligne - 1][colonne + 1].couleur == couleur.NULL) {
					possibleMoves.add(new Case(ligne - 1, colonne + 1));
				} else if (b.board[ligne - 1][colonne + 1].couleur == couleur.NOIR) {
					possibleMoves.add(new Case(ligne - 1, colonne + 1, true));
				}
			}

			if (ligne + 1 <= 7 && colonne - 1 >= 0) {
				if (b.board[ligne + 1][colonne - 1].couleur == couleur.NULL) {
					possibleMoves.add(new Case(ligne + 1, colonne - 1));
				} else if (b.board[ligne + 1][colonne - 1].couleur == couleur.NOIR) {
					possibleMoves.add(new Case(ligne + 1, colonne - 1, true));
				}
			}
		}
		
		if (couleur == couleur.NOIR) {

			if (colonne - 1 >= 0) {
				if (b.board[ligne][colonne - 1].couleur == couleur.NULL) {
					possibleMoves.add(new Case(ligne, colonne - 1));
				} else if (b.board[ligne][colonne - 1].couleur == couleur.BLANC) {
					possibleMoves.add(new Case(ligne, colonne - 1, true));
				}
			}

			if (colonne + 1 <= 7) {
				if (b.board[ligne][colonne + 1].couleur == couleur.NULL) {
					possibleMoves.add(new Case(ligne, colonne + 1));
				} else if (b.board[ligne][colonne + 1].couleur == couleur.BLANC) {
					possibleMoves.add(new Case(ligne, colonne + 1, true));
				}
			}

			if (ligne - 1 >= 0) {
				if (b.board[ligne - 1][colonne].couleur == couleur.NULL) {
					possibleMoves.add(new Case(ligne - 1, colonne));
				} else if (b.board[ligne - 1][colonne].couleur == couleur.BLANC) {
					possibleMoves.add(new Case(ligne - 1, colonne, true));
				}
			}

			if (ligne + 1 <= 7) {
				if (b.board[ligne + 1][colonne].couleur == couleur.NULL) {
					possibleMoves.add(new Case(ligne + 1, colonne));
				} else if (b.board[ligne + 1][colonne].couleur == couleur.BLANC) {
					possibleMoves.add(new Case(ligne + 1, colonne, true));
				}
			}

			if (ligne - 1 >= 0 && colonne - 1 >= 0) {
				if (b.board[ligne - 1][colonne - 1].couleur == couleur.NULL) {
					possibleMoves.add(new Case(ligne - 1, colonne - 1));
				} else if (b.board[ligne - 1][colonne - 1].couleur == couleur.BLANC) {
					possibleMoves.add(new Case(ligne - 1, colonne - 1, true));
				}
			}

			if (ligne + 1 <= 7 && colonne + 1 <= 7) {
				if (b.board[ligne + 1][colonne + 1].couleur == couleur.NULL) {
					possibleMoves.add(new Case(ligne + 1, colonne + 1));
				} else if (b.board[ligne + 1][colonne + 1].couleur == couleur.BLANC) {
					possibleMoves.add(new Case(ligne + 1, colonne + 1, true));
				}
			}

			if (ligne - 1 >= 0 && colonne + 1 <= 7) {
				if (b.board[ligne - 1][colonne + 1].couleur == couleur.NULL) {
					possibleMoves.add(new Case(ligne - 1, colonne + 1));
				} else if (b.board[ligne - 1][colonne + 1].couleur == couleur.BLANC) {
					possibleMoves.add(new Case(ligne - 1, colonne + 1, true));
				}
			}

			if (ligne + 1 <= 7 && colonne - 1 >= 0) {
				if (b.board[ligne + 1][colonne - 1].couleur == couleur.NULL) {
					possibleMoves.add(new Case(ligne + 1, colonne - 1));
				} else if (b.board[ligne + 1][colonne - 1].couleur == couleur.BLANC) {
					possibleMoves.add(new Case(ligne + 1, colonne - 1, true));
				}
			}
		}
	}
}
