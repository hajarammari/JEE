package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
//5. Faire l'injection des dépendances :
//  b. Par instanciation dynamique
public class Presentation2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("src/config.txt"));
        //Connaître le nom de la classe
        String daoClassName = scanner.nextLine();
        //Charger la classe en mémoire
        Class cDao = Class.forName(daoClassName);
        //Instancier la classe
        IDao dao = (IDao) cDao.newInstance();
        System.out.println(dao.getData());


        //OBJET METIER
        String metierClasseName = scanner.nextLine();
        Class cMetier = Class.forName(metierClasseName);
        IMetier metier = (IMetier) cMetier.newInstance();

        //Injection
        Method method = cMetier.getMethod("setDao", IDao.class);
        //metier.setDao(dao)
        method.invoke(metier, dao);
        System.out.println("Résultat : "+ metier.calcul());
    }
}
