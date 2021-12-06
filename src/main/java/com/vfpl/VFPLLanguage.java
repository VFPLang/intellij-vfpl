package com.vfpl;


import com.intellij.lang.Language;

public class VFPLLanguage extends Language {
    public static final VFPLLanguage INSTANCE = new VFPLLanguage();


    private VFPLLanguage() {
        super("VFPL");
    }
}
