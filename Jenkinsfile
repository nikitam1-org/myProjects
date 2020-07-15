node{
	stage('SCM checkout')
	{
 		git 'https://github.com/nikitam1-org/myProjects.git'
	}
	stage('Compile-packge')
	{
		sh 'mvn package'
	}
}
