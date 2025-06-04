package mx.unam.aragon.ico.is.cdsapi.services.interfaces;

import java.util.Optional;

import mx.unam.aragon.ico.is.cdsapi.entities.Cd;

public interface CdService {
    public abstract Optional <Cd> buscarPorId(Long id);
    public abstract Iterable<Cd> listar();
    public abstract Cd crear(Cd cd);
    public abstract Cd actualizar(Long id, Cd cd);
    public abstract Cd eliminar(Long id);
    
    
    
}
