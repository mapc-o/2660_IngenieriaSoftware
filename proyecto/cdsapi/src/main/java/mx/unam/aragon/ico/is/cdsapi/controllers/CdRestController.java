package mx.unam.aragon.ico.is.cdsapi.controllers;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.unam.aragon.ico.is.cdsapi.entities.Cd;
import mx.unam.aragon.ico.is.cdsapi.services.interfaces.CdService;

@RestController
@RequestMapping("/api/v1/cds")

public class CdRestController {
   @Autowired
   private CdService cdService;

   @GetMapping("/")
   public ResponseEntity<Iterable<Cd>> getCd(){
      //return cdService.listar();
      return new ResponseEntity<>(cdService.listar(), HttpStatus.OK);
   }
    
   //{variable de ruta}
   @GetMapping("/{clave}")
   public ResponseEntity<Cd> getCdPorClave(@PathVariable Long clave) {
      //return computadoraService.buscarPorId(clave).orElse(null);
      //return new ResponseEntity<>(computadoraService.buscarPorId(clave).orElse(null),HttpStatus.OK);
      Optional<Cd> tmp = cdService.buscarPorId(clave);
      if(tmp.isPresent()){
         return new ResponseEntity<>(tmp.get(), HttpStatus.OK);
      } else {
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
   }

   @PostMapping("/")
   public ResponseEntity<Cd> createCd(@RequestBody Cd cd){
      return new ResponseEntity<>(cdService.crear(cd), HttpStatus.CREATED);
   }

   @PostMapping("/{id}")
   public ResponseEntity<String> noExiste() {
      return new ResponseEntity<>("End Point no soportado", HttpStatus.NOT_FOUND);

   }

   @PatchMapping("/{clave}")
   public ResponseEntity<Cd> actualizarParcial(@PathVariable Long clave, @RequestBody Cd cd){
      Cd tmp = cdService.buscarPorId(clave).orElse(null);
      if(tmp != null){
         if(cd.getNombre() != null) tmp.setNombre(cd.getNombre());
         if(cd.getArtista() != null) tmp.setArtista(cd.getArtista());
         if(cd.getGenre() != null) tmp.setGenre(cd.getGenre());
         if(cd.getPrecio() != null) tmp.setPrecio(cd.getPrecio());
         if(cd.getFoto() != null) tmp.setFoto(cd.getFoto());
         return new ResponseEntity<>(cdService.actualizar(clave, tmp), HttpStatus.OK);
      } else {
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);

      }
   }

   @PutMapping("/{clave}")
   public ResponseEntity<Cd> editar(@PathVariable Long clave, @RequestBody Cd cd){
      Optional tmp = cdService.buscarPorId(clave);
      if(tmp.isPresent()){
         return new ResponseEntity<>(cdService.actualizar(clave, cd), HttpStatus.OK);
      } else {
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);

      }
   }

   @DeleteMapping("/{clave}")
   public ResponseEntity<Cd> eliminar(@PathVariable Long clave) {
      Cd tmp = cdService.buscarPorId(clave).orElse(null);
      if (tmp != null){
         return new ResponseEntity<>(cdService.eliminar(clave), HttpStatus.OK);
   
      } else {
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
      
   }




}
