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
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AR15CarryHandle;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M416;
import com.vicmatskiv.mw.models.M4A1;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MBUSiron;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class M416Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("M416")
//      .withAmmo(CommonProxy.AR15Mag)
//      .withAmmoCapacity(30)
        .withFireRate(0.7f)
        .withRecoil(3.5f)
        .withZoom(0.9f)
        .withMaxShots(Integer.MAX_VALUE, 3, 1)
        //.withMaxShots(5)
        .withShootSound("m4a1")
        .withSilencedShootSound("ar15silenced")
        .withReloadSound("m4reload")
        .withUnloadSound("m4unload")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.8f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.1f)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                Ores.INGOT_STEEL)
        .withInformationProvider(stack -> Arrays.asList("Type: Carbine", "Damage: 7", 
        "Caliber: 5.56x45mm NATO", "Magazines:", "30rnd 5.56x45mm NATO Magazine", "20rnd 5.56x45mm NATO Magazine", "40rnd 5.56x45mm NATO Magazine",
        "30rnd 5.56x45mm NATO PMAG Magazine", "100rnd 5.56x45mm NATO Beta-C Magazine",
        "Fire Rate: Auto"))
        .withCompatibleAttachment(GunSkins.Diamond, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Diamond.getTextureVariantIndex("Diamond"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.ElectricSkin, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.ElectricSkin.getTextureVariantIndex("Electric"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(GunSkins.Fade, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Fade.getTextureVariantIndex("Ruby"));
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
         .withCompatibleAttachment(GunSkins.Arctic, 
                (a, i) -> {
                    i.setActiveTextureIndex(GunSkins.Arctic.getTextureVariantIndex("Arctic"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(Magazines.NATOMag1, (model) -> {
            GL11.glTranslatef(-0.35F, 0.5F, -1.25F);
            GL11.glScaled(1.15F, 1.2F, 1.15F);
        })
        .withCompatibleAttachment(Magazines.NATO40rnd, (model) -> {
            GL11.glTranslatef(-0.35F, 0.5F, -1.25F);
            GL11.glScaled(1.15F, 1.2F, 1.15F);
        })
        .withCompatibleAttachment(Magazines.NATO20rnd, (model) -> {
            GL11.glTranslatef(-0.35F, 0.5F, -1.25F);
            GL11.glScaled(1.15F, 1.2F, 1.15F);
        })
        .withCompatibleAttachment(Magazines.NATOMag2, (model) -> {
            GL11.glTranslatef(-0.35F, 0.5F, -1.25F);
            GL11.glScaled(1.15F, 1.2F, 1.15F);
        })
        .withCompatibleAttachment(Magazines.NATODrum100, (model) -> {
            GL11.glTranslatef(-0.35F, 0.69F, -1.25F);
            GL11.glScaled(1.15F, 1.2F, 1.15F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.AR15Action, true, (model) -> {
            GL11.glTranslatef(-0.175F, -1.28F, -0.67F);
            GL11.glScaled(0.7F, 0.4F, 0.7F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.162F, -1.75F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(-0.055F, -1.35F, -4.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(-0.185F, -1.45F, -3.75F);
                GL11.glScaled(0.51F, 0.45F, 1F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(0.092F, -1.91F, -0.9F);
                GL11.glScaled(0F, 0F, 0F);
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
                GL11.glTranslatef(-0.164F, -1.255F, -3.7F);
                GL11.glScaled(0.5F, 0.4F, 1.1F);
                GL11.glRotatef(-180F, 0f, 0f, 1f);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(-0.044F, -1.1F, -0.3F);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(-180F, 0f, 0f, 1f);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
         .withCompatibleAttachment(Attachments.AKMIron, true, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
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
                GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(0.092F, -1.91F, -0.9F);
                GL11.glScaled(0F, 0F, 0F);
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
                GL11.glTranslatef(-0.044F, -1.1F, -0.3F);
                GL11.glScaled(0.63F, 1F, 1.9F);
                GL11.glRotatef(-180F, 0f, 0f, 1f);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(-0.107F, -1.37F, -0.25F);
                GL11.glScaled(0.35F, 0.5F, 0.37F);
            } else if(model instanceof MBUSiron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.265F, -1.41F, -0.3F);
            GL11.glScaled(0.6F, 0.6F, 0.6F);
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
            GL11.glTranslatef(-0.17F, -1.14F, -0.45F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Scope, (player, stack) -> {
            GL11.glTranslatef(-0.3F, -1.38F, -0.3F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
            },(model) -> {
                if(model instanceof LPscope) {
                GL11.glTranslatef(0.237F, -0.272F, 0.67F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
                }
            })
        .withCompatibleAttachment(Attachments.HP, (player, stack) -> {
            GL11.glTranslatef(-0.3F, -1.38F, -0.5F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
             if(model instanceof LPscope) {
                GL11.glTranslatef(0.237F, -0.235F, 1.16F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (model) -> {
            if(model instanceof Reflex) {
                GL11.glTranslatef(-0.072F, -1.25F, -0.9F);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -1.53F, -0.9F);
                GL11.glScaled(0.07F, 0.07F, 0.07F);
            }
        })
        .withCompatibleAttachment(Attachments.Holo2, (model) -> {
            if(model instanceof Holographic) {
            GL11.glTranslatef(-0.053F, -1.28F, -0.6F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
            } else if(model instanceof Holo2) {
                GL11.glTranslatef(-0.12F, -1.545F, -0.5F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
        .withCompatibleAttachment(Attachments.Holographic2, (model) -> {
            if(model instanceof Holographic2) {
                GL11.glTranslatef(-0.053F, -1.28F, -0.6F);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
            } else if(model instanceof Holo2) {
                GL11.glTranslatef(-0.12F, -1.55F, -0.5F);
                GL11.glScaled(0.05F, 0.05F, 0.05F);
            }
        })
        .withCompatibleAttachment(Attachments.Kobra, (model) -> {
            if(model instanceof Kobra) {
                GL11.glTranslatef(-0.053F, -1.28F, -0.6F);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.12F, -1.53F, -1.05F);
                GL11.glScaled(0.07F, 0.07F, 0.07F);
            }
        })
        .withCompatibleAttachment(Attachments.MicroT1, (model) -> {
            if(model instanceof MicroT1) {
                GL11.glTranslatef(-0.17F, -1.42F, -0.6F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            } else if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -1.53F, -0.7F);
                GL11.glScaled(0.07F, 0.07F, 0.07F);
            }
        })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0.41F, -2.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.41F, -2.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Grip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.35F, -2.9F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.41F, -2.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
            GL11.glTranslatef(-0.2F, -0.41F, -3.2F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef(0.05F, -1.18F, -3.2F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.05F, -1.18F, -3.2F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        })
        .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
            GL11.glTranslatef(-0.2F, -1.235F, -6.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
//      .withCompatibleAttachment(CommonProxy.M4Rail, true, (model) -> {
//            if(model instanceof AKRail) {
//                GL11.glTranslatef(0.13F, -1.17F, -3.5F);
//                GL11.glScaled(0.6F, 0.6F, 0.6F);
//                GL11.glRotatef(90F, 0f, 0f, 1f);
//            } else if(model instanceof AKRail2) {
//                GL11.glTranslatef(-0.37F, -1.005F, -3.5F);
//                GL11.glScaled(0.6F, 0.6F, 0.6F);
//                GL11.glRotatef(-90F, 0f, 0f, 1f);
//            } else if(model instanceof AKRail3) {
//                GL11.glTranslatef(-0.03F, -0.84F, -3.64F);
//                GL11.glScaled(0.6F, 0.6F, 0.65F);
//                GL11.glRotatef(180F, 0f, 0f, 1f);
//            } else if(model instanceof AKRail4) {
//                GL11.glTranslatef(-0.2F, -1.32F, -1.82f);
//                GL11.glScaled(0.6F, 0.8F, 0.78F);
//            } else if(model instanceof AKRail5) {
//                GL11.glTranslatef(-0.2F, -1.32F, -3.65f);
//                GL11.glScaled(0.6F, 0.8F, 0.68F);
//            }
//        })
        .withTextureNames("AK12")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new M416())
            //.withTextureName("M4A1")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-1.7F, -0.8F, 1.9F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(4.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.4f, 1.05f, -0.4f);
                
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//                GL11.glRotatef(5.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.4f, 1.05f, -0.1f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(4.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.4f, 1.05f, -0.35f);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f); 
                
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//                GL11.glRotatef(5.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.4f, 1.05f, -0f);
//                GL11.glRotatef(-1.5F, 1f, 0f, 0f); 
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 0.9f, -0.4f);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.001F, 0.095f, 0.65f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
//                    GL11.glTranslatef(-0.003F, -0.065f, 0.55f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.003F, 0.03f, 0.45f);
                } 
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.001F, 0.12f, 0.5f);
                } 

                // HP Zoomw
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.001F, 0.12f, 0.25f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.1f, 0.1f);
                } 

                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.09f, 0.1f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.09f, 0.1f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.09f, 0.1f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.09f, 0.1f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
        
            .withFirstPersonCustomPositioning(Magazines.NATOMag1, (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonCustomPositioning(Magazines.NATO20rnd, (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonCustomPositioning(Magazines.NATO40rnd, (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonCustomPositioning(Magazines.NATOMag2, (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonCustomPositioning(Magazines.NATODrum100, (renderContext) -> {
//              GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
//              GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                })
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.AR15Action.getRenderablePart(), (renderContext) -> {
                })
//                
//            .withFirstPersonCustomPositioning(CommonProxy.M4Rail.getRenderablePart(), (renderContext) -> {
//                })
//
//            .withFirstPersonPositioningCustomZoomingRecoiled(CommonProxy.M4Rail.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, 0F, 0F);
//                })
//                
//            .withFirstPersonPositioningCustomRecoiled(CommonProxy.M4Rail.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, 0F, 0F);
//                })
//                
//            .withFirstPersonPositioningCustomZoomingRecoiled(CommonProxy.NATODrum100.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, 0F, 0F);
//                })
//                
//            .withFirstPersonPositioningCustomRecoiled(CommonProxy.NATODrum100.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, 0F, 0F);
//                })
//                
//            .withFirstPersonPositioningCustomZoomingRecoiled(CommonProxy.NATOMag2.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, 0F, 0F);
//                })
//                
//            .withFirstPersonPositioningCustomRecoiled(CommonProxy.NATOMag2.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, 0F, 0F);
//                })
//                
//            .withFirstPersonPositioningCustomZoomingRecoiled(CommonProxy.NATOMag1.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, 0F, 0F);
//                })
//                
//            .withFirstPersonPositioningCustomRecoiled(CommonProxy.NATOMag1.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, 0F, 0F);
//                })
//                
//            .withFirstPersonPositioningCustomZoomingRecoiled(CommonProxy.NATO20rnd.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, 0F, 0F);
//                })
//                
//            .withFirstPersonPositioningCustomRecoiled(CommonProxy.NATO20rnd.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, 0F, 0F);
//                })
//                
//            .withFirstPersonPositioningCustomZoomingRecoiled(CommonProxy.NATO40rnd.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, 0F, 0F);
//                })
//                
//            .withFirstPersonPositioningCustomRecoiled(CommonProxy.NATO40rnd.getRenderablePart(), (renderContext) -> {
//                GL11.glTranslatef(0F, 0F, 0F);
//                })
                
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.650000f, 0.950000f, -0.275000f);
                    }, 350, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.650000f, 0.950000f, -0.275000f);
                    }, 300, 100),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(32.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.650000f, 0.92f, -0.275000f);
                }, 100, 130),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.3f, 0.95f, -0.275000f);
                }, 290, 10),
                new Transition((renderContext) -> { // Reload position
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(43.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-2.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.3f, 0.95f, -0.275000f);
                }, 310, 0)
            )
            
            .withFirstPersonPositioningUnloading(
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.5f, 0.85f, -0.300000f);
                    GL11.glRotatef(13F, 0f, 0f, 1f);
                    GL11.glRotatef(5F, 1f, 0f, 0f);
                }, 300, 50),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.2f, 1f, -0.300000f);
                    GL11.glRotatef(-10F, 0f, 0f, 1f);
                    GL11.glRotatef(-3F, 1f, 0f, 0f);
                }, 170, 0),
                new Transition((renderContext) -> { // Reload position
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(-0.24f, 1f, -0.300000f);
                    GL11.glRotatef(-4F, 0f, 0f, 1f);
                    GL11.glRotatef(-1F, 1f, 0f, 0f);
                }, 170, 0)
            )
            
            .withFirstPersonCustomPositioningUnloading(Magazines.NATOMag1,
                new Transition((renderContext) -> {
                    
                  }, 250, 1000),
                  new Transition((renderContext) -> {
                      GL11.glTranslatef(-0.01F, 0F, 0F);
//                    GL11.glRotatef(0F, 0f, 1f, 0f);
//                    GL11.glScaled(0.55F, 0.55F, 0.55F);
//                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.3F, 1.7F, 0.1F);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
//                GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
              }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.AR15Action.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 500, 1000),
                new Transition((renderContext) -> {
                }, 500, 1000),
                new Transition((renderContext) -> {
                }, 500, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.AR15Action.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 0F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
//            .withFirstPersonCustomPositioningUnloading(CommonProxy.M4Rail.getRenderablePart(),
//                new Transition((renderContext) -> {
//                }, 500, 1000),
//                new Transition((renderContext) -> {
//                }, 500, 1000)
//                    )
//                    
//            .withFirstPersonCustomPositioningReloading(CommonProxy.M4Rail.getRenderablePart(),
//                new Transition((renderContext) -> {
//                }, 250, 1000),
//                new Transition((renderContext) -> {
//                }, 250, 1000),
//                new Transition((renderContext) -> {
//                }, 250, 1000),
//                new Transition((renderContext) -> {
//                }, 250, 1000),
//                new Transition((renderContext) -> {
//                }, 250, 1000)
//                    )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.NATO40rnd,
                    new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                            GL11.glTranslatef(-0.01F, 0F, 0F);
//                        GL11.glRotatef(0F, 0f, 1f, 0f);
//                        GL11.glScaled(0.55F, 0.55F, 0.55F);
//                        GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.3F, 1.7F, 0.1F);
                        GL11.glRotatef(-30F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.NATO20rnd,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(-0.01F, 0F, 0F);
//                    GL11.glRotatef(0F, 0f, 1f, 0f);
//                    GL11.glScaled(0.55F, 0.55F, 0.55F);
//                    GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.3F, 1.7F, 0.1F);
                        GL11.glRotatef(-30F, 0f, 0f, 1f);
//                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.NATOMag1,
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.3F, 1.7F, 0.1F);
                        GL11.glRotatef(-30F, 0f, 0f, 1f);
//                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0.01F, 0F, 0F);
//                  GL11.glRotatef(0F, 0f, 1f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0.01F, 0F, 0F);
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
                    
            .withFirstPersonCustomPositioningReloading(Magazines.NATO40rnd,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.3F, 1.7F, 0.1F);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0.01F, 0F, 0F);
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
                    
            .withFirstPersonCustomPositioningReloading(Magazines.NATO20rnd,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.3F, 1.7F, 0.1F);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0.01F, 0F, 0F);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.NATOMag2,
                    new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                            GL11.glTranslatef(-0.01F, 0F, 0F);
//                        GL11.glRotatef(0F, 0f, 1f, 0f);
//                        GL11.glScaled(0.55F, 0.55F, 0.55F);
//                        GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.3F, 1.7F, 0.1F);
                        GL11.glRotatef(-30F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.NATOMag2,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.3F, 1.7F, 0.1F);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0.01F, 0F, 0F);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.NATODrum100,
                    new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                            GL11.glTranslatef(-0.01F, 0F, 0F);
//                        GL11.glRotatef(0F, 0f, 1f, 0f);
//                        GL11.glScaled(0.55F, 0.55F, 0.55F);
//                        GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0.3F, 1.7F, 0.1F);
                        GL11.glRotatef(-30F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                        //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(Magazines.NATODrum100,
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0.3F, 1.7F, 0.1F);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(-0.01F, 0F, 0F);
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
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.350000f, 0.9f, -0.525000f);
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.001F, 0.095f, 0.75f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
//                    GL11.glTranslatef(-0.003F, -0.065f, 0.55f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.003F, 0.03f, 0.55f);
                } 
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Scope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.001F, 0.12f, 0.5f);
                } 

                // HP Zoomw
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.001F, 0.12f, 0.25f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.1f, 0.1f);
                } 

                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.09f, 0.1f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.09f, 0.1f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.09f, 0.1f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.09f, 0.1f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
                
            .withFirstPersonPositioningRunning((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.5f, 1.6f, -0.100000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.750000f, 0.675000f, 0.250000f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 5f);
                         GL11.glTranslatef(0.48f, 0.08f, -0.05f);
                         GL11.glRotatef(115f, 0, 0f, 1f);
                         GL11.glRotatef(-70f, 1f, 0f, 0f);
                         GL11.glRotatef(30f, 1f, 1f, 0f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 3f);
                         GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-100f, 1f, 0f, 0f);
                     })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(2.2f, 2.2f, 2.2f);
                         GL11.glTranslatef(1f, 0.4f, -0.4f);
                         GL11.glRotatef(99f, 0, 0f, 1f);
                         GL11.glRotatef(-60f, 20f, 20f, -20f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(2.5f, 2.5f, 3f);
                         GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-100f, 1f, 0f, 0f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.100000f, 0.600000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.550000f, 0.475000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.550000f, 0.475000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.150000f, -0.700000f, 0.150000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-135.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.225000f, -0.775000f, 0.200000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-100f, 1f, 0f, 0f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-100f, 1f, 0f, 0f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-100f, 1f, 0f, 0f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-100f, 1f, 0f, 0f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-100f, 1f, 0f, 0f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.100000f, 0.600000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.100000f, 0.600000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 5f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.100000f, 0.600000f);
                    }, 50, 200)
                    )
                    
            .withFirstPersonRightHandPositioningUnloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-100f, 1f, 0f, 0f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-100f, 1f, 0f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(2.5f, 2.5f, 3f);
                        GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
                        GL11.glRotatef(90f, 0, 0f, 1f);
                        GL11.glRotatef(-100f, 1f, 0f, 0f);
                    }, 250, 50))
                    
            .build())
        .withSpawnEntityDamage(7f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
    
}
