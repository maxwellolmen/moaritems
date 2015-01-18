package dev.Maxwell3103.moaritems.items;

import cpw.mods.fml.common.registry.GameRegistry;
import dev.Maxwell3103.moaritems.MoarItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class DriedApple extends ItemFood {
	private final String name = "driedapple";
	
	public DriedApple(int food, float saturation, boolean wolfFood) {
		super(food, saturation, wolfFood);
		
		setUnlocalizedName(MoarItems.MODID + "_" + name);
		setTextureName(MoarItems.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabFood);
		
		GameRegistry.registerItem(this, name);
	}
	
	public String getName() {
		return name;
	}
}