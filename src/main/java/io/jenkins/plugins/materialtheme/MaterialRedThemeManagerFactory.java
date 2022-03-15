package io.jenkins.plugins.materialtheme;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.Theme;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import io.jenkins.plugins.thememanager.ThemeManagerFactoryDescriptor;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class MaterialRedThemeManagerFactory extends AbstractMaterialTheme {

    public static final String MATERIAL_RED_CSS = "theme-red.css";
    public static final String MATERIAL_RED_SYMBOL = "material-red";

    @DataBoundConstructor
    public MaterialRedThemeManagerFactory() {
    }

    @Extension
    @Symbol(MATERIAL_RED_SYMBOL)
    public static class MaterialRedThemeManagerFactoryDescriptor extends AbstractMaterialThemeDescriptor {

        @NonNull
        @Override
        public String getDisplayName() {
            return "Material - Red";
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new MaterialRedThemeManagerFactory();
        }

        @Override
        public String getThemeCssSuffix() {
            return MATERIAL_RED_CSS;
        }

        @Override
        public String getThemeKey() {
            return ID + "-red";
        }

        @Override
        public boolean isNamespaced() {
            return true;
        }
    }
}
