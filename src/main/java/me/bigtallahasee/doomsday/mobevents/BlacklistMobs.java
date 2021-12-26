package me.bigtallahasee.doomsday.mobevents;

import me.bigtallahasee.doomsday.Doomsday;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.Plugin;

public class BlacklistMobs implements Listener {
    Plugin plugin = Doomsday.getPlugin(Doomsday.class);

    //All of the Hostile Mobs will be done below

    @EventHandler
    public void onBabyZombieSpawn(CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Zombie) {
            Zombie z = (Zombie)e.getEntity();
            if (z.isVillager())
                e.setCancelled(true);
        }
    }

    @EventHandler
    public void onSkeletonSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Skeleton") &&
                e.getEntity() instanceof org.bukkit.entity.Skeleton)
            e.setCancelled(true);
    }

    @EventHandler
    public void onSpiderSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Spider") &&
                e.getEntity() instanceof org.bukkit.entity.Spider)
            e.setCancelled(true);
    }

    @EventHandler
    public void onSlimeSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Slime") &&
                e.getEntity() instanceof org.bukkit.entity.Slime)
            e.setCancelled(true);
    }

    @EventHandler
    public void onEndermanSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Enderman") &&
                e.getEntity() instanceof org.bukkit.entity.Enderman)
            e.setCancelled(true);
    }

    @EventHandler
    public void onWitchSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Witch") &&
                e.getEntity() instanceof org.bukkit.entity.Witch)
            e.setCancelled(true);
    }
    @EventHandler
    public void onCreeperSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Creeper") &&
                e.getEntity() instanceof org.bukkit.entity.Creeper)
            e.setCancelled(true);
    }
    @EventHandler
    public void onCaveSpiderSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Cave-Spider") &&
                e.getEntity() instanceof org.bukkit.entity.CaveSpider)
            e.setCancelled(true);
    }
    @EventHandler
    public void onZombiePigmanSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Zombie-Pigman") &&
                e.getEntity() instanceof org.bukkit.entity.PigZombie)
            e.setCancelled(true);
    }
    @EventHandler
    public void onPiglinSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Piglin") &&
                e.getEntity() instanceof org.bukkit.entity.Piglin)
            e.setCancelled(true);
    }
    @EventHandler
    public void onEvokerSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Evoker") &&
                e.getEntity() instanceof org.bukkit.entity.Evoker)
            e.setCancelled(true);
    }
        @EventHandler
        public void onVindicatorSpawn(CreatureSpawnEvent e) {
            if (plugin.getConfig().getBoolean("Block-Vindicator") &&
                    e.getEntity() instanceof org.bukkit.entity.Vindicator)
                e.setCancelled(true);
        }
    @EventHandler
    public void onPillagerSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Pillager") &&
                e.getEntity() instanceof org.bukkit.entity.Pillager)
            e.setCancelled(true);
    }
    @EventHandler
    public void onRavagerSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Ravager") &&
                e.getEntity() instanceof org.bukkit.entity.Ravager)
            e.setCancelled(true);
    }
    @EventHandler
    public void onVexSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Vex") &&
                e.getEntity() instanceof org.bukkit.entity.Vex)
            e.setCancelled(true);
    }
    @EventHandler
    public void onEndermiteSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Endermite") &&
                e.getEntity() instanceof org.bukkit.entity.Endermite)
            e.setCancelled(true);
    }
    @EventHandler
    public void onGuardianSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Guardian") &&
                e.getEntity() instanceof org.bukkit.entity.Guardian)
            e.setCancelled(true);
    }
    @EventHandler
    public void onElderGuardianSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Elder-Guardian") &&
                e.getEntity() instanceof org.bukkit.entity.ElderGuardian)
            e.setCancelled(true);
    }
    @EventHandler
    public void onShulkerSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Shulker") &&
                e.getEntity() instanceof org.bukkit.entity.Shulker)
            e.setCancelled(true);
    }
    @EventHandler
    public void onHuskSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Husk") &&
                e.getEntity() instanceof org.bukkit.entity.Husk)
            e.setCancelled(true);
    }
    @EventHandler
    public void onStraySpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Stray") &&
                e.getEntity() instanceof org.bukkit.entity.Stray)
            e.setCancelled(true);
    }
    @EventHandler
    public void onPhantomSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Phantom") &&
                e.getEntity() instanceof org.bukkit.entity.Phantom)
            e.setCancelled(true);
    }
    @EventHandler
    public void onBlazeSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Blaze") &&
                e.getEntity() instanceof org.bukkit.entity.Blaze)
            e.setCancelled(true);
    }
    @EventHandler
    public void onGhastSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Ghast") &&
                e.getEntity() instanceof org.bukkit.entity.Ghast)
            e.setCancelled(true);
    }
    @EventHandler
    public void onMagmaCubeSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Magma-Cube") &&
                e.getEntity() instanceof org.bukkit.entity.MagmaCube)
            e.setCancelled(true);
    }
    @EventHandler
    public void onSilverFishSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Silverfish") &&
                e.getEntity() instanceof org.bukkit.entity.Silverfish)
            e.setCancelled(true);
    }
    @EventHandler
    public void onZombieVillagerSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Zombie-Villager") &&
                e.getEntity() instanceof org.bukkit.entity.ZombieVillager)
            e.setCancelled(true);
    }
    @EventHandler
    public void onDrownedSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Drowned") &&
                e.getEntity() instanceof org.bukkit.entity.Drowned)
            e.setCancelled(true);
    }
    @EventHandler
    public void onWitherSkeletonSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Wither-Skeleton") &&
                e.getEntity() instanceof org.bukkit.entity.WitherSkeleton)
            e.setCancelled(true);
    }
    @EventHandler
    public void onHoglinSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Hoglin") &&
                e.getEntity() instanceof org.bukkit.entity.Hoglin)
            e.setCancelled(true);
    }
    @EventHandler
    public void onZoglinSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Zoglin") &&
                e.getEntity() instanceof org.bukkit.entity.Zoglin)
            e.setCancelled(true);
    }
    @EventHandler
    public void onPiglinBruteSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Piglin-Brute") &&
                e.getEntity() instanceof org.bukkit.entity.PiglinBrute)
            e.setCancelled(true);
    }
    @EventHandler
    public void onEnderDragonSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Ender-Dragon") &&
                e.getEntity() instanceof org.bukkit.entity.EnderDragon)
            e.setCancelled(true);
    }
    @EventHandler
    public void onWitherSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Wither") &&
                e.getEntity() instanceof org.bukkit.entity.Wither)
            e.setCancelled(true);
    }

    //All Passive mobs will be down below here!

    @EventHandler
    public void onVillagerSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Villager") &&
                e.getEntity() instanceof org.bukkit.entity.Villager)
            e.setCancelled(true);
    }

    @EventHandler
    public void onChickenSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Chicken") &&
                e.getEntity() instanceof org.bukkit.entity.Chicken)
            e.setCancelled(true);
    }

    @EventHandler
    public void onCowSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Cow") &&
                e.getEntity() instanceof org.bukkit.entity.Cow)
            e.setCancelled(true);
    }

    @EventHandler
    public void onSheepSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Sheep") &&
                e.getEntity() instanceof org.bukkit.entity.Sheep)
            e.setCancelled(true);
    }

    @EventHandler
    public void onRabbitSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Rabbit") &&
                e.getEntity() instanceof org.bukkit.entity.Rabbit)
            e.setCancelled(true);
    }

    @EventHandler
    public void onOcelotSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Ocelot") &&
                e.getEntity() instanceof org.bukkit.entity.Ocelot)
            e.setCancelled(true);
    }

    @EventHandler
    public void onWolfSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Wolf") &&
                e.getEntity() instanceof org.bukkit.entity.Wolf)
            e.setCancelled(true);
    }

    @EventHandler
    public void onHorseSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Horse") &&
                e.getEntity() instanceof org.bukkit.entity.Horse)
            e.setCancelled(true);
    }

    @EventHandler
    public void onPigSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Pig") &&
                e.getEntity() instanceof org.bukkit.entity.Pig)
            e.setCancelled(true);
    }
    @EventHandler
    public void onFoxSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Fox") &&
                e.getEntity() instanceof org.bukkit.entity.Fox)
            e.setCancelled(true);
    }
    @EventHandler
    public void onBatSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Bat") &&
                e.getEntity() instanceof org.bukkit.entity.Bat)
            e.setCancelled(true);
    }
    @EventHandler
    public void onCodSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Cod") &&
                e.getEntity() instanceof org.bukkit.entity.Cod)
            e.setCancelled(true);
    }
    @EventHandler
    public void onSalmonSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Salmon") &&
                e.getEntity() instanceof org.bukkit.entity.Salmon)
            e.setCancelled(true);
    }
    @EventHandler
    public void onMooshromSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Mooshrom") &&
                e.getEntity() instanceof org.bukkit.entity.MushroomCow)
            e.setCancelled(true);
    }
    @EventHandler
    public void onSquidSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Squid") &&
                e.getEntity() instanceof org.bukkit.entity.Squid)
            e.setCancelled(true);
    }
    @EventHandler
    public void onStriderSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Strider") &&
                e.getEntity() instanceof org.bukkit.entity.Strider)
            e.setCancelled(true);
    }
    @EventHandler
    public void onTropicalFishSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Tropical-Fish") &&
                e.getEntity() instanceof org.bukkit.entity.TropicalFish)
            e.setCancelled(true);
    }
    @EventHandler
    public void onTurtleSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Turtle") &&
                e.getEntity() instanceof org.bukkit.entity.Cod)
            e.setCancelled(true);
    }
    @EventHandler
    public void onWanderingTraderSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Wandering-Trader") &&
                e.getEntity() instanceof org.bukkit.entity.WanderingTrader)
            e.setCancelled(true);
    }
    @EventHandler
    public void onPufferFishSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Pufferfish") &&
                e.getEntity() instanceof org.bukkit.entity.PufferFish)
            e.setCancelled(true);
    }
    @EventHandler
    public void onAxolotlSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Axolotl") &&
                e.getEntity() instanceof org.bukkit.entity.Axolotl)
            e.setCancelled(true);
    }
    @EventHandler
    public void onGlowSquidSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Glow-Squid") &&
                e.getEntity() instanceof org.bukkit.entity.GlowSquid)
            e.setCancelled(true);
    }
    @EventHandler
    public void onDonkeySpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Donkey") &&
                e.getEntity() instanceof org.bukkit.entity.Donkey)
            e.setCancelled(true);
    }
    @EventHandler
    public void onCatSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Cat") &&
                e.getEntity() instanceof org.bukkit.entity.Cat)
            e.setCancelled(true);
    }
    @EventHandler
    public void onParrotSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Parrot") &&
                e.getEntity() instanceof org.bukkit.entity.Parrot)
            e.setCancelled(true);
    }
    @EventHandler
    public void onMuleSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Mule") &&
                e.getEntity() instanceof org.bukkit.entity.Mule)
            e.setCancelled(true);
    }
    @EventHandler
    public void onDolphinSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Dolphin") &&
                e.getEntity() instanceof org.bukkit.entity.Dolphin)
            e.setCancelled(true);
    }

    //All neutral mobs are listed below!
    @EventHandler
    public void onPolarBearSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Polar-Bear") &&
                e.getEntity() instanceof org.bukkit.entity.PolarBear)
            e.setCancelled(true);
    }
    @EventHandler
    public void onTraderLlamaSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Trader-Llama") &&
                e.getEntity() instanceof org.bukkit.entity.TraderLlama)
            e.setCancelled(true);
    }
    @EventHandler
    public void onLlamaSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Llama") &&
                e.getEntity() instanceof org.bukkit.entity.Llama)
            e.setCancelled(true);
    }
    @EventHandler
    public void onPandaSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Panda") &&
                e.getEntity() instanceof org.bukkit.entity.Panda)
            e.setCancelled(true);
    }
    @EventHandler
    public void onBeeSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Bee") &&
                e.getEntity() instanceof org.bukkit.entity.Bee)
            e.setCancelled(true);
    }
    @EventHandler
    public void onIronGolemSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Iron-Golem") &&
                e.getEntity() instanceof org.bukkit.entity.IronGolem)
            e.setCancelled(true);
    }
    @EventHandler
    public void onGoatSpawn(CreatureSpawnEvent e) {
        if (plugin.getConfig().getBoolean("Block-Goat") &&
                e.getEntity() instanceof org.bukkit.entity.Goat)
            e.setCancelled(true);
    }
}
