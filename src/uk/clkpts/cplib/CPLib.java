package uk.clkpts.cplib;

import java.util.HashMap;

import org.bukkit.plugin.Plugin;

import uk.clkpts.cplib.wdp.WDP;

public class CPLib {
	
	// Information
	public String version = "Alpha 1";
	public boolean debug = true;
	
	// Settings
	public boolean loadAll = true;
	
	// Classes
	public HashMap<String, Object> load = new HashMap<String, Object>();
	
	// Initialise
	public CPLib(Plugin plugin){
		WDP wdp = new WDP(plugin);
		load.put("wdp", wdp);
		load.put("data", null);
		load.put("social", null);
	}
	
	public Object load(String classname){
		if(load.get(classname) != null){
			return load.get(classname);
		}
		else
		{
			CPFallback error = new CPFallback(classname);
			return error;
		}
		
	}
	
}
