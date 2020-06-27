package Model;

import Interfaces.IRechargeable;

/**
 *
 * @author Evan Lokajaya
 */
public class RechargeStation {
    public void Recharge(IRechargeable rechargeable){
        rechargeable.Recharge();
    }
}
