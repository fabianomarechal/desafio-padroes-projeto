package dio.desafio.padroesdeprojeto.gof.facade;

import dio.desafio.padroesdeprojeto.subsystem1.crm.CrmService;
import dio.desafio.padroesdeprojeto.subsystem2.cep.CepApi;

public class Facade {
    public void migrarCliente(String name, String cep){
        String city = CepApi.getInstance().getCity(cep);
        String state = CepApi.getInstance().getState(cep);
        CrmService.saveClient(name, cep, city, state);
    }
}
