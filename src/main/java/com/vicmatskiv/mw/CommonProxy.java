package com.vicmatskiv.mw;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

import com.vicmatskiv.mw.attachments.ItemACOG;
import com.vicmatskiv.mw.attachments.ItemAKMIron;
import com.vicmatskiv.mw.attachments.ItemAR15Iron;
import com.vicmatskiv.mw.attachments.ItemBipod;
import com.vicmatskiv.mw.attachments.ItemGrip;
import com.vicmatskiv.mw.attachments.ItemGrip2;
import com.vicmatskiv.mw.attachments.ItemHP;
import com.vicmatskiv.mw.attachments.ItemHolo2;
import com.vicmatskiv.mw.attachments.ItemKobra;
import com.vicmatskiv.mw.attachments.ItemLaser;
import com.vicmatskiv.mw.attachments.ItemLaser2;
import com.vicmatskiv.mw.attachments.ItemReflex;
import com.vicmatskiv.mw.attachments.ItemScope;
import com.vicmatskiv.mw.attachments.ItemSilencer;
import com.vicmatskiv.mw.attachments.ItemVGrip;
import com.vicmatskiv.mw.blocks.BlockCopperOre;
import com.vicmatskiv.mw.blocks.BlockLeadOre;
import com.vicmatskiv.mw.blocks.BlockSulfurOre;
import com.vicmatskiv.mw.blocks.BlockTinOre;
import com.vicmatskiv.mw.blocks.BlockTitaniumOre;
import com.vicmatskiv.mw.blocks.BlockZincOre;
import com.vicmatskiv.mw.items.ItemAK47Mag;
import com.vicmatskiv.mw.items.ItemAK74UMag;
import com.vicmatskiv.mw.items.ItemAR15Mag;
import com.vicmatskiv.mw.items.ItemDragonuvMag;
import com.vicmatskiv.mw.items.ItemDrumMag;
import com.vicmatskiv.mw.items.ItemFNFALMag;
import com.vicmatskiv.mw.items.ItemFamasMag;
import com.vicmatskiv.mw.items.ItemG18Mag;
import com.vicmatskiv.mw.items.ItemG21Mag;
import com.vicmatskiv.mw.items.ItemG36CMag;
import com.vicmatskiv.mw.items.ItemG36Mag;
import com.vicmatskiv.mw.items.ItemGaussMag;
import com.vicmatskiv.mw.items.ItemGrenades;
import com.vicmatskiv.mw.items.ItemM107Mag;
import com.vicmatskiv.mw.items.ItemM14Mag;
import com.vicmatskiv.mw.items.ItemM249Mag;
import com.vicmatskiv.mw.items.ItemM9Mag;
import com.vicmatskiv.mw.items.ItemMP5Mag;
import com.vicmatskiv.mw.items.ItemMP7Mag;
import com.vicmatskiv.mw.items.ItemMagnumAmmo;
import com.vicmatskiv.mw.items.ItemPX90Mag;
import com.vicmatskiv.mw.items.ItemRPK74MMag;
import com.vicmatskiv.mw.items.ItemRemington870Mag;
import com.vicmatskiv.mw.items.ItemScarHMag;
import com.vicmatskiv.mw.items.ItemScarMag;
import com.vicmatskiv.mw.items.ItemXWPMag;
import com.vicmatskiv.mw.items.guns.ACRFactory;
import com.vicmatskiv.mw.items.guns.AK12Factory;
import com.vicmatskiv.mw.items.guns.AK47Factory;
import com.vicmatskiv.mw.items.guns.AK74MFactory;
import com.vicmatskiv.mw.items.guns.AK74UFactory;
import com.vicmatskiv.mw.items.guns.AKMFactory;
import com.vicmatskiv.mw.items.guns.AR15Factory;
import com.vicmatskiv.mw.items.guns.AS50Factory;
import com.vicmatskiv.mw.items.guns.AUGFactory;
import com.vicmatskiv.mw.items.guns.DragonuvFactory;
import com.vicmatskiv.mw.items.guns.FNFALFactory;
import com.vicmatskiv.mw.items.guns.FamasFactory;
import com.vicmatskiv.mw.items.guns.FamasG2Factory;
import com.vicmatskiv.mw.items.guns.G18Factory;
import com.vicmatskiv.mw.items.guns.G21Factory;
import com.vicmatskiv.mw.items.guns.G36CFactory;
import com.vicmatskiv.mw.items.guns.G36Factory;
import com.vicmatskiv.mw.items.guns.GaussRifleFactory;
import com.vicmatskiv.mw.items.guns.GrenadeLauncherFactory;
import com.vicmatskiv.mw.items.guns.HK416CFactory;
import com.vicmatskiv.mw.items.guns.KSG12Factory;
import com.vicmatskiv.mw.items.guns.M107Factory;
import com.vicmatskiv.mw.items.guns.M14Factory;
import com.vicmatskiv.mw.items.guns.M16A3Factory;
import com.vicmatskiv.mw.items.guns.M16A4Factory;
import com.vicmatskiv.mw.items.guns.M240Factory;
import com.vicmatskiv.mw.items.guns.M249Factory;
import com.vicmatskiv.mw.items.guns.M4A4Factory;
import com.vicmatskiv.mw.items.guns.M9Factory;
import com.vicmatskiv.mw.items.guns.MG36Factory;
import com.vicmatskiv.mw.items.guns.MP5Factory;
import com.vicmatskiv.mw.items.guns.MP5KFactory;
import com.vicmatskiv.mw.items.guns.MP7Factory;
import com.vicmatskiv.mw.items.guns.MagnumFactory;
import com.vicmatskiv.mw.items.guns.P2000Factory;
import com.vicmatskiv.mw.items.guns.PX90Factory;
import com.vicmatskiv.mw.items.guns.RPK74MFactory;
import com.vicmatskiv.mw.items.guns.Remington900Factory;
import com.vicmatskiv.mw.items.guns.ScarFactory;
import com.vicmatskiv.mw.items.guns.ScarHFactory;
import com.vicmatskiv.mw.items.guns.XEagleFactory;
import com.vicmatskiv.mw.items.guns.XWPFactory;
import com.vicmatskiv.mw.resources.ItemBullets;
import com.vicmatskiv.mw.resources.ItemCGrip;
import com.vicmatskiv.mw.resources.ItemCloth;
import com.vicmatskiv.mw.resources.ItemCopperIngot;
import com.vicmatskiv.mw.resources.ItemElectronics;
import com.vicmatskiv.mw.resources.ItemGreenCloth;
import com.vicmatskiv.mw.resources.ItemGunmetalIngot;
import com.vicmatskiv.mw.resources.ItemGunmetalPlate;
import com.vicmatskiv.mw.resources.ItemLeadIngot;
import com.vicmatskiv.mw.resources.ItemOpticGlass;
import com.vicmatskiv.mw.resources.ItemSulfurDust;
import com.vicmatskiv.mw.resources.ItemTanCloth;
import com.vicmatskiv.mw.resources.ItemTinIngot;
import com.vicmatskiv.mw.resources.ItemTitaniumIngot;
import com.vicmatskiv.mw.resources.ItemZincIngot;
import com.vicmatskiv.weaponlib.CustomArmor;
import com.vicmatskiv.weaponlib.CustomArmor.Builder;
import com.vicmatskiv.weaponlib.ItemAmmo;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.Weapon;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

	public static Item Marinechest;
	public static Item Marineboots;
	public static Item Marinehelmet;

	public static Item Spetznazchest;
	public static Item Spetznazboots;
	public static Item Spetznazhelmet;

	public static Item Swatchest;
	public static Item Swatboots;
	public static Item Swathelmet;
	
	public static Item GasSwatchest;
	public static Item GasSwatboots;
	public static Item GasSwathelmet;

	public static Item Tacticalchest;
	public static Item Tacticalboots;
	public static Item Tacticalhelmet;

	public static ItemAttachment<Weapon> Reflex;
	public static ItemAttachment<Weapon> Holo2;
	public static ItemAttachment<Weapon> Kobra;
	public static ItemAttachment<Weapon> ACOG;
	public static ItemAttachment<Weapon> Scope;
	public static ItemAttachment<Weapon> HP;
	public static ItemAttachment<Weapon> Silencer;
	public static ItemAttachment<Weapon> Laser;
	public static ItemAttachment<Weapon> Laser2;
	public static ItemAttachment<Weapon> Grip2;
	public static ItemAttachment<Weapon> Grip;
	public static ItemAttachment<Weapon> VGrip;
	public static ItemAttachment<Weapon> Bipod;

	public static ItemAttachment<Weapon> AKMIron;
	public static ItemAttachment<Weapon> AR15Iron;

	public static Item AK47;
	public static Item AKM;
	public static Item AK12;
	public static Item AK74U;
	public static Item AK74M;
	public static Item AR15;
	public static Item M4A4;
	public static Item M16A3;
	public static Item M16A4;
	public static Item FNFAL;
	public static Item Scar;
	public static Item ScarH;
	public static Item G18;
	public static Item G21;
	public static Item M9;
	public static Item XEagle;
	public static Item P2000;
	public static Item Magnum;
	public static Item PX90;
	public static Item G36;
	public static Item G36C;
	public static Item AUG;
	public static Item Famas;
	public static Item FamasG2;
	public static Item MP5;
	public static Item MP5K;
	public static Item MP7;
	public static Item AS50;
	public static Item M14;
	public static Item XWP;
	public static Item Dragonuv;
	public static Item M107;
	public static Item GrenadeLauncher;
	public static Item Remington870;
	public static Item KSG12;
	public static Item M240;
	public static Item M249;
	public static Item RPK74M;
	public static Item MG36;
	public static Item ACR;
	public static Item HK416C;
	//public static Item GaussRifle;
//	public static Item RPG;

	public static ItemAmmo AK47Mag;
	public static ItemAmmo G18Mag;
	public static ItemAmmo M9Mag;
	public static ItemAmmo AR15Mag;
	public static ItemAmmo XWPMag;
	public static ItemAmmo DragonuvMag;
	public static ItemAmmo Remington870Mag;
	public static ItemAmmo PX90Mag;
	public static ItemAmmo G36CMag;
	public static ItemAmmo ScarMag;
	public static ItemAmmo MP5Mag;
	public static ItemAmmo AK74UMag;
	public static ItemAmmo MP7Mag;
	public static ItemAmmo MagnumAmmo;
	public static ItemAmmo FNFALMag;
	public static ItemAmmo M14Mag;
	public static ItemAmmo Grenades;
	public static ItemAmmo M249Mag;
	public static ItemAmmo FamasMag;
	public static ItemAmmo G21Mag;
	public static ItemAmmo M107Mag;
	public static ItemAmmo G36Mag;
	public static ItemAmmo RPK74MMag;
	public static ItemAmmo DrumMag;
	public static ItemAmmo ScarHMag;
	//public static ItemAmmo GaussMag;
	//public static ItemAmmo RPGAmmo;

	public static Item Bullets;
	public static Item Electronics;
	public static Item CGrip;
	public static Item OpticGlass;
	public static Item Cloth;
	public static Item TanCloth;
	public static Item GreenCloth;

	public static Block TitaniumOre;
	public static Item TitaniumIngot;

	public static Block LeadOre;
	public static Item LeadIngot;

	public static Block CopperOre;
	public static Item CopperIngot;

	public static Block ZincOre;
	public static Item ZincIngot;

	public static Block TinOre;
	public static Item TinIngot;

	public static Block SulfurOre;
	public static Item SulfurDust;

	public static Item GunmetalIngot;
	public static Item GunmetalPlate;

	static ArmorMaterial Marine = EnumHelper.addArmorMaterial("Marine", 40,
			new int[] { 3, 5, 4, 3 }, 15);
	static ArmorMaterial Tactical = EnumHelper.addArmorMaterial("Tactical", 40,
			new int[] { 2, 4, 3, 2 }, 15);

	// private ClientEventHandler clientEventHandler = new ClientEventHandler();

	public ModelBiped getArmorModel(int id) {
		return null;
	}

	protected boolean isClient() {
		return false;
	}

	public void preInit(Object mod, FMLPreInitializationEvent event) {

		ModernWarfareMod.MOD_CONTEXT.init(mod, ModernWarfareMod.CHANNEL);

		Bullets = new ItemBullets();
		Electronics = new ItemElectronics();
		CGrip = new ItemCGrip();
		OpticGlass = new ItemOpticGlass();
		Cloth = new ItemCloth();
		TanCloth = new ItemTanCloth();
		GreenCloth = new ItemGreenCloth();

		TitaniumOre = new BlockTitaniumOre();
		TitaniumIngot = new ItemTitaniumIngot();
		OreDictionary.registerOre("ingotTitanium", TitaniumIngot);

		LeadOre = new BlockLeadOre();
		LeadIngot = new ItemLeadIngot();
		OreDictionary.registerOre("ingotLead", LeadIngot);

		CopperOre = new BlockCopperOre();
		CopperIngot = new ItemCopperIngot();
		OreDictionary.registerOre("ingotCopper", CopperIngot);

		ZincOre = new BlockZincOre();
		ZincIngot = new ItemZincIngot();
		OreDictionary.registerOre("ingotZinc", ZincIngot);

		TinOre = new BlockTinOre();
		TinIngot = new ItemTinIngot();
		OreDictionary.registerOre("ingotTin", TinIngot);

		SulfurOre = new BlockSulfurOre();
		SulfurDust = new ItemSulfurDust();
		OreDictionary.registerOre("ingotSulfurDust", SulfurDust);

		GunmetalIngot = new ItemGunmetalIngot();
		
		GunmetalPlate = new ItemGunmetalPlate();

		AK47Mag = new ItemAK47Mag();
		G18Mag = new ItemG18Mag();
		M9Mag = new ItemM9Mag();
		AR15Mag = new ItemAR15Mag();
		XWPMag = new ItemXWPMag();
		DragonuvMag = new ItemDragonuvMag();
		Remington870Mag = new ItemRemington870Mag();
		PX90Mag = new ItemPX90Mag();
		G36CMag = new ItemG36CMag();
		ScarMag = new ItemScarMag();
		MP5Mag = new ItemMP5Mag();
		AK74UMag = new ItemAK74UMag();
		MP7Mag = new ItemMP7Mag();
		MagnumAmmo = new ItemMagnumAmmo();
		FNFALMag = new ItemFNFALMag();
		M14Mag = new ItemM14Mag();
		Grenades = new ItemGrenades();
		M249Mag = new ItemM249Mag();
		FamasMag = new ItemFamasMag();
		G21Mag = new ItemG21Mag();
		M107Mag = new ItemM107Mag();
		G36Mag = new ItemG36Mag();
		RPK74MMag = new ItemRPK74MMag();
		DrumMag = new ItemDrumMag();
		ScarHMag = new ItemScarHMag();
		//GaussMag = new ItemGaussMag();
	//	RPGAmmo = new ItemRPGAmmo();

		Reflex = new ItemReflex();
		Holo2 = new ItemHolo2();
		Kobra = new ItemKobra();
		ACOG = new ItemACOG();
		Scope = new ItemScope();
		HP = new ItemHP();
		Silencer = new ItemSilencer();
		Laser = new ItemLaser();
		Laser2 = new ItemLaser2();
		Grip2 = new ItemGrip2();
		Grip = new ItemGrip();
		VGrip = new ItemVGrip();
		Bipod = new ItemBipod();

		AKMIron = new ItemAKMIron();
		AR15Iron = new ItemAR15Iron();

		AK47 = new AK47Factory().createGun(this);
		AKM = new AKMFactory().createGun(this);
		AK12 = new AK12Factory().createGun(this);
		AK74U = new AK74UFactory().createGun(this);
		AK74M = new AK74MFactory().createGun(this);
		AR15 = new AR15Factory().createGun(this);
		M4A4 = new M4A4Factory().createGun(this);
		M16A3 = new M16A3Factory().createGun(this);
		M16A4 = new M16A4Factory().createGun(this);
		HK416C = new HK416CFactory().createGun(this);
		ACR = new ACRFactory().createGun(this);
		Scar = new ScarFactory().createGun(this);
		ScarH = new ScarHFactory().createGun(this);
		FNFAL = new FNFALFactory().createGun(this);
		G18 = new G18Factory().createGun(this);
		G21 = new G21Factory().createGun(this);
		M9 = new M9Factory().createGun(this);
		XEagle = new XEagleFactory().createGun(this);
		P2000 = new P2000Factory().createGun(this);
		Magnum = new MagnumFactory().createGun(this);
		Remington870 = new Remington900Factory().createGun(this);
		KSG12 = new KSG12Factory().createGun(this);
		G36 = new G36Factory().createGun(this);
		G36C = new G36CFactory().createGun(this);
		AUG = new AUGFactory().createGun(this);
		Famas = new FamasFactory().createGun(this);
		FamasG2 = new FamasG2Factory().createGun(this);
		MP5 = new MP5Factory().createGun(this);
		MP5K = new MP5KFactory().createGun(this);
		MP7 = new MP7Factory().createGun(this);
		PX90 = new PX90Factory().createGun(this);
		AS50 = new AS50Factory().createGun(this);
		XWP = new XWPFactory().createGun(this);
		Dragonuv = new DragonuvFactory().createGun(this);
		M14 = new M14Factory().createGun(this);
		M107 = new M107Factory().createGun(this);
		M240 = new M240Factory().createGun(this);
		M249 = new M249Factory().createGun(this);
		MG36 = new MG36Factory().createGun(this);
		RPK74M = new RPK74MFactory().createGun(this);
		GrenadeLauncher = new GrenadeLauncherFactory().createGun(this);
		//GaussRifle = new GaussRifleFactory().createGun(this);
	//	RPG = new RPGFactory().createGun(this);

		GameRegistry.registerItem(AK47Mag, "AK47Mag");
		GameRegistry.registerItem(G18Mag, "G18Mag");
		GameRegistry.registerItem(M9Mag, "M9Mag");
		GameRegistry.registerItem(AR15Mag, "AR15Mag");
		GameRegistry.registerItem(XWPMag, "XWPMag");
		GameRegistry.registerItem(DragonuvMag, "DragonuvMag");
		GameRegistry.registerItem(Remington870Mag, "Remington870Mag");
		GameRegistry.registerItem(PX90Mag, "PX90Mag");
		GameRegistry.registerItem(G36CMag, "G36CMag");
		GameRegistry.registerItem(ScarMag, "ScarMag");
		GameRegistry.registerItem(MP5Mag, "MP5Mag");
		GameRegistry.registerItem(AK74UMag, "AK74UMag");
		GameRegistry.registerItem(MP7Mag, "MP7Mag");
		GameRegistry.registerItem(MagnumAmmo, "MagnumAmmo");
		GameRegistry.registerItem(FNFALMag, "FNFALMag");
		GameRegistry.registerItem(M14Mag, "M14Mag");
		GameRegistry.registerItem(Grenades, "Grenades");
		GameRegistry.registerItem(M249Mag, "M249Mag");
		GameRegistry.registerItem(FamasMag, "FamasMag");
		GameRegistry.registerItem(G21Mag, "G21Mag");
		GameRegistry.registerItem(M107Mag, "M107Mag");
		GameRegistry.registerItem(G36Mag, "G36Mag");
		GameRegistry.registerItem(RPK74MMag, "RPK74MMag");
		GameRegistry.registerItem(DrumMag, "DrumMag");
		GameRegistry.registerItem(ScarHMag, "ScarHMag");
	//	GameRegistry.registerItem(GaussMag, "GaussMag");
	//	GameRegistry.registerItem(RPGAmmo, "RPGAmmo");

		GameRegistry.registerItem(ACOG, "ACOG");
		GameRegistry.registerItem(Reflex, "Reflex");
		GameRegistry.registerItem(Scope, "Scope");
		GameRegistry.registerItem(Silencer, "Silencer");
		GameRegistry.registerItem(Laser, "Laser");
		GameRegistry.registerItem(HP, "HP");
		GameRegistry.registerItem(Holo2, "Holo2");
		GameRegistry.registerItem(Grip2, "Grip2");
		GameRegistry.registerItem(Bipod, "Bipod");
		GameRegistry.registerItem(Laser2, "Laser2");
		GameRegistry.registerItem(Grip, "Grip");
		GameRegistry.registerItem(VGrip, "VGrip");
		GameRegistry.registerItem(Kobra, "Kobra");

		GameRegistry.registerItem(AKMIron, "AKMIron");
		GameRegistry.registerItem(AR15Iron, "AR15Iron");

		GameRegistry.registerItem(Bullets, "Bullets");
		GameRegistry.registerItem(Electronics, "Electronics");
		GameRegistry.registerItem(CGrip, "CGrip");
		GameRegistry.registerItem(OpticGlass, "OpticGlass");
		GameRegistry.registerItem(Cloth, "Cloth");
		GameRegistry.registerItem(TanCloth, "TanCloth");
		GameRegistry.registerItem(GreenCloth, "GreenCloth");

		GameRegistry.registerBlock(TitaniumOre, "TitaniumOre");
		GameRegistry.registerItem(TitaniumIngot, "TitaniumIngot");

		GameRegistry.registerBlock(LeadOre, "LeadOre");
		GameRegistry.registerItem(LeadIngot, "LeadIngot");

		GameRegistry.registerBlock(CopperOre, "CopperOre");
		GameRegistry.registerItem(CopperIngot, "CopperIngot");

		GameRegistry.registerBlock(ZincOre, "ZincOre");
		GameRegistry.registerItem(ZincIngot, "ZincIngot");

		GameRegistry.registerBlock(TinOre, "TinOre");
		GameRegistry.registerItem(TinIngot, "TinIngot");

		GameRegistry.registerBlock(SulfurOre, "SulfurOre");
		GameRegistry.registerItem(SulfurDust, "SulfurDust");

		GameRegistry.registerItem(GunmetalIngot, "GunmetalIngot");
		GameRegistry.registerItem(GunmetalPlate, "GunmetalPlate");


		GameRegistry.registerWorldGenerator(new WorldGeneratorEventHandler(), 0);

		Builder marineArmorBuilder = new CustomArmor.Builder()
				.withModId(ModernWarfareMod.MODID).withMaterial(Marine)
				.withUnlocalizedName("Marine").withTextureName("Marine")
				.withModelClass("com.vicmatskiv.mw.models.Marine")
				.withHudTextureName("Marine");

		Marinehelmet = marineArmorBuilder.buildHelmet(isClient());
		Marinechest = marineArmorBuilder.buildChest(isClient());
		Marineboots = marineArmorBuilder.buildBoots(isClient());

		Builder spetznazArmorBuilder = new CustomArmor.Builder()
				.withModId(ModernWarfareMod.MODID).withMaterial(Marine)
				.withUnlocalizedName("Spetznaz").withTextureName("Spetznaz")
				.withModelClass("com.vicmatskiv.mw.models.Marine")
				.withHudTextureName("Marine");

		Spetznazhelmet = spetznazArmorBuilder.buildHelmet(isClient());
		Spetznazchest = spetznazArmorBuilder.buildChest(isClient());
		Spetznazboots = spetznazArmorBuilder.buildBoots(isClient());

		Builder swatArmorBuilder = new CustomArmor.Builder()
				.withModId(ModernWarfareMod.MODID).withMaterial(Marine)
				.withUnlocalizedName("Swat").withTextureName("Swat")
				.withModelClass("com.vicmatskiv.mw.models.Swat")
				.withHudTextureName("Marine");

		Swathelmet = swatArmorBuilder.buildHelmet(isClient());
		Swatchest = swatArmorBuilder.buildChest(isClient());
		Swatboots = swatArmorBuilder.buildBoots(isClient());
		
		Builder gasswatArmorBuilder = new CustomArmor.Builder()
		.withModId(ModernWarfareMod.MODID).withMaterial(Marine)
		.withUnlocalizedName("GasSwat").withTextureName("GasSwat")
		.withModelClass("com.vicmatskiv.mw.models.GasSwat")
		.withHudTextureName("Marine");

		GasSwathelmet = gasswatArmorBuilder.buildHelmet(isClient());
		GasSwatchest = gasswatArmorBuilder.buildChest(isClient());
		GasSwatboots = gasswatArmorBuilder.buildBoots(isClient());

		new CustomArmor.Builder().withModId(ModernWarfareMod.MODID)
				.withMaterial(Tactical).withUnlocalizedName("Tactical")
				.withTextureName("Tactical")
				.withModelClass("com.vicmatskiv.mw.models.Tactical")
				.withHudTextureName("Tactical").build(isClient());

	}

}