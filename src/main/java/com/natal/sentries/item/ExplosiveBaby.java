package com.natal.sentries.item;

import com.natal.sentries.entity.EntityExplosiveBaby;
import com.natal.sentries.refrence.Refrence;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Nathanael on 5/4/2015.
 */
public class ExplosiveBaby extends Item{
    public ExplosiveBaby(String name, int maxStack){
        super();
        this.setMaxStackSize(maxStack);
        this.setUnlocalizedName(Refrence.MOD_ID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabAllSearch);
        this.setTextureName(Refrence.MOD_ID + ":" + name);
    }


    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
        if (!world.isRemote){

            world.spawnEntityInWorld(new EntityExplosiveBaby(world, player));
            itemStack.stackSize--;
        }
        return itemStack;
    }


}
