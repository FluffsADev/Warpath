package com.fluffsadev.warpath.raidingmanagement;

import com.fluffsadev.warpath.Warpath;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;

public class RaidConfigCommand extends CommandBase {

    @Override
    public String getCommandName() {
        return "raidconfig";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/raidconfig - Opens the raid config panel";
    }

    @Override
    public void processCommand(ICommandSender p_71515_1_, String[] p_71515_2_) {

    }


    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if (!(sender instanceof EntityPlayerMP)) {
            sender.addChatMessage(new ChatComponentText("Only players can run this command."));
            return;
        }

        EntityPlayerMP player = (EntityPlayerMP) sender;

        // Check if player has permission (OP or above)
        if (sender.canCommandSenderUseCommand(2, "raidconfig")) {
            // Open GUI
        }
        else {
            sender.addChatMessage(new ChatComponentText("You don't have permission to use this."));
        }

        // Open your custom GUI
        player.openGui(Warpath.instance, 5, player.worldObj, 0, 0, 0);
    }
}
