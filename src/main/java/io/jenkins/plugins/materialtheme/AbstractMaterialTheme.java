package io.jenkins.plugins.materialtheme;

import io.jenkins.plugins.thememanager.Theme;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import java.util.Arrays;

public class AbstractMaterialTheme extends ThemeManagerFactory {

    public static final String BASE_CSS = "light-theme.css";
    public static final String CUSTOMISED_CSS = "bonita-jenkins-theme.css";

    @Override
    public Theme getTheme() {
        return Theme.builder().withCssUrls(
                Arrays.asList(toAssetUrl(BASE_CSS), getCssUrl(), toAssetUrl(CUSTOMISED_CSS)))
                .build();
    }
}
