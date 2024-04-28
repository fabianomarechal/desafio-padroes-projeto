package dio.desafio.padroesdeprojeto.gof.strategy;

public class ManualAccelerator implements Accelerator {
    @Override
    public void accelerate() {
        System.out.println("Aceleração manual ativada. Aumentando velocidade gradualmente.");
    }

    @Override
    public void decelerate() {
        System.out.println("Aceleração manual ativada. Reduzindo velocidade gradualmente.");
    }
}
