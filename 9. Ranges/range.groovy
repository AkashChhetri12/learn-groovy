

def r1 = 1..10

println r1 // 1..10

// check class
println r1.getClass() // groovy.lang.IntRange

// check size
println r1.size() // 10

// check where range starts from and end at
println r1.getFrom() // 1
println r1.getTo() // 10

// get value from particular position
println r1.get(2) // 3
println r1[2] // 3

// check contains
println r1.contains(9) // true
println r1.contains(11) // false

// check whether range is reverse 
println r1.isReverse() // false

def r2 = 5..1
println r2.isReverse() // true

// create subrange from range
def r3 = r1.subList(3, 6)
println r3 // 4..6

// create exclusive range
def r4 = 'a'..<'e'
println r4 // a..d



// iterate over range
for ( i in 1..3) {
    println i
}
// output:
// 1
// 2
// 3

for ( i in r3 ) {
    println i
}
// output:
// 4
// 5
// 6

r4.each {
    println "$it"
}
// output:
// a
// b
// c
// d

