import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Eya", "Guirat", "IT", 5);
        Employe e2 = new Employe(2, "Amal", "Jazi", "HR", 3);
        Employe e3 = new Employe(3, "Ali", "Ben Ali", "Gestion", 10);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("Tous les employés :");
        societe.displayEmploye();

        System.out.println("Trié par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("Trié par Département et Grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();




        DepartementHashSet gestionDepartements = new DepartementHashSet();

        Departement d1 = new Departement(1, "IT", 50);
        Departement d2 = new Departement(2, "HR", 20);
        Departement d3 = new Departement(3, "Finance", 30);

        gestionDepartements.ajouterDepartement(d1);
        gestionDepartements.ajouterDepartement(d2);
        gestionDepartements.ajouterDepartement(d3);

        System.out.println("Tous les départements :");
        gestionDepartements.displayDepartement();

        System.out.println("Départements triés par ID :");
        TreeSet<Departement> sortedDepartements = gestionDepartements.trierDepartementById();
        for (Departement d : sortedDepartements) {
            System.out.println(d);
        }
    }
}
