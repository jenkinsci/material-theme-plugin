package io.jenkins.plugins.materialtheme;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class MaterialPurpleThemeManagerFactory extends AbstractMaterialTheme {

    public static final String MATERIAL_PURPLE_CSS = "theme-purple.css";
    public static final String MATERIAL_PURPLE_SYMBOL = "material-purple";

    @DataBoundConstructor
    public MaterialPurpleThemeManagerFactory() {
    }

    @Extension
    @Symbol(MATERIAL_PURPLE_SYMBOL)
    public static class MaterialPurpleThemeManagerFactoryDescriptor extends AbstractMaterialThemeDescriptor {

        @NonNull
        @Override
        public String getDisplayName() {
            return "Material - Purple";
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new MaterialPurpleThemeManagerFactory();
        }

        @Override
        public String getThemeCssSuffix() {
            return MATERIAL_PURPLE_CSS;
        }

        @Override
        public String getThemeKey() {
            return ID + "-purple";
        }

        @Override
        public boolean isNamespaced() {
            return true;
        }
    }
}
