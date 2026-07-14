package io.ncbpfluffybear.fluffymachines.utils;

import dev.j3fftw.extrautils.utils.LoreBuilderDynamic;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerBackpack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ColoredFireworkStar;
import io.ncbpfluffybear.fluffymachines.items.FireproofRune;
import io.ncbpfluffybear.fluffymachines.items.MiniBarrel;
import io.ncbpfluffybear.fluffymachines.items.tools.FluffyWrench;
import io.ncbpfluffybear.fluffymachines.items.tools.PortableCharger;
import io.ncbpfluffybear.fluffymachines.machines.AdvancedAutoDisenchanter;
import io.ncbpfluffybear.fluffymachines.machines.AdvancedChargingBench;
import io.ncbpfluffybear.fluffymachines.machines.AutoAncientAltar;
import io.ncbpfluffybear.fluffymachines.machines.AutoCraftingTable;
import io.ncbpfluffybear.fluffymachines.machines.AutoTableSaw;
import io.ncbpfluffybear.fluffymachines.machines.BackpackLoader;
import io.ncbpfluffybear.fluffymachines.machines.BackpackUnloader;
import io.ncbpfluffybear.fluffymachines.machines.ElectricDustFabricator;
import io.ncbpfluffybear.fluffymachines.machines.ElectricDustRecycler;
import io.ncbpfluffybear.fluffymachines.machines.SmartFactory;
import io.ncbpfluffybear.fluffymachines.machines.WaterSprinkler;
import io.ncbpfluffybear.fluffymachines.multiblocks.CrankGenerator;
import io.ncbpfluffybear.fluffymachines.objects.AutoCrafter;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Specifies all plugin items
 */
public class FluffyItems {

    private FluffyItems() {
    }

    // Barrels
    public static final SlimefunItemStack MINI_FLUFFY_BARREL = new SlimefunItemStack(
        "MINI_FLUFFY_BARREL",
        Material.COMPOSTER,
        "&eBarril Fluffy Mini",
        "",
        "&7Armazena grandes quantidades de itens",
        "&7A capacidade pode ser alterada",
        "",
        "&bCapacidade máxima: &e" + MiniBarrel.getDisplayCapacity() + " itens",
        "",
        LoreBuilder.TIER_COMMON
    );

    // Portable Chargers
    public static final SlimefunItemStack SMALL_PORTABLE_CHARGER = new SlimefunItemStack(
        "SMALL_PORTABLE_CHARGER",
        Material.BRICK,
        "&eCarregador Portátil I",
        "",
        "&7Carrega itens/equipamentos na mão",
        "",
        "&eVelocidade: &7" + PortableCharger.Type.SMALL.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.SMALL.chargeCapacity),
        "",
        LoreBuilder.TIER_COMMON
    );

    public static final SlimefunItemStack MEDIUM_PORTABLE_CHARGER = new SlimefunItemStack(
        "MEDIUM_PORTABLE_CHARGER",
        Material.IRON_INGOT,
        "&6Carregador Portátil II",
        "",
        "&7Carrega itens/equipamentos na mão",
        "",
        "&eVelocidade: &7" + PortableCharger.Type.MEDIUM.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.MEDIUM.chargeCapacity),
        "",
        LoreBuilder.TIER_COMMON
    );

    public static final SlimefunItemStack BIG_PORTABLE_CHARGER = new SlimefunItemStack(
        "BIG_PORTABLE_CHARGER",
        Material.GOLD_INGOT,
        "&aCarregador Portátil III",
        "",
        "&7Carrega itens/equipamentos na mão",
        "",
        "&eVelocidade: &7" + PortableCharger.Type.BIG.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.BIG.chargeCapacity),
        "",
        LoreBuilder.TIER_RARE
    );

    public static final SlimefunItemStack LARGE_PORTABLE_CHARGER = new SlimefunItemStack(
        "LARGE_PORTABLE_CHARGER",
        Material.NETHER_BRICK,
        "&2Carregador Portátil IV",
        "",
        "&7Carrega itens/equipamentos na mão",
        "",
        "&eVelocidade: &7" + PortableCharger.Type.LARGE.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.LARGE.chargeCapacity),
        "",
        LoreBuilder.TIER_RARE
    );

    public static final SlimefunItemStack CARBONADO_PORTABLE_CHARGER = new SlimefunItemStack(
        "CARBONADO_PORTABLE_CHARGER",
        Material.NETHERITE_INGOT,
        "&4Carregador Portátil V",
        "",
        "&7Carrega itens/equipamentos na mão",
        "",
        "&eVelocidade: &7" + PortableCharger.Type.CARBONADO.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.CARBONADO.chargeCapacity),
        "",
        LoreBuilder.TIER_EPIC
    );

    // Items
    public static final SlimefunItemStack ANCIENT_BOOK = new SlimefunItemStack(
        "ANCIENT_BOOK",
        Material.BOOK,
        "&6Livro Antigo",
        "",
        "&7Utilizado no &cDesencantador Automático Avançado",
        "",
        "&6&oEssência de mil anos condensada",
        "",
        LoreBuilder.TIER_RARE
    );
    public static final SlimefunItemStack HELICOPTER_HAT = new SlimefunItemStack(
        "HELICOPTER_HAT",
        Material.LEATHER_HELMET, Color.AQUA,
        "&1Chapéu de Helicóptero",
        "",
        "&7brrrrrrrrRRRRRRRR",
        "",
        "&eAgache&7 para usar",
        "",
        LoreBuilder.TIER_RARE
    );
    public static final SlimefunItemStack WATERING_CAN = new SlimefunItemStack(
        "WATERING_CAN",
        "6484da45301625dee79ae29ff513efa583f1ed838033f20db80963cedf8aeb0e",
        "&bRegador",
        "",
        "&fRega as plantas",
        "",
        "&7> &eBotão direito&7 para encher o regador",
        "&7> &eBotão direito&7 para acelerar crescimento",
        "&7> &eBotão direito&7 para crescimento lento",
        "",
        "&aÁgua restante: &e0",
        "",
        LoreBuilder.TIER_COMMON
    );
    public static final SlimefunItemStack ENDER_CHEST_EXTRACTION_NODE = new SlimefunItemStack(
        "ENDER_CHEST_EXTRACTION_NODE",
        "e707c7f6c3a056a377d4120028405fdd09acfcd5ae804bfde0f653be866afe39",
        "&6Nó de Extração da Ender Chest",
        "",
        "&7Coloque esta máquina ao lado de uma &5Ender Chest",
        "",
        "&7Extrai itens da &5Ender Chest",
        "&7para os &6baús&7 adjacentes",
        "",
        LoreBuilder.TIER_RARE
    );
    public static final SlimefunItemStack ENDER_CHEST_INSERTION_NODE = new SlimefunItemStack(
        "ENDER_CHEST_INSERTION_NODE",
        "7e5dc50c0186d53381d9430a2eff4c38f816b8791890c7471ffdb65ba202bc5",
        "&bNó de Inserção da Ender Chest",
        "",
        "&7Coloque esta máquina ao lado de uma &5Ender Chest",
        "",
        "&7Insere itens na &5Ender Chest",
        "&7a partir dos &6baús&7 adjacentes",
        "",
        LoreBuilder.TIER_RARE
    );
    // Machines
    public static final SlimefunItemStack AUTO_CRAFTING_TABLE = new SlimefunItemStack(
        "AUTO_CRAFTING_TABLE",
        Material.CRAFTING_TABLE,
        "&6Mesa de Criação Automática (Vanilla)",
        "",
        "&7Cria automaticamente itens &fVanilla",
        "",
        LoreBuilderDynamic.power(AutoCraftingTable.CAPACITY, " Buffer"),
        LoreBuilderDynamic.powerPerSecond(AutoCraftingTable.ENERGY_CONSUMPTION),
        "",
        LoreBuilder.TIER_RARE
    );
    public static final SlimefunItemStack AUTO_ANCIENT_ALTAR = new SlimefunItemStack(
        "AUTO_ANCIENT_ALTAR",
        Material.ENCHANTING_TABLE,
        "&5Altar Ancestral Automático",
        "",
        "&7Cria automaticamente itens do &5Altar Ancestral",
        "",
        LoreBuilderDynamic.power(AutoAncientAltar.CAPACITY, " Buffer"),
        LoreBuilderDynamic.powerPerSecond(AutoAncientAltar.ENERGY_CONSUMPTION),
        "",
        LoreBuilder.TIER_RARE
    );
    public static final SlimefunItemStack AUTO_TABLE_SAW = new SlimefunItemStack(
        "AUTO_TABLE_SAW",
        Material.STONECUTTER,
        "&6Serra Automática",
        "",
        "&7Cria automaticamente itens da &6Serra",
        "",
        LoreBuilderDynamic.power(AutoTableSaw.CAPACITY, " Buffer"),
        LoreBuilderDynamic.powerPerSecond(AutoTableSaw.ENERGY_CONSUMPTION),
        "",
        LoreBuilder.TIER_RARE
    );
    public static final SlimefunItemStack WATER_SPRINKER = new SlimefunItemStack(
        "WATER_SPRINKLER",
        "d6b13d69d1929dcf8edf99f3901415217c6a567d3a6ead12f75a4de3ed835e85",
        "&bAspersor de Água",
        "",
        "&7biu~",
        "",
        LoreBuilderDynamic.power(WaterSprinkler.CAPACITY, " Buffer"),
        LoreBuilderDynamic.powerPerSecond(WaterSprinkler.ENERGY_CONSUMPTION) + " por planta",
        "",
        LoreBuilder.TIER_COMMON
    );
    public static final SlimefunItemStack GENERATOR_CORE = new SlimefunItemStack(
        "GENERATOR_CORE",
        Material.BLAST_FURNACE,
        "&7Núcleo do Gerador",
        "",
        "&7Componente do gerador",
        "",
        LoreBuilder.TIER_COMMON
    );
    public static final SlimefunItemStack CRANK_GENERATOR = new SlimefunItemStack(
        "CRANK_GENERATOR",
        Material.BLAST_FURNACE,
        "&7Gerador de Manivela",
        "",
        "&eBotão direito&7 para gerar energia",
        "",
        LoreBuilderDynamic.power(CrankGenerator.RATE, " por uso"),
        LoreBuilderDynamic.power(CrankGenerator.CAPACITY, " Buffer"),
        "",
        Utils.multiBlockWarning(),
        "",
        LoreBuilder.TIER_COMMON
    );

    public static final SlimefunItemStack FOUNDRY = new SlimefunItemStack(
        "FOUNDRY",
        Material.BLAST_FURNACE,
        "&cFundição",
        "",
        "&eArmazena pós de minério e lingotes",
        "&7Capacidade de 138.240 lingotes",
        "",
        Utils.multiBlockWarning(),
        "",
        LoreBuilder.TIER_RARE
    );

    public static final SlimefunItemStack BACKPACK_UNLOADER = new SlimefunItemStack(
        "BACKPACK_UNLOADER",
        Material.BROWN_STAINED_GLASS,
        "&eDescarregador de Mochila",
        "",
        "&7Remove itens da mochila",
        "",
        LoreBuilderDynamic.power(BackpackUnloader.CAPACITY, " Buffer"),
        LoreBuilderDynamic.powerPerSecond(BackpackUnloader.ENERGY_CONSUMPTION),
        "",
        LoreBuilder.TIER_RARE
    );
    public static final SlimefunItemStack BACKPACK_LOADER = new SlimefunItemStack(
        "BACKPACK_LOADER",
        Material.ORANGE_STAINED_GLASS,
        "&eCarregador de Mochila",
        "",
        "&7Carrega itens na mochila",
        "",
        LoreBuilderDynamic.power(BackpackLoader.CAPACITY, " Buffer"),
        LoreBuilderDynamic.powerPerSecond(BackpackLoader.ENERGY_CONSUMPTION),
        "",
        LoreBuilder.TIER_RARE
    );
    public static final SlimefunItemStack UPGRADED_EXPLOSIVE_PICKAXE = new SlimefunItemStack(
        "UPGRADED_EXPLOSIVE_PICKAXE",
        Material.DIAMOND_PICKAXE,
        "&e&lPicareta Explosiva Aprimorada",
        "",
        "&7Minera em área 5x5",
        "",
        LoreBuilder.TIER_RARE
    );
    public static final SlimefunItemStack UPGRADED_EXPLOSIVE_SHOVEL = new SlimefunItemStack(
        "UPGRADED_EXPLOSIVE_SHOVEL",
        Material.DIAMOND_SHOVEL,
        "&e&lPá Explosiva Aprimorada",
        "",
        "&7Minera em área 5x5",
        "",
        LoreBuilder.TIER_RARE
    );
    public static final SlimefunItemStack FIREPROOF_RUNE = new SlimefunItemStack(
        "FIREPROOF_RUNE",
        new ColoredFireworkStar(Color.fromRGB(255, 165, 0),
            "&7Runa Antiga &8&l[&c&lÀ Prova de Fogo&8&l]",
            "",
            "&eJogue este item junto com outro no chão",
            "&eo item ficará &cà prova de fogo",
            "",
            LoreBuilder.TIER_RARE
        )
    );
    public static final SlimefunItemStack SUPERHEATED_FURNACE = new SlimefunItemStack(
        "SUPERHEATED_FURNACE",
        Material.BLAST_FURNACE,
        "&cForno Superaquecido",
        "",
        "&7Componente da Fundição",
        "&cNão destrua com ferramentas explosivas!",
        "",
        LoreBuilder.TIER_RARE
    );
    public static final SlimefunItemStack AUTO_ENHANCED_CRAFTING_TABLE = new SlimefunItemStack(
        "AUTO_ENHANCED_CRAFTING_TABLE",
        Material.CRAFTING_TABLE,
        "&eMesa de Criação Aprimorada Automática",
        "",
        "&7Cria automaticamente itens da &eMesa Aprimorada",
        "",
        LoreBuilderDynamic.power(AutoCrafter.CAPACITY, " Buffer"),
        LoreBuilderDynamic.powerPerSecond(AutoCrafter.ENERGY_CONSUMPTION),
        "",
        LoreBuilder.TIER_RARE
    );
    public static final SlimefunItemStack AUTO_MAGIC_WORKBENCH = new SlimefunItemStack(
        "AUTO_MAGIC_WORKBENCH",
        Material.BOOKSHELF,
        "&6Bancada Mágica Automática",
        "",
        "&7Cria automaticamente itens da &6Bancada Mágica",
        "",
        LoreBuilderDynamic.power(AutoCrafter.CAPACITY, " Buffer"),
        LoreBuilderDynamic.powerPerSecond(AutoCrafter.ENERGY_CONSUMPTION),
        "",
        LoreBuilder.TIER_RARE
    );
    public static final SlimefunItemStack AUTO_ARMOR_FORGE = new SlimefunItemStack(
        "AUTO_ARMOR_FORGE",
        Material.SMITHING_TABLE,
        "&7Forja de Armaduras Automática",
        "",
        "&7Cria automaticamente itens da &6Forja de Armaduras",
        "",
        LoreBuilderDynamic.power(AutoCrafter.CAPACITY, " Buffer"),
        LoreBuilderDynamic.powerPerSecond(AutoCrafter.ENERGY_CONSUMPTION),
        "",
        LoreBuilder.TIER_RARE
    );
    public static final SlimefunItemStack ADVANCED_AUTO_DISENCHANTER = new SlimefunItemStack(
        "ADVANCED_AUTO_DISENCHANTER",
        Material.ENCHANTING_TABLE,
        "&cDesencantador Automático Avançado",
        "",
        "&7Remove um encantamento específico de um item",
        "&7Requer um &6Livro Antigo&7 para funcionar",
        "",
        LoreBuilderDynamic.power(AdvancedAutoDisenchanter.CAPACITY, " Buffer"),
        LoreBuilderDynamic.powerPerSecond(AdvancedAutoDisenchanter.ENERGY_CONSUMPTION),
        "",
        LoreBuilder.TIER_RARE
    );
    public static final SlimefunItemStack SCYTHE = new SlimefunItemStack(
        "SCYTHE",
        Material.IRON_HOE,
        "&eFoice",
        "",
        "&7Colhe até 5 plantações de uma vez",
        "",
        LoreBuilder.TIER_COMMON
    );
    public static final SlimefunItemStack UPGRADED_LUMBER_AXE = new SlimefunItemStack(
        "UPGRADED_LUMBER_AXE",
        Material.DIAMOND_AXE,
        "&6&lMachado de Madeira Aprimorado",
        "",
        "&7Derruba toda a árvore de uma vez.",
        "&7Botão direito para descascar a árvore.",
        "",
        LoreBuilder.TIER_RARE
    );
    public static final SlimefunItemStack DOLLY = new SlimefunItemStack(
        "DOLLY",
        Material.MINECART,
        "&bCarrinho de Baús",
        "",
        "&7Botão direito para pegar um baú",
        "",
        PlayerBackpack.LORE_OWNER,
        "",
        LoreBuilder.TIER_COMMON
    );

    public static final SlimefunItemStack WARP_PAD = new SlimefunItemStack(
        "WARP_PAD",
        Material.SMOKER,
        "&6Plataforma de Teletransporte",
        "",
        "&7Teleporta para outra Plataforma de Teletransporte",
        "&7Requer um Configurador para funcionar",
        "",
        "&7Agache sobre a plataforma para teletransportar",
        "",
        LoreBuilder.TIER_RARE
    );

    public static final SlimefunItemStack WARP_PAD_CONFIGURATOR = new SlimefunItemStack(
        "WARP_PAD_CONFIGURATOR",
        Material.BLAZE_ROD,
        "&6Configurador de Plataforma de Teletransporte",
        "",
        "&eAgache + botão direito&7 para definir destino",
        "&eBotão direito&7 para definir origem",
        "",
        "&eCoordenadas:&7 Nenhuma",
        "",
        LoreBuilder.TIER_COMMON
    );

    public static final SlimefunItemStack ELECTRIC_DUST_FABRICATOR = new SlimefunItemStack(
        "ELECTRIC_DUST_FABRICATOR",
        Material.BLAST_FURNACE,
        "&6Fabricador Elétrico de Pó",
        "",
        "&7Máquina 3 em 1: moedor, peneira e lavador",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.speed(10),
        LoreBuilderDynamic.power(ElectricDustFabricator.CAPACITY, " Buffer"),
        LoreBuilderDynamic.powerPerSecond(ElectricDustFabricator.ENERGY_CONSUMPTION),
        "",
        LoreBuilder.TIER_EPIC
    );

    public static final SlimefunItemStack ELECTRIC_DUST_RECYCLER = new SlimefunItemStack(
        "ELECTRIC_DUST_RECYCLER",
        Material.IRON_BLOCK,
        "&fReciclador de Pó de Minério",
        "",
        "&7Recicla pó de minério em minério crivado",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.speed(1),
        LoreBuilderDynamic.power(ElectricDustRecycler.CAPACITY, " Buffer"),
        LoreBuilderDynamic.powerPerSecond(ElectricDustRecycler.ENERGY_CONSUMPTION),
        "",
        LoreBuilder.TIER_EPIC
    );

    public static final SlimefunItemStack ALTERNATE_ELEVATOR_PLATE = new SlimefunItemStack(
        "ALTERNATE_ELEVATOR_PLATE",
        Material.POLISHED_BLACKSTONE_PRESSURE_PLATE,
        "&3Placa de Elevador Alternativa",
        "",
        "&fColoque uma em cada andar",
        "&fOs elevadores devem estar na mesma linha vertical.",
        "",
        "&eBotão direito&7 para nomear",
        "",
        LoreBuilder.TIER_COMMON
    );

    public static final SlimefunItemStack FLUFFY_WRENCH = new SlimefunItemStack(
        "FLUFFY_WRENCH",
        FluffyWrench.Wrench.DEFAULT.getMaterial(),
        "&6Chave Inglesa Fluffy",
        "",
        "&7Remove componentes Slimefun rapidamente (consome durabilidade)",
        "",
        "&eClique esquerdo/direito&7 para desmontar",
        "",
        LoreBuilder.TIER_COMMON
    );

    public static final SlimefunItemStack REINFORCED_FLUFFY_WRENCH = new SlimefunItemStack(
        "REINFORCED_FLUFFY_WRENCH",
        FluffyWrench.Wrench.REINFORCED.getMaterial(),
        "&bChave Inglesa Reforçada",
        "",
        "&7Remove componentes Slimefun rapidamente (consome durabilidade)",
        "",
        "&eClique esquerdo/direito&7 para desmontar",
        "",
        LoreBuilder.TIER_RARE
    );

    public static final SlimefunItemStack CARBONADO_FLUFFY_WRENCH = new SlimefunItemStack(
        "CARBONADO_FLUFFY_WRENCH",
        FluffyWrench.Wrench.CARBONADO.getMaterial(),
        "&7Chave Inglesa de Carbonado",
        "",
        "&7Remove componentes Slimefun rapidamente (consome 1J por uso)",
        "",
        "&eClique esquerdo/direito&7 para desmontar",
        "",
        LoreBuilder.powerCharged(0, FluffyWrench.Wrench.CARBONADO.getMaxCharge()),
        "",
        LoreBuilder.TIER_EPIC
    );

    public static final SlimefunItemStack PAXEL = new SlimefunItemStack(
        "PAXEL",
        Material.DIAMOND_PICKAXE,
        "&bMulti-Ferramenta",
        "",
        "&7Picareta, machado e pá em uma só ferramenta!",
        "",
        LoreBuilder.TIER_RARE
    );

    public static final SlimefunItemStack ADVANCED_CHARGING_BENCH = new SlimefunItemStack(
        "ADVANCED_CHARGING_BENCH",
        Material.SMITHING_TABLE,
        "&cBancada de Carregamento Avançada",
        "",
        "&7Carrega itens com energia",
        "&7Pode ser aprimorada com o &6Cartão de Upgrade",
        "",
        LoreBuilder.TIER_RARE
    );

    public static final SlimefunItemStack ACB_UPGRADE_CARD = new SlimefunItemStack(
        "ACB_UPGRADE_CARD",
        Material.PAPER,
        "&6Cartão de Upgrade da Bancada",
        "",
        "&eBotão direito na &cBancada Avançada&7 para aprimorar",
        "",
        "&6Velocidade de Carregamento &a+" + AdvancedChargingBench.CHARGE + "J",
        "&6Capacidade &a+" + AdvancedChargingBench.CAPACITY + "J",
        "&6Consumo de Energia &c+" + AdvancedChargingBench.ENERGY_CONSUMPTION + "J",
        "",
        LoreBuilder.TIER_RARE
    );

    public static final SlimefunItemStack CARGO_MANIPULATOR = new SlimefunItemStack(
        "CARGO_MANIPULATOR",
        Material.SEA_PICKLE,
        "&9Configurador de Carga",
        "",
        "&eBotão direito&7 para copiar configuração do nó",
        "&eClique esquerdo&7 para aplicar configuração do nó",
        "&eShift+Botão direito&7 para limpar configuração",
        "",
        LoreBuilder.TIER_RARE
    );

    public static final SlimefunItemStack EXP_DISPENSER = new SlimefunItemStack(
        "EXP_DISPENSER",
        Material.DISPENSER,
        "&aDispensador de Experiência",
        "",
        "&7Botão direito para coletar XP dos dispensadores",
        "&7e dos Barris Fluffy à frente",
        "&7em garrafas de experiência",
        "",
        Utils.multiBlockWarning(),
        "",
        LoreBuilder.TIER_COMMON
    );

    public static final SlimefunItemStack SMART_FACTORY = new SlimefunItemStack(
        "SMART_FACTORY",
        Material.SMOKER,
        "&cFábrica Inteligente",
        "",
        "&7Máquina tudo-em-um",
        "&7Cria recursos a partir de matérias-primas diretamente",
        "",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.speed(1),
        LoreBuilderDynamic.power(SmartFactory.getEnergyCapacity(), " Buffer"),
        LoreBuilderDynamic.powerPerSecond(SmartFactory.getEnergyConsumption()),
        "",
        LoreBuilder.TIER_LEGENDARY
    );

    static {
        FireproofRune.setFireproof(FIREPROOF_RUNE);
        addGlow(SMALL_PORTABLE_CHARGER);
        addGlow(MEDIUM_PORTABLE_CHARGER);
        addGlow(BIG_PORTABLE_CHARGER);
        addGlow(LARGE_PORTABLE_CHARGER);
        addGlow(CARBONADO_PORTABLE_CHARGER);
    }

    private static void addGlow(ItemStack item) {
        item.addUnsafeEnchantment(Enchantment.BINDING_CURSE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
    }
}
