@Library('jira-test')
import org.k9.*


pipeline {
 	agent any 
 	stages {
 		stage('JIRA') {
 			steps {
 				script {
 					def config = [fields: [ project: [key: 'MRM'],
                       summary: 'New JIRA Created from Jenkins.',
                       description: 'New JIRA Created from Jenkins.',
                       issuetype: [name: 'Task']]]
                      def out = new jira.Jira(this,config)
      out.createJiraTicket()
                       echo "${out}"
 				}
 			}
 		}
 	}
 }
