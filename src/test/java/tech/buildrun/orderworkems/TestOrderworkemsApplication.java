package tech.buildrun.orderworkems;


import org.springframework.boot.SpringApplication;

import java.util.List;

import static tech.buildrun.orderworkems.ContainersConfig.*;

public class TestOrderworkemsApplication {

    public static void main(String[] args) {
        localStackContainer.setPortBindings(List.of("4566:4566"));
        localStackContainer.start();
        setupSqs();
        getProperties().forEach(System::setProperty);

        SpringApplication.from(OrderworkemsApplication::main).with(ServiceConnectionConfig.class).run(args);
    }

}
