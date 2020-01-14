
package boletin14ex;

public class TemperaturaErrada extends Exception {

    TemperaturaErrada(String string) {
        
    }
    public void error (int Cent) {
         if (Cent<80)
            System.out.println("Se esta trabajando a temperaturas bajas");
         else
            System.out.println("La temperatura es correcta");  
     }
}
