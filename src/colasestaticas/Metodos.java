package colasestaticas;

import java.util.ArrayList;

/**
 *
 * @author diego.diaz
 */
public class Metodos {
    
    ArrayList<Person> pila = new ArrayList<>();
    
    //Metodo para agragar una persona en cola
    public void Push(Person persona){
        pila.add(persona);
    }
    
    //Metodo para eliminar al primer elemento en cola
    public void Pop(){
        if (!pila.isEmpty()) {
            pila.remove(0);
        }
    }
    
    //Metodo para ver
    public String Verpila(){
        String u = " ";
        for (int i = 0; i < pila.size(); i++) {
            u+="Elemento" + (i+1) + " " + pila.get(i) + "\n";
        }
        return u;
    }
    
    //Metodo para saber el tamaño de la cola
    public int Item(){
        return pila.size();
    }
    
    //metodo para eliminar todos las personas de la cola
    public void VaciarPila(){
        pila.clear();
    }
    
    //metodo para acceder a la ultima persona en cola
    public Person Ultimo(){
        Person n = null;
        if(pila.size() > 0){
            n = pila.get(pila.size() - 1);
        }
        return n;
    }
    
    //metodo para acceder a la primera persona en cola
    public Person Primero(){
        Person u = null;
        if(pila.size() > 0){
            u = pila.get(0);
        }
        return u;
    }
    
    public String Co(){
        String q = "";
        if (pila.isEmpty()) {
            q = "Si";
        }else{
            q = "No";
        }
        return q;
    }
    
    public Person GPersona(int i){
        Person m;
        m = pila.get(i);
        return m;
    }
 
}
