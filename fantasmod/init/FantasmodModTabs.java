
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fantasmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.fantasmod.FantasmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FantasmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FantasmodMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(FantasmodModBlocks.ORANGE_ICE_BRICKS.get().asItem());
			tabData.accept(FantasmodModBlocks.PINK_KRYSTALALANITE_ROCK.get().asItem());
			tabData.accept(FantasmodModBlocks.KRYSTALANITE_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(FantasmodModItems.GREEN_ICE_ARMOR_HELMET.get());
			tabData.accept(FantasmodModItems.GREEN_ICE_ARMOR_CHESTPLATE.get());
			tabData.accept(FantasmodModItems.GREEN_ICE_ARMOR_LEGGINGS.get());
			tabData.accept(FantasmodModItems.GREEN_ICE_ARMOR_BOOTS.get());
			tabData.accept(FantasmodModItems.KRYSTALANITE_ARMOR_HELMET.get());
			tabData.accept(FantasmodModItems.KRYSTALANITE_ARMOR_CHESTPLATE.get());
			tabData.accept(FantasmodModItems.KRYSTALANITE_ARMOR_LEGGINGS.get());
			tabData.accept(FantasmodModItems.KRYSTALANITE_ARMOR_BOOTS.get());
			tabData.accept(FantasmodModItems.KRYSTALANITE_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(FantasmodModItems.WANDERER_SPAWN_EGG.get());
			tabData.accept(FantasmodModItems.TORMENTED_SOUL_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(FantasmodModItems.RAW_GREEN_ICE_ORE.get());
			tabData.accept(FantasmodModItems.GREEN_ICE_INGOT.get());
			tabData.accept(FantasmodModItems.RAW_KRYSTALANITE.get());
			tabData.accept(FantasmodModItems.HARDENED_KRYSTALANITE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(FantasmodModBlocks.NAVY_ICE.get().asItem());
			tabData.accept(FantasmodModBlocks.RED_NAVY_ICE.get().asItem());
			tabData.accept(FantasmodModBlocks.ORANGE_NAVY_ICE.get().asItem());
			tabData.accept(FantasmodModBlocks.GREEN_ICE_ORE.get().asItem());
			tabData.accept(FantasmodModBlocks.KRYSTALALANITEBLOCK.get().asItem());
			tabData.accept(FantasmodModBlocks.KRYSTALALANITE_ORE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(FantasmodModItems.ICE.get());
			tabData.accept(FantasmodModItems.KRYSTALANITE_PICKAXE.get());
			tabData.accept(FantasmodModItems.KRYSTALANITE_AXE.get());
			tabData.accept(FantasmodModItems.KRYSTALANITE_SHOVEL.get());
			tabData.accept(FantasmodModItems.KRYSTALANITE_HOE.get());
		}
	}
}
