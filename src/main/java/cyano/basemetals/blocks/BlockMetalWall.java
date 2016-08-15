package cyano.basemetals.blocks;

import cyano.basemetals.material.IMetalObject;
import cyano.basemetals.material.MetalMaterial;
import cyano.basemetals.registry.IOreDictionaryEntry;
import net.minecraft.block.BlockWall;
import net.minecraft.block.SoundType;

/**
 *
 * @author Jasmine Iwanek
 *
 */
public class BlockMetalWall extends BlockWall implements IOreDictionaryEntry, IMetalObject {

	final MetalMaterial metal;

	/**
	 *
	 * @param metal
	 */
	public BlockMetalWall(MetalMaterial metal) {
		super(baseminerals.init.Blocks.getBlockByName(metal.getName() + "_block"));
		this.setSoundType(SoundType.METAL);
		this.metal = metal;
		this.blockHardness = metal.getMetalBlockHardness();
		this.blockResistance = metal.getBlastResistance();
		this.setHarvestLevel("pickaxe", metal.getRequiredHarvestLevel());
	}

	@Override
	public MetalMaterial getMetalMaterial() {
		return this.metal;
	}

	@Override
	public String getOreDictionaryName() {
		return "wall" + this.metal.getCapitalizedName();
	}
}
