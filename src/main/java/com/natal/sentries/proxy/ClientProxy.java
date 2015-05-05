package com.natal.sentries.proxy;

import com.natal.sentries.entity.EntityExplosiveBaby;
import com.natal.sentries.init.ModItems;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderSnowball;

/**
 * Created by Nathanael on 5/4/2015.
 */
public class ClientProxy extends CommonProxy{

    public void registerRenderThings()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityExplosiveBaby.class, new RenderSnowball(ModItems.explosiveBaby));
    }
}
