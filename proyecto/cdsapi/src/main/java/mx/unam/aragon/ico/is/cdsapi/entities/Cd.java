package mx.unam.aragon.ico.is.cdsapi.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "cds")
public class Cd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clave;

    @Column(name= "nombre_cd", nullable = false, length = 50)
    @NotBlank(message = "¿eres gallego o qué, no se aceptan blancos?")
    @NotNull(message = "No debería ser nulo")
    private String nombre;

    @Column(name = "artista_cd", columnDefinition = "VARCHAR(50) not null")
    private String artista;

    @Column(name = "genre_cd", columnDefinition = "VARCHAR(50) not null")
    private String genre;

    @Column(name= "url_foto", nullable= true, insertable= false, columnDefinition = "VARCHAR(500) DEFAULT 'https://upload.wikimedia.org/wikipedia/en/a/a2/Oingo_Boingo-Only_a_Lad.jpg?20120520191436'")
    private String foto;

    @Column(name= "precio_pesos", nullable= true)
    private float precio;

    public Cd(int clave, String nombre, String artista, String genre, String foto, float precio) {
        this.clave = clave;
        this.nombre = nombre;
        this.artista = artista;
        this.genre = genre;
        this.foto = foto;
        this.precio = precio; 
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Cd() {
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + clave;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((artista == null) ? 0 : artista.hashCode());
        result = prime * result + ((genre == null) ? 0 : genre.hashCode());
        result = prime * result + ((foto == null) ? 0 : foto.hashCode());
        result = prime * result + Float.floatToIntBits(precio);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cd other = (Cd) obj;
        if (clave != other.clave)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (artista == null) {
            if (other.artista != null)
                return false;
        } else if (!artista.equals(other.artista))
            return false;
        if (genre == null) {
            if (other.genre != null)
                return false;
        } else if (!genre.equals(other.genre))
            return false;
        if (foto == null) {
            if (other.foto != null)
                return false;
        } else if (!foto.equals(other.foto))
            return false;
        if (Float.floatToIntBits(precio) != Float.floatToIntBits(other.precio))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cd [clave=" + clave + ", nombre=" + nombre + ", artista=" + artista + ", genre=" + genre + ", foto="
                + foto + ", precio=" + precio + "]";
    }


    

    
}