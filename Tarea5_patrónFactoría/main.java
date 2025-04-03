import java.util.Scanner;
import productos.Tienda;
import productos.factory.productoFactory;
import productos.factory.Producto;


public class main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int opcion = 0;
        Tienda lib = new Tienda();
        lib.menu();
        opcion = key.nextInt();

     
        Producto producto = productoFactory.getProducto(opcion);
        System.out.println(producto);

       
    }
    
}
