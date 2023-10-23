

def employee = [
    'name' : 'John',
    'age' : 30,
    'dept': 'IT'
]

// access value
println employee // [name:John, age:30, dept:IT]

println employee.name // John

println employee['age'] // 30

println employee.get('dept') // IT

println employee.getAt('dept') // IT



// check size of the map
println employee.size() // 3


// add new elem in map
employee.put('city', 'BGLR') 
println employee // [name:John, age:30, dept:IT, city:BGLR]


// check occurance
println employee.containsKey('city') //  true 
println employee.containsValue('IT') // true


// check class of maps using which it got implemented
println employee.getClass() // class java.util.LinkedHashMap

// cloning maps 
def employee_2 = employee.clone()
assert employee_2 == employee
println employee_2 // [name:John, age:30, dept:IT, city:BGLR]


// iteration
employee.each { k, v ->
    println "$k <-> $v"
}
// output:
// name <-> John
// age <-> 30
// dept <-> IT
// city <-> BGLR

employee.eachWithIndex { k,v,i ->
    println "$i. $k <-> $v"
}
// output:
// 0. name <-> John
// 1. age <-> 30
// 2. dept <-> IT
// 3. city <-> BGLR

employee.each { e ->
    println "$e.key <-> $e.value"
}

// output:
// name <-> John
// age <-> 30
// dept <-> IT
// city <-> BGLR

employee.eachWithIndex { e, i ->
    println "$i ) $e.key <-> $e.value"
}
// output:
// 0 ) name <-> John
// 1 ) age <-> 30
// 2 ) dept <-> IT
// 3 ) city <-> BGLR