package uk.clkpts.cplib.wdp;

import org.bukkit.plugin.Plugin;

public class WDP {
	WDPArmor armor;
	
	public WDP(Plugin plugin){
		armor = new WDPArmor(plugin);
	}
}
