// Date: 10/19/2019 8:45:47 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.weaponlib.ModelWithAttachments;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class FatmanRack extends ModelWithAttachments
{
  //fields
    ModelRenderer Support11;
    ModelRenderer Support12;
    ModelRenderer Support13;
    ModelRenderer Support14;
    ModelRenderer Support15;
    ModelRenderer Support16;
    ModelRenderer Support17;
    ModelRenderer Support18;
    ModelRenderer Rail1;
    ModelRenderer Rail2;
    ModelRenderer Bars1;
    ModelRenderer Bars2;
    ModelRenderer Bars3;
    ModelRenderer Bars4;
    ModelRenderer Bars5;
    ModelRenderer Rail3;
    ModelRenderer Rail4;
    ModelRenderer Bars6;
    ModelRenderer Bars7;
    ModelRenderer Bars8;
    ModelRenderer Bars9;
    ModelRenderer Bars10;
    ModelRenderer Bars11;
    ModelRenderer Bars12;
    ModelRenderer Bars13;
    ModelRenderer Bars14;
    ModelRenderer Bars15;
    ModelRenderer Bars16;
    ModelRenderer Bars17;
    ModelRenderer Bars18;
    ModelRenderer Bars19;
    ModelRenderer Bars20;
    ModelRenderer Bars21;
    ModelRenderer Bars22;
    ModelRenderer Bars23;
    ModelRenderer Bars24;
    ModelRenderer Bars25;
    ModelRenderer Bars26;
    ModelRenderer Bars27;
    ModelRenderer Bars28;
    ModelRenderer Bars29;
    ModelRenderer Bars30;
    ModelRenderer Bars31;
    ModelRenderer Bars32;
    ModelRenderer Bars33;
    ModelRenderer Bars34;
    ModelRenderer Bars35;
    ModelRenderer Bars36;
    ModelRenderer Bars37;
    ModelRenderer Bars38;
    ModelRenderer Bars39;
    ModelRenderer Bars40;
    ModelRenderer Support21;
    ModelRenderer Support22;
    ModelRenderer Support23;
    ModelRenderer Support24;
    ModelRenderer Support25;
    ModelRenderer Support26;
    ModelRenderer Support27;
    ModelRenderer Support28;
    ModelRenderer SupportDetalization1;
    ModelRenderer SupportDetalization2;
    ModelRenderer SupportDetalization3;
    ModelRenderer SupportDetalization4;
    ModelRenderer SupportDetalization5;
  
  public FatmanRack()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      Support11 = new ModelRenderer(this, 0, 0);
      Support11.addBox(0F, 0F, 0F, 1, 6, 3);
      Support11.setRotationPoint(-15.5F, -22.4F, 46F);
      Support11.setTextureSize(64, 32);
      Support11.mirror = true;
      setRotation(Support11, 0F, 0F, 0F);
      Support12 = new ModelRenderer(this, 0, 0);
      Support12.addBox(0F, 0F, 0F, 1, 1, 3);
      Support12.setRotationPoint(-15.5F, -16.4F, 46F);
      Support12.setTextureSize(64, 32);
      Support12.mirror = true;
      setRotation(Support12, 0F, 0F, -0.2443461F);
      Support13 = new ModelRenderer(this, 0, 0);
      Support13.addBox(0F, 0F, 0F, 1, 2, 3);
      Support13.setRotationPoint(-15.3F, -15.4F, 46F);
      Support13.setTextureSize(64, 32);
      Support13.mirror = true;
      setRotation(Support13, 0F, 0F, -0.4537856F);
      Support14 = new ModelRenderer(this, 0, 0);
      Support14.addBox(0F, 0F, 0F, 1, 2, 3);
      Support14.setRotationPoint(-14.4F, -13.5F, 46F);
      Support14.setTextureSize(64, 32);
      Support14.mirror = true;
      setRotation(Support14, 0F, 0F, -0.6283185F);
      Support15 = new ModelRenderer(this, 0, 0);
      Support15.addBox(-0.3F, 0F, 0F, 1, 2, 3);
      Support15.setRotationPoint(-13F, -12.1F, 46F);
      Support15.setTextureSize(64, 32);
      Support15.mirror = true;
      setRotation(Support15, 0F, 0F, -0.6457718F);
      Support16 = new ModelRenderer(this, 0, 0);
      Support16.addBox(0F, 0F, 0F, 1, 2, 3);
      Support16.setRotationPoint(-12F, -10.2F, 46F);
      Support16.setTextureSize(64, 32);
      Support16.mirror = true;
      setRotation(Support16, 0F, 0F, -0.7679449F);
      Support17 = new ModelRenderer(this, 0, 0);
      Support17.addBox(0F, 0F, 0F, 3, 1, 3);
      Support17.setRotationPoint(-10F, -9.5F, 46F);
      Support17.setTextureSize(64, 32);
      Support17.mirror = true;
      setRotation(Support17, 0F, 0F, 0.4014257F);
      Support18 = new ModelRenderer(this, 0, 0);
      Support18.addBox(0F, 0F, 0F, 3, 1, 3);
      Support18.setRotationPoint(-7.7F, -8.4F, 46F);
      Support18.setTextureSize(64, 32);
      Support18.mirror = true;
      setRotation(Support18, 0F, 0F, 0F);
      Rail1 = new ModelRenderer(this, 0, 0);
      Rail1.addBox(0F, 0F, 0F, 2, 1, 73);
      Rail1.setRotationPoint(-16F, -23F, 46F);
      Rail1.setTextureSize(64, 32);
      Rail1.mirror = true;
      setRotation(Rail1, 0F, 0F, 0F);
      Rail2 = new ModelRenderer(this, 0, 0);
      Rail2.addBox(0F, 0F, 0F, 2, 1, 73);
      Rail2.setRotationPoint(-16F, -25F, 46F);
      Rail2.setTextureSize(64, 32);
      Rail2.mirror = true;
      setRotation(Rail2, 0F, 0F, 0F);
      Bars1 = new ModelRenderer(this, 0, 0);
      Bars1.addBox(-2.2F, 0.4F, 0F, 1, 1, 74);
      Bars1.setRotationPoint(-12F, -13F, 46F);
      Bars1.setTextureSize(64, 32);
      Bars1.mirror = true;
      setRotation(Bars1, 0F, 0F, 0.9773844F);
      Bars2 = new ModelRenderer(this, 0, 0);
      Bars2.addBox(0F, -1.7F, 0F, 1, 2, 3);
      Bars2.setRotationPoint(-13F, -12F, 46F);
      Bars2.setTextureSize(64, 32);
      Bars2.mirror = true;
      setRotation(Bars2, 0F, 0F, -0.6108652F);
      Bars3 = new ModelRenderer(this, 0, 0);
      Bars3.addBox(-1.2F, 0.3F, 0F, 1, 1, 74);
      Bars3.setRotationPoint(-10F, -10.2F, 46F);
      Bars3.setTextureSize(64, 32);
      Bars3.mirror = true;
      setRotation(Bars3, 0F, 0F, -0.9075712F);
      Bars4 = new ModelRenderer(this, 0, 0);
      Bars4.addBox(-0.8F, -0.5F, 0F, 1, 2, 6);
      Bars4.setRotationPoint(-12F, -12F, 46F);
      Bars4.setTextureSize(64, 32);
      Bars4.mirror = true;
      setRotation(Bars4, 0F, 0F, -0.6457718F);
      Bars5 = new ModelRenderer(this, 0, 0);
      Bars5.addBox(0F, 0.3F, 0F, 1, 2, 3);
      Bars5.setRotationPoint(-12F, -10.6F, 46F);
      Bars5.setTextureSize(64, 32);
      Bars5.mirror = true;
      setRotation(Bars5, 0F, 0F, -0.7679449F);
      Rail3 = new ModelRenderer(this, 0, 0);
      Rail3.addBox(0F, 0F, 0F, 2, 3, 1);
      Rail3.setRotationPoint(-16F, -25F, 45F);
      Rail3.setTextureSize(64, 32);
      Rail3.mirror = true;
      setRotation(Rail3, 0F, 0F, 0F);
      Rail4 = new ModelRenderer(this, 0, 0);
      Rail4.addBox(0F, 0F, 0F, 2, 3, 2);
      Rail4.setRotationPoint(-16F, -25F, 119F);
      Rail4.setTextureSize(64, 32);
      Rail4.mirror = true;
      setRotation(Rail4, 0F, 0F, 0F);
      Bars6 = new ModelRenderer(this, 0, 0);
      Bars6.addBox(0F, -1.7F, 0F, 1, 2, 3);
      Bars6.setRotationPoint(-13F, -12F, 52F);
      Bars6.setTextureSize(64, 32);
      Bars6.mirror = true;
      setRotation(Bars6, 0F, 0F, -0.6108652F);
      Bars7 = new ModelRenderer(this, 0, 0);
      Bars7.addBox(0F, -1.7F, 0F, 1, 2, 3);
      Bars7.setRotationPoint(-13F, -12F, 58F);
      Bars7.setTextureSize(64, 32);
      Bars7.mirror = true;
      setRotation(Bars7, 0F, 0F, -0.6108652F);
      Bars8 = new ModelRenderer(this, 0, 0);
      Bars8.addBox(0F, -1.7F, 0F, 1, 2, 3);
      Bars8.setRotationPoint(-13F, -12F, 82F);
      Bars8.setTextureSize(64, 32);
      Bars8.mirror = true;
      setRotation(Bars8, 0F, 0F, -0.6108652F);
      Bars9 = new ModelRenderer(this, 0, 0);
      Bars9.addBox(0F, -1.7F, 0F, 1, 2, 3);
      Bars9.setRotationPoint(-13F, -12F, 76F);
      Bars9.setTextureSize(64, 32);
      Bars9.mirror = true;
      setRotation(Bars9, 0F, 0F, -0.6108652F);
      Bars10 = new ModelRenderer(this, 0, 0);
      Bars10.addBox(0F, -1.7F, 0F, 1, 2, 3);
      Bars10.setRotationPoint(-13F, -12F, 70F);
      Bars10.setTextureSize(64, 32);
      Bars10.mirror = true;
      setRotation(Bars10, 0F, 0F, -0.6108652F);
      Bars11 = new ModelRenderer(this, 0, 0);
      Bars11.addBox(0F, -1.7F, 0F, 1, 2, 3);
      Bars11.setRotationPoint(-13F, -12F, 64F);
      Bars11.setTextureSize(64, 32);
      Bars11.mirror = true;
      setRotation(Bars11, 0F, 0F, -0.6108652F);
      Bars12 = new ModelRenderer(this, 0, 0);
      Bars12.addBox(0F, -1.7F, 0F, 1, 2, 3);
      Bars12.setRotationPoint(-13F, -12F, 88F);
      Bars12.setTextureSize(64, 32);
      Bars12.mirror = true;
      setRotation(Bars12, 0F, 0F, -0.6108652F);
      Bars13 = new ModelRenderer(this, 0, 0);
      Bars13.addBox(0F, -1.7F, 0F, 1, 2, 3);
      Bars13.setRotationPoint(-13F, -12F, 94F);
      Bars13.setTextureSize(64, 32);
      Bars13.mirror = true;
      setRotation(Bars13, 0F, 0F, -0.6108652F);
      Bars14 = new ModelRenderer(this, 0, 0);
      Bars14.addBox(0F, -1.7F, 0F, 1, 2, 3);
      Bars14.setRotationPoint(-13F, -12F, 100F);
      Bars14.setTextureSize(64, 32);
      Bars14.mirror = true;
      setRotation(Bars14, 0F, 0F, -0.6108652F);
      Bars15 = new ModelRenderer(this, 0, 0);
      Bars15.addBox(0F, -1.7F, 0F, 1, 2, 3);
      Bars15.setRotationPoint(-13F, -12F, 106F);
      Bars15.setTextureSize(64, 32);
      Bars15.mirror = true;
      setRotation(Bars15, 0F, 0F, -0.6108652F);
      Bars16 = new ModelRenderer(this, 0, 0);
      Bars16.addBox(0F, -1.7F, 0F, 1, 2, 3);
      Bars16.setRotationPoint(-13F, -12F, 112F);
      Bars16.setTextureSize(64, 32);
      Bars16.mirror = true;
      setRotation(Bars16, 0F, 0F, -0.6108652F);
      Bars17 = new ModelRenderer(this, 0, 0);
      Bars17.addBox(0F, -1.7F, 0F, 1, 2, 3);
      Bars17.setRotationPoint(-13F, -12F, 117F);
      Bars17.setTextureSize(64, 32);
      Bars17.mirror = true;
      setRotation(Bars17, 0F, 0F, -0.6108652F);
      Bars18 = new ModelRenderer(this, 0, 0);
      Bars18.addBox(-0.8F, -0.5F, 0F, 1, 2, 3);
      Bars18.setRotationPoint(-12F, -12F, 55F);
      Bars18.setTextureSize(64, 32);
      Bars18.mirror = true;
      setRotation(Bars18, 0F, 0F, -0.6457718F);
      Bars19 = new ModelRenderer(this, 0, 0);
      Bars19.addBox(-0.8F, -0.5F, 0F, 1, 2, 3);
      Bars19.setRotationPoint(-12F, -12F, 61F);
      Bars19.setTextureSize(64, 32);
      Bars19.mirror = true;
      setRotation(Bars19, 0F, 0F, -0.6457718F);
      Bars20 = new ModelRenderer(this, 0, 0);
      Bars20.addBox(-0.8F, -0.5F, 0F, 1, 2, 3);
      Bars20.setRotationPoint(-12F, -12F, 67F);
      Bars20.setTextureSize(64, 32);
      Bars20.mirror = true;
      setRotation(Bars20, 0F, 0F, -0.6457718F);
      Bars21 = new ModelRenderer(this, 0, 0);
      Bars21.addBox(-0.8F, -0.5F, 0F, 1, 2, 3);
      Bars21.setRotationPoint(-12F, -12F, 73F);
      Bars21.setTextureSize(64, 32);
      Bars21.mirror = true;
      setRotation(Bars21, 0F, 0F, -0.6457718F);
      Bars22 = new ModelRenderer(this, 0, 0);
      Bars22.addBox(-0.8F, -0.5F, 0F, 1, 2, 3);
      Bars22.setRotationPoint(-12F, -12F, 79F);
      Bars22.setTextureSize(64, 32);
      Bars22.mirror = true;
      setRotation(Bars22, 0F, 0F, -0.6457718F);
      Bars23 = new ModelRenderer(this, 0, 0);
      Bars23.addBox(-0.8F, -0.5F, 0F, 1, 2, 3);
      Bars23.setRotationPoint(-12F, -12F, 85F);
      Bars23.setTextureSize(64, 32);
      Bars23.mirror = true;
      setRotation(Bars23, 0F, 0F, -0.6457718F);
      Bars24 = new ModelRenderer(this, 0, 0);
      Bars24.addBox(-0.8F, -0.5F, 0F, 1, 2, 3);
      Bars24.setRotationPoint(-12F, -12F, 91F);
      Bars24.setTextureSize(64, 32);
      Bars24.mirror = true;
      setRotation(Bars24, 0F, 0F, -0.6457718F);
      Bars25 = new ModelRenderer(this, 0, 0);
      Bars25.addBox(-0.8F, -0.5F, 0F, 1, 2, 3);
      Bars25.setRotationPoint(-12F, -12F, 97F);
      Bars25.setTextureSize(64, 32);
      Bars25.mirror = true;
      setRotation(Bars25, 0F, 0F, -0.6457718F);
      Bars26 = new ModelRenderer(this, 0, 0);
      Bars26.addBox(-0.8F, -0.5F, 0F, 1, 2, 3);
      Bars26.setRotationPoint(-12F, -12F, 103F);
      Bars26.setTextureSize(64, 32);
      Bars26.mirror = true;
      setRotation(Bars26, 0F, 0F, -0.6457718F);
      Bars27 = new ModelRenderer(this, 0, 0);
      Bars27.addBox(-0.8F, -0.5F, 0F, 1, 2, 3);
      Bars27.setRotationPoint(-12F, -12F, 109F);
      Bars27.setTextureSize(64, 32);
      Bars27.mirror = true;
      setRotation(Bars27, 0F, 0F, -0.6457718F);
      Bars28 = new ModelRenderer(this, 0, 0);
      Bars28.addBox(-0.8F, -0.5F, 0F, 1, 2, 5);
      Bars28.setRotationPoint(-12F, -12F, 115F);
      Bars28.setTextureSize(64, 32);
      Bars28.mirror = true;
      setRotation(Bars28, 0F, 0F, -0.6457718F);
      Bars29 = new ModelRenderer(this, 0, 0);
      Bars29.addBox(0F, 0.3F, 0F, 1, 2, 3);
      Bars29.setRotationPoint(-12F, -10.6F, 52F);
      Bars29.setTextureSize(64, 32);
      Bars29.mirror = true;
      setRotation(Bars29, 0F, 0F, -0.7679449F);
      Bars30 = new ModelRenderer(this, 0, 0);
      Bars30.addBox(0F, 0.3F, 0F, 1, 2, 3);
      Bars30.setRotationPoint(-12F, -10.6F, 58F);
      Bars30.setTextureSize(64, 32);
      Bars30.mirror = true;
      setRotation(Bars30, 0F, 0F, -0.7679449F);
      Bars31 = new ModelRenderer(this, 0, 0);
      Bars31.addBox(0F, 0.3F, 0F, 1, 2, 3);
      Bars31.setRotationPoint(-12F, -10.6F, 64F);
      Bars31.setTextureSize(64, 32);
      Bars31.mirror = true;
      setRotation(Bars31, 0F, 0F, -0.7679449F);
      Bars32 = new ModelRenderer(this, 0, 0);
      Bars32.addBox(0F, 0.3F, 0F, 1, 2, 3);
      Bars32.setRotationPoint(-12F, -10.6F, 70F);
      Bars32.setTextureSize(64, 32);
      Bars32.mirror = true;
      setRotation(Bars32, 0F, 0F, -0.7679449F);
      Bars33 = new ModelRenderer(this, 0, 0);
      Bars33.addBox(0F, 0.3F, 0F, 1, 2, 3);
      Bars33.setRotationPoint(-12F, -10.6F, 76F);
      Bars33.setTextureSize(64, 32);
      Bars33.mirror = true;
      setRotation(Bars33, 0F, 0F, -0.7679449F);
      Bars34 = new ModelRenderer(this, 0, 0);
      Bars34.addBox(0F, 0.3F, 0F, 1, 2, 3);
      Bars34.setRotationPoint(-12F, -10.6F, 82F);
      Bars34.setTextureSize(64, 32);
      Bars34.mirror = true;
      setRotation(Bars34, 0F, 0F, -0.7679449F);
      Bars35 = new ModelRenderer(this, 0, 0);
      Bars35.addBox(0F, 0.3F, 0F, 1, 2, 3);
      Bars35.setRotationPoint(-12F, -10.6F, 88F);
      Bars35.setTextureSize(64, 32);
      Bars35.mirror = true;
      setRotation(Bars35, 0F, 0F, -0.7679449F);
      Bars36 = new ModelRenderer(this, 0, 0);
      Bars36.addBox(0F, 0.3F, 0F, 1, 2, 3);
      Bars36.setRotationPoint(-12F, -10.6F, 94F);
      Bars36.setTextureSize(64, 32);
      Bars36.mirror = true;
      setRotation(Bars36, 0F, 0F, -0.7679449F);
      Bars37 = new ModelRenderer(this, 0, 0);
      Bars37.addBox(0F, 0.3F, 0F, 1, 2, 3);
      Bars37.setRotationPoint(-12F, -10.6F, 100F);
      Bars37.setTextureSize(64, 32);
      Bars37.mirror = true;
      setRotation(Bars37, 0F, 0F, -0.7679449F);
      Bars38 = new ModelRenderer(this, 0, 0);
      Bars38.addBox(0F, 0.3F, 0F, 1, 2, 3);
      Bars38.setRotationPoint(-12F, -10.6F, 106F);
      Bars38.setTextureSize(64, 32);
      Bars38.mirror = true;
      setRotation(Bars38, 0F, 0F, -0.7679449F);
      Bars39 = new ModelRenderer(this, 0, 0);
      Bars39.addBox(0F, 0.3F, 0F, 1, 2, 3);
      Bars39.setRotationPoint(-12F, -10.5F, 112F);
      Bars39.setTextureSize(64, 32);
      Bars39.mirror = true;
      setRotation(Bars39, 0F, 0F, -0.7679449F);
      Bars40 = new ModelRenderer(this, 0, 0);
      Bars40.addBox(0F, 0.3F, 0F, 1, 2, 3);
      Bars40.setRotationPoint(-12F, -10.6F, 117F);
      Bars40.setTextureSize(64, 32);
      Bars40.mirror = true;
      setRotation(Bars40, 0F, 0F, -0.7679449F);
      Support21 = new ModelRenderer(this, 0, 0);
      Support21.addBox(0F, 0F, 0F, 1, 6, 3);
      Support21.setRotationPoint(-15.5F, -22.4F, 117F);
      Support21.setTextureSize(64, 32);
      Support21.mirror = true;
      setRotation(Support21, 0F, 0F, 0F);
      Support22 = new ModelRenderer(this, 0, 0);
      Support22.addBox(0F, 0F, 0F, 1, 1, 3);
      Support22.setRotationPoint(-15.5F, -16.4F, 117F);
      Support22.setTextureSize(64, 32);
      Support22.mirror = true;
      setRotation(Support22, 0F, 0F, -0.2443461F);
      Support23 = new ModelRenderer(this, 0, 0);
      Support23.addBox(0F, 0F, 0F, 1, 2, 3);
      Support23.setRotationPoint(-15.3F, -15.4F, 117F);
      Support23.setTextureSize(64, 32);
      Support23.mirror = true;
      setRotation(Support23, 0F, 0F, -0.4537856F);
      Support24 = new ModelRenderer(this, 0, 0);
      Support24.addBox(0F, 0F, 0F, 1, 2, 3);
      Support24.setRotationPoint(-14.4F, -13.5F, 117F);
      Support24.setTextureSize(64, 32);
      Support24.mirror = true;
      setRotation(Support24, 0F, 0F, -0.6283185F);
      Support25 = new ModelRenderer(this, 0, 0);
      Support25.addBox(-0.3F, 0F, 0F, 1, 2, 3);
      Support25.setRotationPoint(-13F, -12.1F, 117F);
      Support25.setTextureSize(64, 32);
      Support25.mirror = true;
      setRotation(Support25, 0F, 0F, -0.6457718F);
      Support26 = new ModelRenderer(this, 0, 0);
      Support26.addBox(0F, 0F, 0F, 1, 2, 3);
      Support26.setRotationPoint(-12F, -10.2F, 117F);
      Support26.setTextureSize(64, 32);
      Support26.mirror = true;
      setRotation(Support26, 0F, 0F, -0.7679449F);
      Support27 = new ModelRenderer(this, 0, 0);
      Support27.addBox(0F, 0F, 0F, 3, 1, 3);
      Support27.setRotationPoint(-10F, -9.5F, 117F);
      Support27.setTextureSize(64, 32);
      Support27.mirror = true;
      setRotation(Support27, 0F, 0F, 0.4014257F);
      Support28 = new ModelRenderer(this, 0, 0);
      Support28.addBox(0F, 0F, 0F, 3, 1, 3);
      Support28.setRotationPoint(-7.7F, -8.4F, 117F);
      Support28.setTextureSize(64, 32);
      Support28.mirror = true;
      setRotation(Support28, 0F, 0F, 0F);
      SupportDetalization1 = new ModelRenderer(this, 0, 0);
      SupportDetalization1.addBox(0F, 0F, 0F, 1, 1, 3);
      SupportDetalization1.setRotationPoint(-15.5F, -24F, 58F);
      SupportDetalization1.setTextureSize(64, 32);
      SupportDetalization1.mirror = true;
      setRotation(SupportDetalization1, 0F, 0F, 0F);
      SupportDetalization2 = new ModelRenderer(this, 0, 0);
      SupportDetalization2.addBox(0F, 0F, 0F, 1, 1, 3);
      SupportDetalization2.setRotationPoint(-15.5F, -24F, 71F);
      SupportDetalization2.setTextureSize(64, 32);
      SupportDetalization2.mirror = true;
      setRotation(SupportDetalization2, 0F, 0F, 0F);
      SupportDetalization3 = new ModelRenderer(this, 0, 0);
      SupportDetalization3.addBox(0F, 0F, 0F, 1, 1, 3);
      SupportDetalization3.setRotationPoint(-15.5F, -24F, 102F);
      SupportDetalization3.setTextureSize(64, 32);
      SupportDetalization3.mirror = true;
      setRotation(SupportDetalization3, 0F, 0F, 0F);
      SupportDetalization4 = new ModelRenderer(this, 0, 0);
      SupportDetalization4.addBox(0F, 0F, 0F, 1, 1, 3);
      SupportDetalization4.setRotationPoint(-15.5F, -24F, 87F);
      SupportDetalization4.setTextureSize(64, 32);
      SupportDetalization4.mirror = true;
      setRotation(SupportDetalization4, 0F, 0F, 0F);
      SupportDetalization5 = new ModelRenderer(this, 0, 0);
      SupportDetalization5.addBox(0F, 0F, 0F, 1, 1, 3);
      SupportDetalization5.setRotationPoint(-15.5F, -24F, 117F);
      SupportDetalization5.setTextureSize(64, 32);
      SupportDetalization5.mirror = true;
      setRotation(SupportDetalization5, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
      GL11.glPushMatrix();
      GL11.glRotatef(180, 0, 1, 0);
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Support11.render(f5);
    Support12.render(f5);
    Support13.render(f5);
    Support14.render(f5);
    Support15.render(f5);
    Support16.render(f5);
    Support17.render(f5);
    Support18.render(f5);
    Rail1.render(f5);
    Rail2.render(f5);
    Bars1.render(f5);
    Bars2.render(f5);
    Bars3.render(f5);
    Bars4.render(f5);
    Bars5.render(f5);
    Rail3.render(f5);
    Rail4.render(f5);
    Bars6.render(f5);
    Bars7.render(f5);
    Bars8.render(f5);
    Bars9.render(f5);
    Bars10.render(f5);
    Bars11.render(f5);
    Bars12.render(f5);
    Bars13.render(f5);
    Bars14.render(f5);
    Bars15.render(f5);
    Bars16.render(f5);
    Bars17.render(f5);
    Bars18.render(f5);
    Bars19.render(f5);
    Bars20.render(f5);
    Bars21.render(f5);
    Bars22.render(f5);
    Bars23.render(f5);
    Bars24.render(f5);
    Bars25.render(f5);
    Bars26.render(f5);
    Bars27.render(f5);
    Bars28.render(f5);
    Bars29.render(f5);
    Bars30.render(f5);
    Bars31.render(f5);
    Bars32.render(f5);
    Bars33.render(f5);
    Bars34.render(f5);
    Bars35.render(f5);
    Bars36.render(f5);
    Bars37.render(f5);
    Bars38.render(f5);
    Bars39.render(f5);
    Bars40.render(f5);
    Support21.render(f5);
    Support22.render(f5);
    Support23.render(f5);
    Support24.render(f5);
    Support25.render(f5);
    Support26.render(f5);
    Support27.render(f5);
    Support28.render(f5);
    SupportDetalization1.render(f5);
    SupportDetalization2.render(f5);
    SupportDetalization3.render(f5);
    SupportDetalization4.render(f5);
    SupportDetalization5.render(f5);
    GL11.glPopMatrix();
  }

}