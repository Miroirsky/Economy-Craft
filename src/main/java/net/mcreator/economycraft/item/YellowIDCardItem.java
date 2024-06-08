
package net.mcreator.economycraft.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.economycraft.procedures.WhiteIDCardRightclickedProcedure;
import net.mcreator.economycraft.procedures.WhiteIDCardMakeItemGlowProcedure;
import net.mcreator.economycraft.procedures.WhiteIDCardItemInInventoryTickProcedure;
import net.mcreator.economycraft.init.EconomyCraftModTabs;

public class YellowIDCardItem extends Item {
	public YellowIDCardItem() {
		super(new Item.Properties().tab(EconomyCraftModTabs.TAB_ECONOMY_CRAFT_CREATIVE_TAB).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return WhiteIDCardMakeItemGlowProcedure.execute(itemstack);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		WhiteIDCardRightclickedProcedure.execute(entity, itemstack);
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		WhiteIDCardItemInInventoryTickProcedure.execute(itemstack);
	}
}
