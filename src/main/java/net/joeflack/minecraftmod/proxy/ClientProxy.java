package net.joeflack.minecraftmod.proxy;

import net.joeflack.minecraftmod.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
	}
}
