package salvos.mangoitems.game.items.base;

import net.minecraft.item.ItemFood;
import salvos.mangoitems.MangoItems;
import salvos.mangoitems.game.init.ModCreativeTabs;
import salvos.mangoitems.game.blocks.IHasModel;
import salvos.mangoitems.game.items.ModItems;
import salvos.mangoitems.util.Reference;

public class FoodBase extends ItemFood implements IHasModel {

    public FoodBase(String name, int amount, float saturation, boolean isWolfFood){
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
