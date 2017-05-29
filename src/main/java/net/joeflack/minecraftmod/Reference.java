package net.joeflack.minecraftmod;

public class Reference {
	
	public static final String MOD_ID = "joey";
	public static final String NAME = "Joey's Mod";
	public static final String VERSION = "0.1.0";
	public static final String ACCEPTED_VERSIONS = "[1.9.4]";
	
	public static final String CLIENT_PROXY_CLASS = "net.joeflack.minecraftmod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "net.joeflack.minecraftmod.proxy.ServerProxy";
	
	// Enum's can hold constants and methods, etc. The constants are defined first, each with a number of attributes.
	// The identifiers for these attributes are defined below, and apply in order of the attributes listed. Then methods are defined.
	public static enum ModItems {
		CHEESE("cheese", "ItemCheese"),
		CRACKER("cracker", "ItemCracker");
		
		private String unlocalizedName;
		private String registryName;
		
		ModItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
	
	public static enum ModBlocks {
		CHEESE("cheese", "BlockCheese");
		
		private String unlocalizedName;
		private String registryName;
		
		ModBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}

}
