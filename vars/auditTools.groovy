def call() {
    node {
      sh '''
        git version
        sudo docker version 
      '''
    }
}
