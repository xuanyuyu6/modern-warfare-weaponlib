package com.vicmatskiv.weaponlib.vehicle;

import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.compatibility.CompatibleSound;

public class GeneralVehicleSounds {
	
	public static ModContext cont;
	
	public static CompatibleSound driftConcrete1;
	public static CompatibleSound driftDirt1;
	public static CompatibleSound driftGround1;
	
	
	public static void setup(ModContext c) {
		
		cont = c;
		
		driftConcrete1 = c.registerSound("drift_concrete");
		driftDirt1 = c.registerSound("drift_dirt");
		driftGround1 = c.registerSound("drift_ground");
		
	}
	
	

}
