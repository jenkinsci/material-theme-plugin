package io.jenkins.plugins.materialtheme;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.Theme;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import io.jenkins.plugins.thememanager.ThemeManagerFactoryDescriptor;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class MaterialLightBlueThemeManagerFactory extends AbstractMaterialTheme {

    public static final String MATERIAL_LIGHT_BLUE_CSS = "theme-light-blue.css";
    public static final String MATERIAL_LIGHT_BLUE_SYMBOL = "material-light-blue";

    @DataBoundConstructor
    public MaterialLightBlueThemeManagerFactory() {
    }


    @Extension
    @Symbol(MATERIAL_LIGHT_BLUE_SYMBOL)
    public static class MaterialLightBlueThemeManagerFactoryDescriptor extends AbstractMaterialThemeDescriptor {

        @NonNull
        @Override
        public String getDisplayName() {
            return "Material - Light Blue";
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new MaterialLightBlueThemeManagerFactory();
        }

        @Override
        public String getThemeCssSuffix() {
            return MATERIAL_LIGHT_BLUE_CSS;
        }

        @Override
        public String getThemeKey() {
            return ID + "-light-blue";
        }
    }
}
