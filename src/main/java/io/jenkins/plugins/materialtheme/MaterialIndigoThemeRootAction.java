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
import static io.jenkins.plugins.materialtheme.MaterialIndigoThemeManagerFactory.MATERIAL_INDIGO_CSS;
import static io.jenkins.plugins.materialtheme.MaterialIndigoThemeManagerFactory.MATERIAL_INDIGO_URL_NAME;

@Extension
@Restricted(NoExternalUse.class)
public class MaterialIndigoThemeRootAction extends AbstractMaterialThemeRootAction {

    @Override
    public String getUrlName() {
        return MATERIAL_INDIGO_URL_NAME;
    }

    @Override
    public String getThemeCss() throws IOException {
        String base_css = this.readCssFile(MATERIAL_THEME_CSS);
        base_css = base_css.replace("<MATERIAL_PRIMARY>", "#3f51b5");
        base_css = base_css.replace("<MATERIAL_SECONDARY>", "#606FC7");
        return base_css;
    }

    @WebMethod(name = MATERIAL_INDIGO_CSS)
    public void doMaterialRedoThemeCss(StaplerRequest req, StaplerResponse res) throws IOException {
        this.doRedoThemeCss(req, res);
    }
}
