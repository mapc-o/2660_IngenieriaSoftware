package Tarea4_patrónSingleton;

public class ClaseSingleton {
    private static ClaseSingleton instancia;
    
    private int sonido;
    private int brillo;
    private int sensibilidad;
    private String res;




    private ClaseSingleton(){
        this.sonido = 100;
        this.brillo = 100;
        this.sensibilidad = 60;
        this.res = "1920 x 1080";

    };



    public static ClaseSingleton getInstancia(){
        if(instancia == null){
                instancia = new ClaseSingleton();
        };

        return instancia;

    };

    public int getSonido() {
        return sonido;
    }

    public int getBrillo(){
        return brillo;
    }

    public int getSensibilidad() {
        return sensibilidad;
    }

    public String getRes() {
        return res;
    }

    public void setSonido(int sonido) {
        this.sonido = sonido;
    }

    public void setBrillo(int brillo) {
        this.brillo = brillo;
    }

    public void setSensibilidad(int sensibilidad) {
        this.sensibilidad = sensibilidad;
    }

    public void setRes(String res) {
        this.res = res;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{sonido=").append(sonido);
        sb.append(", brillo=").append(brillo);
        sb.append(", sensibilidad=").append(sensibilidad);
        sb.append(", res=").append(res);
        sb.append('}');
        return sb.toString();
    }




    


    
}
