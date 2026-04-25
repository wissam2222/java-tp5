package parties;

public class TestAbonnements {

public static void main(String[] args) {
Abonnement []abonnements = new Abonnement[3];
AbonnementVideo video = new AbonnementVideo("Youtube",199,2,true,false);
AbonnementMusique musique = new AbonnementMusique("Spotify",60,1,4,false);	
AbonnementJeux jeux= new AbonnementJeux("Games",267,0,5,6);	
 abonnements[0] = video ;
 abonnements[1]= musique;
 abonnements[2]=jeux;
for(Abonnement a: abonnements){
    a.afficherInfos();
    System.out.println("Cout: " + a.calculerCoutMensuel() + "DH");
    System.out.println("Score: " + a.calculerScoreSatisfaction());
    
}
Reducible []Reducible = new Reducible[2];
Reducible[0]= video;
Reducible[1]= musique;

// Réducible 20%
System.out.println("Réduction 20% sur Youtube:" + video.appliquerReduction(20)+ "DH");
System.out.println("Réduction 20% sur Spotify : " + musique.appliquerReduction(20) + "DH");

// Réduction 50% (non autoriséé , > 30%)
System.out.println("Réduction 50% sur Youtube:" + video.appliquerReduction(50)+ "DH");
System.out.println("Réduction 50% sur Spotify : " + musique.appliquerReduction(50) + "DH");

}
}
