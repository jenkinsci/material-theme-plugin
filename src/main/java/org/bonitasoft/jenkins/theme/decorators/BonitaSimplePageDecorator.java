package org.bonitasoft.jenkins.theme.decorators;

import hudson.Extension;
import jenkins.model.SimplePageDecorator;

@Extension
public class BonitaSimplePageDecorator extends SimplePageDecorator {

   public String getProductName() {
     return "Bonita Continuous Delivery";
   }

}
