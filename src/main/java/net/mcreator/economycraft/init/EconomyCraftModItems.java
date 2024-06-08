
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.economycraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.economycraft.item.YellowIDCardItem;
import net.mcreator.economycraft.item.WhiteIDCardItem;
import net.mcreator.economycraft.item.SilverDotItem;
import net.mcreator.economycraft.item.SilverCupItem;
import net.mcreator.economycraft.item.SilverBowlItem;
import net.mcreator.economycraft.item.RedIDCardItem;
import net.mcreator.economycraft.item.PurpleIDCardItem;
import net.mcreator.economycraft.item.OrangeIDCardItem;
import net.mcreator.economycraft.item.NetheriteDotItem;
import net.mcreator.economycraft.item.NetheriteCupItem;
import net.mcreator.economycraft.item.NetheriteBowlItem;
import net.mcreator.economycraft.item.GreenIDCardItem;
import net.mcreator.economycraft.item.GoldenDotItem;
import net.mcreator.economycraft.item.GoldenCupItem;
import net.mcreator.economycraft.item.GoldenBowlItem;
import net.mcreator.economycraft.item.EmeraldDotItem;
import net.mcreator.economycraft.item.EmeraldCupItem;
import net.mcreator.economycraft.item.EmeraldBowlItem;
import net.mcreator.economycraft.item.DiamondDotItem;
import net.mcreator.economycraft.item.DiamondCupItem;
import net.mcreator.economycraft.item.DiamondBowlItem;
import net.mcreator.economycraft.item.CyanIDCardItem;
import net.mcreator.economycraft.item.BrownIDCardItem;
import net.mcreator.economycraft.item.BronzeDotItem;
import net.mcreator.economycraft.item.BronzeCupItem;
import net.mcreator.economycraft.item.BronzeBowlItem;
import net.mcreator.economycraft.item.BlueIDCardItem;
import net.mcreator.economycraft.EconomyCraftMod;

public class EconomyCraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EconomyCraftMod.MODID);
	public static final RegistryObject<Item> BRONZE_CUP = REGISTRY.register("bronze_cup", () -> new BronzeCupItem());
	public static final RegistryObject<Item> BRONZE_DOT = REGISTRY.register("bronze_dot", () -> new BronzeDotItem());
	public static final RegistryObject<Item> BRONZE_BOWL = REGISTRY.register("bronze_bowl", () -> new BronzeBowlItem());
	public static final RegistryObject<Item> SILVER_DOT = REGISTRY.register("silver_dot", () -> new SilverDotItem());
	public static final RegistryObject<Item> SILVER_CUP = REGISTRY.register("silver_cup", () -> new SilverCupItem());
	public static final RegistryObject<Item> SILVER_BOWL = REGISTRY.register("silver_bowl", () -> new SilverBowlItem());
	public static final RegistryObject<Item> GOLDEN_DOT = REGISTRY.register("golden_dot", () -> new GoldenDotItem());
	public static final RegistryObject<Item> GOLDEN_CUP = REGISTRY.register("golden_cup", () -> new GoldenCupItem());
	public static final RegistryObject<Item> GOLDEN_BOWL = REGISTRY.register("golden_bowl", () -> new GoldenBowlItem());
	public static final RegistryObject<Item> DIAMOND_DOT = REGISTRY.register("diamond_dot", () -> new DiamondDotItem());
	public static final RegistryObject<Item> DIAMOND_CUP = REGISTRY.register("diamond_cup", () -> new DiamondCupItem());
	public static final RegistryObject<Item> DIAMOND_BOWL = REGISTRY.register("diamond_bowl", () -> new DiamondBowlItem());
	public static final RegistryObject<Item> EMERALD_DOT = REGISTRY.register("emerald_dot", () -> new EmeraldDotItem());
	public static final RegistryObject<Item> EMERALD_CUP = REGISTRY.register("emerald_cup", () -> new EmeraldCupItem());
	public static final RegistryObject<Item> EMERALD_BOWL = REGISTRY.register("emerald_bowl", () -> new EmeraldBowlItem());
	public static final RegistryObject<Item> NETHERITE_DOT = REGISTRY.register("netherite_dot", () -> new NetheriteDotItem());
	public static final RegistryObject<Item> NETHERITE_CUP = REGISTRY.register("netherite_cup", () -> new NetheriteCupItem());
	public static final RegistryObject<Item> NETHERITE_BOWL = REGISTRY.register("netherite_bowl", () -> new NetheriteBowlItem());
	public static final RegistryObject<Item> WHITE_ID_CARD = REGISTRY.register("white_id_card", () -> new WhiteIDCardItem());
	public static final RegistryObject<Item> RED_ID_CARD = REGISTRY.register("red_id_card", () -> new RedIDCardItem());
	public static final RegistryObject<Item> GREEN_ID_CARD = REGISTRY.register("green_id_card", () -> new GreenIDCardItem());
	public static final RegistryObject<Item> ORANGE_ID_CARD = REGISTRY.register("orange_id_card", () -> new OrangeIDCardItem());
	public static final RegistryObject<Item> YELLOW_ID_CARD = REGISTRY.register("yellow_id_card", () -> new YellowIDCardItem());
	public static final RegistryObject<Item> BLUE_ID_CARD = REGISTRY.register("blue_id_card", () -> new BlueIDCardItem());
	public static final RegistryObject<Item> CYAN_ID_CARD = REGISTRY.register("cyan_id_card", () -> new CyanIDCardItem());
	public static final RegistryObject<Item> PURPLE_ID_CARD = REGISTRY.register("purple_id_card", () -> new PurpleIDCardItem());
	public static final RegistryObject<Item> BROWN_ID_CARD = REGISTRY.register("brown_id_card", () -> new BrownIDCardItem());
}
