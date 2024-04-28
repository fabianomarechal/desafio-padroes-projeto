package dio.desafio.padroesdeprojeto.subsystem1.crm;

public class CrmService {
    private CrmService(){
        super();
    }

    public static void saveClient(String name, String cep, String city, String state) {
        System.out.println("Cadastrando cliente com sucesso no CRM!");
        System.out.println("Nome: " + name);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + city);
        System.out.println("Estado: " + state);
    }
}
