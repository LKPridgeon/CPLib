package uk.clkpts.cplib;

import org.bukkit.plugin.java.JavaPlugin;
import org.fusesource.jansi.Ansi.Color;

public class CPLibLoad extends JavaPlugin{
	
	CPLib lib;
	
	public void onEnable(){
		lib = new CPLib(this);
		System.out.println(Color.RED + "~[ " + Color.GREEN + "Welcome to CPLib!" + Color.RED + " ]~");
		System.out.println(Color.GREEN + "> You have loaded CPLib in plugin mode.");
		System.out.println(Color.GREEN + "> Current Version is: " + lib.version);
		System.out.println(Color.GREEN + "> Debug is: " + lib.debug);
	}
	
	

}
