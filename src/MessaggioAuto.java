
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MessaggioAuto extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Il plugin è stato abilitato.");
        getServer().getScheduler().runTaskTimer(this, this::Messaggio, 0, 5 * 60 * 20); // 5 minuti = 5 * 60 * 20 ticks (20 ticks compongono 1 secondo)
    }

    private void Messaggio() {

        Bukkit.broadcastMessage("Acquista un pacchetto vip per usufruire dei vantaggi esclusivi");
    }

    @Override
    public void onDisable() {
        getLogger().info("Il plugin è stato disabilitato.");

    }
}