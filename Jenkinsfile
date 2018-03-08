@Library('jira-test')
import org.k9.*


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
                       out = new jira.Jira(this,config)
                       echo "${out.data.key}"
 				}
 			}
 		}
 	}
 }
