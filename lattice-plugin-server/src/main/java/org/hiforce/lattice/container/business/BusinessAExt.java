package org.hiforce.lattice.container.business;

import org.hifforce.lattice.annotation.Realization;
import org.hiforce.lattice.remote.sdk.BlankRemoteSampleBusinessExt;

/**
 * @author Rocky Yu
 * @since 2022/9/30
 */
@Realization(codes = BusinessA.CODE)
public class BusinessAExt extends BlankRemoteSampleBusinessExt {

    @Override
    public String remoteHelloInvoke(String word) {
        String str = "Hello: " + word;
        System.out.println("=====> BusinessAExt: " + str);
        return str;
    }
}
