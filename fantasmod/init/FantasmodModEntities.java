
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fantasmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.fantasmod.entity.WandererEntity;
import net.mcreator.fantasmod.entity.TormentedSoulEntity;
import net.mcreator.fantasmod.FantasmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FantasmodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, FantasmodMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<WandererEntity>> WANDERER = register("wanderer",
			EntityType.Builder.<WandererEntity>of(WandererEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TormentedSoulEntity>> TORMENTED_SOUL = register("tormented_soul",
			EntityType.Builder.<TormentedSoulEntity>of(TormentedSoulEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			WandererEntity.init();
			TormentedSoulEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WANDERER.get(), WandererEntity.createAttributes().build());
		event.put(TORMENTED_SOUL.get(), TormentedSoulEntity.createAttributes().build());
	}
}
