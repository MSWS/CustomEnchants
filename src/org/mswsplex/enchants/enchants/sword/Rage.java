package org.mswsplex.enchants.enchants.sword;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;

public class Rage extends Enchantment {

	public Rage(int id) {
		super(id);
	}

	@Override
	public boolean canEnchantItem(ItemStack item) {
		return item.getType().toString().contains("SWORD");
	}

	@Override
	public boolean conflictsWith(Enchantment enchantment) {
		return false;
	}

	@Override
	public EnchantmentTarget getItemTarget() {
		return EnchantmentTarget.WEAPON;
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	public String getName() {
		return "Rage";
	}

	@Override
	public int getStartLevel() {
		return 0;
	}

}
