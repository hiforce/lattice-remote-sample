package org.hiforce.lattice.remote.sdk;

import org.hifforce.lattice.annotation.Extension;
import org.hifforce.lattice.annotation.model.ProtocolType;
import org.hifforce.lattice.annotation.model.ReduceType;
import org.hifforce.lattice.model.ability.IBusinessExt;

/**
 * @author Rocky Yu
 * @since 2022/9/16
 */
public interface RemoteSampleBusinessExt extends IBusinessExt {

    String EXT_REMOTE_HELLO_INVOKE = "EXT_REMOTE_HELLO_INVOKE";

    @Extension(
            name = "EXT_REMOTE_HELLO_INVOKE",
            code = EXT_REMOTE_HELLO_INVOKE,
            protocolType = ProtocolType.REMOTE,
            reduceType = ReduceType.FIRST
    )
    String remoteHelloInvoke(String word);
}
