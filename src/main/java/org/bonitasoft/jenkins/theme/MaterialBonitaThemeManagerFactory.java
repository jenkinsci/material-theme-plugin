package org.bonitasoft.jenkins.theme;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class MaterialBonitaThemeManagerFactory extends AbstractMaterialTheme {

    public static final String BONITA_JENKINS_THEME_CSS = "bonita-jenkins-theme.css";
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
            return BONITA_JENKINS_THEME_CSS;
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
