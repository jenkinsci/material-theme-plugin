package io.jenkins.plugins.materialtheme;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.Theme;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import io.jenkins.plugins.thememanager.ThemeManagerFactoryDescriptor;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class MaterialRedThemeManagerFactory extends ThemeManagerFactory {

    public static final String MATERIAL_RED_CSS = "theme-red.css";
    public static final String MATERIAL_RED_SYMBOL = "material-red";
    // Seems like this needs to be 'theme-<descriptor_symbol/theme_id>'
    public static final String MATERIAL_RED_URL_NAME = "theme-material-red";

    @DataBoundConstructor
    public MaterialRedThemeManagerFactory() {
    }

    @Override
    public Theme getTheme() {
        return Theme.builder()
                .withCssUrl(getCssUrl())
                .build();
    }
    
    @Extension
    @Symbol(MATERIAL_RED_SYMBOL)
    public static class MaterialRedThemeManagerFactoryDescriptor extends ThemeManagerFactoryDescriptor {

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

        @NonNull
        @Override
        public String getThemeId() {
            return MATERIAL_RED_SYMBOL;
        }
    }
}
