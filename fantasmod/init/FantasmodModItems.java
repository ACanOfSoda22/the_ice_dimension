
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fantasmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.fantasmod.item.UncommonBrickArmorItem;
import net.mcreator.fantasmod.item.RawKrystalaniteItem;
import net.mcreator.fantasmod.item.RawGreenIceOreItem;
import net.mcreator.fantasmod.item.KrystalaniteSwordItem;
import net.mcreator.fantasmod.item.KrystalaniteShovelItem;
import net.mcreator.fantasmod.item.KrystalanitePickaxeItem;
import net.mcreator.fantasmod.item.KrystalaniteHoeItem;
import net.mcreator.fantasmod.item.KrystalaniteAxeItem;
import net.mcreator.fantasmod.item.KrystalaniteArmorItem;
import net.mcreator.fantasmod.item.IceItem;
import net.mcreator.fantasmod.item.HardenedKrystalaniteItem;
import net.mcreator.fantasmod.item.GreenIceIngotItem;
import net.mcreator.fantasmod.FantasmodMod;

public class FantasmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, FantasmodMod.MODID);
	public static final DeferredHolder<Item, Item> NAVY_ICE = block(FantasmodModBlocks.NAVY_ICE);
	public static final DeferredHolder<Item, Item> WANDERER_SPAWN_EGG = REGISTRY.register("wanderer_spawn_egg", () -> new DeferredSpawnEggItem(FantasmodModEntities.WANDERER, -1, -1, new Item.Properties()));
	public static final DeferredHolder<Item, Item> ICE = REGISTRY.register("ice", () -> new IceItem());
	public static final DeferredHolder<Item, Item> TORMENTED_SOUL_SPAWN_EGG = REGISTRY.register("tormented_soul_spawn_egg", () -> new DeferredSpawnEggItem(FantasmodModEntities.TORMENTED_SOUL, -1, -1, new Item.Properties()));
	public static final DeferredHolder<Item, Item> GREEN_ICE_ARMOR_HELMET = REGISTRY.register("green_ice_armor_helmet", () -> new UncommonBrickArmorItem.Helmet());
	public static final DeferredHolder<Item, Item> GREEN_ICE_ARMOR_CHESTPLATE = REGISTRY.register("green_ice_armor_chestplate", () -> new UncommonBrickArmorItem.Chestplate());
	public static final DeferredHolder<Item, Item> GREEN_ICE_ARMOR_LEGGINGS = REGISTRY.register("green_ice_armor_leggings", () -> new UncommonBrickArmorItem.Leggings());
	public static final DeferredHolder<Item, Item> GREEN_ICE_ARMOR_BOOTS = REGISTRY.register("green_ice_armor_boots", () -> new UncommonBrickArmorItem.Boots());
	public static final DeferredHolder<Item, Item> RED_NAVY_ICE = block(FantasmodModBlocks.RED_NAVY_ICE);
	public static final DeferredHolder<Item, Item> ORANGE_NAVY_ICE = block(FantasmodModBlocks.ORANGE_NAVY_ICE);
	public static final DeferredHolder<Item, Item> RAW_GREEN_ICE_ORE = REGISTRY.register("raw_green_ice_ore", () -> new RawGreenIceOreItem());
	public static final DeferredHolder<Item, Item> GREEN_ICE_ORE = block(FantasmodModBlocks.GREEN_ICE_ORE);
	public static final DeferredHolder<Item, Item> GREEN_ICE_INGOT = REGISTRY.register("green_ice_ingot", () -> new GreenIceIngotItem());
	public static final DeferredHolder<Item, Item> KRYSTALALANITEBLOCK = block(FantasmodModBlocks.KRYSTALALANITEBLOCK);
	public static final DeferredHolder<Item, Item> KRYSTALALANITE_ORE = block(FantasmodModBlocks.KRYSTALALANITE_ORE);
	public static final DeferredHolder<Item, Item> ORANGE_ICE_BRICKS = block(FantasmodModBlocks.ORANGE_ICE_BRICKS);
	public static final DeferredHolder<Item, Item> PINK_KRYSTALALANITE_ROCK = block(FantasmodModBlocks.PINK_KRYSTALALANITE_ROCK);
	public static final DeferredHolder<Item, Item> KRYSTALANITE_BLOCK = block(FantasmodModBlocks.KRYSTALANITE_BLOCK);
	public static final DeferredHolder<Item, Item> RAW_KRYSTALANITE = REGISTRY.register("raw_krystalanite", () -> new RawKrystalaniteItem());
	public static final DeferredHolder<Item, Item> HARDENED_KRYSTALANITE = REGISTRY.register("hardened_krystalanite", () -> new HardenedKrystalaniteItem());
	public static final DeferredHolder<Item, Item> KRYSTALANITE_ARMOR_HELMET = REGISTRY.register("krystalanite_armor_helmet", () -> new KrystalaniteArmorItem.Helmet());
	public static final DeferredHolder<Item, Item> KRYSTALANITE_ARMOR_CHESTPLATE = REGISTRY.register("krystalanite_armor_chestplate", () -> new KrystalaniteArmorItem.Chestplate());
	public static final DeferredHolder<Item, Item> KRYSTALANITE_ARMOR_LEGGINGS = REGISTRY.register("krystalanite_armor_leggings", () -> new KrystalaniteArmorItem.Leggings());
	public static final DeferredHolder<Item, Item> KRYSTALANITE_ARMOR_BOOTS = REGISTRY.register("krystalanite_armor_boots", () -> new KrystalaniteArmorItem.Boots());
	public static final DeferredHolder<Item, Item> KRYSTALANITE_PICKAXE = REGISTRY.register("krystalanite_pickaxe", () -> new KrystalanitePickaxeItem());
	public static final DeferredHolder<Item, Item> KRYSTALANITE_AXE = REGISTRY.register("krystalanite_axe", () -> new KrystalaniteAxeItem());
	public static final DeferredHolder<Item, Item> KRYSTALANITE_SWORD = REGISTRY.register("krystalanite_sword", () -> new KrystalaniteSwordItem());
	public static final DeferredHolder<Item, Item> KRYSTALANITE_SHOVEL = REGISTRY.register("krystalanite_shovel", () -> new KrystalaniteShovelItem());
	public static final DeferredHolder<Item, Item> KRYSTALANITE_HOE = REGISTRY.register("krystalanite_hoe", () -> new KrystalaniteHoeItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
