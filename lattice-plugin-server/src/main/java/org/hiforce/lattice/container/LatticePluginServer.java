package org.hiforce.lattice.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jiongyang.wjy
 * @since 2022/4/18
 */

@SpringBootApplication
@EnableDiscoveryClient
public class LatticePluginServer {

    public static void main(String[] args) {
        SpringApplication.run(LatticePluginServer.class, args);
    }
}

