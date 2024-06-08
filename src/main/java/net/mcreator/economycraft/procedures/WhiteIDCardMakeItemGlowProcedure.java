package net.mcreator.economycraft.procedures;

import net.minecraft.world.item.ItemStack;

public class WhiteIDCardMakeItemGlowProcedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getBoolean("assigned");
	}
}
