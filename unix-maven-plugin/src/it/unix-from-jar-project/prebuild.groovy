ant.exec(command: 'mvn install:install-file -o ' +
'-DgroupId=com.stratio.mojo.unix.it ' +
'-DartifactId=my-native ' +
'-Dversion=1.0 ' +
'-Dclassifier=${os.name}-${os.version}-${os.arch} ' +
'-Dpackaging=so ' +
'-Dfile=my-native.so ' +
'-DgeneratePom')
