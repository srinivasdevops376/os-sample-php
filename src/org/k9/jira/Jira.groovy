package org.k9.jira

import org.k9.*

class Jira implements serializable {
 	def script
 	def config

 	Jira(script, config) {
 		this.script = script
 		this.config = config
 	}

 	def createJiraTicket(){
 		def newIssue = jiraNewIssue issue: config.issue, site: 'jira'
 		thia.script.echo 
 		return newIssue
 	}
 }
