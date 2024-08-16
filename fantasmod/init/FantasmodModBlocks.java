
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fantasmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.fantasmod.block.RedNavyIceBlock;
import net.mcreator.fantasmod.block.PinkKrystalalaniteRockBlock;
import net.mcreator.fantasmod.block.OrangeNavyIceBlock;
import net.mcreator.fantasmod.block.OrangeIceBricksBlock;
import net.mcreator.fantasmod.block.NavyIceBlock;
import net.mcreator.fantasmod.block.KrystalaniteBlockBlock;
import net.mcreator.fantasmod.block.KrystalalaniteblockBlock;
import net.mcreator.fantasmod.block.KrystalalaniteOreBlock;
import net.mcreator.fantasmod.block.IcePortalBlock;
import net.mcreator.fantasmod.block.GreenIceOreBlock;
import net.mcreator.fantasmod.FantasmodMod;

public class FantasmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, FantasmodMod.MODID);
	public static final DeferredHolder<Block, Block> NAVY_ICE = REGISTRY.register("navy_ice", () -> new NavyIceBlock());
	public static final DeferredHolder<Block, Block> ICE_PORTAL = REGISTRY.register("ice_portal", () -> new IcePortalBlock());
	public static final DeferredHolder<Block, Block> RED_NAVY_ICE = REGISTRY.register("red_navy_ice", () -> new RedNavyIceBlock());
	public static final DeferredHolder<Block, Block> ORANGE_NAVY_ICE = REGISTRY.register("orange_navy_ice", () -> new OrangeNavyIceBlock());
	public static final DeferredHolder<Block, Block> GREEN_ICE_ORE = REGISTRY.register("green_ice_ore", () -> new GreenIceOreBlock());
	public static final DeferredHolder<Block, Block> KRYSTALALANITEBLOCK = REGISTRY.register("krystalalaniteblock", () -> new KrystalalaniteblockBlock());
	public static final DeferredHolder<Block, Block> KRYSTALALANITE_ORE = REGISTRY.register("krystalalanite_ore", () -> new KrystalalaniteOreBlock());
	public static final DeferredHolder<Block, Block> ORANGE_ICE_BRICKS = REGISTRY.register("orange_ice_bricks", () -> new OrangeIceBricksBlock());
	public static final DeferredHolder<Block, Block> PINK_KRYSTALALANITE_ROCK = REGISTRY.register("pink_krystalalanite_rock", () -> new PinkKrystalalaniteRockBlock());
	public static final DeferredHolder<Block, Block> KRYSTALANITE_BLOCK = REGISTRY.register("krystalanite_block", () -> new KrystalaniteBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
