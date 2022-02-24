
package holamundo;

import java.awt.Color;
import poo.conceptos.Automovil;

public class HolaMundo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        
        //usando el atributo nombre de la clase persona 
        /* la clase persona se le esta llamando en el archivo hola mundo 
        como per1  y esta siendo igualado por new Persona
        como persona se llama per1, tiene los atributos de la clase persona
        por lo que estamos llamando a asu atributo nombre*/
        Persona per1 = new Persona();
        per1.setNombre("Arturo Vaz");
        //estamos llamando al atributo nombre de per1
        System.out.println("Nombre: " + per1.getNombre() );
        per1.Comer("Pizza Hawaiana");
        
        Persona per2 = new Persona();
        per2.setNombre("Felipe");
        System.out.println("Nombre: "+per2.getNombre());
        per2.Comer("Hamburguesa Hawaiana");
        System.out.println("\n");
    //llamando a la clase automovil con sus respectivos objetos
    
         //objeto VW Sedan
        Automovil miBocho = new Automovil();
        miBocho.setMarca("VW");//asignación del estado "VW" al atributo marca
        System.out.println("La marca del automovil es: "+miBocho.getMarca() );
        miBocho.setSubMarca("Sedan");//asignacion del estado "Sedan" al atributo submarca
        System.out.println("La submarca del automovil es: "+miBocho.getSubMarca());
        miBocho.setModelo(1970);//asignacion del estado "1970" al atributo modelo
        System.out.println("Modelo del automovil: "+miBocho.getModelo());
        miBocho.setColor(Color.BLUE);//asignacion del estado "color azul" al atributo Color
        System.out.println("Color del automovil: "+miBocho.getColor());
        System.out.println("\n");
        
        //objeto Ford Munstan
        Automovil miMustang = new Automovil();
        miMustang.setMarca("Ford");//asignación del estado "Ford" al atributo marca
        System.out.println("La marca del automovil es: "+miMustang.getMarca() );
        miMustang.setSubMarca("Mustan");//asignacion del estado "Mustang" al atributo submarca
        System.out.println("La submarca del automovil es: "+miMustang.getSubMarca());
        miMustang.setModelo(2010);//asignacion del estado "2010" al atributo modelo
        System.out.println("Modelo del automovil: "+miMustang.getModelo());
        miMustang.setColor(Color.YELLOW);//asignacion del estado "color amarrillo" al atributo Color
        System.out.println("Color del automovil: "+miMustang.getColor()); 
        System.out.println("\n");
        
        //objeto Akura NSX
        Automovil miAkura = new Automovil();
        miAkura.setMarca("Akura");//asignación del estado "Akura" al atributo marca
        System.out.println("La marca del automovil es: "+miAkura.getMarca() );
        miAkura.setSubMarca("NSX");//asignacion del estado "NSX" al atributo submarca
        System.out.println("La submarca del automovil es: "+miAkura.getSubMarca());
        miAkura.setModelo(2013);//asignacion del estado "2013" al atributo modelo
        System.out.println("Modelo del automovil: "+miAkura.getModelo());
        miAkura.setColor(Color.GRAY);//asignacion del estado "color gris" al atributo Color
        System.out.println("Color del automovil: "+miAkura.getColor());  
        System.out.println("\n");
    }   
}
