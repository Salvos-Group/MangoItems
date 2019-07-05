package salvos.mangoitems.items.tools;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSword;
import salvos.mangoitems.MangoItems;
import salvos.mangoitems.init.ModCreativeTabs;
import salvos.mangoitems.init.ModItems;
import salvos.mangoitems.util.IHasModel;
import salvos.mangoitems.util.Reference;

public class AxeBase extends ItemHoe implements IHasModel {

    public AxeBase(String name, ToolMaterial material){
        super(material);

        setUnlocalizedName(Reference.MOD_ID+"."+name);
        setRegistryName(name);
        setCreativeTab(ModCreativeTabs.CREATIVE_TOOLS);

        ModItems.items.add(this);
    }

    @Override
    public void registerModels() {
        MangoItems.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
