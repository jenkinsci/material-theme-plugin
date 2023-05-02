package org.bonitasoft.jenkins.theme;

import io.jenkins.plugins.thememanager.ThemeManagerFactoryDescriptor;

public abstract class AbstractMaterialThemeDescriptor extends ThemeManagerFactoryDescriptor {
    public static final String ID = "jenkins";

    @Override
    public String getThemeId() {
        return ID;
    }

    @Override
    public boolean isNamespaced() {
        return true;
    }
}
