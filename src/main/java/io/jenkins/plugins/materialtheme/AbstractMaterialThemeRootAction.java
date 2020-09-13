package io.jenkins.plugins.materialtheme;

import hudson.Extension;
import hudson.model.UnprotectedRootAction;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import org.apache.commons.io.IOUtils;
import org.kohsuke.accmod.Restricted;
import org.kohsuke.stapler.StaplerResponse;
import org.kohsuke.stapler.WebMethod;

import static java.util.Objects.requireNonNull;

abstract class AbstractMaterialThemeRootAction implements UnprotectedRootAction {

    @Override
    public String getIconFileName() {
        return null;
    }

    @Override
    public String getDisplayName() {
        return null;
    }

    void tryWritingCss(StaplerResponse res, String css_name) throws IOException {
        try (InputStream themeInputStream = getClass().getResourceAsStream(css_name)) {
            res.setContentType("text/css");
            requireNonNull(themeInputStream);
            String s1 = IOUtils.toString(themeInputStream, StandardCharsets.UTF_8);
            res.getWriter().print(s1);
        }
    }
}
