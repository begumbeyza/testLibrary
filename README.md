# testLibrary
Add it in your root build.gradle at the end of repositories:
dependencies {
	        implementation 'com.github.begumbeyza:testLibrary:1.0.0'
	}
  
  Step 2. Add the dependency
  	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
