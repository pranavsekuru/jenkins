def call(Map config = [:]) {
    def app = config.app ?: 'my-app'
    def target = config.target ?: 'dev'
    echo "App: ${app} | Target: ${target} | Build number: ${env.BUILD_NUMBER}"
    sh "echo Deploying ${app} to ${target}"
}
