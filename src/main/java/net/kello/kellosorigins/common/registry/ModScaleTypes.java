package net.kello.kellosorigins.common.registry;

import net.kello.kellosorigins.Kellosorigins;
import virtuoel.pehkui.api.*;

public class ModScaleTypes {
    public static ScaleType MODIFY_SIZE_TYPE;
    public static ScaleModifier MODIFY_SIZE_MODIFIER;

    public static void init() {
        MODIFY_SIZE_MODIFIER = ScaleRegistries.register(ScaleRegistries.SCALE_MODIFIERS, Kellosorigins.id("modify_size"), new TypedScaleModifier(() -> MODIFY_SIZE_TYPE));
        ScaleTypes.WIDTH.getDefaultBaseValueModifiers().add(MODIFY_SIZE_MODIFIER);
        ScaleTypes.HEIGHT.getDefaultBaseValueModifiers().add(MODIFY_SIZE_MODIFIER);
        ScaleTypes.DROPS.getDefaultBaseValueModifiers().add(MODIFY_SIZE_MODIFIER);
        ScaleTypes.VISIBILITY.getDefaultBaseValueModifiers().add(MODIFY_SIZE_MODIFIER);
        MODIFY_SIZE_TYPE = ScaleRegistries.register(ScaleRegistries.SCALE_TYPES, Kellosorigins.id("modify_size"), ScaleType.Builder.create().affectsDimensions().addDependentModifier(MODIFY_SIZE_MODIFIER).build());
    }
}
