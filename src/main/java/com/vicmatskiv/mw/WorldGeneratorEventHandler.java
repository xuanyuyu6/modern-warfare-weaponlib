package com.vicmatskiv.mw;

import java.util.Random;

import com.vicmatskiv.mw.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorEventHandler implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		switch(world.provider.dimensionId) {
		case -1: 
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 0: 
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1: 
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
			break;
		}
	}

	private void generateEnd(World world, Random random, int x, int z) {
		// TODO Auto-generated method stub
		
	}

	private void generateSurface(World world, Random random, int x, int z) {
		
		addOreSpawn(CommonProxy.TitaniumOre, 0, Blocks.stone, world, random, 
				x, z, 16, 16, 8 + random.nextInt(6), 20, 5, 90);
		
		addOreSpawn(CommonProxy.CopperOre, 0, Blocks.stone, world, random, 
				x, z, 16, 16, 8 + random.nextInt(6), 20, 5, 90);
		
		addOreSpawn(CommonProxy.SulfurOre, 0, Blocks.stone, world, random, 
				x, z, 16, 16, 8 + random.nextInt(6), 20, 5, 90);
		
		addOreSpawn(CommonProxy.ZincOre, 0, Blocks.stone, world, random, 
				x, z, 16, 16, 8 + random.nextInt(6), 20, 5, 90);
		
		addOreSpawn(CommonProxy.LeadOre, 0, Blocks.stone, world, random, 
				x, z, 16, 16, 8 + random.nextInt(6), 20, 5, 90);
		
		addOreSpawn(CommonProxy.TinOre, 0, Blocks.stone, world, random, 
				x, z, 16, 16, 8 + random.nextInt(6), 20, 5, 90);
	}

	private void generateNether(World world, Random random, int x, int z) {
		
	}
	
	public void addOreSpawn(Block block, int metadata, Block target, World world, 
			Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, 
			int chancesToSpawn, int minY, int maxY) {
		
		int diffBetweenMinMaxY = maxY - minY;
		for(int x = 0; x < chancesToSpawn; x++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBetweenMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			new WorldGenMinable(block, metadata, maxVeinSize, target)
				.generate(world, random, posX, posY, posZ);
		}
		
		
	}

}