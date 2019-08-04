package salvos.mangoitems.blocks.furnitures;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class TapBase extends FurnitureHorizontalBase {

    private static final AxisAlignedBB BOUNDING_BOX_NORTH = new AxisAlignedBB(0.0625*6, 0, 0, 0.0625*10, 8*0.0625, 0.0625*8);
    private static final AxisAlignedBB BOUNDING_BOX_SOUTH = new AxisAlignedBB(0.0625*6, 0, 0.0625*8, 0.0625*10, 8*0.0625, 0.0625*16);
    private static final AxisAlignedBB BOUNDING_BOX_EAST = new AxisAlignedBB(0.0625*8, 0, 0.0625*6, 0.0625*16, 8*0.0625, 0.0625*10);
    private static final AxisAlignedBB BOUNDING_BOX_WEST = new AxisAlignedBB(0, 0, 0.0625*6, 0.0625*8, 8*0.0625, 0.0625*10);

    public TapBase(String name, Material material) {
        super(name, material);
    }

    public TapBase(String name, Material material, float hardness) {
        super(name, material, hardness);
    }

    public TapBase(String name, Material material, float hardness, float resistance) {
        super(name, material, hardness, resistance);
    }

    public TapBase(String name, Material material, float hardness, float resistance, String tool, int harvestLevel) {
        super(name, material, hardness, resistance, tool, harvestLevel);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess access, BlockPos pos) {
        if (state.getValue(FACING).getHorizontalIndex() == 0) {
            return BOUNDING_BOX_SOUTH;
        } else if (state.getValue(FACING).getHorizontalIndex() == 1) {
            return BOUNDING_BOX_WEST;
        } else if (state.getValue(FACING).getHorizontalIndex() == 2) {
            return BOUNDING_BOX_NORTH;
        } else if (state.getValue(FACING).getHorizontalIndex() == 3) {
            return BOUNDING_BOX_EAST;
        }
        return FULL_BLOCK_AABB;
    }
}
