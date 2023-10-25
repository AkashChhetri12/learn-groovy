import groovy.json.JsonSlurper


// creating it from variable
data = '''
{
    "fruits" : [
        "apple",
        "mango",
        "banana"
    ],
    "colors" : [
        "red",
        "green",
        "blue",
        "yellow"
    ],
    "details" : {
        "name" : "Akash",
        "id" : 1
    }
}
'''

def json_data = new JsonSlurper().parseText(data)
println json_data
println json_data.fruits
println json_data.colors[2]
println json_data.details
println json_data.details.name




// Reading json file
// String currentDir = new File(".").getAbsolutePath()

// String FILE_PATH = "$currentDir/example.json"

// File json_file = new File(FILE_PATH)


// json_data = new JsonSlurper().parse(json_file)

// println json_data.origin
// println json_data


// pasrsing http request
// url is in-built feature in groovy

def weather_base_url = "https://api.open-meteo.com/v1/forecast?latitude=28.6448&longitude=77.216721&current=temperature_2m,is_day&hourly=temperature_2m,visibility&daily=temperature_2m_max,temperature_2m_min,apparent_temperature_max,sunrise,sunset&timezone=GMT&forecast_days=3"

def connection = new URL(weather_base_url).openConnection()

try {

    connection.setRequestProperty("Accept", "application/json")

    def resp_code = connection.getResponseCode()
    def resp = connection.getContent()
    def resp_text = resp.text

    println resp_code
    println resp_text
    println connection.contentType
    connection.headerFields.each { println "> ${it}"}

    json_data = new JsonSlurper().parseText(resp_text)

    println json_data.current.temperature_2m
    println json_data.current.is_day
} catch( IOException e ) {
    println "failed to retrieve data. Error: ${e.message}"
} finally {
    connection.disconnect()
}
