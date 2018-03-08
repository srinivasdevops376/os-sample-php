@Library('jira-test')
import org.k9.jira.Jira


pipeline {
 	agent any 
 	stages {
 		stage('JIRA') {
 			steps {
 				script {
 					config = [fields: [ project: [key: 'MRM'],
                       summary: 'New JIRA Created from Jenkins.',
                       description: 'New JIRA Created from Jenkins.',
                       issuetype: [name: 'Task']]]
                       out = new Jira(this,config)
                       echo "${out.data.key}"
 				}
 			}
 		}
 	}
 }
