package net.lolagain.nicerworld.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class SteamerBlock extends Block {
    public SteamerBlock(Settings settings) {
        super(settings);
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        double d = (double)pos.getX() + 0.55 - (double)(random.nextFloat() * 0.1f);
        double e = (double)pos.getY() + 0.65;
        double f = (double)pos.getZ() + 0.55 - (double)(random.nextFloat() * 0.1f);
        world.addParticle(ParticleTypes.CLOUD, d, e, f, random.nextGaussian() * 0.01, random.nextGaussian() * 0.01 + 0.15, random.nextGaussian() * 0.01);
        world.addParticle(ParticleTypes.CLOUD, d, e, f, random.nextGaussian() * 0.01, random.nextGaussian() * 0.01 + 0.12, random.nextGaussian() * 0.01);
    }
}
