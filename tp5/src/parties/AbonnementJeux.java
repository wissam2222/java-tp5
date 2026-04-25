package parties;

public class AbonnementJeux extends Abonnement {
   protected  int nbJeuxInclus;
   protected  int heuresJeuParMois;
   public AbonnementJeux(String nom ,double prixBase,int nbProfils,int nbJeuxInclus,int heuresJeuParMois) {
	   super(nom,prixBase,nbProfils);
	   this.heuresJeuParMois=heuresJeuParMois;
	   this.nbJeuxInclus=nbJeuxInclus;
}
public  double calculerCoutMensuel() {
	double coutTotal= getPrixBase();
	if(nbJeuxInclus > 50) {
		coutTotal += 25;
	}
	if(heuresJeuParMois > 40) {
		coutTotal += 15;
	}
	
	return coutTotal;
}
public int calculerScoreSatisfaction() {
	int score=40;
	if(nbJeuxInclus>=30) {
		score += 20;
	}
	if(heuresJeuParMois >20) {
		score += 20;

	}
	if(getNbProfils() >=2) {
		score += 10;
	}
	if(score>100) {
		score =100;
	}
  return score;}

}