import jenkins.model.*
import hudson.plugins.sonar.*
import hudson.plugins.sonar.model.*

def jenkinsInstance = Jenkins.getInstance()

def sonarDescriptor = jenkinsInstance.getDescriptor('hudson.plugins.sonar.SonarPublisher')

def sonarInstallation = new SonarInstallation(
        'SONAR', //Name
        false, //disable Sonar
        'http://example.net:9000', //Sonar URL
        'http://example.db.net:1521', //database URL
        'db-user', //database user
        'db-password', //database password
        '', //sonar maven version
        '', //additional arguments
        new TriggersConfig(),
        'sonar-user', //sonar username
        'sonar-password', //sonar user password
        '' // additional properties
)

sonarDescriptor.setInstallations(sonarInstallation)

sonarDescriptor.save()