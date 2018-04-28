// Date: 10/27/2017 4:37:35 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class WebleyBullets extends ModelBase
{
  //fields
    
    ModelRenderer bullet1;
    ModelRenderer bullet2;
    ModelRenderer bullet3;
    ModelRenderer bullet4;
    ModelRenderer bullet5;
    ModelRenderer bullet6;
    
  
  public WebleyBullets()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      
      bullet1 = new ModelRenderer(this, 0, 100);
      bullet1.addBox(0F, 0F, 0F, 2, 2, 1);
      bullet1.setRotationPoint(-2F, -19.5F, -15.2F);
      bullet1.setTextureSize(64, 32);
      bullet1.mirror = true;
      setRotation(bullet1, 0F, 0F, 0F);
      bullet2 = new ModelRenderer(this, 0, 100);
      bullet2.addBox(0F, 0F, 0F, 2, 2, 1);
      bullet2.setRotationPoint(-2F, -12.5F, -15.2F);
      bullet2.setTextureSize(64, 32);
      bullet2.mirror = true;
      setRotation(bullet2, 0F, 0F, 0F);
      bullet3 = new ModelRenderer(this, 0, 100);
      bullet3.addBox(0F, 0F, 0F, 2, 2, 1);
      bullet3.setRotationPoint(1F, -14F, -15.2F);
      bullet3.setTextureSize(64, 32);
      bullet3.mirror = true;
      setRotation(bullet3, 0F, 0F, 0F);
      bullet4 = new ModelRenderer(this, 0, 100);
      bullet4.addBox(0F, 0F, 0F, 2, 2, 1);
      bullet4.setRotationPoint(1F, -18F, -15.2F);
      bullet4.setTextureSize(64, 32);
      bullet4.mirror = true;
      setRotation(bullet4, 0F, 0F, 0F);
      bullet5 = new ModelRenderer(this, 0, 100);
      bullet5.addBox(0F, 0F, 0F, 2, 2, 1);
      bullet5.setRotationPoint(-5F, -18F, -15.2F);
      bullet5.setTextureSize(64, 32);
      bullet5.mirror = true;
      setRotation(bullet5, 0F, 0F, 0F);
      bullet6 = new ModelRenderer(this, 0, 100);
      bullet6.addBox(0F, 0F, 0F, 2, 2, 1);
      bullet6.setRotationPoint(-5F, -14F, -15.2F);
      bullet6.setTextureSize(64, 32);
      bullet6.mirror = true;
      setRotation(bullet6, 0F, 0F, 0F);
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    bullet1.render(f5);
    bullet2.render(f5);
    bullet3.render(f5);
    bullet4.render(f5);
    bullet5.render(f5);
    bullet6.render(f5);
    
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}