package echec;

import java.util.Scanner;

enum nom {
    JBLANC, JNOIR
}

public class Player {
    public static Scanner scanner;
    public nom            nom;
    public Piece          choixPiece;
    public int            choixLigne;
    public int            choixColonne;
    public Case           choixCase;
    public int            helpLigne   = 10;
    public int            helpColonne = 10;

    public Player( nom nom ) {
        this.nom = nom;
    }

    public void play( Board b ) {
        do {
            demanderPiece( b );
            choixPiece.calcNextMoves( b );
            demanderCase( b );
            move( b, choixPiece, choixLigne, choixColonne );
            // Tant que le joueur selectionne des cases impossibles, on lui
            // demande de
            // rejouer
        } while ( !choixPiece.moved );
    }

    public Piece demanderPiece( Board b ) {

        do {
            System.out.println( "" );
            affichageNomJoueur();
            System.out.println( "Selectionnez la pièce à jouer" );

            scanner = new Scanner( System.in );
            String lettre = scanner.next();
            int numero = scanner.nextInt();

            int pieceLigne = convertirNumero( numero );
            int pieceColonne = convertirLettre( lettre );

            choixPiece = b.board[pieceLigne][pieceColonne];

            if ( choixPiece.couleur == couleur.NULL )
                System.out.println( "Cette case est vide!" );

        } while ( choixPiece.couleur == couleur.NULL );
        // System.out.println(choixPiece.ligne);
        // System.out.println(choixPiece.colonne);
        return choixPiece;
    }

    public void demanderCase( Board b ) {

        if ( choixPiece.getClass().getSimpleName().equals( "Reine" )
                || choixPiece.getClass().getSimpleName().equals( "Tour" ) )
            System.out.println( "Où bouger cette " + choixPiece.getClass().getSimpleName() + " ?" );
        else
            System.out.println( "Où bouger ce " + choixPiece.getClass().getSimpleName() + " ?" );

        scanner = new Scanner( System.in );
        String lettre = scanner.next();

        if ( lettre.equals( "help" ) ) {
            b.displayHelp( choixPiece );
            choixLigne = helpLigne;
            choixColonne = helpColonne;
        } else {
            int numero = scanner.nextInt();
            choixLigne = convertirNumero( numero );
            choixColonne = convertirLettre( lettre );
            choixCase = new Case( choixLigne, choixColonne );

        }
    }

    public void move( Board b, Piece p, int ligne, int colonne ) {
        p.moved = false;
        // si case est help tu fais rien, moved reste à false donc meme joueur
        // rejoue
        if ( ligne != helpLigne && colonne != helpColonne ) {

            for ( Case c : p.possibleMoves )
                if ( c.ligne == ligne && c.colonne == colonne ) {
                    b.board[p.ligne][p.colonne] = new PieceNull( p.ligne, p.colonne );
                    p.ligne = ligne;
                    p.colonne = colonne;
                    b.board[p.ligne][p.colonne] = p;
                    p.moved = true;
                }

            if ( p.moved == false )
                System.out.println( "Impossible de bouger cette pièce sur cette case." );
            b.display();
        }
    }

    public void affichageNomJoueur() {
        if ( nom == echec.nom.JBLANC )
            System.out.println( "JOUEUR BLANC" );
        else
            System.out.println( "JOUEUR NOIR" );
    }

    public int convertirNumero( int numero ) {
        switch ( numero ) {
        case 1:
            return 7;
        case 2:
            return 6;
        case 3:
            return 5;
        case 4:
            return 4;
        case 5:
            return 3;
        case 6:
            return 2;
        case 7:
            return 1;
        case 8:
            return 0;
        default:
            return 10;
        }
    }

    public int convertirLettre( String lettre ) {
        switch ( lettre ) {
        case "A":
            return 0;
        case "B":
            return 1;
        case "C":
            return 2;
        case "D":
            return 3;
        case "E":
            return 4;
        case "F":
            return 5;
        case "G":
            return 6;
        case "H":
            return 7;
        default:
            return 10;
        }
    }
}