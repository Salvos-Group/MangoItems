package salvos.mangoitems.proxy;

import com.google.common.collect.Ordering;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import salvos.mangoitems.game.blocks.ModOres;
import salvos.mangoitems.game.blocks.events.RightClickBlock;
import salvos.mangoitems.game.entities.ModEntities;
import salvos.mangoitems.game.entities.events.EntityInteract;
import salvos.mangoitems.game.init.*;
import salvos.mangoitems.game.items.ModItems;
import salvos.mangoitems.game.entities.rendering.RenderHandler;
import salvos.mangoitems.game.init.ChiselHelper;

import java.util.List;

public class CommonProxy {

    public void registerItemRenderer(Item item, int meta, String id){ }

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        ModOres.init();
        ModEntities.init();
        RenderHandler.registerEntityRenders();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
        ChiselHelper.init();
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        List<Item> order = ModItems.items;
        ModCreativeTabs.tabSorter = Ordering.explicit(order).onResultOf(ItemStack::getItem);

        //EVENTS
        MinecraftForge.EVENT_BUS.register(RightClickBlock.class);
        MinecraftForge.EVENT_BUS.register(EntityInteract.class);
    }

}
