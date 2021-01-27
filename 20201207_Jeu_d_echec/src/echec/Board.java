package echec;

public class Board {

    public String test;

    public String nom;
    public int    lignes;
    public int    colonnes;
    public Piece  board[][];
    // public int nbVoitures;
    // public int nbCamions;
    // public int nbBus;

    public Board( int lignes, int colonnes, String nom ) {

        this.nom = nom;
        this.lignes = lignes;
        this.colonnes = colonnes;
        board = new Piece[lignes][colonnes];

        System.out.println( "Création de la BOARD " + nom );
        System.out.println( "Lignes = " + board.length );
        System.out.println( "Colonnes = " + board[0].length );
        System.out.println( "Capacité totale = " + lignes * colonnes + " cases" );

        blank();
        display();
    }

    public void blank() {
        for ( int i = 0; i < lignes; i++ )
            for ( int j = 0; j < colonnes; j++ )
                board[i][j] = new PieceNull( i, j );
    }

    // public void fill() {
    // for (int i = 0; i < lignes; i++) {
    // for (int j = 0; j < colonnes; j++) {
    // board[i][j] = tA1;
    // }
    // }
    // }

    public void info() {
        System.out.println( "" );
        System.out.print( "INFOS BOARD " + nom + " : " );
        // System.out.print(nbVoitures+" Pièces blanches mangées : ");
        // System.out.print(nbCamions+" Pièces noires mangées : ");
        System.out.println( "" );
    }

    public void display() {
        System.out.println( "" );
        System.out.println( "   ___[ECHIQUIER]___" );
        for ( int i = 0; i < lignes; i++ ) {
            System.out.print( 8 - i + " >|" );
            for ( int j = 0; j < colonnes; j++ )
                System.out.print( board[i][j] + "|" );
            System.out.println( "" );
        }
        System.out.println( "    ^ ^ ^ ^ ^ ^ ^ ^" );
        System.out.println( "    A B C D E F G H" );
        // info();
    }

    public void displayHelp( Piece p ) {
        System.out.println( "" );
        System.out.println( "   _____[HELP]_____" );
        for ( int i = 0; i < lignes; i++ ) {
            System.out.print( 8 - i + " >|" );
            for ( int j = 0; j < colonnes; j++ )
                if ( p.possibleMoves.contains( new Case( i, j, false ) ) )
                    System.out.print( "·|" );
                // si cette case contenait une pièce ennemi, afficher une croix
                else if ( p.possibleMoves.contains( new Case( i, j, true ) ) )
                    System.out.print( "×|" );
                else
                    System.out.print( board[i][j] + "|" );
            System.out.println( "" );
        }
        System.out.println( "    ^ ^ ^ ^ ^ ^ ^ ^" );
        System.out.println( "    A B C D E F G H" );

    }
}