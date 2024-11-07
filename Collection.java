package tp7;

abstract  class Ustensile {
	protected int annee;
	public Ustensile(int a){
	this.annee=a;	}
public double calculerValeur() {
	        int age=2024-annee;
	        if (age<50){
	            return 0;
	        }
	        return age-50;
	    }
}


class AssietteRonde extends Assiette {
    private double rayon;

    public AssietteRonde(int annee,double rayon) {
        super(annee);
        this.rayon=rayon;
    }
    public double calculerSurface() {
        return Math.PI*rayon*rayon;
    }

 
}
class AssietteCarree extends Assiette {
    private double cote;
    public AssietteCarree(int annee,double cote) {
        super(annee);
        this.cote=cote;
    }

    public double calculerSurface() {
        return cote*cote;
    }
    public double calculerValeur() {
        return super.calculerValeur() * 5; 
    }
}

class Cuillere extends Ustensile {
    private double longueur;

    public Cuillere(int annee,double longueur) {
        super(annee);
        this.longueur=longueur;
    }
 
}

 public class Collection {

	 public static void main(String[] args) {
	Ustensile[] us = new Ustensile[5];
	us[0] = new AssietteRonde(1926, 8.4);
	us[1] = new Cuillere(1881, 7.3); 
	us[2]= new AssietteCarree(1935, 5.6); 
	us[3]= new Cuillere(1917, 8.8);
	us[4] = new AssietteRonde(1837, 5.4);

	 afficherCuilleres(us);
	afficherSurfaceAssiettes(us);
	afficherValeurTotale(us);
	 }
	 static void afficherCuilleres(Ustensile[] us) {
	        int nbCuilleres=0;
	        for (int i=0;i<us.length;i++) {
	            if (us[i] instanceof Cuillere) {
	                nbCuilleres++;
	            }
	        }
	        System.out.println("Il y a"+nbCuilleres+"cuillères");
	    }

	    static void afficherSurfaceAssiettes(Ustensile[] us) {
	        double somme=0;
	        for (int i=0;i<us.length;i++) {
	            if (us[i] instanceof Assiette) {
	                somme+=((Assiette)us[i]).calculerSurface();
	            }
	        }
	        System.out.println("Surface totale des assiettes:"+somme);
	    }

	    static void afficherValeurTotale(Ustensile[] us) {
	        double somme=0;
	        for (int i=0;i<us.length; i++) {
	            somme+=us[i].calculerValeur();
	        }
	        System.out.println("Valeur totale de la collection : " + somme);
	    }
	}