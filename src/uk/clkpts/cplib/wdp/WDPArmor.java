package uk.clkpts.cplib.wdp;

import java.util.UUID;

import org.bukkit.Color;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.Plugin;

public class WDPArmor {
	
	@SuppressWarnings("unused")
	private final Plugin plugin;
	
	public WDPArmor(Plugin plugin){
		this.plugin = plugin;
	}
	
	  public ItemStack getArmor(ItemStack item, String name, String cols, int R, int G, int B) {
	      LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
	      if(cols != null){
	    	  if(cols.equalsIgnoreCase("aqua")){meta.setColor(Color.AQUA);}
	    	  else if(cols.equalsIgnoreCase("black")){meta.setColor(Color.BLACK);}
	    	  else if(cols.equalsIgnoreCase("blue")){meta.setColor(Color.BLUE);}
	    	  else if(cols.equalsIgnoreCase("fushia")){meta.setColor(Color.FUCHSIA);}
	    	  else if(cols.equalsIgnoreCase("gray")){meta.setColor(Color.GRAY);}
	    	  else if(cols.equalsIgnoreCase("green")){meta.setColor(Color.GREEN);}
	    	  else if(cols.equalsIgnoreCase("lime")){meta.setColor(Color.LIME);}
	    	  else if(cols.equalsIgnoreCase("brown")){meta.setColor(Color.MAROON);}
	    	  else if(cols.equalsIgnoreCase("navy")){meta.setColor(Color.NAVY);}
	    	  else if(cols.equalsIgnoreCase("olive")){meta.setColor(Color.OLIVE);}
	    	  else if(cols.equalsIgnoreCase("orange")){meta.setColor(Color.ORANGE);}
	    	  else if(cols.equalsIgnoreCase("purple")){meta.setColor(Color.PURPLE);}
	    	  else if(cols.equalsIgnoreCase("red")){meta.setColor(Color.RED);}
	    	  else if(cols.equalsIgnoreCase("silver")){meta.setColor(Color.SILVER);}
	    	  else if(cols.equalsIgnoreCase("teal")){meta.setColor(Color.TEAL);}
	    	  else if(cols.equalsIgnoreCase("custom"))
	    	  {
	    		  meta.setColor(Color.fromRGB(R,G,B));
	    	  }
	    	  else{System.out.println("WDP: Colour Error #1");}
	      }
	      else{System.out.println("WDP: Colour Error #2");}
	      meta.setDisplayName(name);
	      item.setItemMeta(meta);
	      return item;
	  }
	  
	  public ItemStack getHead(ItemStack item, UUID nick) {
	      SkullMeta meta = (SkullMeta) item.getItemMeta();
	      meta.setOwner(nick.toString());
	      item.setItemMeta(meta);
	      return item;
	  }
	  
}
