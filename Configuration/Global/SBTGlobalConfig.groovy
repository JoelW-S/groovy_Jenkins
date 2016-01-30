import jenkins.model.*
import org.jvnet.hudson.plugins.*

def jenkinsInstance = Jenkins.getInstance()
def sbtDescriptor = jenkinsInstance.getDescriptor('org.jvnet.hudson.plugins.SbtPluginBuilder')

def sbtInstallation = new SbtPluginBuilder.SbtInstallation(
        'SBT_LATEST', //name of SBT
        '/usr/local/sbt/latest/bin/sbt-launch.jar', //change to sbt-launch.jar dir
        null, //additional properties
        null //install automatic
)

sbtDescriptor.setInstallations(sbtInstallation)

sbtDescriptor.save()