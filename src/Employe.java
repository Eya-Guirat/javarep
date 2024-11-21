import java.util.Objects;

public class Employe implements Comparable<Employe> {

    private int id;
    private String nom;
    private String prenom;
    private String departement;
    private int grade;


    public Employe() {
    }


    public Employe(int id, String prenom, String nom, String departement, int grade) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.departement = departement;
        this.grade = grade;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employe employe = (Employe) obj;
        return id == employe.id && nom.equals(employe.nom);
    }


    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", departement='" + departement + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Employe o) {
        return Integer.compare(this.id, o.id);
    }
}
