package org.k9.jira

@Grapes(
    @Grab(group='com.atlassian.jira', module='jira-api', version='7.1.0-QR20151229171111', scope='provided')
)


import com.atlassian.jira.component.ComponentAccessor
import org.k9.*

class Jira implements Serializable {
 	def script
 	def config

 	Jira(script, config) {
 		this.script = script
 		this.config = config
 	}

 	def createJiraTicket(){
   script.echo "config   ${config}"
   def issue = config.toString()
 //		def newIssue = jiraNewIssue issue: config, site: 'jira'
  // script.echo "in create jira method:    ${newIssue}"
 	//	return newIssue
 	IssueService issueService = ComponentAccessor.getInstance().getIssueService();
 	script.echo "issue service ${issueService}"
 	}
 }
