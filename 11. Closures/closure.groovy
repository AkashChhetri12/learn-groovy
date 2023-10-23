
// defining and calling closure
def closure_1 = { println "Hello World.." }
closure_1() // Hello World..
closure_1.call() // Hello World..


// pass parameter to closure

def closure_2 = { name -> 
                    println "Hello $name.." 
                }
closure_2("Akash") // Hello Akash..
closure_2.call("Akash") // Hello Akash..


// Refer Variables
def message = "How are you?"
def closure_3 = { name ->
                    println "Hello $name.. $message"
                }
closure_3.call("Akash") // Hello Akash.. How are you?
/* This is something you will not be do with methods. */
// def printMessage() {
//     println "$message" // this will throw a property not found exception
// }
// printMessage()


// Passing closures as parameter to method
def printMessage(clos) {
    clos.call("Ram")
}
printMessage(closure_3) // Hello Ram.. How are you?
// passing varargs
def concat1 = { String... args -> println args.join(" ") } 
concat1('abc','def') // abc def
def concat2 = { String [] args -> println args.join(" ") }
concat2('abc','def') // abc def


// Closure with return 
def closure_4 = { a, b, c ->
                    return (a+b+c)
                }
println closure_4.call(10, 40, 50) // 100
println closure_4(10, 40, 50) // 100


// using closure function
// list:
def fruits = [ "apple", "mango", "grapes", "banana" ]
fruits.each { println it }
// output:
// apple
// mango
// grapes
// banana

// map:
def emp =  [name:'John', age:30, dept:'IT', city:'BGLR']
emp.each { k, v ->
    println "$k <-> $v"
}
// output:
// name <-> John
// age <-> 30
// dept <-> IT
// city <-> BGLR

// Some other functions with closures
def nums = [1,2,3,4,5,3,6,3,7,8]

println nums.find { item -> item == 3 }  // 3 - that means 3 is in list
println nums.find { item -> item == 9 }  // null - that means 9 is no in list


println nums.findAll { item -> item == 3 } // [3, 3, 3]
println nums.findAll {item -> item > 4 } // [5, 6, 7, 8]


println nums.any { i -> i > 3 && i < 7 } // true - that means between 3 and 7 there is some number
println nums.any { i -> i < 1 || i > 8 } // false


println nums.every { i -> i > 3 } // false - that means in array some array elements are equal and < 3
println nums.every { i -> i >= 1 && i <= 8 } // true



println nums.collect { i -> i*10 }
