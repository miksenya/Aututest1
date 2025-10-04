package pageuserbug.support;

public class DataGen {
    public static String uniq() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String uniqEmail(String prefix) {
        return prefix + "_" + uniq() + "@mail.com";
    }
}
