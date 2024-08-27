
/*
 * mi primer programa
 */
public class Saludar {

    // atributo
    String mensaje;

    // método Constructor default
    public Saludar() {
        setMensaje("Hola Mundo!... desde Constructor default.");
    }

    // método Constructor Sobrecargado
    public Saludar(String mensaje) {
        setMensaje(mensaje.concat("... desde Constructor Sobrecargado."));
    }

    // método Consultor / getter
    public String getMensaje() {
        return mensaje;
    }

    // método Modificador / setter
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /*
     * método punto de ejecución del código java
     */
    public static void main(String[] args) {

        // Inicio
        System.out.println("Hola Mundo!... desde Paradigma Estructurado.");

        Saludar saludo = new Saludar();
        System.out.println(saludo.getMensaje());

        String mensaje = "Hola Mundo!";
        saludo = new Saludar(mensaje);
        System.out.println(saludo.getMensaje());

    }
}