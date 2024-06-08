
package net.mcreator.economycraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.economycraft.init.EconomyCraftModTabs;

public class BronzeBowlItem extends Item {
	public BronzeBowlItem() {
		super(new Item.Properties().tab(EconomyCraftModTabs.TAB_ECONOMY_CRAFT_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
