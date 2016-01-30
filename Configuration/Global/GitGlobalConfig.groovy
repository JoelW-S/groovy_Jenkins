import jenkins.model.*

def jenkinsInstance = Jenkins.getInstance()

def gitDescriptor = jenkinsInstance.getDescriptor('hudson.plugins.git.GitSCM')

gitDescriptor.setGlobalConfigName('jenkins-ci')
gitDescriptor.setGlobalConfigEmail('jenkins-ci@example.com')

gitDescriptor.save()
