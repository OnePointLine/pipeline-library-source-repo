
// https://jenkinsci.github.io/templating-engine-plugin/1.1.1/pages/Templating/configuration_files/default_step_implementation.html
// https://jenkinsci.github.io/templating-engine-plugin/pages/Library_Development/getting_started.html

void call(){
    node{
        sh "Hello from sync step!"
    }
}


