package echec;

public class Case {
    int     ligne;
    int     colonne;
    boolean eat;

    public Case( int ligne, int colonne ) {
        this.ligne = ligne;
        this.colonne = colonne;
        this.eat = false;
    }

    public Case( int ligne, int colonne, boolean eat ) {
        this.ligne = ligne;
        this.colonne = colonne;
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "[" + ligne + ";" + colonne + "]";
    }

    @Override
    public boolean equals( Object obj ) {
        if ( obj instanceof Case )
            if ( this.ligne == ( (Case) obj ).ligne && this.colonne == ( (Case) obj ).colonne
                    && this.eat == ( (Case) obj ).eat )
                return true;
        return false;
    }

}
