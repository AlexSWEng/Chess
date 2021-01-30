package echec;

public class Tour extends Piece {
    public Tour( Board b, String nom, couleur couleur, int ligne, int colonne ) {
        super( b, nom, couleur, ligne, colonne );
        if ( couleur == couleur.BLANC )
            affichage = "T";
        else
            affichage = "t";
    }

    @Override
    public void calcNextMoves( Board b ) {

        possibleMoves.clear();

        if ( couleur == couleur.BLANC ) {

            boolean blocked = false;
            int i = 1;
            while ( !blocked && colonne - i >= 0 )
                if ( b.board[ligne][colonne - i].couleur == couleur.NULL ) {
                    possibleMoves.add( new Case( ligne, colonne - i ) );
                    i++;
                } else if ( b.board[ligne][colonne - i].couleur == couleur.NOIR ) {
                    possibleMoves.add( new Case( ligne, colonne - i, true ) );
                    blocked = true;
                } else
                    blocked = true;

            blocked = false;
            i = 1;
            while ( !blocked && colonne + i <= 7 )
                if ( b.board[ligne][colonne + i].couleur == couleur.NULL ) {
                    possibleMoves.add( new Case( ligne, colonne + i ) );
                    i++;
                } else if ( b.board[ligne][colonne + i].couleur == couleur.NOIR ) {
                    possibleMoves.add( new Case( ligne, colonne + i, true ) );
                    blocked = true;
                } else
                    blocked = true;

            blocked = false;
            i = 1;
            while ( !blocked && ligne - i >= 0 )
                if ( b.board[ligne - i][colonne].couleur == couleur.NULL ) {
                    possibleMoves.add( new Case( ligne - i, colonne ) );
                    i++;
                } else if ( b.board[ligne - i][colonne].couleur == couleur.NOIR ) {
                    possibleMoves.add( new Case( ligne - i, colonne, true ) );
                    blocked = true;
                } else
                    blocked = true;

            blocked = false;
            i = 1;
            while ( !blocked && ligne + i <= 7 )
                if ( b.board[ligne + i][colonne].couleur == couleur.NULL ) {
                    possibleMoves.add( new Case( ligne + i, colonne ) );
                    i++;
                } else if ( b.board[ligne + i][colonne].couleur == couleur.NOIR ) {
                    possibleMoves.add( new Case( ligne + i, colonne, true ) );
                    blocked = true;
                } else
                    blocked = true;
        }

        if ( couleur == couleur.NOIR ) {

            boolean blocked = false;
            int i = 1;
            while ( !blocked && colonne - i >= 0 )
                if ( b.board[ligne][colonne - i].couleur == couleur.NULL ) {
                    possibleMoves.add( new Case( ligne, colonne - i ) );
                    i++;
                } else if ( b.board[ligne][colonne - i].couleur == couleur.BLANC ) {
                    possibleMoves.add( new Case( ligne, colonne - i, true ) );
                    blocked = true;
                } else
                    blocked = true;

            blocked = false;
            i = 1;
            while ( !blocked && colonne + i <= 7 )
                if ( b.board[ligne][colonne + i].couleur == couleur.NULL ) {
                    possibleMoves.add( new Case( ligne, colonne + i ) );
                    i++;
                } else if ( b.board[ligne][colonne + i].couleur == couleur.BLANC ) {
                    possibleMoves.add( new Case( ligne, colonne + i, true ) );
                    blocked = true;
                } else
                    blocked = true;

            blocked = false;
            i = 1;
            while ( !blocked && ligne - i >= 0 )
                if ( b.board[ligne - i][colonne].couleur == couleur.NULL ) {
                    possibleMoves.add( new Case( ligne - i, colonne ) );
                    i++;
                } else if ( b.board[ligne - i][colonne].couleur == couleur.BLANC ) {
                    possibleMoves.add( new Case( ligne - i, colonne, true ) );
                    blocked = true;
                } else
                    blocked = true;

            blocked = false;
            i = 1;
            while ( !blocked && ligne + i <= 7 )
                if ( b.board[ligne + i][colonne].couleur == couleur.NULL ) {
                    possibleMoves.add( new Case( ligne + i, colonne ) );
                    i++;
                } else if ( b.board[ligne + i][colonne].couleur == couleur.BLANC ) {
                    possibleMoves.add( new Case( ligne + i, colonne, true ) );
                    blocked = true;
                } else
                    blocked = true;
        }
    }
}
