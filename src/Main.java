public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Dupont", "Jean", "RH", 3);
        Employe e2 = new Employe(2, "Durand", "Marie", "IT", 4);
        Employe e3 = new Employe(3, "Martin", "Paul", "Finance", 2);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("Liste des employés :");
        societe.displayEmploye();

        System.out.println("\nRecherche par nom (Durand) : " + societe.rechercherEmploye("Durand"));

        System.out.println("\nTri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\nTri par département et grade :");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();
    }
}
