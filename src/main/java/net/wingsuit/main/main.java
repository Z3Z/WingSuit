package net.wingsuit.main;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.craftbukkit.v1_9_R1.CraftServer;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener{
	
	public void onEnable(){
		loadListeners();
		loadCommands();
		ConsoleCommandSender console = Bukkit.getConsoleSender();
		console.sendMessage("ENABLED");
	}
	
	public void onDisable(){
		ConsoleCommandSender console = Bukkit.getConsoleSender();
		console.sendMessage("DISABLED");
	}
	
	public void loadListeners(){
		//PluginManager pm = Bukkit.getPluginManager();
	}
	
	public void loadCommands(){
		((CraftServer) this.getServer()).getCommandMap().register("Azunex", new commandHandler("Azunex"));
		((CraftServer) this.getServer()).getCommandMap().register("Krymz", new commandHandler("Krymz"));
	}
}
