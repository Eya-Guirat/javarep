import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {
    private List<Employe> employes;

    // Constructor
    public SocieteArrayList() {
        employes = new ArrayList<>();
    }

    // Add an employee to the list
    @Override
    public void ajouterEmploye(Employe t) {
        employes.add(t);
    }

    // Search for an employee by name
    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    // Search for an employee by object
    @Override
    public boolean rechercherEmploye(Employe t) {
        return employes.contains(t);
    }

    // Remove an employee from the list
    @Override
    public void supprimerEmploye(Employe t) {
        employes.remove(t);
    }

    // Display all employees
    @Override
    public void displayEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    // Sort employees by ID
    @Override
    public void trierEmployeParId() {
        Collections.sort(employes, Comparator.comparingInt(Employe::getId));
    }

    // Sort employees by Department and Grade
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employes.sort(Comparator.comparing(Employe::getDepartement)
                .thenComparing(Employe::getGrade));
    }
}
