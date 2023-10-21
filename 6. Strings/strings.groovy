
// String name = "Akash" // -> Defining string datatype
// println name

// def name = "Akash"  // -> Dynamic typing
// println name

// // - single quoted i.e. '....'

// // now if we use single quotes

// println 'My name is ' + name
// println 'My name is '.concat(name)
// println 'My name is ${name}' // --> This is called string interpolation
// println 'My name is $name'  // --> This is called string interpolation


//  // - double quoted i.e. "...."

// // printing with double quotes
// println "My name is " + name
// println "My name is ".concat(name)
// println "My name is ${name}" // --> This is called string interpolation
// println "My name is $name"  // --> This is called string interpolation




// - triple single quoted i.e. ''' .... '''

// def s1 =  '''Comments are used to document your code. 
// Comments in Groovy can be single line or multiline.

// Single line comments are identified by using the // at any position in the line. 

// Multiline comments are identified with /* in the beginning and */ to identify the end of the multiline comment.
//  '''

//  print s1





   
    // - triple double quoted i.e. """ .... """
// def lang_s = "Groovy"
// def s1 =  """Comments are used to document your code. 
// Comments in $lang_s can be single line or multiline.

// Single line comments are identified by using the // at any position in the line. 

// Multiline comments are identified with /* in the beginning and */ to identify the end of the multiline comment.
// """

//  print s1





// Some string related functions

// def name = "akash"

// println name.length() // 5
// println name[1] // k
// println name.getAt(1) // k
// println name[-2] // s
// println name[0..2] // aka
// println name[4..2] // hsa
// println name[-1..-3] //hsa
// println name[0,2,4] // aah

// println name.indexOf('s') // 3
// println name.indexOf('a') // 0

// println name.substring(2) // ash
// println name.substring(1, 4) // kas
// println name.toUpperCase() // AKASH

// name = "AKASH"

// println name.toLowerCase() // akash


// def s2 = "This is groovy"

// println s2.split(" ") // [This, is, groovy]
// println s2-(" is ") // Thisgroovy
// println s2.replace("groovy", "GROOVY!!") // This is GROOVY!!

// println s2.toList() // [T, h, i, s,  , i, s,  , g, r, o, o, v, y]

// println "Hi " * 3 // Hi Hi Hi

// println "XYZ".equals("XYZ") // true
// println "xyz".equalsIgnoreCase("XYZ") // true








    // - slashy  i.e. /....../



def str = /slashy: This is Akash/
println str

def name = "Akash"
str = /slashy: This is $name/
println str

// How to print double quotes in string
// sol. either use single quoted string or use slashy string

str = 'single quotes: This is "Akash"'
println str

// what if name is variable
str = 'single quotes : This is "$name"' // -> will not interpolate
println str

str = "escape quotes: This is \"$name\"" // -> we need to use \ to escape "
println str

// with slashy string we don't need to bother about it
str = /slashy : This is "Akash"/
println str

str = /slashy : This is "$name"/
println str

    // - dollar slashy $/......$/

str = $/dollar slashy : This is "Akash"/$
println str

str = $/dollar slashy : This is "$name"/$
println str


// usage of slashy and dollar slashy
// If we are defining the regular expression pattern, then slashy strings
// are useful as we don't need to escape backslashes. i.e /\s=/
// However, if we need a forward slash in pattern, we need a dollar 
// slashy string i.e. $/([a-z]+)/([a-z]+)/$ 