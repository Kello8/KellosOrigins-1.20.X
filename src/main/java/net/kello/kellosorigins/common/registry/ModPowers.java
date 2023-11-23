package net.kello.kellosorigins.common.registry;

import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.factory.PowerFactory;
import io.github.apace100.apoli.registry.ApoliRegistries;
import io.github.apace100.calio.data.SerializableData;
import io.github.apace100.calio.data.SerializableDataTypes;
import net.kello.kellosorigins.Kellosorigins;
import net.kello.kellosorigins.common.power.ModifySizePower;
import net.minecraft.registry.Registry;

public class ModPowers {
    public static final PowerFactory<Power> MODIFY_SIZE = new PowerFactory<>(Kellosorigins.id("modify_size"), new SerializableData().add("scale_types", SerializableDataTypes.IDENTIFIERS).add("scale", SerializableDataTypes.FLOAT), data -> (type, entity) -> new ModifySizePower(type, entity, data.get("scale_types"), data.getFloat("scale"))).allowCondition();

    public static void init() {
        Registry.register(ApoliRegistries.POWER_FACTORY, MODIFY_SIZE.getSerializerId(), MODIFY_SIZE);
    }
}
