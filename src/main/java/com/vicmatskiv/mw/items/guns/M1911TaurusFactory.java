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
import com.vicmatskiv.mw.models.Taurus1911;
import com.vicmatskiv.mw.models.Taurus1911Slide;
import com.vicmatskiv.mw.models.M1911frontsight;
import com.vicmatskiv.mw.models.M1911rearsight;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class M1911TaurusFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("M1911Taurus")
//      .withAmmo(CommonProxy.M1911Mag)
//      .withAmmoCapacity(10)
        .withFireRate(0.5f)
        .withRecoil(5f)
        .withZoom(0.9f)
        .withMaxShots(1)
        .withShootSound("M1911")
        .withSilencedShootSound("m1911silenced")
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
//      .withShellCasingForwardOffset(0.001f)
        .withInaccuracy(3)
        .withCreativeTab(ModernWarfareMod.PistolsTab)
        .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate)
        .withInformationProvider(stack -> Arrays.asList("Type: Pistol", "Damage: 5.5", 
        "Caliber: .45 ACP", "Magazines:", "10rnd .45 ACP Magazine",
        "Fire Rate: Semi"))
        .withCompatibleAttachment(GunSkins.ElectricSkin, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.ElectricSkin.getTextureVariantIndex("Electric"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Amber, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Amber.getTextureVariantIndex("Amber"));
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
        .withCompatibleAttachment(GunSkins.Diamond, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Diamond.getTextureVariantIndex("Diamond"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(AuxiliaryAttachments.Taurus1911Slide, true, (model) -> {
            if(model instanceof Taurus1911Slide) {
                GL11.glScaled(1F, 1F, 1F);
            }
            else if(model instanceof M1911rearsight) {
                GL11.glTranslatef(-0.155F, -1.175F, -0.15F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            }
            else if(model instanceof M1911frontsight) {
                GL11.glTranslatef(-0.15F, -1.17F, -2.35F);
                GL11.glScaled(0.25F, 0.25F, 0.25F);
            }
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.01F, -0.65F, -2.3F);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
            GL11.glRotatef(-90F, 0f, 0f, -4f);
        })
        .withCompatibleAttachment(Magazines.M1911_7rnd, (model) -> {
            GL11.glTranslatef(0F, 0.2F, 0.12F);
            })
        .withCompatibleAttachment(Attachments.Silencer45ACP, (model) -> {
            GL11.glTranslatef(-0.23F, -1.14F, -4.92F);
            GL11.glScaled(1.5F, 1.5F, 1.5F);
        })
        .withTextureNames("Taurus1911")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new Taurus1911())
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
                GL11.glTranslatef(-0.7f, 0.65f, -3.2f);
                
//                GL11.glScaled(2F, 2F, 2F);
//                GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(70.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(50.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(1f, 0.450000f, -1.6f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(4F, 0f, 0f, 1f);
                GL11.glScaled(2F, 2F, 2F);
                GL11.glTranslatef(-0.7f, 0.65f, -3f);
                GL11.glRotatef(-7F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.Taurus1911Slide.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.5F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.Taurus1911Slide.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.5F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomRecoiled(Magazines.M1911_7rnd, (renderContext) -> {})
            
            .withFirstPersonPositioningCustomZoomingRecoiled(Magazines.M1911_7rnd, (renderContext) -> {})
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.350000f, 0.64f, -2.4f);
                GL11.glRotatef(-3F, 1f, 0f, 0f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            //.withFirstPersonCustomRecoiled(CommonProxy.Glock21Mag, (p, itemStack) -> {})
                
            .withFirstPersonCustomPositioning(Magazines.M1911_7rnd, (renderContext) -> {})
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.Taurus1911Slide.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.5F);
                }
            })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.9f, 0.525000f, -2f);
                    }, 280, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.4f, 0.625000f, -2f);
                    }, 300, 100),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(2F, 2F, 2F);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(22.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-1.4f, 0.625000f, -2f);
                    }, 120, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(15F, 0f, 1f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                        GL11.glRotatef(-10F, 1f, 0f, 0f);
                        GL11.glScaled(3F, 3F, 3F);
                        GL11.glTranslatef(-1.1f, 1.5f, -2.2f);
                    }, 200, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(15F, 0f, 1f, 0f);
                        GL11.glRotatef(10F, 0f, 0f, 1f);
                        GL11.glRotatef(-25F, 1f, 0f, 0f);
                        GL11.glScaled(3F, 3F, 3F);
                        GL11.glTranslatef(-1.1f, 1.8f, -1.8f);
                    }, 120, 0)
                    
                    
                )
            
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(40F, 0f, 1f, 0f);
                    GL11.glRotatef(-13F, 0f, 0f, 1f);
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glScaled(3F, 3F, 3F);
                    GL11.glTranslatef(-1.2f, 1.45f, -3.2f);
                }, 150, 50)
            )
            
            .withFirstPersonCustomPositioningUnloading(Magazines.M1911_7rnd,
                new Transition((renderContext) -> {
//                  GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//                  GL11.glRotatef(-20F, 1f, 0f, 0f);
////                    GL11.glScaled(0.55F, 0.55F, 0.55F);
////                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.M1911_7rnd,
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.05F, 1.8F, 0.4F);
//                    GL11.glRotatef(0F, 0f, 1f, 0f);
//                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
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
                    
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.Taurus1911Slide.getRenderablePart(),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
//                    GL11.glRotatef(0F, 0f, 1f, 0f);
//                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.Taurus1911Slide.getRenderablePart(),
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
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.350000f, 0.64f, -2.799999f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
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
                GL11.glTranslatef(-0.575000f, -0.775000f, -1.249999f);
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
                             GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(-0.125000f, -0.775000f, 0.125000f);
                           
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
                             GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.365000f, -0.536000f, 0.135000f);
                         })
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.300000f, -0.900000f, 0.050000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.825000f, 0.000000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(95.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.825000f, 0.000000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-180.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.375000f, -0.675000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-185.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.300000f, -0.675000f, 0.175000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.365000f, -0.536000f, 0.135000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.365000f, -0.536000f, 0.135000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.365000f, -0.536000f, 0.135000f);
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
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.325000f, -0.825000f, 0.250000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.348000f, -0.540000f, 0.144000f);
                    }, 250, 1000))
                    
            .withFirstPersonHandPositioningZooming(
                            (renderContext) -> {
                              GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                              GL11.glRotatef(-110.000000f, 1f, 0f, 0f);
                              GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                              GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                              GL11.glTranslatef(-0.125000f, -0.775000f, 0.125000f);
                          }, 
                          (renderContext) -> {
                              GL11.glScalef(4.500000f, 4.500000f, 4.500000f);
                              GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                              GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                              GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                              GL11.glTranslatef(0.370000f, -0.490000f, 0.150000f);
                          })
            .build())
        .withSpawnEntityDamage(5.5f)
        .withSpawnEntityGravityVelocity(0.02f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}
