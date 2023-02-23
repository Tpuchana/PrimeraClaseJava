/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author SALA
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto miAuto = new Auto(true, "ABC123", 2023, "BMW");
        
        //llamado de atributos
            //Asignación de valores
        miAuto.color = "Azul";        
        miAuto.km = 5230.8f;
        miAuto.cilindraje = 2500f;
        miAuto.precio = 85000000f;
        
        miAuto.infoAuto();
        miAuto.encenderAuto();
        System.out.println("Velocidad de miAuto es: "+ miAuto.velocidad);
        miAuto.acelerarAuto(5);
        System.out.println("Velocidad de miAuto es: "+ miAuto.velocidad);
        miAuto.acelerarAuto(30);
        System.out.println("Velocidad de miAuto es: "+ miAuto.velocidad);
        miAuto.frenarAuto(50);
        System.out.println("Velocidad de miAuto es: "+ miAuto.velocidad);
        miAuto.apagarAuto();
        System.out.println("Velocidad de miAuto es: "+ miAuto.velocidad);
        
            
    }        
    
}
        
    
//          Gato miGato = new Gato();
//          Perro miPerro = new Perro();
//          
//          miGato.color = "Negro";
//          miGato.edad = 7;
//          miGato.nombre = "Luna";
//          miGato.pelaje = "Liso";
//          miGato.sexo = "Femenino";
//          miGato.tamaño = "Pequeño";
//          miGato.raza = "Bombay";
//          miPerro.color = "Gris";
//          miPerro.edad = 7;
//          miPerro.nombre = "Pepa";
//          miPerro.pelaje = "Crepo";
//          miPerro.raza = "Caniche";
//          miPerro.sexo = "Femenino";
//          miPerro.tamaño = "Mediano";
//          
//          System.out.println("Datos Perro\n"
//                + "Raza: " + miPerro.raza + "\n"
//                + "Color: " + miPerro.color + "\n"
//                + "Edad: " + miPerro.edad + "\n"
//                + "Pelaje: " + miPerro.pelaje + "\n"
//                + "Sexo: " + miPerro.sexo + "\n"
//                + "Tamaño: " + miPerro.tamaño + "\n"
//                + "Nombre: " + miPerro.nombre + "\n"
//                  
//          );   
//          
//           System.out.println("Datos Gato\n"
//                + "Raza: " + miGato.raza + "\n"
//                + "Color: " + miGato.color + "\n"
//                + "Edad: " + miGato.edad + "\n"
//                + "Pelaje: " + miGato.pelaje + "\n"
//                + "Sexo: " + miGato.sexo + "\n"
//                + "Tamaño: " + miGato.tamaño + "\n"
//                + "Nombre: " + miGato.nombre + "\n"
//                  
//          );      
                  
                 
                             
    
    

