package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//c. En utilisant le Framework Spring
//       - Version XML
public class PresentationSpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier = (IMetier) context.getBean("metier");
        System.out.println("Resultat :" + metier.calcul());
    }
}
