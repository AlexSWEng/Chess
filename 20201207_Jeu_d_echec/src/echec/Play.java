package echec;

import java.util.*;

public class Play {

	public static void main(String[] args) {

		// Creation des 2 joueurs BLANC et NOIR
		Player jBlanc = new Player(nom.JBLANC);
		Player jNoir = new Player(nom.JNOIR);

		// Creation de l'échiquier vide
		Board b1 = new Board(8, 8, "B1");

		// Creation des pieces
		Piece tA1 = new Tour(b1, "tA1", couleur.BLANC, 7, 0);
		Piece tH1 = new Tour(b1, "tH1", couleur.BLANC, 7, 7);
		Piece tA8 = new Tour(b1, "tA8", couleur.NOIR, 0, 0);
		Piece tH8 = new Tour(b1, "tH8", couleur.NOIR, 0, 7);
		Piece cB1 = new Cavalier(b1, "cB1", couleur.BLANC, 7, 1);
		Piece cG1 = new Cavalier(b1, "cG1", couleur.BLANC, 7, 6);
		Piece cB8 = new Cavalier(b1, "cB8", couleur.NOIR, 0, 1);
		Piece cG8 = new Cavalier(b1, "cG8", couleur.NOIR, 0, 6);
		Piece fC1 = new Fou(b1, "fC1", couleur.BLANC, 7, 2);
		Piece fF1 = new Fou(b1, "fF1", couleur.BLANC, 7, 5);
		Piece fC8 = new Fou(b1, "fC8", couleur.NOIR, 0, 2);
		Piece fF8 = new Fou(b1, "fF8", couleur.NOIR, 0, 5);
		Piece qD1 = new Reine(b1, "qD1", couleur.BLANC, 7, 3);
		Piece qD8 = new Reine(b1, "qD8", couleur.NOIR, 0, 3);
		Piece kE1 = new Roi(b1, "kE1", couleur.BLANC, 7, 4);
		Piece kE8 = new Roi(b1, "kE8", couleur.NOIR, 0, 4);
		Piece pA2 = new Pion(b1, "pA2", couleur.BLANC, 6, 0);
		Piece pB2 = new Pion(b1, "pB2", couleur.BLANC, 6, 1);
		Piece pC2 = new Pion(b1, "pC2", couleur.BLANC, 6, 2);
		Piece pD2 = new Pion(b1, "pD2", couleur.BLANC, 6, 3);
		Piece pE2 = new Pion(b1, "pE2", couleur.BLANC, 6, 4);
		Piece pF2 = new Pion(b1, "pF2", couleur.BLANC, 6, 5);
		Piece pG2 = new Pion(b1, "pG2", couleur.BLANC, 6, 6);
		Piece pH2 = new Pion(b1, "pH2", couleur.BLANC, 6, 7);
		Piece pA7 = new Pion(b1, "pA7", couleur.NOIR, 1, 0);
		Piece pB7 = new Pion(b1, "pB7", couleur.NOIR, 1, 1);
		Piece pC7 = new Pion(b1, "pC7", couleur.NOIR, 1, 2);
		Piece pD7 = new Pion(b1, "pD7", couleur.NOIR, 1, 3);
		Piece pE7 = new Pion(b1, "pE7", couleur.NOIR, 1, 4);
		Piece pF7 = new Pion(b1, "pF7", couleur.NOIR, 1, 5);
		Piece pG7 = new Pion(b1, "pG7", couleur.NOIR, 1, 6);
		Piece pH7 = new Pion(b1, "pH7", couleur.NOIR, 1, 7);

		// Affichage de l'échiquier
		b1.display();

		// Partie
		
		// vérifer les calcNextMoves par ex Fou ne saute pas les pieces etc
		
		// quand une piece prend la place d'une autre, ajouter la piece à liste détruite
		// et afficher un message "PIECE MANGEE"
		
		// VERIFIER DURANT LE TOUR D'UN JOUEUR QU'IL PREND UNE PIECE DE SA COULEUR
		
		while (true) {
			jBlanc.play(b1);
			jNoir.play(b1);
		}

		// Joueur 1 joue
		// Demander quelle piece avec Ligne+Colonne
		// bouger(pE2,E4);
		// Vérifier E4 appartient à ArrayList NextMoves
		// Si oui
		// Si case vide : remplacer case vide par pièce
		// Si case pleine : ajouter pièce précédente à liste des pièces détruites
		// puis déplacer la pièce
		// Sinon
		// pas bouger la pièce, dire impossible

//		pA2.calcNextMoves();
////		System.out.println(pA2.nom);
////		System.out.println("ligne = "+pA2.ligne);
////		System.out.println("colonne = "+pA2.colonne);
////		System.out.println(pA2.possibleMoves);
//		pA2.Move(b1, 4, 0);
//
//		pE2.calcNextMoves();
//		pE2.Move(b1, 5, 4);
//
//		pG2.calcNextMoves();
//		pG2.Move(b1, 4, 6);
//
//		fF1.calcNextMoves();
////		System.out.println(fF1.nom);
////		System.out.println("ligne = "+fF1.ligne);
////		System.out.println("colonne = "+fF1.colonne);
////		System.out.println(fF1.possibleMoves);
//		fF1.Move(b1, 5, 3);
//		fF1.calcNextMoves();
//		fF1.Move(b1, 3, 5);
//
//		tA1.calcNextMoves();
////		System.out.println(tA1.nom);
////		System.out.println("ligne = "+tA1.ligne);
////		System.out.println("colonne = "+tA1.colonne);
////		System.out.println(tA1.possibleMoves);
//		tA1.Move(b1, 5, 0);
//		tA1.calcNextMoves();
//		tA1.Move(b1, 5, 3);
//
//		qD1.calcNextMoves();
////		System.out.println(qD1.nom);
////		System.out.println("ligne = "+qD1.ligne);
////		System.out.println("colonne = "+qD1.colonne);
////		System.out.println(qD1.possibleMoves);
//		qD1.Move(b1, 5, 5);
//		qD1.calcNextMoves();
//		qD1.Move(b1, 3, 3);
//
//		cB1.calcNextMoves();
////		System.out.println(cB1.nom);
////		System.out.println("ligne = "+cB1.ligne);
////		System.out.println("colonne = "+cB1.colonne);
////		System.out.println(cB1.possibleMoves);
//		cB1.Move(b1, 5, 2);
//		cB1.calcNextMoves();
//		cB1.Move(b1, 4, 4);
//		cB1.calcNextMoves();
//		cB1.Move(b1, 4, 5);
//
//		kE1.calcNextMoves();
////		System.out.println(kE1.nom);
////		System.out.println("ligne = " + kE1.ligne);
////		System.out.println("colonne = " + kE1.colonne);
////		System.out.println(kE1.possibleMoves);
//		kE1.Move(b1, 6, 4);
//		kE1.calcNextMoves();
//		kE1.Move(b1, 7, 5);
	}
}
