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

import static io.jenkins.plugins.materialtheme.MaterialRedThemeManagerFactory.MATERIAL_RED_CSS;
import static io.jenkins.plugins.materialtheme.MaterialRedThemeManagerFactory.MATERIAL_RED_URL_NAME;


@Extension
@Restricted(NoExternalUse.class)
public class MaterialRedThemeRootAction extends AbstractMaterialThemeRootAction {

    @Override
    public String getUrlName() {
        return MATERIAL_RED_URL_NAME;
    }

    @WebMethod(name = MATERIAL_RED_CSS)
    public void doMaterialRedThemeCss(StaplerRequest req, StaplerResponse res) throws IOException {
        tryWritingCss(res, MATERIAL_RED_CSS);
        tryWritingCss(res, "icons.css");
    }
}


/*
@Extension
@Restricted(NoExternalUse.class)
public class MaterialBlueThemeRootAction implements UnprotectedRootAction {

    @Override
    public String getIconFileName() {
        return null;
    }

    @Override
    public String getDisplayName() {
        return null;
    }

    @Override
    public String getUrlName() {
        return BLUE_URL_NAME;
    }

    private void tryWritingCss(StaplerResponse res, String css_name) throws IOException {
        try (InputStream themeInputStream = getClass().getResourceAsStream(css_name)) {
            res.setContentType("text/css");
            requireNonNull(themeInputStream);
            String s1 = IOUtils.toString(themeInputStream, StandardCharsets.UTF_8);
            res.getWriter().print(s1);
        }
    }

    @WebMethod(name = BLUE_CSS)
    public void doMaterialThemeCss(StaplerRequest req, StaplerResponse res) throws IOException {
        tryWritingCss(res, BLUE_CSS);
        tryWritingCss(res, "icons.css");
    }

    @WebMethod(name = GC_RED_CSS)
    public void doMaterialThemeGCRedCss(StaplerRequest req, StaplerResponse res) throws IOException {
        tryWritingCss(res, GC_RED_CSS);
        tryWritingCss(res, "icons.css");
    }
}
*/
