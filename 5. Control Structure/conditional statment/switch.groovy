
// 5.1.2 switch case

def x = 4
def result = ""

// switch (x) {
//     case "foo":
//         result = "found foo"
//         // lets fall through

//     case "bar":
//         result += "bar"

//     case [4, 5, 6, 'inList']:
//         result = "list"
//         break

//     case 12..30:
//         result = "range"
//         break

//     case Integer:
//         result = "integer"
//         break

//     case Number:
//         result = "number"
//         break

//     case { it < 0 }: // or { x < 0 }
//         result = "negative"
//         break

//     default:
//         result = "default"
// }

// // assert result == "number"
// println (result)

// Another way of writing switch case is
// def person = "Romeo"
// def partner = switch(person) {
//     case 'Romeo'  -> 'Juliet'
//     case 'Adam'   -> 'Eve'
//     case 'Antony' -> 'Cleopatra'
//     case 'Bonnie' -> 'Clyde'
// }

// println partner


def num = "hhads"

switch (num) {
    case { (num instanceof Integer) && num == 0 } : println "num is 0"; break;
    case { (num instanceof Integer) && num > 0 } : println "num is +ve"; break;
    case { (num instanceof Integer) && num < 0 } : println "num is -ve"; break;
    default : println "enter valid input"
}