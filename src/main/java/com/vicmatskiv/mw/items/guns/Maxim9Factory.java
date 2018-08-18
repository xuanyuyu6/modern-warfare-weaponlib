package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.M1911;
import com.vicmatskiv.mw.models.Maxim9;
import com.vicmatskiv.mw.models.Maxim9slide;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.P2000rearsight;
import com.vicmatskiv.mw.models.P226frontsight;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.Taurus1911;
import com.vicmatskiv.mw.models.M1911frontsight;
import com.vicmatskiv.mw.models.M1911rearsight;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class Maxim9Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("Maxim9")
        .withFireRate(0.7f)
        .withRecoil(3f)
        .withZoom(0.9f)
        .withMaxShots(1)
        .withShootSound("maxim9")
        .withReloadSound("PistolReload")
        .withUnloadSound("pistolUnload")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.5f)
        .withFlashOffsetX(() -> 0.2f)
        .withFlashOffsetY(() -> 0.1f)
        .withShootSoundVolume(0.7f)
        .withInaccuracy(2)
        .withCreativeTab(ModernWarfareMod.PistolsTab)
        .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate)
        .withInformationProvider(stack -> Arrays.asList("Type: Pistol", "Damage: 7.5", 
        "Caliber: 9mm", "Magazines:", "20rnd 9mm magazine",
        "Fire Rate: Semi"))
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
        .withCompatibleAttachment(AuxiliaryAttachments.Maxim9Slide, true, (model) -> {
            if(model instanceof Maxim9slide) {
                GL11.glScaled(1F, 1F, 1F);
            }
            else if(model instanceof P2000rearsight) {
                GL11.glTranslatef(-0.17F, -1.17F, 0.05F);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
            }
        })
        .withCompatibleAttachment(Attachments.Maxim9Cover, true, (model) -> {
            })
        .withCompatibleAttachment(Attachments.RMR, (model) -> {
            if(model instanceof RMRsight) {
                GL11.glTranslatef(-0.195F, -1.28F, -1.5F);
                GL11.glScaled(0.48F, 0.48F, 0.48F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -1.25F, -2F);
                GL11.glScaled(0.2F, 0.2F, 0.2F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Maxim9FrontSight, true, (model) -> {
            if(model instanceof P226frontsight) {
                GL11.glTranslatef(-0.165F, -1.175F, -2.88F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
            }
        })
        .withCompatibleAttachment(Magazines.G18Mag, (model) -> {
            GL11.glTranslatef(0F, 0F, 0F);
            })
        .withTextureNames("Maxim9")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new Maxim9())
            //.withTextureName("M9")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
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
                GL11.glRotatef(4F, 0f, 0f, 1f);
                GL11.glScaled(2F, 2F, 2F);
                GL11.glTranslatef(-0.3f, 0.5f, -2.8f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(4F, 0f, 0f, 1f);
                GL11.glScaled(2F, 2F, 2F);
                GL11.glTranslatef(-0.3f, 0.5f, -2.65f);
                GL11.glRotatef(-6F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.Maxim9Slide.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.5F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.Maxim9Slide.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.5F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
             .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.Maxim9FrontSight.getRenderablePart(), (renderContext) -> {
                })
                
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.Maxim9FrontSight.getRenderablePart(), (renderContext) -> {
                }) 
                
            .withFirstPersonPositioningCustomRecoiled(Magazines.G18Mag, (renderContext) -> {})
            
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.G18Mag, (renderContext) -> {})
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.350000f, 0.63f, -2.7f);
                GL11.glRotatef(-5F, 1f, 0f, 0f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    GL11.glTranslatef(0f, 0.2f, 1.5f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            //.withFirstPersonCustomRecoiled(CommonProxy.Glock21Mag, (p, itemStack) -> {})
                
            .withFirstPersonCustomPositioning(Magazines.G18Mag, (renderContext) -> {})
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.Maxim9Slide.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.5F);
                }
            })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(-4F, 0f, 0f, 1f);
                        GL11.glRotatef(-9F, 1f, 0f, 0f);
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glTranslatef(-0.3f, 1.2f, -2.7f);
                    }, 360, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(38F, 0f, 1f, 0f);
                        GL11.glRotatef(-7F, 0f, 0f, 1f);
                        GL11.glRotatef(-1F, 1f, 0f, 0f);
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glTranslatef(-0.43f, 0.6f, -2.7f);
                    }, 200, 0),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(40F, 0f, 1f, 0f);
                        GL11.glRotatef(2F, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glTranslatef(-0.45f, 0.6f, -2.7f);
                    }, 160, 150),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(38F, 0f, 1f, 0f);
                        GL11.glRotatef(7F, 0f, 0f, 1f);
                        GL11.glRotatef(-4F, 1f, 0f, 0f);
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glTranslatef(-0.44f, 0.9f, -2.7f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glRotatef(9F, 0f, 0f, 1f);
                        GL11.glRotatef(2F, 1f, 0f, 0f);
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glTranslatef(-0.33f, 0.5f, -2.7f);
                    }, 120, 0)
                    
                    
                )
            
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glRotatef(-4F, 0f, 0f, 1f);
                    GL11.glRotatef(-9F, 1f, 0f, 0f);
                    GL11.glScaled(2F, 2F, 2F);
                    GL11.glTranslatef(-0.35f, 1.2f, -2.7f);
                }, 300, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                    GL11.glRotatef(-9F, 1f, 0f, 0f);
                    GL11.glScaled(2F, 2F, 2F);
                    GL11.glTranslatef(-0.35f, 1.2f, -2.7f);
                }, 230, 0)
            )
            
            .withFirstPersonCustomPositioningUnloading(Magazines.G18Mag,
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                 GL11.glTranslatef(0.05F, 1.8F, 0.4F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.G18Mag,
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.05F, 1.8F, 0.4F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
//                    GL11.glTranslatef(0.5F, 0F, -0.2F);
//                    GL11.glRotatef(0F, 0f, 1f, 0f);
//                    GL11.glScaled(0.55F, 0.55F, 0.55F);
//                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
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
                    
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.Maxim9Slide.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.Maxim9Slide.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0F);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.Maxim9FrontSight.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.Maxim9FrontSight.getRenderablePart(),
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
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.149999f, 0.575000f, -0.725000f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glScaled(2F, 2F, 2F);
                      GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.375000f, 0.950000f, -1.075000f);
                  }, 350, 600)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.350000f, 0.63f, -2.799999f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    GL11.glTranslatef(0f, 0.2f, 1.5f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScaled(0.7F, 0.7F, 0.7F);
                GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.575000f, -0.3f, -1f);
             })
            .withFirstPersonPositioningModifying((renderContext) -> {
                     GL11.glScaled(3F, 3F, 3F);
                     GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(-1.374999f, 0.600000f, -1.449999f);
                 })
                 .withFirstPersonHandPositioning(
                         (renderContext) -> {
                             GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                             GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(-0.100000f, -0.800000f, 0.075000f);
                           
//                           GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                       }, 
                       (renderContext) -> {
                           GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                           GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                           GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                           GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                           GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                           
//                           GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                       })
                .withFirstPersonHandPositioningRunning(
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(35.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.450000f, 0.000000f, 0.375000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                     })         
                .withFirstPersonHandPositioningModifying(
                         (renderContext) -> {
                             GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                             GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.275000f, -0.125000f, 0.400000f);
                         }, 
                         (renderContext) -> {
                             GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                             GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                         })
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -1.149999f, 0.200000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.850000f, 0.150000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.850000f, 0.150000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.800000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.800000f, 0.075000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.850000f, 0.150000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -1.149999f, 0.200000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonHandPositioningZooming(
                    (renderContext) -> {
                      GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                      GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(-0.100000f, -0.800000f, 0.075000f);
                  }, 
                  (renderContext) -> {
                      GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                      GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                      GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                      GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                      GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                  })
                  
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.775000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.775000f, 0.125000f);
                    }, 250, 50))
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                    }, 250, 50))
                          
            .build())
        .withSpawnEntityDamage(7.5f)
        .withSpawnEntityGravityVelocity(0.02f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}
