
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fantasmod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.fantasmod.client.renderer.WandererRenderer;
import net.mcreator.fantasmod.client.renderer.TormentedSoulRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FantasmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FantasmodModEntities.WANDERER.get(), WandererRenderer::new);
		event.registerEntityRenderer(FantasmodModEntities.TORMENTED_SOUL.get(), TormentedSoulRenderer::new);
	}
}
