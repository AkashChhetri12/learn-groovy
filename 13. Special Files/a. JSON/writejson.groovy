import groovy.json.*

// creating it from variable

data = [
    "fruits" :
        [
            "apple", 
            "mango", 
            "banana"
        ], 
    "colors":
        [
            "red", 
            "green", 
            "blue", 
            "yellow"
        ], 
    "details":
        [
            "name":"Akash", 
            "id":"1"
        ]
    ]

// convert map to json
def json_str = JsonOutput.toJson(data)
println(json_str)


// pretty print in console
def json_data = new JsonBuilder(data).toPrettyString()
// println json_data

// Writing json file
String currentDir = new File(".").getAbsolutePath()

String FILE_PATH = "$currentDir/example-write.json"

File json_file = new File(FILE_PATH)


json_file.write(json_data)

println json_file.text



// using JsonOutput.prettyprint
def json_data2 = JsonOutput.prettyPrint(JsonOutput.toJson([test: 'test', test2: 'test2']))
// println json_data2