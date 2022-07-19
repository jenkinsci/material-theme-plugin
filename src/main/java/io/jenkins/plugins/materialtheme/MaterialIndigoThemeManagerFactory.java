package io.jenkins.plugins.materialtheme;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class MaterialIndigoThemeManagerFactory extends AbstractMaterialTheme {

    public static final String MATERIAL_INDIGO_CSS = "theme-indigo.css";
    public static final String MATERIAL_INDIGO_SYMBOL = "material-indigo";

    @DataBoundConstructor
    public MaterialIndigoThemeManagerFactory() {
    }


    @Extension
    @Symbol(MATERIAL_INDIGO_SYMBOL)
    public static class MaterialIndigoThemeManagerFactoryDescriptor extends AbstractMaterialThemeDescriptor {

        @NonNull
        @Override
        public String getDisplayName() {
            return "Material - Indigo";
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new MaterialIndigoThemeManagerFactory();
        }

        @Override
        public String getThemeCssSuffix() {
            return MATERIAL_INDIGO_CSS;
        }

        @Override
        public String getThemeKey() {
            return ID + "-indigo";
        }
    }
}
