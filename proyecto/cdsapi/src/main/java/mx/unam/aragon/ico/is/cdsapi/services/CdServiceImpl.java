package mx.unam.aragon.ico.is.cdsapi.services;

import mx.unam.aragon.ico.is.cdsapi.services.interfaces.CdService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.unam.aragon.ico.is.cdsapi.entities.Cd;
import mx.unam.aragon.ico.is.cdsapi.repositories.CdRepository;

@Transactional
@Service
public class CdServiceImpl implements CdService{

    @Autowired
    private CdRepository cdRepository;

    @Override
    public Optional<Cd> buscarPorId(Long id) {
        return cdRepository.findById(id);
    }

    @Override
    public Iterable<Cd> listar() {
        return cdRepository.findAll();
    }

    @Override
    public Cd crear(Cd cd) {
        return cdRepository.save(cd);
    }

    @Override
    public Cd actualizar(Long id, Cd cd) {
        Optional<Cd> cdActual = cdRepository.findById(id);
        if(cdActual.isPresent()){
            Cd cdobj = cdActual.get();
            cdobj.setNombre(cd.getNombre());
            cdobj.setArtista(cd.getArtista());
            cdobj.setGenre(cd.getGenre());
            cdobj.setFoto(cd.getFoto());
            cdobj.setPrecio(cd.getPrecio());
            return cdRepository.save(cdobj);

        } else {
            return null;
        }
    }

    @Override
    public Cd eliminar(Long id) {
        Cd tmp = cdRepository.findById(id).orElse(null);
    if (tmp != null) {
            cdRepository.deleteById(id);
            return tmp; 
        }
        return null;
    }       
    
}
