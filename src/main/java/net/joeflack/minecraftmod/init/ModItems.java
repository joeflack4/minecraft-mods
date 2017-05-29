package net.joeflack.minecraftmod.init;

//import net.joeflack.minecraftmod.Reference;
import net.joeflack.minecraftmod.items.ItemCheese;
import net.joeflack.minecraftmod.items.ItemCracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item cheese;
	public static Item cracker;
//	public static Item[] items = new Item[2];
	
	public static void init() {
		cheese = new ItemCheese();
		cracker = new ItemCracker();		
	}
	
	public static void register() {
		final Item[] items = {cheese, cracker};
		for (Item item : items) {
			GameRegistry.register(item);
		}
//		GameRegistry.register(cheese);
	}
	
	public static void registerRenders() {
		final Item[] items = {cheese, cracker};
		for (Item item : items) {
			registerRender(item);
		}
//		registerRender(cheese);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
