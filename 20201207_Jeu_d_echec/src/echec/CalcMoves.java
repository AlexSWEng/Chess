package echec;

public interface CalcMoves {
    public void calcNextMoves( Board b );
    // avec les coords actuelles, cette méthode calcule toutes les cases valides
    // pour un next move, puis les stock dans un ArrayList pour comparaison avec
    // input utilisateur
}
