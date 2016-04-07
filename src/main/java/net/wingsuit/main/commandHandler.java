package net.wingsuit.main;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Boat;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class commandHandler extends BukkitCommand {
	
	@SuppressWarnings("unused")
	private main plugin;

	public commandHandler(String string) {
		super(string);
		this.description = "tp back to wingsuit spot";
	}
	
	public Block block;
	
	public boolean execute(CommandSender sender,
			String alias, String[] args) {
		Player player = (Player) sender;
		if(sender.equals(player)){
		
		if (alias.equalsIgnoreCase("Azunex")){
			final Boat boat = (Boat) player.getLocation().getWorld()
					.spawn(player.getLocation(), Boat.class);
			@SuppressWarnings("deprecation")
			FallingBlock falling = block.getLocation().getWorld().spawnFallingBlock(player.getLocation(), Material.POWERED_RAIL, (byte)0);
			falling.setVelocity(block.getLocation().getDirection());
			boat.setPassenger(player);
			boat.setPassenger(falling);
			player.getInventory().setHelmet(new ItemStack(Material.SAPLING, 1, (byte)4));
			}
		}
		
		if (alias.equalsIgnoreCase("Krymz")){
			final Boat boat = (Boat) player.getLocation().getWorld()
					.spawn(player.getLocation(), Boat.class);
			@SuppressWarnings("deprecation")
			FallingBlock falling = block.getLocation().getWorld().spawnFallingBlock(player.getLocation(), Material.ANVIL, (byte)2);
			falling.setVelocity(block.getLocation().getDirection());
			boat.setPassenger(player);
			boat.setPassenger(falling);
			player.getInventory().setHelmet(new ItemStack(Material.CARPET, 1, (byte)10));
			}
		
		return true;
	}
}
