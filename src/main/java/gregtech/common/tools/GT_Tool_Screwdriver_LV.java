package gregtech.common.tools;

import gregtech.api.enums.Textures;
import gregtech.api.interfaces.IIconContainer;
import gregtech.api.items.GT_MetaGenerated_Tool;
import net.minecraft.item.ItemStack;

public class GT_Tool_Screwdriver_LV extends GT_Tool_Screwdriver {
    @Override
    public float getMaxDurabilityMultiplier() {
        return 1.0F;
    }

    @Override
    public int getToolDamagePerContainerCraft() {
        return 200;
    }

    @Override
    public IIconContainer getIcon(boolean aIsToolHead, ItemStack aStack) {
        return !aIsToolHead
                ? GT_MetaGenerated_Tool.getPrimaryMaterial(aStack)
                        .mIconSet
                        .mTextures[gregtech.api.enums.OrePrefixes.toolHeadScrewdriver.mTextureIndex]
                : Textures.ItemIcons.HANDLE_ELECTRIC_SCREWDRIVER;
    }

    @Override
    public short[] getRGBa(boolean aIsToolHead, ItemStack aStack) {
        return !aIsToolHead
                ? GT_MetaGenerated_Tool.getPrimaryMaterial(aStack).mRGBa
                : GT_MetaGenerated_Tool.getSecondaryMaterial(aStack).mRGBa;
    }
}
