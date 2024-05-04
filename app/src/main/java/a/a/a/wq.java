package a.a.a;

import android.content.Context;
import android.os.Environment;

import com.besome.sketch.SketchApplication;

import java.io.File;

public class wq {

    public static final String A = "trindadeware" + File.separator + "localization" + File.separator + "strings_provided.xml";
    public static final String B = "trindadeware" + File.separator + "signed_apk";
    public static final String C = "trindadeware" + File.separator + "keystore";
    public static final String D = "trindadeware" + File.separator + "keystore" + File.separator + "release_key.jks";
    public static final String E = "trindadeware" + File.separator + "service_account";
    public static final String F = ".trindadeware" + File.separator + "upload";
    public static final String[] G = {"subs_year_01", "subs_50_year_01", "subs_30_year_01", "subs_20_year_01", "subs_month_06", "subs_month_03", "subs_month_01", "subs_50_month_01", "subs_30_month_01", "subs_20_month_01"};
    public static final long[] H = {32140800000L, 32140800000L, 32140800000L, 32140800000L, 16070400000L, 8035200000L, 2678400000L, 2678400000L, 2678400000L, 2678400000L};
    public static final String[] I = {"subs_month_01", "subs_year_01"};
    public static final String[] L = {"subs_20_month_01", "subs_20_year_01"};
    public static final String[] M = {"F83085529A75E7A8CEDD64013B1A374B", "90C443DFAB7F23424DE7E079787466CD", "F83085529A75E7A8CEDD64013B1A374B", "C99E5B3F179203AE2749F8F9B5A7493A", "100EFD7391FF1BEE4A1E2F960A1B8AF2"};
    public static final String[] N = {"1486507718310013_1788685811425534", "1486507718310013_1804931006467681", "1486507718310013_1805009746459807", "1486507718310013_1805001526460629", "1486507718310013_1805273579766757", "1486507718310013_1805397669754348", "1486507718310013_1805436593083789", "1486507718310013_1805666736394108", "1486507718310013_1805724186388363", "1486507718310013_1809233042704144"};
    public static final String[] O = {"255022168522663_266931247331755", "255022168522663_268282677196612", "255022168522663_268283823863164", "255022168522663_266575314034015", "255022168522663_279474749410738"};
    public static final String a = ".trindadeware" + File.separator + "libs";
    public static final String b = ".trindadeware" + File.separator + "mysc";
    public static final String c = ".trindadeware" + File.separator + "mysc" + File.separator + "list";
    public static final String d = ".trindadeware" + File.separator + "data";
    public static final String e = ".trindadeware" + File.separator + "bak";
    public static final String f = ".trindadeware" + File.separator + "temp" + File.separator + "images";
    public static final String g = ".trindadeware" + File.separator + "temp" + File.separator + "sounds";
    public static final String h = ".trindadeware" + File.separator + "temp" + File.separator + "fonts";
    public static final String i = ".trindadeware" + File.separator + "temp" + File.separator + "proj";
    public static final String j = ".trindadeware" + File.separator + "temp" + File.separator + "data";
    public static final String l = ".trindadeware" + File.separator + "resources";
    public static final String m = ".trindadeware" + File.separator + "resources" + File.separator + "icons";
    public static final String n = ".trindadeware" + File.separator + "resources" + File.separator + "images";
    public static final String o = ".trindadeware" + File.separator + "resources" + File.separator + "sounds";
    public static final String p = ".trindadeware" + File.separator + "resources" + File.separator + "fonts";
    public static final String r = ".trindadeware" + File.separator + "download" + File.separator + "apk";
    public static final String s = ".trindadeware" + File.separator + "download" + File.separator + "data";
    public static final String t = ".trindadeware" + File.separator + "tutorial" + File.separator + "images";
    public static final String u = ".trindadeware" + File.separator + "tutorial" + File.separator + "sounds";
    public static final String v = ".trindadeware" + File.separator + "tutorial" + File.separator + "fonts";
    public static final String w = ".trindadeware" + File.separator + "tutorial" + File.separator + "proj";
    public static final String x = ".trindadeware" + File.separator + "collection";
    public static final String y = "trindadeware" + File.separator + "localization";
    public static final String z = "trindadeware" + File.separator + "localization" + File.separator + "strings.xml";

    public static final String EXTRA_SYSTEM_DATA = ".trindadeware" + File.separator + "data" + File.separator + "system";
    public static final String CUSTOM_COMPONENT_FILE = EXTRA_SYSTEM_DATA + File.separator + "component.json";
    public static final String EXTRA_DATA_EXPORT = EXTRA_SYSTEM_DATA + File.separator + "export";

    public static String getAbsolutePathOf(String path) {
        return new File(Environment.getExternalStorageDirectory(), path).getAbsolutePath();
    }

    public static String a() {
        return getAbsolutePathOf(x);
    }

    public static String a(int type) {
        return switch (type) {
            case 1 -> "SL-01";
            case 2 -> "SL-02";
            case 3 -> "SL-03";
            case 4 -> "SL-04";
            default -> "";
        };
    }

    public static String a(String sc_id) {
        return getAbsolutePathOf(e + File.separator + sc_id);
    }

    public static void a(Context context, String preferenceName) {
        DB dataP17 = new DB(context, "P17_" + preferenceName);
        DB dataP18 = new DB(context, "P18_" + preferenceName);
        DB dataP13 = new DB(context, "P13_" + preferenceName);
        DB dataP14 = new DB(context, "P14_" + preferenceName);
        dataP17.a();
        dataP18.a();
        dataP13.a();
        dataP14.a();
        DB dataD03 = new DB(context, "D03_" + preferenceName);
        DB dataD04 = new DB(context, "D04_" + preferenceName);
        DB dataD01 = new DB(context, "D01_" + preferenceName);
        DB dataD02 = new DB(context, "D02_" + preferenceName);
        dataD03.a();
        dataD04.a();
        dataD01.a();
        dataD02.a();
    }

    public static String b() {
        return getAbsolutePathOf(s);
    }

    public static String b(int type) {
        return switch (type) {
            case 0 -> "linear";
            case 1 -> "relativelayout";
            case 2 -> "hscroll";
            case 3 -> "button";
            case 4 -> "textview";
            case 5 -> "edittext";
            case 6 -> "imageview";
            case 7 -> "webview";
            case 8 -> "progressbar";
            case 9 -> "listview";
            case 10 -> "spinner";
            case 11 -> "checkbox";
            case 12 -> "vscroll";
            case 13 -> "switch";
            case 14 -> "seekbar";
            case 15 -> "calendarview";
            case 16 -> "fab";
            case 17 -> "adview";
            case 18 -> "mapview";
            case 19 -> "radiobutton";
            case 20 -> "ratingbar";
            case 21 -> "videoview";
            case 22 -> "searchview";
            case 23 -> "autocomplete";
            case 24 -> "multiautocomplete";
            case 25 -> "gridview";
            case 26 -> "analogclock";
            case 27 -> "datepicker";
            case 28 -> "timepicker";
            case 29 -> "digitalclock";
            case 30 -> "tablayout";
            case 31 -> "viewpager";
            case 32 -> "bottomnavigation";
            case 33 -> "badgeview";
            case 34 -> "patternlockview";
            case 35 -> "wavesidebar";
            case 36 -> "cardview";
            case 37 -> "collapsingtoolbar";
            case 38 -> "textinputlayout";
            case 39 -> "swiperefreshlayout";
            case 40 -> "radiogroup";
            case 41 -> "materialbutton";
            case 42 -> "signinbutton";
            case 43 -> "circleimageview";
            case 44 -> "lottie";
            case 45 -> "youtube";
            case 46 -> "otpview";
            case 47 -> "codeview";
            case 48 -> "recyclerview";
            default -> "widget";
        };
    }

    public static String b(String sc_id) {
        return getAbsolutePathOf(d + File.separator + sc_id);
    }

    public static String c() {
        return getAbsolutePathOf(".trindadeware" + File.separator + "download");
    }

    public static String c(String sc_id) {
        return getAbsolutePathOf(c + File.separator + sc_id);
    }

    public static String d() {
        return getAbsolutePathOf(p);
    }

    public static String d(String sc_id) {
        return getAbsolutePathOf(b + File.separator + sc_id);
    }

    public static String e() {
        return getAbsolutePathOf(m);
    }

    public static String e(String sc_id) {
        return "resource" + File.separator + sc_id + File.separator + "res.zip";
    }

    public static String getExtractedIconPackStoreLocation() {
        return new File(SketchApplication.getContext().getFilesDir(), "iconpack").getAbsolutePath();
    }

    public static String g() {
        return getAbsolutePathOf(n);
    }

    public static String h() {
        return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxqe7Fu3i3VfnKRSRRljTsMuk7Br0dXaFdGnMNCzMGLQ72PSTEAUo4sXs5+Utmdf9R2s2tZyArdnehk9+Q72F0XzEZGeVfgzfLky7ffuk04yxUye/FlXBun/s0F7g2496+PyfXCP9jIBdncvQ9kaT8Xn6F/j0s2TqS/6xlCD38eYgCVFyp1mld1vYhGCZBlQvXFVJAoKCzqN2QZVO5KarkyTQSGeudvV/UQsJgyHh5zTZKnla1VIVj1Wl3nBb//s2dsmFnAx3500Y/h//XHveLUS7BkP34AGGWPLuoyJruLNvrZ3uUNDnCgnW4+z8Ilaj2SwCTeqQvvw/suZdExs88QIDAQAB";
    }

    @Deprecated
    public static String i() {
        return getAbsolutePathOf(C);
    }

    public static String j() {
        return getAbsolutePathOf(D);
    }

    public static String k() {
        return getAbsolutePathOf(y);
    }

    public static String l() {
        return getAbsolutePathOf(z);
    }

    public static String m() {
        return getAbsolutePathOf(A);
    }

    public static String n() {
        return getAbsolutePathOf(c);
    }

    public static String o() {
        return getAbsolutePathOf(B);
    }

    public static String p() {
        return getAbsolutePathOf(E);
    }

    public static String q() {
        return getAbsolutePathOf(".trindadeware" + File.separator);
    }

    public static String r() {
        return getAbsolutePathOf(a);
    }

    public static String s() {
        return getAbsolutePathOf("trindadeware");
    }

    public static String t() {
        return getAbsolutePathOf(o);
    }

    public static String u() {
        return getAbsolutePathOf(h);
    }

    public static String v() {
        return getAbsolutePathOf(f);
    }

    public static String w() {
        return getAbsolutePathOf(g);
    }

    public static String x() {
        return getAbsolutePathOf(F);
    }

    public static String getCustomComponent() {
        return getAbsolutePathOf(CUSTOM_COMPONENT_FILE);
    }

    public static String getExtraDataExport() {
        return getAbsolutePathOf(EXTRA_DATA_EXPORT);
    }

    public static String y() {
        return "16011998";
    }

    public static String[] z() {
        return new String[]{"Blowfish", "Blowfish/CBC/PKCS5Padding"};
    }
}
