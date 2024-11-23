public class Cuadrado extends Figura{

    //Atributo de la clase
    private double lado;

    //Constructores
    public Cuadrado(){

    }

    public Cuadrado(double x, double y, double lado){
        super( x, y);
        this.lado = lado;

    }

    //Metodos getter and setter
    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado = lado;

    }

    //Tengo el mismo metodo de la clase madre (Figura), pero lo implementara de forma distinta(Circulo)
    @Override//Override = Sobreescritura
    public double calcularArea() { //El metodo se implemetara "{}" de manera distinta en cada clase hija

        double areaCuadrado = lado * lado;
        return areaCuadrado;

    }
}