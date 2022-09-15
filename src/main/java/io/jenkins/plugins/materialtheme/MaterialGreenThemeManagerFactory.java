package io.jenkins.plugins.materialtheme;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class MaterialGreenThemeManagerFactory extends AbstractMaterialTheme {

    public static final String MATERIAL_GREEN_CSS = "theme-green.css";
    public static final String MATERIAL_GREEN_SYMBOL = "material-green";

    @DataBoundConstructor
    public MaterialGreenThemeManagerFactory() {
    }

    @Extension
    @Symbol(MATERIAL_GREEN_SYMBOL)
    public static class MaterialGreenThemeManagerFactoryDescriptor extends AbstractMaterialThemeDescriptor {

        @NonNull
        @Override
        public String getDisplayName() {
            return "Material - Green";
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new MaterialGreenThemeManagerFactory();
        }

        @Override
        public String getThemeCssSuffix() {
            return MATERIAL_GREEN_CSS;
        }

        @Override
        public String getThemeKey() {
            return ID + "-green";
        }

        @Override
        public boolean isNamespaced() {
            return true;
        }
    }
}
