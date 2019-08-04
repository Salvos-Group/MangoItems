package salvos.mangoitems.init;

import salvos.mangoitems.blocks.OreBase;
import salvos.mangoitems.blocks.type.OreType;
import salvos.mangoitems.blocks.type.RockType;

public class ModOres {

    public static void init(){
        for(RockType rockType : RockType.values()){
            for(OreType oreType : OreType.values()){
                new OreBase(rockType, oreType);
            }
        }
    }

}
