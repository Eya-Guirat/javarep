public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Eya", "Guirat", "IT", 5);
        Employe e2 = new Employe(2, "Amal", "Jazi", "HR", 3);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);

        System.out.println("All Employees:");
        societe.displayEmploye();

        System.out.println("Sorted by ID:");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("Sorted by Department and Grade:");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
    }
}
