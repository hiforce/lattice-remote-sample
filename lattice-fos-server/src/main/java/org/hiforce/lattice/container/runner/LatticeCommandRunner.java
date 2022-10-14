package org.hiforce.lattice.container.runner;

import org.hiforce.lattice.remote.client.LatticeRemoteClient;
import org.hiforce.lattice.remote.client.model.RemoteBusiness;
import org.hiforce.lattice.remote.client.model.RemoteExtension;
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

        RemoteBusiness remoteBusiness = new RemoteBusiness();
        remoteBusiness.setBizCode("business.a");
        remoteBusiness.getExtensions().add(RemoteExtension.of("EXT_REMOTE_HELLO_INVOKE", true));

        LatticeRemoteClient.getInstance().registerRemoteBusiness(remoteBusiness);
        System.out.println(">>> Lattice started!");
    }
}
