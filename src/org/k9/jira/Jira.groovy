package org.k9.jira

import org.k9.*

class Jira implements Serializable {
 	def script
 	def config

 	Jira(script, config) {
 		this.script = script
 		this.config = config
 	}

 	def createJiraTicket(){
 		def newIssue = jiraNewIssue issue: config.issue, site: 'jira'
   script.echo "in create jira method:    ${newIssue}"
 		return newIssue
 	}
 }
