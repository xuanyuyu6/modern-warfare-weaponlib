package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36C;
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
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class G36CFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("G36C")
//		.withAmmo(CommonProxy.G36CMag)
//		.withAmmoCapacity(30)
		.withFireRate(0.7f)
		.withRecoil(3.2f)
		.withZoom(0.9f)
		.withMaxShots(Integer.MAX_VALUE, 3, 1)
		//.withMaxShots(5)
		.withShootSound("G36")
		.withSilencedShootSound("RifleSilencer")
		.withReloadSound("StandardReload")
		.withUnloadSound("Unload")
		.withReloadingTime(50)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(1f)
		.withFlashScale(() -> 0.8f)
		.withFlashOffsetX(() -> 0.13f)
		.withFlashOffsetY(() -> 0.1f)
		.withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MiniSteelPlate,
                CommonProxy.SteelIngot)
		.withInformationProvider(stack -> Arrays.asList("Type: Assault rifle/Carbine", "Damage: 7", 
		"Caliber: 5.56x45mm NATO", "Magazines:", "30rnd 5.56x45mm NATO Magazine (Type 3)",
		"Fire Rate: Auto"))
		.withCompatibleAttachment(CommonProxy.ElectricSkin, 
				(a, i) -> {
					i.setActiveTextureIndex(CommonProxy.ElectricSkin.getTextureVariantIndex("Electric"));
				}, 
				(a, i) -> {
				}
		)
		.withCompatibleAttachment(CommonProxy.Fade, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Fade.getTextureVariantIndex("Ruby"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(CommonProxy.Emerald, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Emerald.getTextureVariantIndex("Emerald"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(CommonProxy.Desert, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Desert.getTextureVariantIndex("Desert"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(CommonProxy.Sapphire, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Sapphire.getTextureVariantIndex("Sapphire"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(CommonProxy.Amethyst, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Amethyst.getTextureVariantIndex("Amethyst"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(CommonProxy.Gold, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Gold.getTextureVariantIndex("Gold"));
                }, 
                (a, i) -> {
                }
        )
        
		.withCompatibleAttachment(CommonProxy.NATOG36Mag, (model) -> {
		    GL11.glTranslatef(-0.37F, 0.8F, -1.7F);
		    GL11.glScaled(1.25F, 1.7F, 1.7F);
		})
		.withCompatibleAttachment(CommonProxy.NATODrum100, (model) -> {
            GL11.glTranslatef(-0.37F, 0.8F, -1.7F);
            GL11.glScaled(1.25F, 1.6F, 1.7F);
            GL11.glRotatef(-5f, 1f, 0f, 0f);
        })
		 .withCompatibleAttachment(CommonProxy.G36Rail, true, (model) -> {
            GL11.glTranslatef(-0.31F, -2F, -2.52F);
            GL11.glScaled(0.67F, 0.675F, 0.665F);
        })
         .withCompatibleAttachment(CommonProxy.G36Action, true, (model) -> {
        })
		.withCompatibleAttachment(CommonProxy.Extra, true, (model) -> {
			if(model instanceof AKMiron1) {
				GL11.glTranslatef(0.125F, -1.8F, -0.5F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AKMiron2) {
				GL11.glTranslatef(0.13F, -1.55F, -3.05F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AK47iron) {
				GL11.glTranslatef(0.092F, -1.91F, -0.9F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M4Iron1) {
				GL11.glTranslatef(0.155F, -1.74F, 1F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M4Iron2) {
				GL11.glTranslatef(0.26F, -1.55F, -2.35F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof P90iron) {
				GL11.glTranslatef(0.26F, -1.55F, -2.35F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof G36CIron1) {
				GL11.glTranslatef(-0.171F, -1.95F, -0.3F);
				GL11.glScaled(0.25F, 0.25F, 0.25F);
			} else if(model instanceof G36CIron2) {
				GL11.glTranslatef(-0.19F, -1.92F, -3.6F);
				GL11.glScaled(0.45F, 0.45F, 0.45F);
			} else if(model instanceof ScarIron1) {
				GL11.glTranslatef(0.165F, -1.65F, 1F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof ScarIron2) {
				GL11.glTranslatef(0.25F, -1.55F, -2F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof FALIron) {
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof M14Iron) {
				GL11.glTranslatef(0.14F, -1.74F, 1F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof MP5Iron) {
				GL11.glTranslatef(0.215F, -1.54F, 1.2F);
				GL11.glScaled(0F, 0F, 0F);
			}
		})
		.withCompatibleAttachment(CommonProxy.ACOG, (player, stack) -> {
		    GL11.glTranslatef(-0.31F, -2F, -1F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
		},(model) -> {
			 if(model instanceof Acog2) {
				GL11.glTranslatef(0.237F, -0.26F, 0.46F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Scope, (player, stack) -> {
		    GL11.glTranslatef(-0.325F, -2F, -1F);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
		},(model) -> {
			 if(model instanceof LPscope) {
				GL11.glTranslatef(0.237F, -0.272F, 0.67F);
				GL11.glScaled(0.05F, 0.05F, 0.05F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Reflex, (model) -> {
			if(model instanceof Reflex) {
			    GL11.glTranslatef(-0.07F, -1.82F, -1.5F);
                GL11.glScaled(0.45F, 0.45F, 0.45F);
			} else if(model instanceof Reflex2) {
			    GL11.glTranslatef(-0.125F, -2.15F, -1.7F);
                GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Kobra, (model) -> {
			if(model instanceof Kobra) {
			    GL11.glTranslatef(-0.05F, -1.87F, -1.5F);
                GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof Reflex2) {
			    GL11.glTranslatef(-0.125F, -2.165F, -1.7F);
                GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Holo2, (model) -> {
			if(model instanceof Holographic) {
			    GL11.glTranslatef(-0.05F, -1.87F, -1.5F);
	            GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof Holo2) {
			    GL11.glTranslatef(-0.125F, -2.165F, -1.7F);
                GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Holographic2, (model) -> {
			if(model instanceof Holographic2) {
			GL11.glTranslatef(-0.05F, -1.87F, -1.5F);
			GL11.glScaled(0.6F, 0.6F, 0.6F);
			} else if(model instanceof Holo2) {
				GL11.glTranslatef(-0.125F, -2.165F, -1.7F);
				GL11.glScaled(0.06F, 0.06F, 0.06F);
			}
		})
		.withCompatibleAttachment(CommonProxy.Grip2, (model) -> {
			GL11.glTranslatef(-0.2F, -0.35F, -4F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(CommonProxy.StubbyGrip, (model) -> {
		    GL11.glTranslatef(-0.2F, -0.35F, -4F);
            GL11.glScaled(1F, 1F, 1F);
		})
//		.withCompatibleAttachment(CommonProxy.Grip, (model) -> {
//			GL11.glTranslatef(.135F, -0.5F, -1.2F);
//			GL11.glScaled(0.6F, 0.6F, 0.6F);
//		})
		.withCompatibleAttachment(CommonProxy.VGrip, (model) -> {
		    GL11.glTranslatef(-0.2F, -0.4F, -4F);
            GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(CommonProxy.Laser2, (p, s) -> {
		    GL11.glTranslatef(0.1F, -1.3F, -4.3F);
            GL11.glScaled(0.85F, 0.85F, 0.85F);
		})
		.withCompatibleAttachment(CommonProxy.Laser, (p, s) -> {
			GL11.glTranslatef(0.1F, -1.3F, -4.3F);
			GL11.glScaled(0.85F, 0.85F, 0.85F);
		})
		.withCompatibleAttachment(CommonProxy.Silencer556x45, (model) -> {
			GL11.glTranslatef(-0.2F, -1.45F, -6.4F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withTextureNames("AK12")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new G36C())
			//.withTextureName("AK47")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.28F, 0.28F, 0.28F);
                GL11.glTranslatef(1, 2f, -1.2f);
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
				GL11.glScaled(1.5F, 1.5F, 1.5F);
				GL11.glTranslatef(-0.225000f, 0.725000f, 0.000000f);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(1.5F, 1.5F, 1.5F);
                GL11.glTranslatef(-0.225000f, 0.725000f, 0.4f);
				GL11.glRotatef(-3F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
			    GL11.glTranslatef(0.14F, -0.2F, -0.2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);

                // Zoom
                GL11.glTranslatef(0.135F, -1.08f, 1.7f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glRotatef(-1F, 1f, 0f, 0f);
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.005F, 0.265f, 0.685f);
                } 
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Scope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.28f, 0.5f);
                } 
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.HP)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.148f, 5f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.225f, 0.2f);
                } 
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.24f, 0.1f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.24f, 0.1f);
                } 
                
                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holographic2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(1.373F, -1.105f, 2.5f);
                } 
                
                // Everything else
                else {
                    GL11.glTranslatef(1.373F, -1.34f, 2.4f);
                }
                
            
                })
             .withFirstPersonCustomPositioning(CommonProxy.G36Action.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0F);
                }
            })
            
            .withFirstPersonPositioningCustomRecoiled(CommonProxy.G36Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1.5f);
                })
            
            .withFirstPersonPositioningCustomZoomingRecoiled(CommonProxy.G36Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1.5f);
                })
				
			.withFirstPersonCustomPositioning(CommonProxy.G36Rail.getRenderablePart(), (renderContext) -> {
                })
            .withFirstPersonPositioningCustomRecoiled(CommonProxy.G36Rail.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(CommonProxy.G36Rail.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(CommonProxy.NATOG36Mag.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(CommonProxy.NATOG36Mag.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomRecoiled(CommonProxy.NATODrum100.getRenderablePart(), (renderContext) -> {
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(CommonProxy.NATODrum100.getRenderablePart(), (renderContext) -> {
                })
				
			.withFirstPersonCustomPositioning(CommonProxy.NATOG36Mag, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonCustomPositioning(CommonProxy.NATODrum100, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningReloading(
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScaled(1.5F, 1.5F, 1.5F);
					    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(-0.875000f, 0.350000f, -0.100000f);
					}, 250, 500),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScaled(1.5F, 1.5F, 1.5F);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.875000f, 0.350000f, -0.100000f);
					}, 250, 20),
				
				new Transition((renderContext) -> { // Reload position
				    GL11.glScalef(1.5f, 1.5f, 1.5f);
                    GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.300000f, 0.850000f, 0.300000f);
				}, 500, 100),
				new Transition((renderContext) -> { // Reload position
				    GL11.glScalef(1.5f, 1.5f, 1.5f);
                    GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.300000f, 0.850000f, 0.300000f);
				}, 70, 0)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((renderContext) -> { // Reload position
				    GL11.glScaled(1.5F, 1.5F, 1.5F);
                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.875000f, 0.350000f, -0.100000f);
				}, 150, 50),
				new Transition((renderContext) -> { // Reload position
				    GL11.glScaled(1.5F, 1.5F, 1.5F);
                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.875000f, 0.350000f, -0.100000f);
				}, 150, 50)
			)
			
			.withFirstPersonCustomPositioningUnloading(CommonProxy.G36Action.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 500, 1000),
                new Transition((renderContext) -> {
                }, 500, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(CommonProxy.G36Action.getRenderablePart(),
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
			
			.withFirstPersonCustomPositioningUnloading(CommonProxy.NATOG36Mag,
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//					GL11.glRotatef(-20F, 1f, 0f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
				    GL11.glTranslatef(0F, 1.5F, 0F);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(CommonProxy.NATOG36Mag,
				new Transition((renderContext) -> {
					GL11.glTranslatef(0F, 1.5F, 0F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0.5F, 0F, -0.2F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
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
					
			.withFirstPersonCustomPositioningUnloading(CommonProxy.G36Rail.getRenderablePart(),
                new Transition((renderContext) -> {
//                    GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//                    GL11.glRotatef(-20F, 1f, 0f, 0f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000),
                new Transition((renderContext) -> {
//                    GL11.glTranslatef(1.3F, 0.5F, -0.8F);
//                    GL11.glRotatef(10F, 1f, 0f, 0f);
//                    GL11.glRotatef(10F, 0f, 1f, 0f);
//                    GL11.glRotatef(-90F, 0f, 0f, 1f);
//                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningReloading(CommonProxy.G36Rail.getRenderablePart(),
                new Transition((renderContext) -> {
//                    GL11.glTranslatef(0.05F, 1F, 0F);
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
                }, 250, 1000)
                    )
					
			.withFirstPersonCustomPositioningUnloading(CommonProxy.NATODrum100,
			        new Transition((renderContext) -> {
//	                  GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//	                  GL11.glRotatef(-20F, 1f, 0f, 0f);
//	                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//	                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
	                }, 250, 1000),
	                new Transition((renderContext) -> {
	                    GL11.glTranslatef(0.05F, 1.5F, 0F);
//	                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//	                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
	                }, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(CommonProxy.NATODrum100,
			        new Transition((renderContext) -> {
	                    GL11.glTranslatef(0.05F, 1.5F, 0F);
//	                  GL11.glRotatef(0F, 0f, 1f, 0f);
//	                  GL11.glScaled(0.55F, 0.55F, 0.55F);
	                    //GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
	                }, 250, 1000),
	                new Transition((renderContext) -> {
//	                  GL11.glTranslatef(0.5F, 0F, -0.2F);
//	                  GL11.glRotatef(0F, 0f, 1f, 0f);
//	                  GL11.glScaled(0.55F, 0.55F, 0.55F);
//	                  GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
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
				GL11.glTranslatef(0.14F, -0.2F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// Zoom
				GL11.glTranslatef(0.135F, -1.08f, 1.6f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(-0.005F, 0.265f, 0.8f);
				} 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Scope)) {
					//System.out.println("Position me for Scope");
					GL11.glTranslatef(0F, 0.28f, 0.65f);
				} 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.HP)) {
					//System.out.println("Position me for Scope");
					GL11.glTranslatef(0F, 0.148f, 5f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.225f, 0.2f);
				} 
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Kobra)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.24f, 0.1f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.24f, 0.1f);
				} 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holographic2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.373F, -1.105f, 2.5f);
				} 
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
			.withFirstPersonPositioningRunning((renderContext) -> {
				GL11.glScaled(1.5F, 1.5F, 1.5F);
				GL11.glRotatef(10.000000f, 1f, 0f, 0f);
				GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
				GL11.glRotatef(25.000000f, 0f, 0f, 1f);
				GL11.glTranslatef(-0.450000f, 1.174999f, -0.125000f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
			     GL11.glScaled(1.5F, 1.5F, 1.5F);
			     GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
			     GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
			     GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
			     GL11.glTranslatef(-1.249999f, 0.800000f, 0.700000f);
			 })
			 
			 .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3.5f, 3.5f, 5.5f);
                         GL11.glTranslatef(0.5f, 0.01f, -0.05f);
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
					     GL11.glScalef(3.5f, 3.5f, 3.5f);
					     GL11.glRotatef(110.000000f, 1f, 0f, 0f);
					     GL11.glRotatef(205.000000f, 0f, 1f, 0f);
					     GL11.glRotatef(-95.000000f, 0f, 0f, 1f);
					     GL11.glTranslatef(0.350000f, -0.775000f, -0.025000f);

					 }, 
					 (renderContext) -> {
					     GL11.glScalef(2.5f, 2.5f, 3f);
                         GL11.glTranslatef(-0.15f, 0.3f, 0.5f);
                         GL11.glRotatef(90f, 0, 0f, 1f);
                         GL11.glRotatef(-100f, 1f, 0f, 0f);
					 })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(3f, 3f, 3f);
						GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
						GL11.glRotatef(80.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(0.625000f, -0.575000f, -0.175000f);

					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 3f);
						GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
						GL11.glRotatef(80.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(0.350000f, -0.800000f, -0.075000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 3f);
					    GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(45.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(0.350000f, -0.175000f, 0.000000f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 3f);
					    GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
					    GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
					    GL11.glRotatef(60.000000f, 0f, 0f, 1f);
					    GL11.glTranslatef(0.150000f, -0.450000f, -0.075000f);
					}, 250, 0))
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 50),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 0))
					
			.withFirstPersonLeftHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.350000f, -0.800000f, -0.075000f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.625000f, -0.575000f, -0.175000f);
					}, 50, 200)
					)
					
			.withFirstPersonRightHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 50))
					
			.build())
		.withSpawnEntityDamage(7f)
		.withSpawnEntityGravityVelocity(0.0118f)
		
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}