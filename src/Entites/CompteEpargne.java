package Entites;

import java.util.Date;

public class CompteEpargne extends Compte {
    private float taux;


    public CompteEpargne(int code, float solde, int nbComptes, Date createdDate, Date updatedDate) {
        super(code, solde, nbComptes, createdDate, updatedDate);
    }

    @Override
    public void verser(float montant) {
        super.verser(montant);
    }

    @Override
    public void retirer(float montant) {
        super.retirer(montant);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public CompteEpargne(int code, float solde, int nbComptes, Date createdDate, Date updatedDate, float taux) {
        super(code, solde, nbComptes, createdDate, updatedDate);
        this.taux = taux;


    }
}
