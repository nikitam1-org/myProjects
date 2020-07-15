node{
	stage('SCM checkout')
	{
 		git 'https://github.com/nikitam1-org/myProjects.git'
	}
	stage('Compile-package')
	{
		sh 'mvn package'
	}
}
