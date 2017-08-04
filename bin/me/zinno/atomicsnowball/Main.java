package me.zinno.atomicsnowball;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.zinno.atomicsnowball.event.entity.ProjectileHit;


public class Main extends JavaPlugin{
	public void onEnable() {
		registerEvent();
	}

	public void onDisable() {
	}

	public void registerEvent() {
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(new ProjectileHit(), this);
	}
	
}
