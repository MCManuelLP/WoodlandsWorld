package com.mcmanuellp.woodlandsworld.block;

import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockWW_BUSH extends BlockWW
{
	public BlockWW_BUSH()
	{

	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int i)
	{
		return null;
	}

	public boolean isOpaqueCube()
	{
		return false;
	}

	public boolean renderAsNormalBlock()
	{
		return false;
	}

	public int getRenderType()
	{
		return 1;
	}
}