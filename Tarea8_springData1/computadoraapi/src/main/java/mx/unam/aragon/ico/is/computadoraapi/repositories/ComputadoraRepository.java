package mx.unam.aragon.ico.is.computadoraapi.repositories;

import org.springframework.data.repository.CrudRepository;
import mx.unam.aragon.ico.is.computadoraapi.entities.Computadora;

public interface ComputadoraRepository extends CrudRepository<Computadora, Long> {
    public Computadora findComputadoraByClave(Long Clave);
}