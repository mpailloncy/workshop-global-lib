#!groovy

def call(localFile, username, host, remotePath) {

	sh """
		scp -o StrictHostKeyChecking=no ${localFile} ${username}@${host}:${remotePath}	
	"""

}

