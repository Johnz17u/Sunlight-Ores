package Nightlight.mods;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
	modid = SunlightOres112.MODID,
	name = SunlightOres112.NAME,
	version = SunlightOres112.VERSION
)
public class SunlightOres112 {
	public static final String MODID = "sunlightores";
	public static final String NAME = "SunlightOres 1.12";
	public static final String VERSION = "1.0";
	
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent preinit) {
		LOGGER.info("Hello, world!");
	}
}
