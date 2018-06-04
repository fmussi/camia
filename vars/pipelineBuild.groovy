#!/usr/bin/env groovy
//Leave the above line alone.  It identifies this as a groovy script.

// adding specific vars for utf
def utfProjPath = "source\\utf\\lvClass\\LV Class.lvproj"
def lvVersion = 2017

def call(viPath, projPath, buildTarget, buildSpec)
{
node
  {
    stage('PreClean')
      {
       echo 'Cleaning out the workspace'
       preClean()
      }
    stage ('SCM_Checkout'){
       echo 'Attempting to get source from repo...'
       checkout scm
      }
    stage ('Temp Directories')
      {
      bat 'mkdir build_temp'
      }
    stage ('Run VI')
      {
        echo 'Attempting to run the VI specified'
        runVI(viPath)
      }
	stage ('UTF Tests')
	  {
		echo 'Running UTF tests'
		utfTest("${WORKSPACE}\\${utfProjPath}",lvVersion)
	  }
    stage ('LabVIEW Build')
      {
       echo 'Attempting to build the specification requested'
       LV_Build(projPath, buildTarget, buildSpec)
      }
     stage('PostClean')
      {
      postClean()
      }
  }
}
