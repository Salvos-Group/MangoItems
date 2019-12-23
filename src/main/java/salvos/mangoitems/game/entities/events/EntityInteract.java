package salvos.mangoitems.game.entities.events;

import net.minecraft.entity.Entity;
import net.minecraft.util.EnumHand;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EntityInteract {

    @SubscribeEvent
    public static void entityInteract(PlayerInteractEvent.EntityInteractSpecific event){
        if(event.getSide().isClient()) return;
        if(event.getHand().equals(EnumHand.OFF_HAND)) return;

        Entity target = event.getTarget();
    }

}
