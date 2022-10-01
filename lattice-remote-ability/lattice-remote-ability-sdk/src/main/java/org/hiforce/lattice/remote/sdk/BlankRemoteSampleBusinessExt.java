package org.hiforce.lattice.remote.sdk;

import org.hifforce.lattice.model.ability.BusinessExt;

/**
 * @author Rocky Yu
 * @since 2022/9/16
 */
public class BlankRemoteSampleBusinessExt extends BusinessExt
        implements RemoteSampleBusinessExt {

    @Override
    public String remoteHelloInvoke(String word) {
        return null;
    }
}
