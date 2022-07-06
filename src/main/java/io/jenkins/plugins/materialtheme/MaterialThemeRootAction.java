package io.jenkins.plugins.materialtheme;

import hudson.Extension;
import hudson.Plugin;
import hudson.model.UnprotectedRootAction;
import jenkins.model.Jenkins;
import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.StaplerResponse;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.Arrays;

import static io.jenkins.plugins.materialtheme.AbstractMaterialTheme.BASE_CSS;
import static io.jenkins.plugins.materialtheme.AbstractMaterialTheme.CUSTOMISED_CSS;
import static io.jenkins.plugins.materialtheme.MaterialIndigoThemeManagerFactory.MATERIAL_INDIGO_CSS;
import static io.jenkins.plugins.materialtheme.MaterialRedThemeManagerFactory.MATERIAL_RED_CSS;

@Extension
public class MaterialThemeRootAction implements UnprotectedRootAction {
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
        return "theme-material";
    }


    public void doDynamic(StaplerRequest req, StaplerResponse rsp) throws IOException, ServletException {
        String cssFile = req.getRestOfPath();
        if (cssFile.startsWith("/")) {
            cssFile = cssFile.substring(1);
        }
        if (!Arrays.asList(BASE_CSS, MATERIAL_INDIGO_CSS, MATERIAL_RED_CSS, CUSTOMISED_CSS)
                .contains(cssFile)) {
            rsp.sendError(404);
            return;
        }
        final Plugin plugin = Jenkins.get().getPlugin("material-theme");
        if (plugin == null) {
            rsp.sendError(404);
            return;
        }
        plugin.doDynamic(req, rsp);
    }
}
