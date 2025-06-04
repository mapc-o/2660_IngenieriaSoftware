package mx.unam.aragon.ico.is.cdsapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import mx.unam.aragon.ico.is.cdsapi.entities.Cd;
import mx.unam.aragon.ico.is.cdsapi.repositories.CdRepository;

@SpringBootTest
class CdsapiApplicationTests {
	@Autowired
	private CdRepository cdRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void insertarCd() {
		Cd cd = new Cd(0, "Le Roi Est Mort, Vive Le Roi!", "ENIGMA", "New Age", null, 1300.0f);
		cdRepository.save(cd); //insert into table
	}

	@Test
	void leerCdPorClave() {
		Long claveTmp = 2l;
		Cd tmp = cdRepository.findCdByClave(claveTmp);
		System.out.println(tmp);
	}

	@Test
	public void deleteById() {
		Long claveTmp = 3l;
		cdRepository.deleteById(claveTmp);
	}
 
	@Test
	public void actualizarCd() {
		Long claveTmp = 1l;
		Cd tmp = cdRepository.findCdByClave(claveTmp);
		tmp.setGenre("Electrónica");
		cdRepository.save(tmp);
	}
}