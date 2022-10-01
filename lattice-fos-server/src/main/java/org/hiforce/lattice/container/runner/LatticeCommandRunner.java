package org.hiforce.lattice.container.runner;

import org.hiforce.lattice.runtime.Lattice;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Rocky Yu
 * @since 2022/9/16
 */
@Component
public class LatticeCommandRunner implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {

        Lattice.getInstance().setSimpleMode(true);
        Lattice.getInstance().start();
        System.out.println(">>> Lattice started!");
    }
}
