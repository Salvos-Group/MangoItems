package salvos.mangoitems.items;

import net.minecraft.item.Item;
import salvos.mangoitems.MangoItems;
import salvos.mangoitems.init.ModCreativeTabs;
import salvos.mangoitems.init.ModItems;
import salvos.mangoitems.util.IHasModel;

public class ItemMangoWrench extends Item implements IHasModel {

    public ItemMangoWrench(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModCreativeTabs.CREATIVE_TOOLS);
        setMaxStackSize(1);

        ModItems.items.add(this);
    }

    @Override
    public void registerModels() {
        MangoItems.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
