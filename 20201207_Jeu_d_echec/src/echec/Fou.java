package echec;

public class Fou extends Piece {
    public Fou( Board b, String nom, couleur couleur, int ligne, int colonne ) {
        super( b, nom, couleur, ligne, colonne );
        if ( couleur == echec.couleur.BLANC )
            affichage = "F";
        else
            affichage = "f";
    }

    @Override
    public void calcNextMoves( Board b ) {

        possibleMoves.clear();

        if ( couleur == echec.couleur.BLANC ) {

            boolean blocked = false;
            int i = 1;
            while ( !blocked && ligne - i >= 0 && colonne - i >= 0 )
                if ( b.board[ligne - i][colonne - i].couleur == echec.couleur.NULL ) {
                    possibleMoves.add( new Case( ligne - i, colonne - i ) );
                    i++;
                } else if ( b.board[ligne - i][colonne - i].couleur == echec.couleur.NOIR ) {
                    possibleMoves.add( new Case( ligne - i, colonne - i, true ) );
                    blocked = true;
                } else
                    blocked = true;

            blocked = false;
            i = 1;
            while ( !blocked && ligne + i <= 7 && colonne + i <= 7 )
                if ( b.board[ligne + i][colonne + i].couleur == echec.couleur.NULL ) {
                    possibleMoves.add( new Case( ligne + i, colonne + i ) );
                    i++;
                } else if ( b.board[ligne + i][colonne + i].couleur == echec.couleur.NOIR ) {
                    possibleMoves.add( new Case( ligne + i, colonne + i, true ) );
                    blocked = true;
                } else
                    blocked = true;

            blocked = false;
            i = 1;
            while ( !blocked && ligne - i >= 0 && colonne + i <= 7 )
                if ( b.board[ligne - i][colonne + i].couleur == echec.couleur.NULL ) {
                    possibleMoves.add( new Case( ligne - i, colonne + i ) );
                    i++;
                } else if ( b.board[ligne - i][colonne + i].couleur == echec.couleur.NOIR ) {
                    possibleMoves.add( new Case( ligne - i, colonne + i, true ) );
                    blocked = true;
                } else
                    blocked = true;

            blocked = false;
            i = 1;
            while ( !blocked && ligne + i <= 7 && colonne - i >= 0 )
                if ( b.board[ligne + i][colonne - i].couleur == echec.couleur.NULL ) {
                    possibleMoves.add( new Case( ligne + i, colonne - i ) );
                    i++;
                } else if ( b.board[ligne + i][colonne - i].couleur == echec.couleur.NOIR ) {
                    possibleMoves.add( new Case( ligne + i, colonne - i, true ) );
                    blocked = true;
                } else
                    blocked = true;
        }

        if ( couleur == echec.couleur.NOIR ) {

            boolean blocked = false;
            int i = 1;
            while ( !blocked && ligne - i >= 0 && colonne - i >= 0 )
                if ( b.board[ligne - i][colonne - i].couleur == echec.couleur.NULL ) {
                    possibleMoves.add( new Case( ligne - i, colonne - i ) );
                    i++;
                } else if ( b.board[ligne - i][colonne - i].couleur == echec.couleur.BLANC ) {
                    possibleMoves.add( new Case( ligne - i, colonne - i, true ) );
                    blocked = true;
                } else
                    blocked = true;

            blocked = false;
            i = 1;
            while ( !blocked && ligne + i <= 7 && colonne + i <= 7 )
                if ( b.board[ligne + i][colonne + i].couleur == echec.couleur.NULL ) {
                    possibleMoves.add( new Case( ligne + i, colonne + i ) );
                    i++;
                } else if ( b.board[ligne + i][colonne + i].couleur == echec.couleur.BLANC ) {
                    possibleMoves.add( new Case( ligne + i, colonne + i, true ) );
                    blocked = true;
                } else
                    blocked = true;

            blocked = false;
            i = 1;
            while ( !blocked && ligne - i >= 0 && colonne + i <= 7 )
                if ( b.board[ligne - i][colonne + i].couleur == echec.couleur.NULL ) {
                    possibleMoves.add( new Case( ligne - i, colonne + i ) );
                    i++;
                } else if ( b.board[ligne - i][colonne + i].couleur == echec.couleur.BLANC ) {
                    possibleMoves.add( new Case( ligne - i, colonne + i, true ) );
                    blocked = true;
                } else
                    blocked = true;

            blocked = false;
            i = 1;
            while ( !blocked && ligne + i <= 7 && colonne - i >= 0 )
                if ( b.board[ligne + i][colonne - i].couleur == echec.couleur.NULL ) {
                    possibleMoves.add( new Case( ligne + i, colonne - i ) );
                    i++;
                } else if ( b.board[ligne + i][colonne - i].couleur == echec.couleur.BLANC ) {
                    possibleMoves.add( new Case( ligne + i, colonne - i, true ) );
                    blocked = true;
                } else
                    blocked = true;
        }
    }
}
