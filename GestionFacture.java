public class GestionFacture {
 public static void main(String[]args) {
  String nom_produit = args[0];
  double prix_unitaire = Double.parseDouble(args[1]);
  int quantite = Integer.parseInt(args[2]);
  double montant_totale = prix_unitaire*quantite;
  System.out.println("FACTURE :");
  System.out.println("Produit :"+nom_produit);
  System.out.println("Prix Unitaire :"+prix_unitaire);
  System.out.println("Quantité :"+quantite);
  System.out.println("Montant total :"+montant_totale);
 }
}
   
    