package dio.desafio.padroesdeprojeto.gof.strategy;

public class AutomaticAccelerator implements Accelerator {
    @Override
    public void accelerate() {
        System.out.println("Aceleração automática ativada. Aumentando velocidade automaticamente.");
    }

    @Override
    public void decelerate() {
        System.out.println("Aceleração automática ativada. Reduzindo velocidade automaticamente.");
    }
}
