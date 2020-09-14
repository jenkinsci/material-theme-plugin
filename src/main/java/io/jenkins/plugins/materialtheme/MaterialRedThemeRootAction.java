package io.jenkins.plugins.materialtheme;

import hudson.Extension;
import hudson.model.UnprotectedRootAction;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import org.apache.commons.io.IOUtils;
import org.kohsuke.accmod.Restricted;
import org.kohsuke.accmod.restrictions.NoExternalUse;
import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.StaplerResponse;
import org.kohsuke.stapler.WebMethod;

import static io.jenkins.plugins.materialtheme.AbstractMaterialThemeRootAction.MATERIAL_THEME_CSS;
import static io.jenkins.plugins.materialtheme.MaterialRedThemeManagerFactory.MATERIAL_RED_CSS;
import static io.jenkins.plugins.materialtheme.MaterialRedThemeManagerFactory.MATERIAL_RED_URL_NAME;


@Extension
@Restricted(NoExternalUse.class)
public class MaterialRedThemeRootAction extends AbstractMaterialThemeRootAction {

    @Override
    public String getUrlName() {
        return MATERIAL_RED_URL_NAME;
    }

    @Override
    public String getThemeCss() throws IOException {
        String base_css = this.readCssFile(MATERIAL_THEME_CSS);
        base_css = base_css.replace("<MATERIAL_PRIMARY>", "#f44336");
        base_css = base_css.replace("<MATERIAL_SECONDARY>", "#e76056");
        return base_css;
    }
}
