package org.hiforce.lattice.remote.ability;

import lombok.extern.slf4j.Slf4j;
import org.hiforce.lattice.annotation.Ability;
import org.hiforce.lattice.model.business.IBizObject;
import org.hiforce.lattice.remote.sdk.BlankRemoteSampleBusinessExt;
import org.hiforce.lattice.runtime.ability.BaseLatticeAbility;
import org.hiforce.lattice.runtime.ability.reduce.Reducers;

import java.util.Objects;


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

        return this.reduceExecute(extension -> extension.remoteHelloInvoke("Jack"),
                Reducers.firstOf(Objects::nonNull));
    }

}
