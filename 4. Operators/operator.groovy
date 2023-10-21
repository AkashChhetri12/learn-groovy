// // 1. Airthmetic
// //     1.1 Normal Operator
// assert  1  + 2 == 3
// assert  4  - 3 == 1
// assert  3  * 5 == 15
// assert  3  / 2 == 1.5
// assert 10  % 3 == 1
// assert  2 ** 3 == 8



// //    1.2 Unary Operator

// assert +3 == 3
// assert -4 == 0 - 4

// assert -(-1) == 1

// //      POSTFIX and PREFIX increments ++ and --
// def a = 2
// def b = a++ * 3             

// assert a == 3 && b == 6

// def c = 3
// def d = c-- * 2             

// assert c == 2 && d == 6

// def e = 1
// def f = ++e + 3             

// assert e == 2 && f == 5

// def g = 4
// def h = --g + 1             

// assert g == 3 && h == 4


// //     1.3 Assignment Operator
// def a = 4
// a += 3

// assert a == 7

// def b = 5
// b -= 3

// assert b == 2

// def c = 5
// c *= 3

// assert c == 15

// def d = 10
// d /= 2

// assert d == 5

// def e = 10
// e %= 3

// assert e == 1

// def f = 3
// f **= 2

// assert f == 9


// // 2. Relational Operator

// assert 1 + 2 == 3
// assert 3 != 4

// assert -2 < 3
// assert 2 <= 2
// assert 3 <= 4

// assert 5 > 1
// assert 5 >= -2

// // 3. Logical operator
// assert !false           
// assert true && true     
// assert true || false
// //     precedence : not > and > or
// //     short circuit: https://groovy-lang.org/operators.html#_short_circuiting


// // 4. bitwise
// int a = 0b00101010
// assert a == 42
// int b = 0b00001000
// assert b == 8
// assert (a & a) == a                     
// assert (a & b) == b                     
// assert (a | a) == a                     
// assert (a | b) == a                     

// int mask = 0b11111111                   
// assert ((a ^ a) & mask) == 0b00000000   
// assert ((a ^ b) & mask) == 0b00100010   
// assert ((~a) & mask)    == 0b11010101   

// int a = 25
// int b = 20

// // println (a & b)
// println Integer.toBinaryString(20) // 10100
// println Integer.toBinaryString(25) // 11001
// println (a & b)                    // 10000

// println Integer.parseInt('10000', 2)


// // 5. Conditional
// //     not
// assert (!true)    == false                      
// assert (!'foo')   == false                      
// assert (!'')      == true    

// //     Ternary Operator
// // The ternary operator is a shortcut expression that is 
// // equivalent to an if/else branch assigning some value to a variable.

// // Instead of:

// if (string!=null && string.length()>0) {
//     result = 'Found'
// } else {
//     result = 'Not found'
// }

// // You can write:

// result = (string!=null && string.length()>0) ? 'Found' : 'Not found'
// // The ternary operator is also compatible with the Groovy truth, 
// // so you can make it even simpler:

// result = string ? 'Found' : 'Not found'

// //     elvis Operator
// // The "Elvis operator" is a shortening of the ternary operator. 
// // One instance of where this is handy is for returning a 
// // 'sensible default' value if an expression resolves to false-ish 
// // (as in Groovy truth). A simple example might look like this:

// displayName = name ? name : 'Anonymous'   // with the ternary operator, you have to repeat the value you want to assign
// displayName = name ?: 'Anonymous'              // with the Elvis operator, the value, which is tested, is used if it is not false-ish




//     elvis assignment
def num=null
num ?= 2
println num

num = 5
num ?= 2
println num