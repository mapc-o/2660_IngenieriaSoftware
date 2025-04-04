package Tarea4_patrónSingleton;

public class Juego {
    public void instanciaJuego(){
        ClaseSingleton juego = ClaseSingleton.getInstancia();
        System.out.println("Juego "+ juego.toString());
    };

}
