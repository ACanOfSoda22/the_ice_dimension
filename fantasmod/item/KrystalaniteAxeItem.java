
package net.mcreator.fantasmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.fantasmod.init.FantasmodModItems;

public class KrystalaniteAxeItem extends AxeItem {
	public KrystalaniteAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 660;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(FantasmodModItems.HARDENED_KRYSTALANITE.get()));
			}
		}, 1, 2f, new Item.Properties());
	}
}
