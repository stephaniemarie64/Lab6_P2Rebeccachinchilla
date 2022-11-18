public class Billetera {
    
    public Billetera(int cantidadMaximaConsumo, int costos){
        this.cantidadMaximaConsumo = cantidadMaximaConsumo;
        this.costos = costos;
    }
    
    private int cantidadMaximaConsumo;
    private int costos;

    public int getCantidadMaximaConsumo() {
        return cantidadMaximaConsumo;
    }

    public void setCantidadMaximaConsumo(int cantidadMaximaConsumo) {
        this.cantidadMaximaConsumo = cantidadMaximaConsumo;
    }

    public int getCostos() {
        return costos;
    }

    public void setCostos(int costos) {
        this.costos = costos;
    }
}
