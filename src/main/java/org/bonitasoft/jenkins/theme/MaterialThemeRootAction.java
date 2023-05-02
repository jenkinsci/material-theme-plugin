package org.bonitasoft.jenkins.theme;

import hudson.Extension;
import hudson.Plugin;
import hudson.model.UnprotectedRootAction;
import jenkins.model.Jenkins;
import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.StaplerResponse;

import javax.servlet.ServletException;
import java.io.IOException;

import static org.bonitasoft.jenkins.theme.MaterialBonitaThemeManagerFactory.BONITA_JENKINS_THEME_CSS;

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

    /**
     * This value is different from the rest of the ids because of ThemeManagerFactory#toAssetUrl
     */
    @Override
    public String getUrlName() {
        return "theme-jenkins";
    }


    public void doDynamic(StaplerRequest req, StaplerResponse rsp) throws IOException, ServletException {
        String cssFile = req.getRestOfPath();
        if (cssFile.startsWith("/")) {
            cssFile = cssFile.substring(1);
        }
        if (!cssFile.equals(BONITA_JENKINS_THEME_CSS)) {
            rsp.sendError(404);
            return;
        }
        final Plugin plugin = Jenkins.get().getPlugin("bonita-jenkins-theme");
        if (plugin == null) {
            rsp.sendError(404);
            return;
        }
        plugin.doDynamic(req, rsp);
    }
}
