package com.fluffsadev.warpath.client.gui;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraftforge.client.event.GuiScreenEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;

public class GuiEventHandler {

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void onGuiInit(GuiScreenEvent.InitGuiEvent.Post event) {
        if (event.gui instanceof GuiIngameMenu) {
            int x = event.gui.width / 2 - 100;
            int y = event.gui.height / 4 + 128;

            event.buttonList.add(new GuiButton(6969, x, y, 200, 20, "Raid Control"));
        }
    }

    @SubscribeEvent
    public void onActionPerformed(GuiScreenEvent.ActionPerformedEvent.Post event) {
        if (event.button.id == 6969) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiRaidControl());
        }
    }
}
