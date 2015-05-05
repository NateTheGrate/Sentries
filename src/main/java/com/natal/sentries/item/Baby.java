package com.natal.sentries.item;

import com.natal.sentries.refrence.Refrence;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Nathanael on 5/4/2015.
 */
public class Baby extends Item{
    public Baby(String name, int maxStack){
        super();
        this.setMaxStackSize(maxStack);
        this.setUnlocalizedName(Refrence.MOD_ID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabAllSearch);
        this.setTextureName(Refrence.MOD_ID + ":" + name);
    }
}
