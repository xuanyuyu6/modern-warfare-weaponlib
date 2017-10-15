// Date: 9/3/2017 10:42:36 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Type100Mag extends ModelBase
{
  //fields
    ModelRenderer mag1;
    ModelRenderer mag2;
    ModelRenderer mag3;
    ModelRenderer mag4;
    ModelRenderer mag5;
    ModelRenderer mag6;
  
  public Type100Mag()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      mag1 = new ModelRenderer(this, 0, 0);
      mag1.addBox(0F, 0F, 0F, 5, 1, 4);
      mag1.setRotationPoint(1.8F, -8.1F, -23.6F);
      mag1.setTextureSize(64, 32);
      mag1.mirror = true;
      setRotation(mag1, 0F, 0.2230717F, 0F);
      mag2 = new ModelRenderer(this, 0, 0);
      mag2.addBox(0F, 0F, 0F, 5, 1, 4);
      mag2.setRotationPoint(1.8F, -7.4F, -23.6F);
      mag2.setTextureSize(64, 32);
      mag2.mirror = true;
      setRotation(mag2, 0F, 0.2230717F, 0F);
      mag3 = new ModelRenderer(this, 0, 0);
      mag3.addBox(0F, 0F, 0F, 4, 1, 5);
      mag3.setRotationPoint(7.6F, -8.1F, -20.8F);
      mag3.setTextureSize(64, 32);
      mag3.mirror = true;
      setRotation(mag3, 0F, 2.082002F, 0F);
      mag4 = new ModelRenderer(this, 0, 0);
      mag4.addBox(0F, 0F, 0F, 4, 1, 5);
      mag4.setRotationPoint(7.6F, -7.4F, -20.8F);
      mag4.setTextureSize(64, 32);
      mag4.mirror = true;
      setRotation(mag4, 0F, 2.082002F, 0F);
      mag5 = new ModelRenderer(this, 0, 0);
      mag5.addBox(0F, 0F, 0F, 4, 1, 6);
      mag5.setRotationPoint(11.9F, -8.1F, -23.2F);
      mag5.setTextureSize(64, 32);
      mag5.mirror = true;
      setRotation(mag5, 0F, 2.342252F, 0F);
      mag6 = new ModelRenderer(this, 0, 0);
      mag6.addBox(0F, 0F, 0F, 4, 1, 6);
      mag6.setRotationPoint(11.9F, -7.4F, -23.2F);
      mag6.setTextureSize(64, 32);
      mag6.mirror = true;
      setRotation(mag6, 0F, 2.342252F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    mag1.render(f5);
    mag2.render(f5);
    mag3.render(f5);
    mag4.render(f5);
    mag5.render(f5);
    mag6.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
