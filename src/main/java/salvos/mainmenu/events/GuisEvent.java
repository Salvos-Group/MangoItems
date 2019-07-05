package salvos.mainmenu.events;

import net.minecraft.client.gui.GuiMainMenu;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GuisEvent {

    @SubscribeEvent
    public static void invte(GuiOpenEvent e) {
        if (e.getGui() != null) {
            if(e.getGui() instanceof GuiMainMenu){

            }
        }
    }

}
