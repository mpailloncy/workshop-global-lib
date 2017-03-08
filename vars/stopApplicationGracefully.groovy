def call(username, hostname) {

	sshExec(username, hostname, "sudo killall -9 java")

}
