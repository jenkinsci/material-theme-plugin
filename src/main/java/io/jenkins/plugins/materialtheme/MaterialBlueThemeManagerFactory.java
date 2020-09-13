package io.jenkins.plugins.materialtheme;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.Theme;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import io.jenkins.plugins.thememanager.ThemeManagerFactoryDescriptor;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class MaterialBlueThemeManagerFactory extends ThemeManagerFactory {

    public static final String MATERIAL_BLUE_CSS = "theme-blue.css";
    // Seems like this needs to be 'theme-<descriptor_symbol>'
    public static final String MATERIAL_BLUE_URL_NAME = "theme-material-blue";

    @DataBoundConstructor
    public MaterialBlueThemeManagerFactory() {
    }

    @Override
    public Theme getTheme() {
        return Theme.builder()
                .withCssUrl(getCssUrl())
                .build();
    }
    
    @Extension
    @Symbol("material-blue")
    public static class MaterialBlueThemeManagerFactoryDescriptor extends ThemeManagerFactoryDescriptor {

        @NonNull
        @Override
        public String getDisplayName() {
            return "Material - Blue";
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new MaterialBlueThemeManagerFactory();
        }

        @Override
        public String getThemeCssSuffix() {
            return "theme-blue.css";
        }

        @NonNull
        @Override
        public String getThemeId() {
            return "material-blue";
        }
    }
}
