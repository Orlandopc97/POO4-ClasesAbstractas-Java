public class Circulo extends Figura {

    //Atributos
    private double radio;

    //Constructores
    public Circulo(){

    }
    public Circulo(double x, double y, double radio){
        super(x, y);
        this.radio = radio;
    }

    //Metados getters and setters


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Tengo el mismo metodo de la clase madre (Figura), pero lo implementara de forma distinta(Circulo)
    @Override //Override = Sobreescritura
    public double calcularArea() {//El metodo se implemetara "{}" de manera distinta en cada clase hija

        double pi = 3.1416;
        double areaCirculo = pi * radio + radio ;

        return areaCirculo;
    }
    //Se escribe el metodo de manera normal y arriba la anotacion @Override "Sobrescribir"
}
