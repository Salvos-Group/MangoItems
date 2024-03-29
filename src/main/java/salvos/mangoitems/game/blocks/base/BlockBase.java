package salvos.mangoitems.game.blocks.base;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import salvos.mangoitems.MangoItems;
import salvos.mangoitems.game.blocks.IHasModel;
import salvos.mangoitems.game.blocks.ModBlocks;
import salvos.mangoitems.game.init.ModCreativeTabs;
import salvos.mangoitems.game.items.ModItems;
import salvos.mangoitems.util.Reference;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material) {
        super(material);

        setUnlocalizedName(Reference.MOD_ID+"."+name);
        setRegistryName(name);
        setCreativeTab(ModCreativeTabs.CREATIVE_BLOCKS);

        ModBlocks.blocks.add(this);
        ModItems.items.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public BlockBase(String name, Material material, float hardness) {
        super(material);

        setUnlocalizedName(Reference.MOD_ID+"."+name);
        setRegistryName(name);
        setCreativeTab(ModCreativeTabs.CREATIVE_BLOCKS);
        setHardness(hardness);

        ModBlocks.blocks.add(this);
        ModItems.items.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public BlockBase(String name, Material material, float hardness, float resistance) {
        super(material);

        setUnlocalizedName(Reference.MOD_ID+"."+name);
        setRegistryName(name);
        setCreativeTab(ModCreativeTabs.CREATIVE_BLOCKS);
        setHardness(hardness);
        setResistance(resistance);

        ModBlocks.blocks.add(this);
        ModItems.items.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public BlockBase(String name, Material material, float hardness, float resistance, String tool, int harvestLevel) {
        super(material);

        setUnlocalizedName(Reference.MOD_ID+"."+name);
        setRegistryName(name);
        setCreativeTab(ModCreativeTabs.CREATIVE_BLOCKS);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(tool, harvestLevel);

        ModBlocks.blocks.add(this);
        ModItems.items.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels(){
        MangoItems.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
