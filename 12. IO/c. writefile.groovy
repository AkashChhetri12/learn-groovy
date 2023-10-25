String currentDir = new File(".").getAbsolutePath()
String FILE_PATH = "$currentDir/data.txt"


File file = new File(FILE_PATH)

file.write("This is LINE 1") // works like append

file << "\nThis is LINE 2" // works line append

// file.text = "This is LINE 3" // overwrite all the file content


// using writer
// file.withWriter { writer ->
//     writer.writeLine("This is LINE 4")    //  overwrite all the file content
// }
//

file.append("\nThis is LINE 5") // append line in file


// length of file
println file.length() // print in bytes

// check if is a file or dir
println file.isFile()
println file.isDirectory()
println file.isHidden()

// copy or push you data to new file
def file2 = new File(currentDir + "/data2.txt")

file2 << file.text // push content of file to file 2

// remove the data or make file empty
// file.text = ""
// file.bytes = []

// rename file
def rename_file = new File ("new_data.txt")
file.renameTo(rename_file)

println file.text

// deleting the file
file.delete()
file2.delete()
rename_file.delete()


