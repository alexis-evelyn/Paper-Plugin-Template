package me.alexisevelyn.projectname;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.Chunk;
import org.bukkit.ChunkSnapshot;

import java.util.Random;

import org.bukkit.ChatColor;

// https://papermc.io/javadocs/paper/1.15/org/bukkit/Chunk.html
// https://papermc.io/javadocs/paper/1.15/org/bukkit/ChunkSnapshot.html

public class Commands implements CommandExecutor {
	private Plugin plugin = Main.getPlugin(Main.class);
	Random rand = new Random();

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if(command.getName().equalsIgnoreCase("commandOne")) {
			if (sender instanceof Player) {
				boolean generateChunk = true;
				sender.sendMessage(ChatColor.GOLD + "Command One!!!");

				// ((Player) sender).getWorld().getChunkAtAsync(rand.nextInt(100), rand.nextInt(100), generateChunk);
				//
				// ((Player) sender).setAbsorptionAmount(Double.MAX_VALUE);
				//
				// ((Player) sender).setFoodLevel(Integer.MAX_VALUE);
				// ((Player) sender).setSaturation(Float.MAX_VALUE);
			} else {
				sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Only Players Can Run This Command!!!");
				return true;
			}

			return true;
		} else if(command.getName().equalsIgnoreCase("commandTwo")) {
			if (sender instanceof Player) {
				boolean generateChunk = true;
				sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Command Two!!!");

				// for(int x = 0; x < 100; x++) {
				// 	((Player) sender).getWorld().getChunkAtAsync(rand.nextInt(100), rand.nextInt(100), generateChunk);
				// }
			} else {
				sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Only Players Can Run This Command!!!");
				return true;
			}

			return true;
		}

		return false;
	}
}
