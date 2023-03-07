package com.vicmatskiv.weaponlib;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleMessageHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ArmorControlHandler implements CompatibleMessageHandler<ArmorControlMessage, CompatibleMessage>  {

    public static final String TAG_NIGHT_VISION = "nv";
    
    @SuppressWarnings("unused")
    private ModContext modContext;

    //private double yOffset = 1;

    public ArmorControlHandler() {
    }

    public ArmorControlHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(ArmorControlMessage message, CompatibleMessageContext ctx) {
        if(ctx.isServerSide()) {
            ctx.runInMainThread(() -> {
                if(message.isToggleNightVision()) {
                    EntityPlayer player = ctx.getPlayer();
                    ItemStack helmetStack = compatibility.getHelmet(player);
                    if(helmetStack != null && helmetStack.getItem() instanceof CustomArmor 
                            && ((CustomArmor)helmetStack.getItem()).hasNightVision()) {
                        compatibility.ensureTagCompound(helmetStack);
                        NBTTagCompound tagCompound = compatibility.getTagCompound(helmetStack);
                        boolean nightVisionOn = tagCompound.getBoolean(TAG_NIGHT_VISION);
                        tagCompound.setBoolean(TAG_NIGHT_VISION, !nightVisionOn);
                    }
                }
            });
        }
        return null;
    }
}
