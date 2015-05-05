package com.natal.sentries.init;

import com.natal.sentries.item.Baby;
import com.natal.sentries.item.ExplosiveBaby;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Nathanael on 5/4/2015.
 */
public class ModItems {
    public static Baby baby = new Baby("baby", 16);
    public static ExplosiveBaby explosiveBaby = new ExplosiveBaby("explosiveBaby", 16);

    public static void init(){
        GameRegistry.registerItem( baby, "Infant" );
        GameRegistry.registerItem( explosiveBaby, "Explosive Infant");


    }
}
