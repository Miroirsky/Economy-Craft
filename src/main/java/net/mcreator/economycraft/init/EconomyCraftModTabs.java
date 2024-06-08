
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.economycraft.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class EconomyCraftModTabs {
	public static CreativeModeTab TAB_ECONOMY_CRAFT_CREATIVE_TAB;

	public static void load() {
		TAB_ECONOMY_CRAFT_CREATIVE_TAB = new CreativeModeTab("tabeconomy_craft_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(EconomyCraftModItems.GREEN_ID_CARD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
