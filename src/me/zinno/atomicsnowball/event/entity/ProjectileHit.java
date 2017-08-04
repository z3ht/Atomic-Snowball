package me.zinno.atomicsnowball.event.entity;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class ProjectileHit implements Listener {
	
	@EventHandler
	public void onProjectileHit(ProjectileHitEvent event) {
		if(event.getEntity() instanceof Snowball) {
			World world = event.getEntity().getWorld();
			Location loc;
			if(event.getHitBlock() == null)loc = event.getHitEntity().getLocation();
			else loc = event.getHitBlock().getLocation();
			world.createExplosion(loc, 6F, true);
			world.spawnParticle(Particle.FLAME, loc, 500, 2, 2, 2);
			world.playSound(loc, Sound.ENTITY_GENERIC_EXPLODE, 1, .25F);
		}
	}
}
