package org.bonitasoft.jenkins.theme;

import io.jenkins.plugins.thememanager.Theme;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import java.util.Arrays;

public class AbstractMaterialTheme extends ThemeManagerFactory {

    @Override
    public Theme getTheme() {
        return Theme.builder().withCssUrls(
                Arrays.asList(getCssUrl()))
                .build();
    }
}
