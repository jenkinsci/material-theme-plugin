package io.jenkins.plugins.materialtheme;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.Theme;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import io.jenkins.plugins.thememanager.ThemeManagerFactoryDescriptor;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class MaterialGreyThemeManagerFactory extends AbstractMaterialTheme {

    public static final String MATERIAL_GREY_CSS = "theme-grey.css";
    public static final String MATERIAL_GREY_SYMBOL = "material-grey";

    @DataBoundConstructor
    public MaterialGreyThemeManagerFactory() {
    }


    @Extension
    @Symbol(MATERIAL_GREY_SYMBOL)
    public static class MaterialGreyThemeManagerFactoryDescriptor extends AbstractMaterialThemeDescriptor {

        @NonNull
        @Override
        public String getDisplayName() {
            return "Material - Grey";
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new MaterialGreyThemeManagerFactory();
        }

        @Override
        public String getThemeCssSuffix() {
            return MATERIAL_GREY_CSS;
        }

        @Override
        public String getThemeKey() {
            return ID + "-grey";
        }
    }
}
