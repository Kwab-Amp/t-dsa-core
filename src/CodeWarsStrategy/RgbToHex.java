package CodeWarsStrategy;

public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        String hexString = "";
        if(isValidRgb(r) && isValidRgb(g) && isValidRgb(b)) {
            hexString = Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b);
        } else {
            var invalid = getInvalid(r, g, b);
        }
        return hexString.toUpperCase();
    }

    private static boolean isValidRgb(int x) {
        return x >= 0 && x <= 255;
    }

    private static int getInvalid(int r, int g, int b) {
        if (r < 0 || r > 255) {
            return r;
        } else if (g < 0 || g > 255) {
            return g;
        }
        else if (b < 0 || b > 255) {
            return b;
        }
        return 0;
    }
}
