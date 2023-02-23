/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SALA
 */
public class Auto {
          //Atributos
    String placa;
    String color;
    int modelo;
    String marca;
    float km;
    float cilindraje;
    float precio;
    boolean autoencendido;
    double velocidad;



//Metodos
        //Constructor
    public Auto(boolean autoencendido, String placa, int modelo, String marca){
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.autoencendido = false;
        this.velocidad = 0;
        
        
                

}

 

   
    
    //infoAuto: devuelve la información del objeto.
    
    public void infoAuto(){
        System.out.println("""
                           
                Datos Auto;
                + "Placa: """ + this.placa + "\n"
                + "Color: " + this.color + "\n"
                + "Modelo: " + this.modelo + "\n"
                + "Marca: " + this.marca + "\n"
                + "Kilometraje: " + this.km + "\n"
                + "Cilindraje: " + this.cilindraje + "\n"
                + "Precio: " + this.precio + "\n"
        );
    }
    public void encenderAuto (){
    if (this.autoencendido == true){
        System.out.println("El auto ya está encendido");
    }else{
        this.autoencendido=true;
        System.out.println("Encendiendo el auto");
    }
    }
    
    
        
        
    public void apagarAuto(){
    if (this.autoencendido == true){
        this.autoencendido = false;
        System.out.println("Apagando el auto");
        this.velocidad = 0;
    }else{
        this.autoencendido=false;
        System.out.println("El auto ya está apagado");
    }
    }

    public void acelerarAuto(int velocidad){
        if (this.autoencendido == true){
            this.velocidad = this.velocidad + velocidad;
        }else{
            System.out.println("Auto apagado, por favor enciéndalo");
        }
    }
    public void frenarAuto(int velocidad){
        if (this.velocidad>0 && this.autoencendido == true){
            this.velocidad = this.velocidad-velocidad;
            System.out.println("deteniendo el auto");
            
        }else if(this.velocidad==0)
            System.out.println("El auto ya está detenido");
            
        if (this.velocidad<0){
            this.velocidad = 0;
        }
            
    }
    
    
    
            
                
               
       
        
        
   
        
        
}
    
    












