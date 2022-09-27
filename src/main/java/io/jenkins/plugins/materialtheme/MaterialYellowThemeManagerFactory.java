package io.jenkins.plugins.materialtheme;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class MaterialYellowThemeManagerFactory extends AbstractMaterialTheme {

    public static final String MATERIAL_YELLOW_CSS = "theme-yellow.css";
    public static final String MATERIAL_YELLOW_SYMBOL = "material-yellow";

    @DataBoundConstructor
    public MaterialYellowThemeManagerFactory() {
    }

    @Extension
    @Symbol(MATERIAL_YELLOW_SYMBOL)
    public static class MaterialYellowThemeManagerFactoryDescriptor extends AbstractMaterialThemeDescriptor {

        @NonNull
        @Override
        public String getDisplayName() {
            return "Material - Yellow";
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new MaterialYellowThemeManagerFactory();
        }

        @Override
        public String getThemeCssSuffix() {
            return MATERIAL_YELLOW_CSS;
        }

        @Override
        public String getThemeKey() {
            return ID + "-yellow";
        }

        @Override
        public boolean isNamespaced() {
            return true;
        }
    }
}
