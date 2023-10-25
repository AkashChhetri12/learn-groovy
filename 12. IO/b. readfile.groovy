String currentDir = new File(".").getAbsolutePath()

String FILE_PATH = "$currentDir/data.txt"

File file = new File(FILE_PATH)

// reading entire content as string
println file.text

println file.getText('UTF-8')


// collect line into a list
def list = file.collect { it }
println "list : $list"


// Store file content in an array
def array = file as String []
println "array : $array"


// read file into a list of string
def lines = file.readLines() 
println "readLine : $lines"


// read file line by line
file.eachLine { line ->
    println "lines -> $line"
}

// read file line by line with line no
file.eachLine { line, lineNo ->
    println "line $lineNo -> $line"
}


// read with a reader
def line;
file.withReader { reader ->
   while( (line = reader.readLine() )!= null ) {
        println "while line: $line"
   }
}


// reading with new reader
def outputFile = "data2.txt"
def reader = file.newReader()
new File(outputFile).append(reader)
reader.close()


// when working with binary file, read and show content as bytes
byte [] contents = file.bytes
println contents


// size in bytes
println file.length()

// check if is a file or dir
println file.isFile()
println file.isDirectory()

// Get list of files from dir
new File(".").eachFile {
    println it.getAbsolutePath()
}


// recursively  display all files in dir and its sub dir
new File("..").eachFileRecurse { f -> 
    println f.getAbsolutePath()
}


// copy data to another file
def new_file = new File("data3.txt")
new_file << file.text

// delete file
new_file.delete()
