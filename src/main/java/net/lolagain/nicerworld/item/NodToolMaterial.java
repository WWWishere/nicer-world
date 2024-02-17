package net.lolagain.nicerworld.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum NodToolMaterial implements ToolMaterial {
    CHRYSOPRASE(5, 2285, 12.0f, 5.0f, 18,
            () -> Ingredient.ofItems(NodItems.CHRYSOPRASE)),
    RHULITE(5, 111, 16.0f, 6.0f, 24,
                        () -> Ingredient.ofItems(NodItems.RHULITE)),
    MYSTSTONE(6, 3220, 24.0f, 6.5f, 20,
                        () -> Ingredient.ofItems(NodItems.MYSTSTONE_BAR)),
    ELECTRUM(3, 1020, 12.0f, 2.0f, 21,
                        () -> Ingredient.ofItems(NodItems.ELECTRUM_INGOT)),
    STEEL(2, 645, 12.0f, 2.8f, 8,
                        () -> Ingredient.ofItems(NodItems.STEEL_INGOT)),
    LUNIUM(5, 1920, 25.0f, 5.5f, 15,
                        () -> Ingredient.ofItems(NodItems.LUNIUM_INGOT)),
    NATURIUM(6, 9500, 60.0f, 21.0f, 30,
                        () -> Ingredient.ofItems(NodItems.NATURIUM_INGOT));
    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    NodToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
