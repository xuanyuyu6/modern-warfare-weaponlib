package com.vicmatskiv.mw;

import com.vicmatskiv.mw.items.guns.*;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;

import net.minecraft.item.Item;

public class Guns {

    public static Item AK47;
//    public static Item AKM;
    public static Item AK12;
    public static Item AK74U;
    public static Item AK74M;
    public static Item M4A1;
    public static Item M4A4;
    public static Item M27;
    
    public static Item M416;
    
    public static Item AR15;
//    public static Item M16A3;
    public static Item M16A4;
    public static Item FNFAL;
//    public static Item Scar;
    public static Item ScarH;
    public static Item G18;
    public static Item G21;
    public static Item M9;
//    public static Item B92A1;
    public static Item USP45;
//    public static Item XEagle;
    public static Item P2000;
//    public static Item Magnum;
//    public static Item PX90;
    public static Item G36;
    public static Item G36C;
    public static Item AUG;
    public static Item Famas;
//    public static Item FamasG2;
    public static Item FamasF1;
    public static Item MP5;
    public static Item MP5K;
    public static Item MP7;
    public static Item AS50;
    public static Item M14;
    public static Item M110;
    public static Item XWP;
    public static Item Dragonuv;
    public static Item M107;
    public static Item Remington870;
    public static Item KSG12;
    public static Item M1014;
    public static Item SPAS12;
    // public static Item SPAS15;
//    public static Item M240;
    public static Item M249;
    public static Item RPK74M;
    public static Item ACR;
//    public static Item HK416C;
    public static Item M1Carbine;
    public static Item MP40;
    public static Item AN94;
    public static Item M1911;
    public static Item AUGA3;
    public static Item MX;
    public static Item L96;
    public static Item SV98;
    public static Item MosinNagant;
    public static Item M21;
    public static Item M93R;
    public static Item Python;
    public static Item MakarovPM;
    public static Item KrissVector;
    public static Item P226;
    public static Item MP5A5;
    public static Item FNP90;
    public static Item MAC10;
    public static Item QBS09;
    public static Item PP19;
    public static Item Glock32;
    public static Item Minimi;
    public static Item Glock18;
    public static Item HecateII;
    public static Item Deagle44;
    public static Item VSSVintorez;
    public static Item ASVal;
    public static Item UMP45;
    public static Item TAR21;
    public static Item MP9;
    public static Item M8A7;
    public static Item M1Garand;
    public static Item PPSh41;
    public static Item Type100;
    public static Item M1A1Thompson;
    public static Item MP18;
//    public static Item Duplet;

    public static Item SMAW;

    // Fun guns :)
    public static Item M41A;
    public static Item Pistol10mm;
    
    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlInitializationEvent event, CommonProxy proxy) {
     // Try not to change the order of the guns to ensure stable recipes

        AK47 = new AK47Factory().createGun(proxy);
        AK12 = new AK12Factory().createGun(proxy);
        AN94 = new AN94Factory().createGun(proxy);
        AK74U = new AK74UFactory().createGun(proxy);
        AK74M = new AK74MFactory().createGun(proxy);
        AR15 = new AR15Factory().createGun(proxy);
        M4A1 = new M4A1Factory().createGun(proxy);
        ACR = new ACRFactory().createGun(proxy);
        M416 = new M416Factory().createGun(proxy);
        M16A4 = new M16A4Factory().createGun(proxy);
//        HK416C = new HK416CFactory().createGun(proxy);
        ScarH = new ScarHFactory().createGun(proxy);
        MX = new MXFactory().createGun(proxy);
        FNFAL = new FNFALFactory().createGun(proxy);
        M1Carbine = new M1CarbineFactory().createGun(proxy);
        Glock18 = new Glock18Factory().createGun(proxy);
        G21 = new G21Factory().createGun(proxy);
        Glock32 = new Glock32Factory().createGun(proxy);
        M9 = new M9Factory().createGun(proxy);
//        M93R = new M93RFactory().createGun(proxy);
        USP45 = new USP45Factory().createGun(proxy);
        Deagle44 = new Deagle44Factory().createGun(proxy);
        P2000 = new P2000Factory().createGun(proxy);
        P226 = new P226Factory().createGun(proxy);
        Python = new PythonFactory().createGun(proxy);
        M1911 = new M1911Factory().createGun(proxy);
        MakarovPM = new MakarovPMFactory().createGun(proxy);
        Remington870 = new Remington900Factory().createGun(proxy);
        KSG12 = new KSG12Factory().createGun(proxy);
        M1014 = new M1014Factory().createGun(proxy);
        SPAS12 = new SPAS12Factory().createGun(proxy);
        QBS09 = new QBS09Factory().createGun(proxy);
        // SPAS15 = new SPAS15Factory().createGun(proxy);
        G36 = new G36Factory().createGun(proxy);
        G36C = new G36CFactory().createGun(proxy);
        AUG = new AUGFactory().createGun(proxy);
        AUGA3 = new AUGA3Factory().createGun(proxy);
        Famas = new FamasFactory().createGun(proxy);
        FamasF1 = new FamasF1Factory().createGun(proxy);
        MP5 = new MP5Factory().createGun(proxy);
        MP5K = new MP5KFactory().createGun(proxy);
        PP19 = new PP19Factory().createGun(proxy);
        MP7 = new MP7Factory().createGun(proxy);
        FNP90 = new FNP90Factory().createGun(proxy);
        KrissVector = new KrissVectorFactory().createGun(proxy);
        MAC10 = new MAC10Factory().createGun(proxy);
        MP40 = new MP40Factory().createGun(proxy);
        PPSh41 = new PPSh41Factory().createGun(proxy);
        Type100 = new Type100Factory().createGun(proxy);
        MP18 = new MP18Factory().createGun(proxy);
        M1A1Thompson = new M1A1ThompsonFactory().createGun(proxy);
        AS50 = new AS50Factory().createGun(proxy);
        L96 = new L96Factory().createGun(proxy);
        SV98 = new SV98Factory().createGun(proxy);
        HecateII = new HecateIIFactory().createGun(proxy);
        MosinNagant = new MosinNagantFactory().createGun(proxy);
        Dragonuv = new DragonuvFactory().createGun(proxy);
        VSSVintorez = new VSSVintorezFactory().createGun(proxy);
        M14 = new M14Factory().createGun(proxy);
        M21 = new M21Factory().createGun(proxy);
        M110 = new M110Factory().createGun(proxy);
        M107 = new M107Factory().createGun(proxy);
//        M240 = new M240Factory().createGun(proxy);
        M249 = new M249Factory().createGun(proxy);
        RPK74M = new RPK74MFactory().createGun(proxy);
        ASVal = new ASValFactory().createGun(proxy);
        UMP45 = new UMP45Factory().createGun(proxy);
//        UMP9 = new UMP9Factory().createGun(proxy);
        TAR21 = new TAR21Factory().createGun(proxy);
//        KN44 = new KN44Factory().createGun(proxy);
        MP9 = new MP9Factory().createGun(proxy);
        M8A7 = new M8A7Factory().createGun(proxy);
        M1Garand = new M1GarandFactory().createGun(proxy);
//        Duplet = new DupletFactory().createGun(proxy);

        // Fun Guns :)
        M41A = new M41AFactory().createGun(proxy);
        Pistol10mm = new Pistol10mmFactory().createGun(proxy);

        SMAW = new SMAWFactory().createGun(proxy);
        // GaussRifle = new GaussRifleFactory().createGun(proxy);
        // RPG = new RPGFactory().createGun(proxy);
    }
}
