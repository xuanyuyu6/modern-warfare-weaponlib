package com.vicmatskiv.mw;

import com.vicmatskiv.mw.items.guns.*;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;

import net.minecraft.item.Item;

public class Guns {

    public static Item AK47;
    public static Item AKM;
    public static Item AK15;
    public static Item AK12;
    public static Item AMD65;
    public static Item AMD65M;
    public static Item Ots14Groza;
    public static Item AK74U;
    public static Item AK74M;
//    public static Item AR15;
    public static Item M4A1;
    public static Item M416;
    public static Item POFUSA;
    public static Item HK417;
    public static Item M16A4;
    public static Item M16A1;
    public static Item FNFAL;
//    public static Item Scar;
    public static Item ScarH;
    public static Item G18;
    public static Item G21;
    public static Item M9;
    public static Item M93R;
//    public static Item B92A1;
    public static Item USP45;
    public static Item P2000;
    public static Item G36;
    public static Item G36C;
    public static Item AUG;
    public static Item Famas;
    public static Item FamasF1;
    public static Item HK33;
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
    public static Item MP43E;
    public static Item S686;
    public static Item KSG12;
    public static Item M1014;
    public static Item SPAS12;
    // public static Item SPAS15;
    public static Item M249;
    public static Item Mk48MOD1;
    public static Item RPK74M;
    public static Item ACR;
    public static Item M1Carbine;
    public static Item M2Carbine;
    public static Item MP40;
    public static Item AN94;
    public static Item M1911;
    public static Item AUGA3;
//    public static Item MX;
    public static Item L96;
    public static Item SV98;
    public static Item MosinNagant;
//    public static Item MosinPU;
    public static Item M21;
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
    public static Item Remington700;
    public static Item P99;
    public static Item UDP9;
    public static Item Saiga12;
    public static Item Saiga410;
    public static Item VEPR12;
    public static Item SVT40;
    public static Item SKS;
    public static Item M1903A3;
    public static Item M1903A1;
    public static Item Webley;
    public static Item M1928Thompson;
//    public static Item EnfieldNo2;
    public static Item MP41;
    public static Item LugerP08;
    public static Item P08Artillerie;
    public static Item M3A1;
    public static Item STG44;
    public static Item Kar98K;
    public static Item Gewehr98;
    public static Item LeeEnfieldSMLE;
    public static Item LeeEnfieldNo4MkI;
    public static Item Tec9;
    public static Item MPX;
    public static Item M1911Taurus;
    public static Item PLR16;
    public static Item Maxim9;
    public static Item Ghost350;
    public static Item Emp1911;
    public static Item SMAW;
    public static Item USG57;
    public static Item P38;
    public static Item M1918BAR;
    public static Item Intervention;
    public static Item GunwerksHAMR;
    public static Item GL06;
    public static Item FMG9;
    public static Item AA12;
    public static Item M1873;
    public static Item M1873Talon;
    public static Item M1897;
    public static Item SuperShorty;

    // Fun guns :)
    public static Item M41A;
//    public static Item Pistol10mm;
//  public static Item Duplet;
    
    //Halo
    public static Item MA37;
    public static Item MA5D;
    public static Item M395B;
    public static Item SRS99S5;
    public static Item M6G;
    public static Item BR55;
    
    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event, CommonProxy proxy) {
     // Try not to change the order of the guns to ensure stable recipes

        AK47 = new AK47Factory().createGun(proxy);
        AKM = new AKMFactory().createGun(proxy);
        AK12 = new AK12Factory().createGun(proxy);
        AK15 = new AK15Factory().createGun(proxy);
        AK74U = new AK74UFactory().createGun(proxy);
        AK74M = new AK74MFactory().createGun(proxy);
        AMD65 = new AMD65Factory().createGun(proxy);
        AMD65M = new AMD65MFactory().createGun(proxy);
        Ots14Groza = new OTs14GrozaFactory().createGun(proxy);
        AN94 = new AN94Factory().createGun(proxy);
//        AR15 = new AR15Factory().createGun(proxy);
        M4A1 = new M4A1Factory().createGun(proxy);
        M416 = new M416Factory().createGun(proxy);
        ACR = new ACRFactory().createGun(proxy);
        HK33 = new HK33Factory().createGun(proxy);
        POFUSA = new POFUSAFactory().createGun(proxy);
        M16A1 = new M16A1Factory().createGun(proxy);
        M16A4 = new M16A4Factory().createGun(proxy);
//        HK416C = new HK416CFactory().createGun(proxy);
        ScarH = new ScarHFactory().createGun(proxy);
//        MX = new MXFactory().createGun(proxy);
        FNFAL = new FNFALFactory().createGun(proxy);
        M1Carbine = new M1CarbineFactory().createGun(proxy);
        M2Carbine = new M2CarbineFactory().createGun(proxy);
        M1873 = new M1873Factory().createGun(proxy);
        M1873Talon = new M1873TalonFactory().createGun(proxy);
        
        Glock18 = new Glock18Factory().createGun(proxy);
        G21 = new G21Factory().createGun(proxy);
        Glock32 = new Glock32Factory().createGun(proxy);
        M9 = new M9Factory().createGun(proxy);
        M93R = new M93RFactory().createGun(proxy);
        P38 = new P38Factory().createGun(proxy);
        USP45 = new USP45Factory().createGun(proxy);
        P99 = new P99Factory().createGun(proxy);
        Deagle44 = new Deagle44Factory().createGun(proxy);
        P2000 = new P2000Factory().createGun(proxy);
        P226 = new P226Factory().createGun(proxy);
        Python = new PythonFactory().createGun(proxy);
        M1911 = new M1911Factory().createGun(proxy);
        M1911Taurus = new M1911TaurusFactory().createGun(proxy);
        Emp1911 = new Emp1911Factory().createGun(proxy);
        Maxim9 = new Maxim9Factory().createGun(proxy);
        MakarovPM = new MakarovPMFactory().createGun(proxy);
        USG57 = new USG57Factory().createGun(proxy);
        Tec9 = new Tec9Factory().createGun(proxy);
        Webley = new WebleyFactory().createGun(proxy);
        
        LugerP08 = new LugerP08Factory().createGun(proxy);
        
        Remington870 = new Remington900Factory().createGun(proxy);
        M1897 = new M1897Factory().createGun(proxy);
        SuperShorty = new SuperShortyFactory().createGun(proxy);
        KSG12 = new KSG12Factory().createGun(proxy);
        M1014 = new M1014Factory().createGun(proxy);
        SPAS12 = new SPAS12Factory().createGun(proxy);
        QBS09 = new QBS09Factory().createGun(proxy);
        Saiga12 = new Saiga12Factory().createGun(proxy);
        Saiga410 = new Saiga410Factory().createGun(proxy);
        VEPR12 = new VEPR12Factory().createGun(proxy);
        AA12 = new AA12Factory().createGun(proxy);
        
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
        UDP9 = new UDP9Factory().createGun(proxy);
        MPX = new MPXFactory().createGun(proxy);
        FMG9 = new FMG9Factory().createGun(proxy);
        MP40 = new MP40Factory().createGun(proxy);
        MP41 = new MP41Factory().createGun(proxy);
        M3A1 = new M3A1Factory().createGun(proxy);
        PPSh41 = new PPSh41Factory().createGun(proxy);
        Type100 = new Type100Factory().createGun(proxy);
        MP18 = new MP18Factory().createGun(proxy);
        M1928Thompson = new M1928ThompsonFactory().createGun(proxy);
        M1A1Thompson = new M1A1ThompsonFactory().createGun(proxy);
        
        AS50 = new AS50Factory().createGun(proxy);
        L96 = new L96Factory().createGun(proxy);
//        AWP = new AWPFactory().createGun(proxy);
        SV98 = new SV98Factory().createGun(proxy);
        HecateII = new HecateIIFactory().createGun(proxy);
        Intervention = new InterventionFactory().createGun(proxy);
        GunwerksHAMR = new GunwerksHAMRFactory().createGun(proxy);
        MosinNagant = new MosinNagantFactory().createGun(proxy);
//        MosinPU = new MosinPUFactory().createGun(proxy);
        Dragonuv = new DragonuvFactory().createGun(proxy);
        VSSVintorez = new VSSVintorezFactory().createGun(proxy);
        M14 = new M14Factory().createGun(proxy);
        M21 = new M21Factory().createGun(proxy);
        M110 = new M110Factory().createGun(proxy);
        M107 = new M107Factory().createGun(proxy);
//        M240 = new M240Factory().createGun(proxy);
        
        M249 = new M249Factory().createGun(proxy);
        Mk48MOD1 = new Mk48MOD1Factory().createGun(proxy);
        RPK74M = new RPK74MFactory().createGun(proxy);
        M1918BAR = new M1918BARFactory().createGun(proxy);
        
        ASVal = new ASValFactory().createGun(proxy);
        
        UMP45 = new UMP45Factory().createGun(proxy);
        
        TAR21 = new TAR21Factory().createGun(proxy);
        
        MP9 = new MP9Factory().createGun(proxy);
        
        M8A7 = new M8A7Factory().createGun(proxy);
        
        M1Garand = new M1GarandFactory().createGun(proxy);
        
        Remington700 = new Remington700Factory().createGun(proxy);
        
        HK417 = new HK417Factory().createGun(proxy);
        SVT40 = new SVT40Factory().createGun(proxy);
        SKS = new SKSFactory().createGun(proxy);
        M1903A1 = new M1903A1Factory().createGun(proxy);
        M1903A3 = new M1903A3Factory().createGun(proxy);
        Kar98K = new Kar98KFactory().createGun(proxy);
        Gewehr98 = new Gewehr98Factory().createGun(proxy);
        LeeEnfieldSMLE = new LeeEnfieldSMLE().createGun(proxy);
        LeeEnfieldNo4MkI = new LeeEnfieldNo4MkI().createGun(proxy);
        
        P08Artillerie = new P08Artillerie().createGun(proxy);
        
        STG44 = new STG44Factory().createGun(proxy);
        PLR16 = new PLR16Factory().createGun(proxy);
        
        MP43E = new MP43EFactory().createGun(proxy);
        S686 = new S686Factory().createGun(proxy);
        
        Ghost350 = new Ghost350Factory().createGun(proxy);
        
        SMAW = new SMAWFactory().createGun(proxy);
        GL06 = new GL06Factory().createGun(proxy);
//        Duplet = new DupletFactory().createGun(proxy);

        // Fun Guns :)
        M41A = new M41AFactory().createGun(proxy);
//        Pistol10mm = new Pistol10mmFactory().createGun(proxy);
        
        //Halo
        MA37 = new MA37Factory().createGun(proxy);
        MA5D = new MA5DFactory().createGun(proxy);
        M395B = new M395BFactory().createGun(proxy);
        SRS99S5 = new SRS99S5Factory().createGun(proxy);
        M6G = new M6GFactory().createGun(proxy);
        BR55 = new BR55Factory().createGun(proxy);
        
        // GaussRifle = new GaussRifleFactory().createGun(proxy);
        // RPG = new RPGFactory().createGun(proxy);
    }
}
