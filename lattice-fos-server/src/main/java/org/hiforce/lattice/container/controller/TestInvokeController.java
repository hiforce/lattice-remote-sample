package org.hiforce.lattice.container.controller;

import org.hiforce.lattice.model.business.BizContext;
import org.hiforce.lattice.sequence.SequenceGenerator;
import org.hiforce.lattice.remote.ability.LatticeRemoteInvokeAbility;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * @author Rocky Yu
 * @since 2022/9/30
 */
@RestController
public class TestInvokeController {

    @RequestMapping("/hello")
    public String hello() {
        LatticeRemoteInvokeAbility ability = new LatticeRemoteInvokeAbility(() -> new BizContext() {

            @Override
            public Serializable getBizId() {
                return SequenceGenerator.next(TestInvokeController.class.getName());
            }

            @Override
            public String getBizCode() {
                return "business.a";
            }

            @Override
            public String getScenario() {
                return null;
            }
        });
        return ability.remoteHelloInvoke();
    }
}
