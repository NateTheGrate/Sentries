package com.natal.sentries.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

/**
 * Created by Nathanael on 5/4/2015.
 */
public class EntityExplosiveBaby extends EntityThrowable{
    public EntityExplosiveBaby(World world){
        super(world);
    }
    public EntityExplosiveBaby(World world, EntityLivingBase player)
    {
        super(world, player);
    }

    public EntityExplosiveBaby(World world, double x, double y, double z)
    {
        super(world, x, y, z);
    }
    @Override
    protected void onImpact (MovingObjectPosition movingObjectPosition){
        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 2.0f, true);
        this.setDead();
    }
}
