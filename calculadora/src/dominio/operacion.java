
package dominio;


public class Operacion {
    // Atributos
    private int a;
    private int b;
    
    // Constructor
    public Operacion(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    // Metodos consultores
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    // Metodos operacionales
    public int sumar(){
        
        return (a + b);
    }
    public int restar(){
        
        return (a - b);
    }
    public int multiplicar(){
        
        return (a * b);
   }
    public double dividir(){
        
        return ((double) a / b);
    }
    
           
    
}
