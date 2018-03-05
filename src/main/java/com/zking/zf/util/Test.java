package com.zking.zf.util;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Test {
    public static void main(String[] args) {
        Locale locale = Locale.CHINA;

        System.out.println(locale);

        String path = "i18n";
        ResourceBundle bundle = ResourceBundle.getBundle(path, Locale.CHINA);
        String titleLabel = bundle.getString("title.label");
        System.out.println(titleLabel);

        String message = bundle.getString("message");
        message = MessageFormat.format(message, "小名", "消防");
        System.out.println(message);
    }
}
