package com.natal.sentries.init;

import com.natal.sentries.entity.EntityExplosiveBaby;
import com.natal.sentries.item.ExplosiveBaby;
import cpw.mods.fml.common.registry.EntityRegistry;

/**
 * Created by Nathanael on 5/4/2015.
 */
public class ModEntities {
    public static void init(){
        EntityRegistry.registerGlobalEntityID(EntityExplosiveBaby.class, "ExplosiveBaby", EntityRegistry.findGlobalUniqueEntityId());

    }
}
