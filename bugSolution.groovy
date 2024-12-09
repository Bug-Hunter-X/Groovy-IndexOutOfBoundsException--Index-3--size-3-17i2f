def list = [1, 2, 3]
println list[3] ?: "Index out of bounds"

//Alternative solution:
if (list.size() > 3) {
    println list[3]
} else {
    println "Index out of bounds"
}
