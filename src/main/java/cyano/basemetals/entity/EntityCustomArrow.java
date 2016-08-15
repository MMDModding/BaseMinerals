package cyano.basemetals.entity;

import baseminerals.init.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

/**
 *
 * @author Jasmine Iwanek
 *
 */
public class EntityCustomArrow extends EntityTippedArrow {

	private ItemStack itemStack;

	/**
	 *
	 * @param worldIn
	 */
	public EntityCustomArrow(World worldIn) {
		super(worldIn);
	}

	/**
	 *
	 * @param worldIn
	 * @param stack
	 * @param shooter
	 */
	public EntityCustomArrow (World worldIn, ItemStack stack, EntityPlayer shooter) {
		super(worldIn, shooter);
		this.itemStack = stack;
	}

	@Override
	protected ItemStack getArrowStack() {
		if(this.itemStack == null)
			this.itemStack = new ItemStack(Items.getItemByName("aluminum_arrow"));

		return new ItemStack(this.itemStack.getItem(), 1, this.itemStack.getItemDamage());
	}

	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);

		final NBTTagCompound itemStackCompound = new NBTTagCompound();
		this.itemStack.writeToNBT(itemStackCompound);

		compound.setTag("itemstack", itemStackCompound);
	}

	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);

		this.itemStack = ItemStack.loadItemStackFromNBT(compound.getCompoundTag("itemstack"));
	}
}
