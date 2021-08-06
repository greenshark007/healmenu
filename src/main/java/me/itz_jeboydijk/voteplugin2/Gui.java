package me.itz_jeboydijk.voteplugin2;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Gui implements Listener {
    private Inventory gui;

    public void opNewGui(Player p) {
    gui = Bukkit.createInventory(null, InventoryType.CHEST, ChatColor.GREEN + "heal" + ChatColor.WHITE + "menu");


        ItemStack item = new ItemStack(Material.GREEN_CONCRETE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "hunger");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("hunger level");
        meta.setLore(lore);

        item.setItemMeta(meta);


        gui.setItem(11, item);


        ItemStack Item = new ItemStack(Material.BARRIER);
        ItemMeta Meta = Item.getItemMeta();
        Meta.setDisplayName(ChatColor.DARK_RED + "close");
        Item.setItemMeta(Meta);

        gui.setItem(13, Item);

        ItemStack iTem = new ItemStack(Material.RED_CONCRETE);
        ItemMeta mEta = iTem.getItemMeta();
        mEta.setDisplayName(ChatColor.GREEN + "damage");
        ArrayList<String> Lore = new ArrayList<>();
        Lore.add("damage level");
        mEta.setLore(Lore);
        iTem.setItemMeta(mEta);

        gui.setItem(15, iTem);

        ItemStack itEm = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta meTa = itEm.getItemMeta();
        itEm.setItemMeta(meTa);

        gui.setItem(0, itEm);
        gui.setItem(1, itEm);
        gui.setItem(2, itEm);
        gui.setItem(3, itEm);
        gui.setItem(4, itEm);
        gui.setItem(5, itEm);
        gui.setItem(6, itEm);
        gui.setItem(7, itEm);
        gui.setItem(8, itEm);
        gui.setItem(9, itEm);
        gui.setItem(10, itEm);
        gui.setItem(12, itEm);
        gui.setItem(14, itEm);
        gui.setItem(16, itEm);
        gui.setItem(17, itEm);
        gui.setItem(18, itEm);
        gui.setItem(19, itEm);
        gui.setItem(20, itEm);
        gui.setItem(21, itEm);
        gui.setItem(22, itEm);
        gui.setItem(23, itEm);
        gui.setItem(24, itEm);
        gui.setItem(25, itEm);
        gui.setItem(26, itEm);





        p.openInventory(gui);
    }

    @EventHandler
    public void guiClickEvent(InventoryClickEvent e) {
        if(!e.getInventory().equals(gui)){
            return;
        }

        e.setCancelled(true);

        Player p = (Player) e.getWhoClicked();

        switch(e.getSlot()) {
            case 11: {
                p.closeInventory();
                p.setFoodLevel(20);
                p.sendMessage(ChatColor.GREEN + "you have full hunger bars");
                break;
            }
        }

        switch(e.getSlot()) {
            case 13: {
                p.closeInventory();
                break;
            }
        }

        switch(e.getSlot()) {
            case 15: {
                p.closeInventory();
                p.setHealth(20.0);
                p.sendMessage(ChatColor.GREEN + "you have full hearts");
                break;
            }
        }
    }

    @EventHandler
    public void openGuiEvent(GuiEvent e) {
        opNewGui(e.getPlayer());
    }
}
