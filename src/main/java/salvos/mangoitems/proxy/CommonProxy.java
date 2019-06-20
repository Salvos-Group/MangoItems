package salvos.mangoitems.proxy;

import com.google.common.collect.Ordering;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import salvos.mangoitems.init.ModCreativeTabs;
import salvos.mangoitems.init.ModItems;
import salvos.mangoitems.init.ModRecipes;
import salvos.mangoitems.util.helper.ChiselHelper;

import java.util.Arrays;
import java.util.List;

public class CommonProxy {

    public void registerItemRenderer(Item item, int meta, String id){ }

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {

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
    }

}
