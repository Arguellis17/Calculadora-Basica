
package dominio;


public class Principal {
    
    public static void main(String[] args) {
        
        // Creando dos atributos que seran pasados al constructor
        int a = 3;
        int b = 5;
        
        // Constructor de la clase operacion
        Operacion realizar = new Operacion(a,b);
        
        // Imprimiendo resultados
        System.out.println("Suma de los numeros : " + realizar.sumar());
        System.out.println("Resta de los numeros: " + realizar.restar());
        System.out.println("Multiplicacion de los numeros " + realizar.dividir());
        System.out.println("Division de los numeros: " + realizar.multiplicar());
        
       
    }
}
