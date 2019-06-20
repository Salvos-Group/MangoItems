package salvos.mangoitems.blocks.furnitures;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import salvos.mangoitems.blocks.BlockBase;
import salvos.mangoitems.init.ModCreativeTabs;

public class FurnitureBase extends BlockBase {

    public FurnitureBase(String name, Material material) {
        super(name, material);
        setCreativeTab(ModCreativeTabs.CREATIVE_FURNITURE);
    }

    public FurnitureBase(String name, Material material, float hardness, float resistance, String tool, int harvestLevel) {
        super(name, material, hardness, resistance, tool, harvestLevel);
        setCreativeTab(ModCreativeTabs.CREATIVE_FURNITURE);
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

