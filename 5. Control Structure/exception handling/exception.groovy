
// println i/j  // -> this line will generate exception, how to resolve this


// try - catch


// def i = 10, j=0

// try {
//     println i/j

//     println "Hey from try"
// } catch ( Exception e ) {
//     println e.getClass().getName()
//     println e.getMessage()
//     println e.printStackTrace() // To print stacktrace
//     println "Hey from catch, exception occured!"
// }

// println "continue code execution"


// def i = 10, j=0

// try {
//     println i/j
//     println "Hey from try"
// } catch ( ArithmeticException e ) {
//     println e.getClass().getName()
//     println "Hey from catch, exception occured!"
// }



// def i = 10, j=0

// try {
//     println i/j
//     println "Hey from try"
// } catch ( e ) {
//     println e.getClass().getName()
//     println "Hey from catch, exception occured!"
// }


// try with multiple catch

def i = 10, j=0

try {
    // println i/j
    print k
} catch ( ArithmeticException e ) {
    println e.getClass().getName()
    println "Hey from catch, ArithmeticException occured!"
} catch ( Exception e ) {
    println e.getClass().getName()
    println "Hey from catch, exception occured!"
} 




// try finally
// def i = 10, j=0
// try {
//     println i/j
//     println "Hey from try"
// } finally {
//     println "Hey from finally!!"
// }

//try - catch -finally
// def i = 10, j=0
// try {
//     println i/j
//     println "Hey from try"
// } catch ( e ) {
//     println e.getClass().getName()
//     println "Hey from catch, exception occured!"
// } finally {
//     println "Hi from finally!!"
// }