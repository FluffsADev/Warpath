package com.fluffsadev.warpath;

import com.fluffsadev.warpath.client.gui.GuiEventHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Warpath.MODID, version = Warpath.VERSION, name = Warpath.NAME)
public class Warpath {
    @Mod.Instance("warpath")
    public static Warpath instance;

    public static final String MODID = "warpath";
    public static final String VERSION = "1.0.0";
    public static final String NAME = "Warpath";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Config, blocks/items, register events here
        System.out.println("[" + NAME + "] PreInit");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // Recipes, world gen, tile entities
        System.out.println("[" + NAME + "] Init");
        MinecraftForge.EVENT_BUS.register(new GuiEventHandler());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // Cross-mod stuff
        System.out.println("[" + NAME + "] PostInit");
    }
}
