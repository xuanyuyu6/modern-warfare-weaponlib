package com.vicmatskiv.mw.misc;

import java.util.Random;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockTinOre extends Block {
    
    public BlockTinOre() {
        super(Material.ROCK);
//        setBlockName(ModernWarfareMod.MODID + "_" + "TinOre");
        setUnlocalizedName(ModernWarfareMod.MODID + ":" + "tinore");
        setHardness(6F);
        setResistance(15F);
        setSoundType(SoundType.STONE); 
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
    
    public Block getBlockDropped(int meta, Random rand, int fortune) {
        return Ores.TinOre;
    }

}