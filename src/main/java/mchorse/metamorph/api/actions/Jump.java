package mchorse.metamorph.api.actions;

import mchorse.metamorph.api.IAction;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Jump action
 * 
 * Makes player jump very high like a horse. 
 */
public class Jump implements IAction
{
    @Override
    public void execute(EntityPlayer player)
    {
        player.motionY = 0.75;
    }
}