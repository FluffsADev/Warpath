package com.fluffsadev.warpath.client.gui;

import com.fluffsadev.warpath.raidingmanagement.RaidManager;
import cpw.mods.fml.client.config.GuiSlider;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class GuiRaidConfig extends GuiScreen {

    // Example config values
    private GuiSlider raidLevelScale;
    private GuiButton raidLevelConfig;

    @Override
    public void initGui() {
        int centerX = this.width / 2;
        int centerY = this.height / 2;

        // Slider for raid difficulty (0 to 10)
        String currentDifficulty = "Normal";
        this.raidLevelScale = new GuiSlider(0, centerX - 100, centerY - 20, 200, 20, "Difficulty: ", "", 0, 5, currentDifficulty, false, true);
        this.buttonList.add(raidLevelScale);

        // Start raid button
        this.raidLevelConfig = new GuiButton(1, centerX - 100, centerY + 10, 200, 20, "Start Raid");
        this.buttonList.add(raidLevelConfig);
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if (button.id == 1) {
            // Logic to start the raid using the current slider value
            int difficulty = (int) raidLevelScale.getValue();
            // Call your raid start method here
            RaidManager.startRaid(difficulty);
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, "Raid Configuration", this.width / 2, 20, 0xFFFFFF);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
}
