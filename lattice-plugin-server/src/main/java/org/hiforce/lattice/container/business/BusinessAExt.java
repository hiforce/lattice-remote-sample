package org.hiforce.lattice.container.business;

import org.hifforce.lattice.annotation.Realization;
import org.hiforce.lattice.sample.sdk.BlankSampleBusinessExt;

/**
 * @author Rocky Yu
 * @since 2022/9/30
 */
@Realization(codes = BusinessA.CODE)
public class BusinessAExt extends BlankSampleBusinessExt {

    @Override
    public String hello(String word) {
        String str = "Hello: " + word;
        System.out.println("=====> BusinessAExt: " + str);
        return str;
    }
}
