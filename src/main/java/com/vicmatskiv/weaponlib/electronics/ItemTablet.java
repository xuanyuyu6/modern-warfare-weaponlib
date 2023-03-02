package com.vicmatskiv.weaponlib.electronics;

import java.util.function.BiConsumer;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.weaponlib.AttachmentBuilder;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.PlayerItemInstanceFactory;
import com.vicmatskiv.weaponlib.Updatable;
import com.vicmatskiv.weaponlib.perspective.PerspectiveRenderer;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ItemTablet<T> extends ItemAttachment<T> 
implements PlayerItemInstanceFactory<PlayerTabletInstance, TabletState>, Updatable {
    
    private final int DEFAULT_MAX_STACK_SIZE = 1;
        
    public static final class Builder<T> extends AttachmentBuilder<T> {
        
        private BiConsumer<EntityLivingBase, ItemStack> viewfinderPositioning;
        
        public Builder<T> withViewfinderPositioning(BiConsumer<EntityLivingBase, ItemStack> viewfinderPositioning) {
            this.viewfinderPositioning = viewfinderPositioning;
            return this;
        }
        
        @Override
        protected ItemAttachment<T> createAttachment(ModContext modContext) {
            if(viewfinderPositioning == null) {
                viewfinderPositioning = (p, s) -> {
                    GL11.glScalef(3f, 3f, 3f);
                    GL11.glTranslatef(0.1f, 0.5f, 0.1f);
                };
            }
            withPostRender(new PerspectiveRenderer(viewfinderPositioning));
            
            ItemTablet<T> itemTablet = new ItemTablet<>(this);
            itemTablet.modContext = modContext;
            
            return itemTablet;
        }
        
        @Override
        public ItemAttachment<T> build(ModContext modContext) {
            return super.build(modContext);
        }
    }
    
    @SuppressWarnings("unused")
    private ModContext modContext;
    private Builder<T> builder;
    
    private ItemTablet(Builder<T> builder) {
        super(builder.getModId(), AttachmentCategory.SCOPE, builder.getModel(), builder.getTextureName(), null, 
                null, null);
        this.builder = builder;
        
        setMaxStackSize(DEFAULT_MAX_STACK_SIZE);
    }

    @Override
    public void update(EntityPlayer player) {
        
    }

    @Override
    public PlayerTabletInstance createItemInstance(EntityLivingBase player, ItemStack stack, int slot) {
        PlayerTabletInstance instance = new PlayerTabletInstance(slot, player, stack);
        instance.setState(TabletState.READY);
        return instance;
    }
  
}
