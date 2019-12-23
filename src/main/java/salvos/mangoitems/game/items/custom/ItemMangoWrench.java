package salvos.mangoitems.game.items.custom;

import net.minecraft.item.Item;
import salvos.mangoitems.MangoItems;
import salvos.mangoitems.game.init.ModCreativeTabs;
import salvos.mangoitems.game.items.ModItems;
import salvos.mangoitems.game.blocks.IHasModel;
import salvos.mangoitems.util.Reference;

public class ItemMangoWrench extends Item implements IHasModel {

    public ItemMangoWrench(String name){
        setUnlocalizedName(Reference.MOD_ID+"."+name);
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
