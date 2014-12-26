package uk.clkpts.cplib;

import org.fusesource.jansi.Ansi.Color;

public class CPFallback {
	public CPFallback(String name){
		System.out.println(Color.RED + "~[ " + Color.YELLOW + "CPLib Error!" + Color.RED + " ]~");
		System.out.println(Color.RED + "> " + Color.YELLOW + "Oops we could not find " + name);
	}
}
