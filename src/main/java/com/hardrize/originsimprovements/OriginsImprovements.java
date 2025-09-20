package com.hardrize.originsimprovements;

import com.starshootercity.OriginsAddon;
import com.starshootercity.abilities.types.Ability;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public final class OriginsImprovements extends OriginsAddon {
    @NotNull
    public String getNamespace() {
        return "originsimprovements";
    }

    @Override
    public @NotNull List<Ability> getRegisteredAbilities() {
        return List.of(
        );
    }
}
