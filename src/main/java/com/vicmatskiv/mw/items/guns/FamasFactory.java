package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.Famas2;
import com.vicmatskiv.mw.models.FamasG2;
import com.vicmatskiv.mw.models.Felin;
import com.vicmatskiv.mw.models.FelinAction;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class FamasFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("Famas")
//		.withAmmo(CommonProxy.FamasMag)
//		.withAmmoCapacity(30)
		.withFireRate(0.75f)
		.withRecoil(4f)
		.withZoom(0.9f)
		.withMaxShots(Integer.MAX_VALUE, 3, 1)
		//.withMaxShots(5)
		.withShootSound("Famas")
		.withSilencedShootSound("AR15Silenced")
		.withReloadSound("m4reload")
		.withUnloadSound("m4unload")
		.withReloadingTime(50)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.4f)
		.withFlashScale(() -> 0.8f)
		.withFlashOffsetX(() -> 0.1f)
		.withFlashOffsetY(() -> 0.12f)
		.withShellCasingForwardOffset(-0.1f)
		.withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                Ores.INGOT_STEEL)
		.withInformationProvider(stack -> Arrays.asList("Type: Bullpup assault rifle", "Damage: 7", 
		"Caliber: 5.56x45mm NATO", "Magazines:", "30rnd 5.56x45mm NATO Magazine (Type 2)",
		"Fire Rate: Auto"))
		.withCompatibleAttachment(GunSkins.ElectricSkin, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.ElectricSkin.getTextureVariantIndex("Electric"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Voltaic, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Voltaic.getTextureVariantIndex("Voltaic"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Cosmos, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Cosmos.getTextureVariantIndex("Cosmos"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Volcanic, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Volcanic.getTextureVariantIndex("Volcanic"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Emerald, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Emerald.getTextureVariantIndex("Emerald"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Diamond, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Diamond.getTextureVariantIndex("Diamond"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Gold, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Gold.getTextureVariantIndex("Gold"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Sapphire, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Sapphire.getTextureVariantIndex("Sapphire"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Desert, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Desert.getTextureVariantIndex("Desert"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Forest, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Forest.getTextureVariantIndex("Forest"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Amethyst, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amethyst.getTextureVariantIndex("Amethyst"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Ruby, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Ruby.getTextureVariantIndex("Ruby"));
                }, 
                (a, i) -> {
                }
        )
         .withCompatibleAttachment(GunSkins.Arctic, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Arctic.getTextureVariantIndex("Arctic"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Asiimov, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Asiimov.getTextureVariantIndex("Asiimov"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Vulcan, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Vulcan.getTextureVariantIndex("Vulcan"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.CrystalCrimson, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.CrystalCrimson.getTextureVariantIndex("CrystalCrimson"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.PinkIsTheNewBlack, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.PinkIsTheNewBlack.getTextureVariantIndex("PinkIsTheNewBlack"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.DynamicBundle, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.DynamicBundle.getTextureVariantIndex("DynamicBundle"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Woodland_Digital, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Woodland_Digital.getTextureVariantIndex("Woodland_Digital"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Desert_Digital, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Desert_Digital.getTextureVariantIndex("Desert_Digital"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Foliage, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Foliage.getTextureVariantIndex("Foliage"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleAttachment(Magazines.NATOFamasMag, (model) -> {
            GL11.glTranslatef(-0.355F, 0.9F, 1.6F);
            GL11.glScaled(1.2F, 1.5F, 1.5F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.FelinCarryHandle, true, (model) -> {
            GL11.glTranslatef(-0.02F, -0.81F, 0F);
            GL11.glScaled(0.6F, 0.9F, 0.95F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.FamasBipod1, true, (model) -> {
            GL11.glTranslatef(-0.05F, -1.2F, -2.5F);
            GL11.glScaled(1F, 1F, 0.88F);
            GL11.glRotatef(-20F, 0f, 0f, 1f);
            GL11.glRotatef(1F, 1f, 0f, 0f);
            GL11.glRotatef(1.8F, 0f, 1f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.FamasBipod2, true, (model) -> {
            GL11.glTranslatef(-0.25F, -1.05F, -2.5F);
            GL11.glScaled(1F, 1F, 0.88F);
            GL11.glRotatef(200F, 0f, 0f, 1f);
            GL11.glRotatef(-0.8F, 1f, 0f, 0f);
            GL11.glRotatef(1.5F, 0f, 1f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.FelinAction, true, (model) -> {
            GL11.glTranslatef(-0.02F, -0.81F, 0F);
            GL11.glScaled(0.6F, 0.9F, 0.95F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(-0.3F, -1.5F, -0.3F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.255F, -1.55F, -2.25F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.155F, -1.63F, -2.35F);
                GL11.glScaled(0.3F, 0.3F, 0.7F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.23F, -1.92F, 0F);
                GL11.glScaled(0.7F, 0.7F, 0.2F);
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron1) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                GL11.glTranslatef(0.25F, -1.55F, -2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(0.127F, -1.77F, -2.22F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
      .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
          GL11.glTranslatef(-0.286F, -1.72F, -0.4F);
          GL11.glScaled(0.7F, 0.7F, 0.7F);
      },(model) -> {
          if(model instanceof AcogScope2) {
              GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
              GL11.glScaled(0.5F, 0.5F, 0.5F);
          }
          else if(model instanceof AcogReticle) {
              GL11.glTranslatef(0.243F, -0.23F, 0.68f);
              GL11.glScaled(0.03F, 0.03F, 0.03F);
          }
      })
      .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
          GL11.glTranslatef(-0.2F, -1.33F, -0.8F);
          GL11.glScaled(0.55F, 0.55F, 0.55F);
      },(model) -> {
           if(model instanceof Acog2) {
               GL11.glTranslatef(0.15F, -1.035F, 1.513F);
               GL11.glScaled(0.1F, 0.1F, 0.1F);
          }
      })
      .withCompatibleAttachment(Attachments.Reflex, (model) -> {
          if(model instanceof Reflex) {
              GL11.glTranslatef(-0.062F, -1.543F, -0.8F);
              GL11.glScaled(0.45F, 0.45F, 0.45F);
          } else if(model instanceof Reflex2) {
              GL11.glTranslatef(-0.118F, -1.87F, -0.9F);
              GL11.glScaled(0.05F, 0.05F, 0.05F);
          }
      })
       .withCompatibleAttachment(Attachments.Kobra, (model) -> {
          if(model instanceof Kobra) {
              GL11.glTranslatef(-0.047F, -1.57F, -0.7F);
              GL11.glScaled(0.6F, 0.6F, 0.6F);
          } else if(model instanceof Reflex2) {
              GL11.glTranslatef(-0.118F, -1.87F, -0.9F);
              GL11.glScaled(0.05F, 0.05F, 0.05F);
          }
      })
      .withCompatibleAttachment(Attachments.Holo2, (model) -> {
          if(model instanceof Holographic) {
              GL11.glTranslatef(-0.047F, -1.57F, -0.7F);
              GL11.glScaled(0.6F, 0.6F, 0.6F);
          } else if(model instanceof Holo2) {
              GL11.glTranslatef(-0.118F, -1.87F, -0.9F);
              GL11.glScaled(0.05F, 0.05F, 0.05F);
          }
      })
      .withCompatibleAttachment(Attachments.Holographic2, (model) -> {
          if(model instanceof Holographic2) {
          GL11.glTranslatef(-0.047F, -1.57F, -0.7F);
          GL11.glScaled(0.6F, 0.6F, 0.6F);
          } else if(model instanceof Holo2) {
              GL11.glTranslatef(-0.118F, -1.87F, -0.9F);
              GL11.glScaled(0.05F, 0.05F, 0.05F);
          }
      })
      .withCompatibleAttachment(Attachments.MicroT1, (model) -> {
            if(model instanceof MicroT1) {
                GL11.glTranslatef(-0.165F, -1.72F, -0.6F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.12F, -1.83F, -0.7F);
                GL11.glScaled(0.07F, 0.07F, 0.07F);
            }
        })
        .withCompatibleAttachment(Attachments.RMR, (model) -> {
            if(model instanceof RMRsight) {
            GL11.glTranslatef(-0.163F, -1.72F, -0.5F);
            GL11.glScaled(0.28F, 0.28F, 0.28F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.123F, -1.72F, -0.8F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
            GL11.glTranslatef(-0.2F, -1.11F, -5.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withTextureNames("AK12")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new Felin())
            //.withTextureName("M4A1")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.3F, 0.3F, 0.3F);
                GL11.glTranslatef(0f, 0.8f, 0f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1.1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
           .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(2F, 2F, 2F);
                GL11.glTranslatef(-0.3f, 0.750000f, -1.1f);
                GL11.glRotatef(1F, 0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(2F, 2F, 2F);
                GL11.glTranslatef(-0.3f, 0.750000f, -0.9f);
                GL11.glRotatef(2F, 0f, 0f, 1f);
                GL11.glRotatef(-1.5F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(2F, 2F, 2F);
                GL11.glTranslatef(0.46f, 0.77f, -0.15f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.005F, 0.26f, 0.75f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.28f, 0.55f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.24f, 0.8f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.24f, 0.8f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.24f, 0.8f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.24f, 0.8f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.22f, 0.8f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonCustomPositioning(Magazines.NATOFamasMag, (renderContext) -> {
//              GL11.glTranslatef(-0.2F, -0.32F, 0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.FelinCarryHandle.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.FamasBipod1.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.FamasBipod1.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.FamasBipod1.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.FamasBipod2.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.FamasBipod2.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.FamasBipod2.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0F);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.FelinAction.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.FelinCarryHandle.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.FelinCarryHandle.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(Magazines.NATOFamasMag.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.NATOFamasMag.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.FelinAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1.5F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.FelinAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 1.5F);
                })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.475000f, -1.749999f);
                    }, 300, 60),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(-41.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(22.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.475000f, -1.749999f);
                    }, 400, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(22.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.43f, -1.67f);
                    }, 100, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.175000f, -0.100000f, -0.125000f);
                }, 400, 100),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(-2.00000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.175000f, -0.100000f, -0.1f);
                }, 150, 100)
            )
            
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(22.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.225000f, -0.43f, -1.67f);
                }, 150, 50),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.225000f, -0.475000f, -1.749999f);
                }, 150, 50)
            )
            
            .withFirstPersonCustomPositioningUnloading(Magazines.NATOFamasMag,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.2F, 0.5F, -0.2F);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.2F, 0.9F, -0.2F);
                    GL11.glRotatef(-20F, 1f, 0f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.NATOFamasMag,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.05F, 1F, 0F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.5F, 0F, -0.2F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.5F, 0F, -0.2F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                }, 250, 1000),
                new Transition((renderContext) -> {
                    /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                }, 250, 1000)
                    )
            
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.FelinCarryHandle.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 500, 1000),
                new Transition((renderContext) -> {
                }, 500, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.FelinCarryHandle.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.FelinAction.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 500, 1000),
                new Transition((renderContext) -> {
                }, 500, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.FelinAction.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 1.5F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.FamasBipod1.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 500, 1000),
                new Transition((renderContext) -> {
                }, 500, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.FamasBipod1.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.FamasBipod2.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 500, 1000),
                new Transition((renderContext) -> {
                }, 500, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.FamasBipod2.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1f, 0.600000f, -1.5f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.225000f, 1.5f, -1.5f);
                  }, 350, 600)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(2F, 2F, 2F);
                GL11.glTranslatef(0.46f, 0.77f, -0.25f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.005F, 0.26f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.28f, 0.6f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.24f, 0.8f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.24f, 0.8f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.24f, 0.8f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.24f, 0.8f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.22f, 0.8f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.13f, 0.1f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.100000f, 1.125000f, -1.424999f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.1f, 0.625000f, -1f);
             })
             
            .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.075000f, -0.475000f, 0.175000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                     })
            
            .withFirstPersonHandPositioningZooming(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.075000f, -0.475000f, 0.175000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.175000f, 0.000000f, 0.500000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -1.399999f, 0.075000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, -1.174999f, 0.150000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, -1.174999f, 0.150000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.575000f, 0.075000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.250000f, -0.600000f, -0.075000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, -1.174999f, 0.150000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -1.399999f, 0.075000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.475000f, 0.175000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.075000f, -0.475000f, 0.175000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50))
                    
            .build())
		.withSpawnEntityDamage(7f)
		.withSpawnEntityGravityVelocity(0.0118f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}