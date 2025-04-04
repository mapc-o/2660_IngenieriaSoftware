package Tarea4_patrónSingleton;

public class Main {
    public static void main(String[] args) {
        ClaseSingleton singleton = ClaseSingleton.getInstancia();
        Juego instanciaJuego = new Juego();
        Lobby instanciaLobby = new Lobby();

        instanciaJuego.instanciaJuego();
        instanciaLobby.instanciaLobby();
 

        singleton.setBrillo(65);
        singleton.setSensibilidad(45);

        instanciaJuego.instanciaJuego();
        instanciaLobby.instanciaLobby();


    };

    
    
};
