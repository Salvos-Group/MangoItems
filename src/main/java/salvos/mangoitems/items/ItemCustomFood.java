package salvos.mangoitems.items;

import net.minecraft.item.ItemFood;
import salvos.mangoitems.MangoItems;
import salvos.mangoitems.init.ModCreativeTabs;
import salvos.mangoitems.init.ModItems;
import salvos.mangoitems.util.IHasModel;
import salvos.mangoitems.util.Reference;

public class ItemCustomFood extends ItemFood implements IHasModel {

    public ItemCustomFood(String name, int amount, float saturation, boolean isWolfFood){
        super(amount, saturation, isWolfFood);

        setUnlocalizedName(Reference.MOD_ID+"."+name);
        setRegistryName(name);
        setCreativeTab(ModCreativeTabs.CREATIVE_FOOD);

        ModItems.items.add(this);
    }

    @Override
    public void registerModels() {
        MangoItems.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
