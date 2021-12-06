package com.vfpl;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class VFPLFileType extends LanguageFileType {
  public final static VFPLFileType INSTANCE = new VFPLFileType();

  private VFPLFileType() {
      super(VFPLLanguage.INSTANCE);
  }

  @Override
  public @NonNls @NotNull String getName() {
    return "VFPL";
  }

  @Override
  public @NotNull String getDescription() {
    return "A VFPL File";
  }

  @Override
  public @NotNull String getDefaultExtension() {
    return "vfpl";
  }

  @Override
  public @Nullable Icon getIcon() {
    return VFPLIcon.INSTANCE;
  }
}
