package com.vicmatskiv.weaponlib;

import com.vicmatskiv.weaponlib.compatibility.CompatibleRayTraceResult;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

@FunctionalInterface
public interface ImpactHandler {

	public void onImpact(World world, EntityPlayer player, WeaponSpawnEntity entity, CompatibleRayTraceResult position);
}
