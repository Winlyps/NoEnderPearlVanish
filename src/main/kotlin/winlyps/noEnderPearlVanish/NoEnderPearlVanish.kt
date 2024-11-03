package winlyps.noEnderPearlVanish

import org.bukkit.plugin.java.JavaPlugin

class NoEnderPearlVanish : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("enderPearlsVanishOnDeath", "false")
        }
        logger.info("NoEnderPearlVanish plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("enderPearlsVanishOnDeath", "true")
            logger.info("NoEnderPearlVanish plugin has been disabled.")
        }
    }
}