
package practica1;
/**
 *
 * @author Dayal
 */
class Practica1 {

    private String nombre;
    private String mensaje;
    public Practica1(){
        this.mensaje ="";
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getMensaje(){
        return this.mensaje = "Hola: " + this.nombre;
    }
    
    public static void main(String[] args) {
        Practica1 ob = new Practica1();
        ob.setNombre("Dayal");
        System.out.println(ob.getMensaje());
           
    }
    
}
