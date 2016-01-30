import jenkins.model.*

def jenkinsInstance = Jenkins.getInstance()

jenkinsInstance.setSlaveAgentPort(500)

jenkinsInstance.setNumExecutors(4)

jenkinsInstance.save()
