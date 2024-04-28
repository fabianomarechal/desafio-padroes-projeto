package dio.desafio.padroesdeprojeto;

import dio.desafio.padroesdeprojeto.gof.facade.Facade;
import dio.desafio.padroesdeprojeto.gof.singleton.SingletonLazy;
import dio.desafio.padroesdeprojeto.gof.singleton.SingletonEager;
import dio.desafio.padroesdeprojeto.gof.singleton.SingletonLazyHolder;
import dio.desafio.padroesdeprojeto.gof.strategy.Accelerator;
import dio.desafio.padroesdeprojeto.gof.strategy.AutomaticAccelerator;
import dio.desafio.padroesdeprojeto.gof.strategy.Car;
import dio.desafio.padroesdeprojeto.gof.strategy.ManualAccelerator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        testSingleton();

        testStrategy();

        Facade facade = new Facade();
        facade.migrarCliente("Fabiano", "12345678");
        facade.migrarCliente("Marecha", "23456789");

    }

    private static void testStrategy() {
        Accelerator manualAccelerator = new ManualAccelerator();
        Accelerator automaticAccelerator = new AutomaticAccelerator();

        Car car = new Car();

        car.setAccelerator(manualAccelerator);
        car.accelerate();
        car.decelerate();

        car.setAccelerator(automaticAccelerator);
        car.accelerate();
        car.decelerate();
    }

    private static void testSingleton() {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);

        singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);

        SingletonEager lazy = SingletonEager.getInstance();
        System.out.println(lazy);

        lazy = SingletonEager.getInstance();
        System.out.println(lazy);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
    }
}
