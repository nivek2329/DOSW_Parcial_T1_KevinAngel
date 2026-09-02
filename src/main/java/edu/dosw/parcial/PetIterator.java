import java.util.function.Consumer;

public interface IteradorMascota {
    boolean tieneSiguiente();
    Mascota siguiente();
    void paraCadaRestante(Consumer<Mascota> accion);
}
