package service;

public class PortariaService {

    public Boolean permitirEntrada(Pessoa pessoa){

        if (pessoa.getIdade()>=18){
            return true;
        } else if (pessoa.getIdade()>=16 && pessoa.isAcompanhada()){
            return true;
        } else if (pessoa.getIdade()>=16 || pessoa.getIdade()<18 && !pessoa.isAcompanhada()){
            return false;
        } else if (pessoa.getIdade()<16) {
            return false;
        }
        return false;
    }
}
