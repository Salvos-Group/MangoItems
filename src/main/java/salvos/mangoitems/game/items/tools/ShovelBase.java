package salvos.mangoitems.game.items.tools;

import net.minecraft.item.ItemSpade;
import salvos.mangoitems.MangoItems;
import salvos.mangoitems.game.init.ModCreativeTabs;
import salvos.mangoitems.game.items.ModItems;
import salvos.mangoitems.game.blocks.IHasModel;
import salvos.mangoitems.util.Reference;

public class ShovelBase extends ItemSpade implements IHasModel {

    public ShovelBase(String name, ToolMaterial material){
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
