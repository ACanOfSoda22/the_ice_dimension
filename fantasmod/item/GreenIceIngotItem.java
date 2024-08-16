
package net.mcreator.fantasmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GreenIceIngotItem extends Item {
	public GreenIceIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
