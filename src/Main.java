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
    }
}
