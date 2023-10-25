// Read from STDIN in Groovy
// print "What is your name? "
// def name = System.in.newReader().readLine()
// println "Hi " + name
 
// // Read from Console in Groovy
// def name = System.console().readLine 'What is your name? '
// println "Hi " + name


// Converting string to Integer
print "First number: "
def x = System.in.newReader().readLine() as Integer
print "Second number: "
def y = System.in.newReader().readLine() as Integer
println x * y