package Tarea4_patrónSingleton;

public class Lobby {
    public void instanciaLobby(){
        ClaseSingleton lobby = ClaseSingleton.getInstancia();
        System.out.println("Lobby "+ lobby.toString());

    };

    
}
