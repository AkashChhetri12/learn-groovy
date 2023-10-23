

// Method1: without arguments

// def printHello() {
//     println "Say Hello..."
// }
// printHello()


// Method 2: with argument

// def printHello(String name) {
//     println "Say Hello $name ..."
// }
// printHello("Groovy")
// printHello() // -> This will raise exception

// Method 3: Default parameters

// def printHello(String name = "vs") {
//     println "Say Hello $name ..."
// }
// printHello()

// If we have more than arguments and want to some parameters default

// def sum (int a, int b = 0) {
//     println "Sum is " + (a+b)
// }
// sum(10) // -> this will assign a=10


// now if we set a to default
// def sum (int a=0, int b) {
//     println "Sum is " + (a+b)
// }
// sum(20) // this will assign b=10
// sum(b=10, a=20) // change parameter passing order at calling



// Method 4: Return Statement

def sum(int a,  int b) {
    s = a+b
    return s
}
result = sum(10, 30)
println "Sum is " + result


