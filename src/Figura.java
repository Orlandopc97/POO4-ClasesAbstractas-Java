//Se utiliza la palabra reservada abstract
//Al ser clase abstracta se vuelve clase padre
public abstract class  Figura {

    //Sus atributos(variables) se utiliza protected para que solo los pueden ver sus clases hijas
    protected double x; //posicion x
    protected double y; //posicion y

    //Tambien una clase abstracta puede tener constructores pero solo los podran utilizar sus clases hijas.
    //Por eso se utiliza el tipo de acceso protected
    protected Figura(){//Constructor vacio
    }
    protected Figura(double x, double y){//Constructor lleno
        this.x = x;
        this.y = y;
    }

    //Al menos uno de sus metodos debe ser abstracto
    //El metodo clacular area se definiria abstracto por que cada figura calcula diferente su area(circulo, cuadrado, etc)
    public abstract double calcularArea(); //No se ponen llaves por que no se hace implementacion




}
