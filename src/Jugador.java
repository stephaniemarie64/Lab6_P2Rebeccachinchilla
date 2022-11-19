import java.util.ArrayList;

public class Jugador {
    
    public Jugador(String nombre, String usuario, int nivelGordura, int puntosConsumo, String alimento, ArrayList<Jugador> amigos, ArrayList<Jugador> solicitudAmistad, Billetera billetera) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.nivelGordura = nivelGordura;
        this.puntosConsumo = puntosConsumo;
        this.alimento = alimento;
        this.amigos = amigos;
        this.solicitudAmistad = solicitudAmistad;
        this.billetera = billetera;
    }
    
    private String nombre;
    private String usuario;
    private int nivelGordura;
    private int puntosConsumo;
    private String alimento;
    private ArrayList<Jugador> amigos;
    private ArrayList<Jugador> solicitudAmistad;
    private Billetera billetera;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getNivelGordura() {
        return nivelGordura;
    }

    public void setNivelGordura(int nivelGordura) {
        this.nivelGordura = nivelGordura;
    }

    public int getPuntosConsumo() {
        return puntosConsumo;
    }

    public void setPuntosConsumo(int puntosConsumo) {
        this.puntosConsumo = puntosConsumo;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public ArrayList<Jugador> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Jugador> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Jugador> getSolicitudAmistad() {
        return solicitudAmistad;
    }

    public void setSolicitudAmistad(ArrayList<Jugador> solicitudAmistad) {
        this.solicitudAmistad = solicitudAmistad;
    }

    public Billetera getBilletera() {
        return billetera;
    }

    public void setBilletera(Billetera billetera) {
        this.billetera = billetera;
    }

    public void aumentarConsumo(boolean subir){
        this.puntosConsumo += 100;
        if(subir){
            this.nivelGordura++;
        }
    }
    
}
