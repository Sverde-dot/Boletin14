package boletin14ex;
import java.util.Scanner;
public class ConversorTemperaturas {
    Scanner sc = new Scanner(System.in);
    private double Cent=80;
    private double Fhar;
    private double Ream;
    
    public void DarCent(){
        System.out.println("A cuantos grados estamos");
        Cent = sc.nextInt(); 
    }
    public void centigradosAFharenheit() throws TemperaturaErrada{
        if(Cent<80)
        throw new TemperaturaErrada ();
        //º Fharenheir = 9,0 / 5, 0 * centígrados + 32, 4
        Fhar=(9.0/5.0*Cent+32.4);
        
        System.out.println("Se esta trabajando a "+Fhar+"º Fharenheir");  
    }
    public void centígradosAReamur() throws TemperaturaErrada{
        if(Cent<80)
        throw new TemperaturaErrada ();
        //º Reamur = 4,0 / 5,0 * centígrados 
        Ream=(4.0/5.0*Cent);
        System.out.println("Se esta trabajando a "+Ream+"º Reamur");  
    } 
    
}
