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

import static io.jenkins.plugins.materialtheme.MaterialBlueThemeManagerFactory.MATERIAL_BLUE_CSS;
import static io.jenkins.plugins.materialtheme.MaterialBlueThemeManagerFactory.MATERIAL_BLUE_URL_NAME;

@Extension
@Restricted(NoExternalUse.class)
public class MaterialBlueThemeRootAction extends AbstractMaterialThemeRootAction {

    @Override
    public String getUrlName() {
        return MATERIAL_BLUE_URL_NAME;
    }

    @WebMethod(name = MATERIAL_BLUE_CSS)
    public void doMaterialBlueThemeCss(StaplerRequest req, StaplerResponse res) throws IOException {
        tryWritingCss(res, MATERIAL_BLUE_CSS);
        tryWritingCss(res, "icons.css");
    }
}
