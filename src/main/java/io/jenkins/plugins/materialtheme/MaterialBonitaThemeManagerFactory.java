package io.jenkins.plugins.materialtheme;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class MaterialBonitaThemeManagerFactory extends AbstractMaterialTheme {

    public static final String MATERIAL_BONITA_CSS = "theme-bonita.css";
    public static final String MATERIAL_BONITA_SYMBOL = "jenkins-bonita";

    @DataBoundConstructor
    public MaterialBonitaThemeManagerFactory() {
    }

    @Extension
    @Symbol(MATERIAL_BONITA_SYMBOL)
    public static class MaterialBonitaThemeManagerFactoryDescriptor extends AbstractMaterialThemeDescriptor {

        @NonNull
        @Override
        public String getDisplayName() {
            return "Bonita Jenkins Theme";
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new MaterialBonitaThemeManagerFactory();
        }

        @Override
        public String getThemeCssSuffix() {
            return MATERIAL_BONITA_CSS;
        }

        @Override
        public String getThemeKey() {
            return ID + "-bonita";
        }

        @Override
        public boolean isNamespaced() {
            return true;
        }
    }
}
