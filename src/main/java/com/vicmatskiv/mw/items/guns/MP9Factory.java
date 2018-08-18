package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Grip2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MP9;
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

public class MP9Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("MP9")
//      .withAmmo(CommonProxy.M9Mag)
//      .withAmmoCapacity(10)
        .withFireRate(0.8f)
        .withRecoil(2.7f)
        .withZoom(0.9f)
        //.withMaxShots(1)
        .withShootSound("Weevil")
        .withSilencedShootSound("MP5Silenced")
        .withReloadSound("m4reload")
        .withUnloadSound("m4unload")
        .withReloadingTime(30)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.7f)
        .withFlashOffsetX(() -> 0.212f)
        .withFlashOffsetY(() -> 0.22f)
        .withCreativeTab(ModernWarfareMod.SMGTab)
        .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate)
        .withInformationProvider(stack -> Arrays.asList("Type: Submachine gun", "Damage: 5", 
        "Caliber: 9mm", "Magazines:", "20rnd 9mm Magazine",
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
        .withCompatibleAttachment(Magazines.G18Mag, (model) -> {
            GL11.glTranslatef(0F, 0.1F, -0.05F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
            GL11.glRotatef(-10F, 1f, 0f, 0f);
            })
        .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
            GL11.glTranslatef(-0.25F, -1.04F, -4.4F);
            GL11.glScaled(1.5F, 1.5F, 1.5F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.MP5KGrip, true, (model) -> {
            if(model instanceof Grip2) {
                GL11.glTranslatef(-0.2F, -0.2F, -1.4F);
                GL11.glScaled(0.9F, 0.9F, 0.9F);
                GL11.glRotatef(-6F, 1f, 0f, 0f);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.162F, -1.75F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(-0.055F, -1.35F, -4.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.195F, -1.29F, 0.3F);
                GL11.glScaled(0.5F, 0.33F, 0.2F);
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
                GL11.glTranslatef(-0.1F, -1.04F, -1.8F);
                GL11.glScaled(0.15F, 0.45F, 0.3F);
                GL11.glRotatef(-180F, 0f, 0f, 1f);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.31F, -1.2F, -0.1F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
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
            GL11.glTranslatef(-0.19F, -0.88F, -0.5F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (model) -> {
            if(model instanceof Reflex) {
            GL11.glTranslatef(-0.055F, -1F, -0.9F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.12F, -1.335F, -0.9F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Holo2, (model) -> {
            if(model instanceof Holographic) {
                GL11.glTranslatef(-0.04F, -1.02F, -0.4F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
            } else if(model instanceof Holo2) {
                GL11.glTranslatef(-0.12F, -1.335F, -0.4F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
        .withCompatibleAttachment(Attachments.Holographic2, (model) -> {
            if(model instanceof Holographic2) {
                GL11.glTranslatef(-0.04F, -1.02F, -0.4F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
            } else if(model instanceof Holo2) {
                GL11.glTranslatef(-0.12F, -1.335F, -0.4F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
        .withCompatibleAttachment(Attachments.Kobra, (model) -> {
            if(model instanceof Kobra) {
                GL11.glTranslatef(-0.035F, -1.05F, -0.4F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
                } else if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.12F, -1.335F, -0.9F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.AR15Action, true, (model) -> {
            GL11.glTranslatef(-0.175F, -1.05F, -0.35F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        })
        .withTextureNames("AK12")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new MP9())
            //.withTextureName("M9")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glTranslatef(0, 0.3f, 0.5F);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.65f, 1.05f, -1.6f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(-0.65f, 1.05f, -1.5f);
                GL11.glRotatef(5F, 0f, 0f, 1f);
                GL11.glRotated(-1, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.285f, 0.72f, -0.6f);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0.005F, 0.278f, 0.3f);
                } 

                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.217f, 0.3f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.245f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.205f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.205f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.245f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })

            //.withFirstPersonCustomRecoiled(CommonProxy.Glock21Mag, (p, itemStack) -> {})
                
            .withFirstPersonCustomPositioning(Magazines.G18Mag, (renderContext) -> {})
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.MP5KGrip.getRenderablePart(), (renderContext) -> {
                
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                }
            })
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.AR15Action.getRenderablePart(), (renderContext) -> {
                
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                }
            })
            
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.174999f, -0.150000f, -0.850000f);
                    }, 300, 60),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.174999f, -0.150000f, -0.850000f);
                    }, 400, 200),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.500000f, 0.975000f, -1.075000f);
                }, 400, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.500000f, 0.975000f, -1.075000f);
                }, 150, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(65.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.500000f, 0.975000f, -1.075000f);
                }, 60, 0)
              
            )
            
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.174999f, -0.150000f, -0.850000f);
                }, 150, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-1.174999f, -0.150000f, -0.850000f);
                }, 150, 50)
            )
            
            .withFirstPersonCustomPositioningUnloading(Magazines.G18Mag,
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//                  GL11.glRotatef(-20F, 1f, 0f, 0f);
////                    GL11.glScaled(0.55F, 0.55F, 0.55F);
////                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.05F, 1.9F, 0.4F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.G18Mag,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.05F, 1.9F, 0.4F);
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
                }, 250, 1000),
                new Transition((renderContext) -> {
                    /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.MP5KGrip.getRenderablePart(),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0F, 0.5F, -0.2F);
//                  GL11.glRotatef(-20F, 1f, 0f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(1.3F, 0.5F, -0.8F);
//                  GL11.glRotatef(10F, 1f, 0f, 0f);
//                  GL11.glRotatef(10F, 0f, 1f, 0f);
//                  GL11.glRotatef(-90F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.MP5KGrip.getRenderablePart(),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.05F, 1F, 0F);
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
                }, 250, 1000),
                new Transition((renderContext) -> {
                    /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.AR15Action.getRenderablePart(),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0F, 0.5F, -0.2F);
//                  GL11.glRotatef(-20F, 1f, 0f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(1.3F, 0.5F, -0.8F);
//                  GL11.glRotatef(10F, 1f, 0f, 0f);
//                  GL11.glRotatef(10F, 0f, 1f, 0f);
//                  GL11.glRotatef(-90F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.AR15Action.getRenderablePart(),
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.05F, 1F, 0F);
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
                    /*GL11.glTranslatef(0.25F, -0.32F, -0.2F);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);*/
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 0.5F);
                    /*GL11.glRotatef(45F, 0f, 1f, 0f);
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
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8f, 0.600000f, -0.5f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                      GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.225000f, 1.075000f, -1f);
                  }, 350, 600)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                GL11.glTranslatef(0.285f, 0.72f, -0.825000f);
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0.005F, 0.278f, 0.4f);
                } 

                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.217f, 0.4f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.245f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.205f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.205f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0.005F, 0.245f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(4F, 4F, 4F);
                GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.9f, 1.6f, -0.6f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                 GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.950000f, 0.600000f, 0.000000f);
             })
              .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.025000f, -0.500000f, 0.200000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                     })
                     
            .withFirstPersonHandPositioningRunning(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(-0.025000f, -0.500000f, 0.200000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(1.6f, 1.6f, 1.6f);
                         GL11.glTranslatef(1.5f, 0.1f, -0.2f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-10f, 1f, 0f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.1f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                     })
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.575000f, -0.950000f, 0.075000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.950000f, 0.075000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.300000f, -0.825000f, -0.050000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.300000f, -0.950000f, -0.050000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.300000f, -0.825000f, -0.050000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                        GL11.glTranslatef(-0.44f, 0.48f, 0.2f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-140f, 1f, 0f, 0f);
                        GL11.glRotatef(10f, 0f, 0f, 1f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                        GL11.glTranslatef(-0.44f, 0.48f, 0.2f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-140f, 1f, 0f, 0f);
                        GL11.glRotatef(10f, 0f, 0f, 1f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                        GL11.glTranslatef(-0.44f, 0.48f, 0.2f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-140f, 1f, 0f, 0f);
                        GL11.glRotatef(10f, 0f, 0f, 1f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.200000f, -0.950000f, 0.075000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 4f);
                        GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.575000f, -0.950000f, 0.075000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 50))
                    
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.500000f, 0.200000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(3.3f, 3.3f, 3.3f);
                         GL11.glTranslatef(-0.34f, 0.48f, 0.3f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-120f, 1f, 0f, 0f);
                         GL11.glRotatef(10f, 0f, 0f, 1f);
                     })
                     
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.500000f, 0.200000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.500000f, 0.200000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                        GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.3f, 3.3f, 3.3f);
                        GL11.glTranslatef(-0.13f, 0.38f, 0.52f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-95f, 1f, 0f, 0f);
                    }, 250, 50))
                     
            .build())
        .withSpawnEntityDamage(5f)
        .withSpawnEntityGravityVelocity(0.02f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}