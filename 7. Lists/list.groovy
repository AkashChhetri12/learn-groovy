

def fruits = [ "apple" , "mango", "banana", "grapes", "tomato"]

println fruits // [apple, mango, banana, grapes, tomato]

println fruits[0] // apple
println fruits.get(0) // apple
println fruits.getAt(0) // apple


def test_list = [ 1, 2, 3, ["A", "B", "This is groovy"], 4 ]

println test_list[3][1] // B
println test_list.get(3).get(1) // B
println test_list.get(3)[1] //B


println test_list[0..2] // [1, 2, 3]
println test_list[3][0..1] // [A, B]


// backward printing
println test_list[4..2]  // [4, [A, B, This is groovy], 3]



// funcitons

println test_list.contains(3) // true
println test_list.contains(6) // false

println test_list.get(3).contains("A") // true

// check size
println test_list.size() // 5
println test_list[3].size() // 3


// Add elem

test_list.add("new_ele1") // [1, 2, 3, [A, B, This is groovy], 4, new_ele1]
println test_list

test_list << "new_ele2" // [1, 2, 3, [A, B, This is groovy], 4, new_ele1, new_ele2]
println test_list

test_list.add(3, "new_ele3") // [1, 2, 3, new_ele3, [A, B, This is groovy], 4, new_ele1, new_ele2]
println test_list



// remove elem

test_list.remove(3) // [1, 2, 3, [A, B, This is groovy], 4, new_ele1, new_ele2]
println test_list



// string concatenation

test_list = test_list.plus(["con_elem1", "con_elem2"]) // [1, 2, 3, [A, B, This is groovy], 4, new_ele1, new_ele2, con_elem1, con_elem2]
println test_list

test_list += [10, 20] // [1, 2, 3, [A, B, This is groovy], 4, new_ele1, new_ele2, con_elem1, con_elem2, 10, 20]
println test_list


// subs list

test_list.minus(["con_elem1", "con_elem2"]) // [1, 2, 3, [A, B, This is groovy], 4, new_ele1, new_ele2, 10, 20]
println test_list

test_list -= [10, 20] // [1, 2, 3, [A, B, This is groovy], 4, new_ele1, new_ele2]
println test_list


// pop elem:

// remove first item
test_list.pop() // [2, 3, [A, B, This is groovy], 4, new_ele1, new_ele2]
println test_list

// remove last item
test_list.removeLast() // [2, 3, [A, B, This is groovy], 4, new_ele1]
println test_list


// check intersection i.e. getting common elements b/w lsit
println test_list.intersect([1,2,3]) // [2, 3]


// reverse list
println test_list.reverse() // [new_ele1, 4, [A, B, This is groovy], 3, 2]

// sort list 
println test_list.sort() // [2, 3, 4, new_ele1, [A, B, This is groovy]]

// checking empty list
println test_list.isEmpty() // false

// clear list and check is empty
println test_list.clear() // null
println test_list.isEmpty() // true