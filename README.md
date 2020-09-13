# jenkins-material-theme-plugin
## Summary
A Material theme plugin for Jenkins.

## Description
This is an attempt to port the Afonso F's Jenkins material theme (http://afonsof.com/jenkins-material-theme/) to use Theme Manager plugin (https://github.com/jenkinsci/theme-manager-plugin#configuring-the-plugin).
This should allow admins to easily switch theme, and also allow users to select their own theme.

## Disclaimer
I am not a front-end or Java developer. The CCS in the project has mostly been copied from http://afonsof.com/jenkins-material-theme/. The Java in this project has modified from the dark theme plugin (https://github.com/jenkinsci/dark-theme-plugin). 
I have tried to change the original CSS theme to better fit with the current state of the Jenkins CSS - using variables.
This is mainly a place for me to store . If you raise issues with the plugin I will try to fix them.

## Future work
- I would like to add the ability for users to specify a replacement head for the main Jenkins page. To do this I need to find a good way to store the logo, which I think means adding a section into in Jenkins/Configure and allowing users to upload there logo through that.
- Need to add tests to check:
  - That when a theme is loaded through the UI, that the correct theme is loaded.
