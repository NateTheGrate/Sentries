package com.natal.sentries;

import com.natal.sentries.init.ModEntities;
import com.natal.sentries.init.ModItems;
import com.natal.sentries.proxy.ClientProxy;
import com.natal.sentries.proxy.CommonProxy;
import com.natal.sentries.proxy.IProxy;
import com.natal.sentries.refrence.Refrence;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Nathanael on 5/4/2015.
 */
@Mod(modid = Refrence.MOD_ID, name = Refrence.MOD_NAME, version = Refrence.VERSION)
public class Sentries {

    @Mod.Instance(Refrence.MOD_ID)
    public static Sentries instance;

    @SidedProxy(clientSide = Refrence.CLIENT_PROXY, serverSide = Refrence.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ModItems.init();
        ModEntities.init();

        proxy.registerRenderThings();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
