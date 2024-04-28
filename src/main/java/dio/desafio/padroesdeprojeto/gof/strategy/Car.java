package dio.desafio.padroesdeprojeto.gof.strategy;

public class Car implements Accelerator {
    private int speed = 0;
    private Accelerator accelerator;

    public void accelerate() {
        accelerator.accelerate();
    }

    public void decelerate() {
        accelerator.decelerate();
    }

    public void setAccelerator(Accelerator accelerator) {
        this.accelerator = accelerator;
    }
}
