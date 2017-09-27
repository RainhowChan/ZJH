package com.rainhowchan.zjh.tools.converter;

import org.springframework.core.convert.converter.Converter;


public class StringTrimConverter implements Converter<String, String> {
    public String convert(String source) {
        try {
            if (source != null) {
                source = source.trim();
                if ("".equals(source))
                    return null;
            }
            return source;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
