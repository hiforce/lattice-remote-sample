package org.hiforce.lattice.container.controller;

import org.hifforce.lattice.model.business.BizContext;
import org.hifforce.lattice.sequence.SequenceGenerator;
import org.hiforce.lattice.sample.SampleAbility;
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
        SampleAbility ability = new SampleAbility(() -> new BizContext() {

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
        return ability.doHello();
    }
}
