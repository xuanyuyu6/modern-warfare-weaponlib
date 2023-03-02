package com.vicmatskiv.weaponlib.electronics;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.weaponlib.compatibility.CompatibleEntityRenderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class WirelessCameraRenderer extends CompatibleEntityRenderer {

    private String modId;

    public WirelessCameraRenderer(String modId) {
        this.modId = modId;
    }

    @Override
    public void doCompatibleRender(Entity entity, double x, double y, double z, float yaw, float tick) {
        EntityWirelessCamera weaponSpawnEntity = (EntityWirelessCamera) entity;
        ItemWirelessCamera camera = weaponSpawnEntity.getItem();
        if(camera == null) {
            return;
        }
        ModelBase model = camera.getModel();
        if(model != null) {
            String textureName = camera.getTextureName();
            ResourceLocation textureLocation = textureName != null ?
                    new ResourceLocation(modId + ":textures/models/" + textureName) : null;
            //System.out.println("Rendering entity at " + x + ", " + y + ", " + z);
            if(model != null) {
                GL11.glPushMatrix();
                GL11.glTranslatef(0f, 0f, 0f);
                if(textureLocation != null) {
                    bindTexture(textureLocation);
                }
                GL11.glTranslated(x, y, z);
                model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                GL11.glPopMatrix();
            }
        }
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        EntityWirelessCamera camera = (EntityWirelessCamera) entity;
        ItemWirelessCamera item = camera.getItem();
        if(item != null) {
            return new ResourceLocation(modId + ":textures/models/" + item.getTextureName());
        } else {
            return null;
        }
    }
}
