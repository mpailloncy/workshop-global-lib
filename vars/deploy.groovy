#!groovy

// deploy("root", "PROD_IP", "target/*.jar")

def call(username, host, localFile) {

	def remotePath = "/root/app.jar"

	stopApplicationGracefully(username, host)

	copyFileTo(localFile, username, host, remotePath)

	sshExec(username, host, "nohup java -jar ${remotePath} &>/dev/null &")

}
