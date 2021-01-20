package echec;

import java.util.ArrayList;

enum couleur {
	BLANC, NOIR, NULL
}

public abstract class Piece implements CalcMoves {
	String affichage;
	String nom;
	couleur couleur;
	int ligne;
	int colonne;
	ArrayList<Case> possibleMoves = new ArrayList<Case>();
	boolean moved;

	public Piece() {
		affichage = "_";
		couleur = couleur.NULL;
	}

	public Piece(Board b, String nom, couleur couleur, int ligne, int colonne) {
		this.couleur = couleur;
		this.nom = nom;
		this.ligne = ligne;
		this.colonne = colonne;
		b.board[ligne][colonne] = this;
	}

	public String toString() {
		return affichage;
	}
}
