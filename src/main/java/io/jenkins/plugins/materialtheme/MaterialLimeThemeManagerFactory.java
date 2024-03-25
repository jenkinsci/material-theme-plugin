package io.jenkins.plugins.materialtheme;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class MaterialLimeThemeManagerFactory extends AbstractMaterialTheme {

    public static final String MATERIAL_LIME_CSS = "theme-lime.css";
    public static final String MATERIAL_LIME_SYMBOL = "material-lime";

    @DataBoundConstructor
    public MaterialLimeThemeManagerFactory() {
    }

    @Extension
    @Symbol(MATERIAL_LIME_SYMBOL)
    public static class MaterialLimeThemeManagerFactoryDescriptor extends AbstractMaterialThemeDescriptor {

        @NonNull
        @Override
        public String getDisplayName() {
            return "Material - Lime";
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new MaterialLimeThemeManagerFactory();
        }

        @Override
        public String getThemeCssSuffix() {
            return MATERIAL_LIME_CSS;
        }

        @Override
        public String getThemeKey() {
            return ID + "-lime";
        }

        @Override
        public boolean isNamespaced() {
            return true;
        }
    }
}
