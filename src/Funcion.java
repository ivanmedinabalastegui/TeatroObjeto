public class Funcion {
    private String nombre;
    private int precio;

    public Funcion(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String toString() {
        return "Nombre= '" + nombre + '\n' +
                "Precio= " + precio;
    }
}
