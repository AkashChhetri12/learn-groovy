
import groovy.yaml.*

data =  [
    "application":"Sample App Config 1", 
    "users":
        [
            [
                "name":"Akash", 
                "likes":
                    [
                        "Groovy", 
                        "Python", 
                        "Java", 
                        "Shell"
                    ]
            ], 
            [
                "name":"Rahul", 
                "likes":
                    [
                        "Apples", 
                        "Bananas", 
                        "Mango"
                    ]
            ]
        ], 
    "connections":
    [
        "VM1", 
        "VM2"
    ]
]



def builder = new YamlBuilder()

builder data

println builder.toString()

// Writing yaml file
String currentDir = new File(".").getAbsolutePath()

String FILE_PATH = "$currentDir/example-write.yaml"

File yaml_file = new File(FILE_PATH)


yaml_file.write(builder.toString())

println yaml_file.text
