package echec;

public class PieceNull extends Piece {
	public PieceNull(int ligne, int colonne) {
		super();
	}

	public void calcNextMoves(Board b) {
		System.out.println("Les cases vides ne peuvent pas bouger!");
	}
}
