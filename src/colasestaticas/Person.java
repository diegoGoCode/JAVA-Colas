package colasestaticas;

/**
 *
 * @author diego.diaz
 */
public class Person {

    private String nombres;
    private String appelliPa;
    private String appelliMa;
    private int    edad;
    
    Person(){}

    public Person(String n, String apa, String ama, int e) {
        this.nombres = n;
        this.appelliPa = apa;
        this.appelliMa = ama;
        this.edad = e;
    }

    public String getNombres() {
        return nombres;
    }

    public String getAppelliPa() {
        return appelliPa;
    }

    public String getAppelliMa() {
        return appelliMa;
    }

    public int getEdad() {
        return edad;
    }
    
}
