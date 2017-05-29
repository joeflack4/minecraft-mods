package net.joeflack.minecraftmod.blocks;

import net.joeflack.minecraftmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCheese extends Block {

	public BlockCheese() {
		super(Material.CAKE);
		setUnlocalizedName(Reference.ModBlocks.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.CHEESE.getRegistryName());
		setHardness(1.0F); // Default: 1.0.
	}
}
