#!groovy

def call(username, host, command) {
	def status = sh returnStatus: true, script:"ssh -o StrictHostKeyChecking=no -l ${username} ${host} -- ${command}"
	if(status != 0) {
		echo "WARNING! status = ${status}"
	}
}
