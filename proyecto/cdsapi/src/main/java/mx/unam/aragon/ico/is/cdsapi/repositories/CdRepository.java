package mx.unam.aragon.ico.is.cdsapi.repositories;

import org.springframework.data.repository.CrudRepository;
import mx.unam.aragon.ico.is.cdsapi.entities.Cd;

public interface CdRepository extends CrudRepository<Cd, Long> {
    public Cd findCdByClave(Long Clave);
    public Cd deleteByClave(Long Clave);
}