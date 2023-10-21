
// classic for loop

// for (int i = 0 ; i < 5; i++) {
//     println i
// }

// for (int i = 1, j = 1; i < 5; i++, j*=i) {
//     println "$i <-> $j"
// }


// for in loop

// for (i in 1..5) {
//     println i
// }

// for (i in [10, 20, 41]) {
//     println i
// }

// my_map = [
//     "name" : "akash",
//     "company" : "xyz"
// ]
// for (k in my_map) {
//     println "$k.key -> $k.value"
// }


// each loop
// list_l = [10, 13, 123]
// list_l.each {
//     println it // 'it' is default iterator
// }

// list_l = [10, 13, 123]
// we can change iterator name
// list_l.each { new_it ->
//     println new_it // changed default 'it' iterator with'new_it' iterator
// }


// my_map = [
//     "name" : "akash",
//     "company" : "xyz"
// ]

// my_map.each { k,v ->
//     println "$k <=> $v"
// }


// upto
// 1.upto(5) {
//     println it
// }

// times
// 5.times() {
//     println it
// }

// step
// 1.step(10,2) {
//     println it
// }

// while
// def i = 0
// while (i < 4) {
//     println i 
//     i++
// }

// do while

def i = 0
do {
    println i
    i++
} while (i < 3)