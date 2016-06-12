package com.vicmatskiv.mw.items;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.weaponlib.ItemAmmo;

public class ItemG18Mag extends ItemAmmo
{
	public ItemG18Mag()
	{
		setMaxStackSize(8);
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "G18Mag"); 
		setTextureName(ModernWarfareMod.MODID + ":" + "G18Mag");
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
//	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) 
//	{ 
//		par3List.add("Compatible Guns:"); 
//		par3List.add("Glock-18"); 
//	}
}