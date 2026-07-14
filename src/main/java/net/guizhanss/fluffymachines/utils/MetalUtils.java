package net.guizhanss.fluffymachines.utils;

import lombok.experimental.UtilityClass;
import net.guizhanss.guizhanlib.common.utils.StringUtil;

import java.util.Locale;

@UtilityClass
public final class MetalUtils {

    public static String getMetalName(String type) {
        return switch (type.toUpperCase(Locale.ROOT)) {
            case "IRON" -> "Ferro";
            case "GOLD" -> "Ouro";
            case "COPPER" -> "Cobre";
            case "TIN" -> "Estanho";
            case "SILVER" -> "Prata";
            case "LEAD" -> "Chumbo";
            case "ALUMINUM" -> "Alumínio";
            case "ZINC" -> "Zinco";
            case "MAGNESIUM" -> "Magnésio";
            default -> StringUtil.humanize(type);
        };
    }
}
