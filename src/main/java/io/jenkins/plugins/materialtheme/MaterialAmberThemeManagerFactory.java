package io.jenkins.plugins.materialtheme;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class MaterialAmberThemeManagerFactory extends AbstractMaterialTheme {

    public static final String MATERIAL_AMBER_CSS = "theme-amber.css";
    public static final String MATERIAL_AMBER_SYMBOL = "material-amber";

    @DataBoundConstructor
    public MaterialAmberThemeManagerFactory() {
    }

    @Extension
    @Symbol(MATERIAL_AMBER_SYMBOL)
    public static class MaterialAmberThemeManagerFactoryDescriptor extends AbstractMaterialThemeDescriptor {

        @NonNull
        @Override
        public String getDisplayName() {
            return "Material - Amber";
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new MaterialAmberThemeManagerFactory();
        }

        @Override
        public String getThemeCssSuffix() {
            return MATERIAL_AMBER_CSS;
        }

        @Override
        public String getThemeKey() {
            return ID + "-amber";
        }

        @Override
        public boolean isNamespaced() {
            return true;
        }
    }
}
