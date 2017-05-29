package net.joeflack.minecraftmod;

import net.joeflack.minecraftmod.init.ModBlocks;
import net.joeflack.minecraftmod.init.ModItems;
import net.joeflack.minecraftmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.NAME, version=Reference.VERSION, acceptedMinecraftVersions=Reference.ACCEPTED_VERSIONS)
public class JoeysMod {

	@Instance
	public static JoeysMod instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModItems.register();
		ModBlocks.init();
		ModBlocks.register();		
		System.out.println("Pre-initialization complete.");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
		System.out.println("Initialization complete.");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		System.out.println("Post Initialization complete.");
	}
}
