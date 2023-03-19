package presentation;

import dao.DaoImpl2;
import metier.MetierImpl;


//5. Faire l'injection des dépendances :
//  a. Par instanciation statique

public class Presentation {
    //classe fabrique
    public static void main(String[] args) {

        //Instantiation statique
        DaoImpl2 dao =  new DaoImpl2();

        //avec constructeur
        MetierImpl metier = new MetierImpl(dao);

        //avec setter
        //metier.setDao(dao);

        System.out.println("Resultat =" + metier.calcul());

    }
}
