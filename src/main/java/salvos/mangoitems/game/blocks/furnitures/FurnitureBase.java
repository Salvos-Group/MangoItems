package salvos.mangoitems.game.blocks.furnitures;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import salvos.mangoitems.game.blocks.base.BlockBase;
import salvos.mangoitems.game.blocks.ModBlocks;
import salvos.mangoitems.game.init.ModCreativeTabs;

public class FurnitureBase extends BlockBase {

    public FurnitureBase(String name, Material material) {
        super(name, material);
        setCreativeTab(ModCreativeTabs.CREATIVE_FURNITURE);
        ModBlocks.furnitures.add(this);
    }


    public FurnitureBase(String name, Material material, float hardness) {
        super(name, material, hardness);
        setCreativeTab(ModCreativeTabs.CREATIVE_FURNITURE);
        ModBlocks.furnitures.add(this);
    }

    public FurnitureBase(String name, Material material, float hardness, float resistance) {
        super(name, material, hardness, resistance);
        setCreativeTab(ModCreativeTabs.CREATIVE_FURNITURE);
        ModBlocks.furnitures.add(this);
    }

    public FurnitureBase(String name, Material material, float hardness, float resistance, String tool, int harvestLevel) {
        super(name, material, hardness, resistance, tool, harvestLevel);
        setCreativeTab(ModCreativeTabs.CREATIVE_FURNITURE);
        ModBlocks.furnitures.add(this);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state){
        return  false;
    }

    @Override
    public BlockRenderLayer getBlockLayer(){
        return BlockRenderLayer.CUTOUT;
    }
}

