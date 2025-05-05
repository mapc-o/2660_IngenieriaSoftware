package mx.unam.aragon.ico.is.computadoraapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import mx.unam.aragon.ico.is.computadoraapi.entities.Computadora;
import mx.unam.aragon.ico.is.computadoraapi.repositories.ComputadoraRepository;

@SpringBootTest
class ComputadoraapiApplicationTests {
	@Autowired
	private ComputadoraRepository computadoraRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void insertarComputadora() {
		Computadora computadora = new Computadora(0,"HP","Pavilion 2000",null,13000.0f);
		computadoraRepository.save(computadora); //insert into table
	}

	@Test
	void leerComputadoraPorClave() {
		Long claveTmp = 2l;
		Computadora tmp = computadoraRepository.findComputadoraByClave(claveTmp);
		System.out.println(tmp);
	}

	@Test
	public void deleteById() {
		Long claveTmp = 3l;
		computadoraRepository.deleteById(claveTmp);
	}

	@Test
	public void actualizarComputadora() {
		Long claveTmp = 4l;
		Computadora tmp = computadoraRepository.findComputadoraByClave(claveTmp);
		tmp.setModelo("patito3000");
		computadoraRepository.save(tmp);
	}

}
