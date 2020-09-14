package io.jenkins.plugins.materialtheme;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.Theme;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import io.jenkins.plugins.thememanager.ThemeManagerFactoryDescriptor;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class MaterialIndigoThemeManagerFactory extends ThemeManagerFactory {

    public static final String MATERIAL_INDIGO_CSS = "theme-indigo.css";
    // Seems like this needs to be 'theme-<descriptor_symbol>'
    public static final String MATERIAL_INDIGO_URL_NAME = "theme-material-indigo";

    @DataBoundConstructor
    public MaterialIndigoThemeManagerFactory() {
    }

    @Override
    public Theme getTheme() {
        return Theme.builder()
                .withCssUrl(getCssUrl())
                .build();
    }
    
    @Extension
    @Symbol("material-indigo")
    public static class MaterialIndigoThemeManagerFactoryDescriptor extends ThemeManagerFactoryDescriptor {

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
            return "theme-indigo.css";
        }

        @NonNull
        @Override
        public String getThemeId() {
            return "material-indigo";
        }
    }
}
