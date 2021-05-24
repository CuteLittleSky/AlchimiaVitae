package me.apeiros.alchimiavitae.setup.items.general;

import me.apeiros.alchimiavitae.setup.Items;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

public class MysteryMetal extends SlimefunItem {

    public MysteryMetal(Category c) {

        super(c, Items.MYSTERY_METAL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Items.MOLTEN_MYSTERY_METAL, null, null,
                null, null, null,
                null, null, null
        }, new SlimefunItemStack(Items.MYSTERY_METAL, 16));

    }

}