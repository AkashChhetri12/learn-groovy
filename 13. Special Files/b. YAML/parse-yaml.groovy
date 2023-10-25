import groovy.yaml.YamlSlurper

def configYaml = '''\
---
application: "Sample App"
users:
- name: "Akash"
  likes:
  - Groovy
  - Python
  - Java
  - Shell
- name: "Rahul"
  likes:
  - Apples
  - Bananas
  - Mango
connections:
- "VM1"
- "VM2"
'''

def config = new YamlSlurper().parseText(configYaml)
println config


// parsing yaml file
String currentDir = new File(".").getAbsolutePath()
String FILE_PATH = "$currentDir/singleconfig.yaml"

File yaml_file = new File(FILE_PATH)
yaml_config =  new YamlSlurper().parse(yaml_file)
println yaml_config.connections
println yaml_config
