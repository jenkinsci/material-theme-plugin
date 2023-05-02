```yaml
unclassified:
  themeManager:
    disableUserThemes: true
    theme: "bonita-jenkins-theme" 
```

## Building
To build this plugin you should only need to run:
```
mvn clean package
```
The .hpi plugin will be built inside the hpi folder

## Running (development)
To build and run this plugin you should only need to run:
```
mvn clean hpi:run
```

## Development tools
Here is a list of the tools (and versions) I have in my development enviornment - outside of those handeled in the pom.xml.
Java 11
Maven 3.5

## Thanks to
- [Jenkins Material Theme][jenkins-material-theme] for the original theme.
- [jenkins-contrib-theme][jenkins-contrib-theme] for the core theme
- [Google][google] for the the material design inspiration and the icons
- [Material Design Icons][material-design-icons] for some extra icons
- [Theme Manager][theme-manager-plugin] for the base plugin.
- [Dark Theme for Jenkins][dark-theme-plugin] for a good example of using the theme manager.

[jenkins-contrib-theme]: https://github.com/jenkins-contrib-themes/jenkins-core-theme
[google]: https://www.google.com/design/spec/material-design/introduction.html
[material-design-icons]: https://materialdesignicons.com/
[jenkins-material-theme]: https://github.com/afonsof/jenkins-material-theme
[theme-manager-plugin]: https://plugins.jenkins.io/theme-manager/
[dark-theme-plugin]: https://plugins.jenkins.io/dark-theme/
