/*Implementar una ProductFactory que encapsule la
creación de los diferentes tipos de productos.


Libros


ISBN, Tienen un título, una reseña, autor, precio y número de
páginas.


Revistas


ISSN, Tienen un nombre, número de edición, precio y
periodicidad.


Periódicos


ID, Tienen un nombre, fecha de publicación y precio. */
package productos;

import productos.factory.Producto;

public class Periodico implements Producto{
    private int id;
    private String nombre;
    private String fecha;
    private int precio;

    public Periodico() {
    }

    public Periodico( int id, String nombre, String fecha, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Periódico [id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", precio=" + precio + "]";
    }
}
