package serviceTeste;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.Pessoa;
import service.PortariaService;

public class PortariaServiceTest {



    @Test
    public void permiteEntradaMaior18(){
        //Given
        PortariaService portariaService = new PortariaService();

        Pessoa pessoa = new Pessoa("Mario", 18, false);
        //When

        //Then
        Assertions.assertTrue(portariaService.permitirEntrada(pessoa));

    }

    @Test
    public void proibeEntradaMenor18(){
        //Given
        PortariaService portariaService = new PortariaService();

        Pessoa pessoa = new Pessoa("Mario", 17, false);
        //When

        //Then
        Assertions.assertFalse(portariaService.permitirEntrada(pessoa));

    }

    @Test
    public void permiteEntradaMaior16Acompanhado(){
        //Given
        PortariaService portariaService = new PortariaService();

        Pessoa pessoa = new Pessoa("Mario", 17, true);
        //When

        //Then
        Assertions.assertTrue(portariaService.permitirEntrada(pessoa));

    }

    @Test
    public void proibeEntradaMaior16eMenor18NaoAcompanhado() {
        //Given
        PortariaService portariaService = new PortariaService();

        Pessoa pessoa = new Pessoa("Mario", 17, false);
        //When

        //Then
        Assertions.assertFalse(portariaService.permitirEntrada(pessoa));

    }

        @Test
        public void proibeEntradaMenor16(){
            //Given
            PortariaService portariaService = new PortariaService();

            Pessoa pessoa = new Pessoa("Mario", 15, false);
            //When

            //Then
            Assertions.assertFalse(portariaService.permitirEntrada(pessoa));

    }




}
