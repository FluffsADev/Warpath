package com.fluffsadev.warpath.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class GuiRaidControl extends GuiScreen {

    @Override
    public void initGui() {
        int centerX = this.width / 2;
        int centerY = this.height / 2;
        this.buttonList.clear();

        this.buttonList.add(new GuiButton(0, centerX - 100, centerY - 20, 200, 20, "Start Raid"));
        this.buttonList.add(new GuiButton(1, centerX - 100, centerY + 10, 200, 20, "Cancel"));
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        switch (button.id) {
            case 0:
                // Start raid logic here
                mc.thePlayer.sendChatMessage("/startraid"); // just a placeholder
                break;
            case 1:
                mc.displayGuiScreen(null); // closes the GUI
                break;
        }
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        drawCenteredString(this.fontRendererObj, "Raid Control Panel", this.width / 2, this.height / 2 - 60, 0xFFFFFF);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
}

