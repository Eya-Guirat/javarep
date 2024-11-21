import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {
    private List<Employe> employes;


    public SocieteArrayList() {
        employes = new ArrayList<>();
    }


    @Override
    public void ajouterEmploye(Employe t) {
        employes.add(t);
    }


    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean rechercherEmploye(Employe t) {
        return employes.contains(t);
    }


    @Override
    public void supprimerEmploye(Employe t) {
        employes.remove(t);
    }


    @Override
    public void displayEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }


    @Override
    public void trierEmployeParId() {
        Collections.sort(employes, Comparator.comparingInt(Employe::getId));
    }


    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employes.sort(Comparator.comparing(Employe::getDepartement)
                .thenComparing(Employe::getGrade));
    }
}
