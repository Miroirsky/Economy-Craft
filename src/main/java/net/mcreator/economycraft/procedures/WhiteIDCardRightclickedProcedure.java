package net.mcreator.economycraft.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class WhiteIDCardRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			itemstack.getOrCreateTag().putBoolean("assigned", (false));
			itemstack.getOrCreateTag().putString("owner", "");
		} else {
			itemstack.getOrCreateTag().putBoolean("assigned", (true));
			itemstack.getOrCreateTag().putString("owner", (entity.getDisplayName().getString()));
		}
	}
}
