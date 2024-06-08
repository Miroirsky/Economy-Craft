package net.mcreator.economycraft.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

public class WhiteIDCardItemInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("assigned")) {
			(itemstack).setHoverName(Component.literal(("ID Card of: " + itemstack.getOrCreateTag().getString("player"))));
		} else {
			(itemstack).setHoverName(Component.literal("ID Card"));
		}
	}
}
