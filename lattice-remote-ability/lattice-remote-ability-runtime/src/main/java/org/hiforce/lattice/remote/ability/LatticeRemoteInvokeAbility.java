package org.hiforce.lattice.remote.ability;

import lombok.extern.slf4j.Slf4j;
import org.hifforce.lattice.annotation.Ability;
import org.hifforce.lattice.model.business.IBizObject;
import org.hiforce.lattice.remote.sdk.BlankRemoteSampleBusinessExt;
import org.hiforce.lattice.runtime.ability.BaseLatticeAbility;
import org.hiforce.lattice.runtime.ability.reduce.Reducers;

import java.util.Objects;

import static org.hiforce.lattice.remote.sdk.RemoteSampleBusinessExt.EXT_REMOTE_HELLO_INVOKE;


/**
 * @author Rocky Yu
 * @since 2022/9/16
 */
@Slf4j
@Ability(name = "LatticeRemoteInvokeAbility")
public class LatticeRemoteInvokeAbility extends BaseLatticeAbility<BlankRemoteSampleBusinessExt> {

    public LatticeRemoteInvokeAbility(IBizObject bizObject) {
        super(bizObject);
    }

    @Override
    public BlankRemoteSampleBusinessExt getDefaultRealization() {
        return new BlankRemoteSampleBusinessExt();
    }

    public String remoteHelloInvoke() {

        return this.reduceExecute(EXT_REMOTE_HELLO_INVOKE,
                p -> p.remoteHelloInvoke("Jack"),
                Reducers.firstOf(Objects::nonNull));
    }

}
