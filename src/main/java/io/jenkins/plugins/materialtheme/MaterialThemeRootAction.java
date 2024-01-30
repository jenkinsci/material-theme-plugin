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
import static io.jenkins.plugins.materialtheme.MaterialGreyThemeManagerFactory.MATERIAL_GREY_CSS;
import static io.jenkins.plugins.materialtheme.MaterialLightBlueThemeManagerFactory.MATERIAL_LIGHT_BLUE_CSS;
import static io.jenkins.plugins.materialtheme.MaterialGreenThemeManagerFactory.MATERIAL_GREEN_CSS;
import static io.jenkins.plugins.materialtheme.MaterialYellowThemeManagerFactory.MATERIAL_YELLOW_CSS;
import static io.jenkins.plugins.materialtheme.MaterialPurpleThemeManagerFactory.MATERIAL_PURPLE_CSS;
import static io.jenkins.plugins.materialtheme.MaterialLimeThemeManagerFactory.MATERIAL_LIME_CSS;

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

    private static final String css_files[] = new String[] {
        BASE_CSS,
        MATERIAL_INDIGO_CSS,
        MATERIAL_RED_CSS,
        MATERIAL_GREY_CSS,
        MATERIAL_LIGHT_BLUE_CSS,
        MATERIAL_GREEN_CSS,
        MATERIAL_YELLOW_CSS,
        MATERIAL_PURPLE_CSS,
        MATERIAL_LIME_CSS,
        CUSTOMISED_CSS
    };

    public void doDynamic(StaplerRequest req, StaplerResponse rsp) throws IOException, ServletException {
        String cssFile = req.getRestOfPath();
        if (cssFile.startsWith("/")) {
            cssFile = cssFile.substring(1);
        }
	if (!Arrays.asList(css_files).contains(cssFile)) {
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
