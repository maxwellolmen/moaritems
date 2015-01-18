package dev.Maxwell3103.moaritems;

import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import dev.Maxwell3103.moaritems.blocks.CopperOre;
import dev.Maxwell3103.moaritems.items.BreadSlice;
import dev.Maxwell3103.moaritems.items.DriedApple;
import dev.Maxwell3103.moaritems.items.ToastSlice;

@Mod(modid = MoarItems.MODID, version = MoarItems.VERSION)
public class MoarItems {
	public static final String MODID = "moar_items";
	public static final String VERSION = "1.1";
	
	public static DriedApple driedapple;
	public static BreadSlice breadslice;
	public static ToastSlice toastslice;
	
	public static CopperOre copperore;
	
	@EventHandler
	public void preInit(FMLInitializationEvent event) {
		driedapple = new DriedApple(6, (float) 3.6, false);
		breadslice = new BreadSlice(1, (float) 1.44, false);
		toastslice = new ToastSlice(4, (float) 2.88, false);
		
		copperore = new CopperOre();
		
		CopperEventHandler oeh = new CopperEventHandler();
		GameRegistry.registerWorldGenerator(oeh, 0);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.addShapelessRecipe(new ItemStack(breadslice, 5), Items.bread);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.bread), breadslice, breadslice, breadslice, breadslice, breadslice);
		
		GameRegistry.addSmelting(new ItemStack(Items.apple), new ItemStack(driedapple), (float) 0.35);
		GameRegistry.addSmelting(new ItemStack(breadslice), new ItemStack(toastslice), (float) 0.35);
	}
}