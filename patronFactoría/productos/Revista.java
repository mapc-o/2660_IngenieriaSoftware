

package productos;

import productos.factory.Producto;

public class Revista implements Producto {
    private int issn;
    private String nombre;
    private int edicion;
    private int precio;
    private String periodicidad;

    public Revista(int issn,String nombre,int edicion, String periodicidad, int precio) {
        this.issn = issn;
        this.nombre = nombre;
        this.edicion = edicion;
        this.periodicidad = periodicidad;
        this.precio = precio;
    }


    public Revista() {
    }


    public int getIssn() {
        return issn;
    }

    public void setIssn(int issn) {
        this.issn = issn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public String toString() {
        return "Revista [issn=" + issn + ", nombre=" + nombre + ", edición=" + edicion + ", precio=" + precio + ", periodicidad="
                + periodicidad + "]";
    }
    
}
