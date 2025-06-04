package mx.unam.aragon.ico.is.cdsapi.exceptions;

import java.time.LocalDateTime;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.ConstraintViolationException;
 
@RestController
public class ManejadorGlobalExcepciones {
   @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<HashMap<String,String>> manejoDeRest(ConstraintViolationException ex) {
        HashMap<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje", ex.getLocalizedMessage());
        respuesta.put("timestamp", LocalDateTime.now().toString());
        return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<HashMap<String,String>> manejoDeRest(HttpMessageNotReadableException ex) {
        HashMap<String,String> respuesta = new HashMap<>();
        respuesta.put("mensaje", ex.getLocalizedMessage());
        respuesta.put("timestamp", LocalDateTime.now().toString());
        respuesta.put("status", HttpStatus.BAD_REQUEST.toString());
        return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);
    }
    
}
