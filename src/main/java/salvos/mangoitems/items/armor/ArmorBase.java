package salvos.mangoitems.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import salvos.mangoitems.MangoItems;
import salvos.mangoitems.init.ModCreativeTabs;
import salvos.mangoitems.init.ModItems;
import salvos.mangoitems.util.IHasModel;
import salvos.mangoitems.util.Reference;

public class ArmorBase extends ItemArmor implements IHasModel {

    public ArmorBase(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot slot){
        super(material, renderIndex, slot);

        setUnlocalizedName(Reference.MOD_ID+"."+name);
        setRegistryName(name);
        setCreativeTab(ModCreativeTabs.CREATIVE_ARMOR);

        ModItems.items.add(this);
    }

    @Override
    public void registerModels() {
        MangoItems.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
