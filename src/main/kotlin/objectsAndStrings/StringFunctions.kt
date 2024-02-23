package objectsAndStrings

fun main(args: Array<String>){
    val pet = "Crocodile"
    println(pet.length)

    var myName = "suslik"
    println(myName.capitalize())

    val myAnimal = "Giraffe"
    println(myAnimal.decapitalize())

    val text = "   too many space at the     beginning and the end     "
    // trim() doesn't remove spacing at the middle of phrase
    println(text.trim())

    // get() return character under index
    println(myAnimal.get(2)) // or myAnimal[2]

    // get a part of a String starts with index, or starts and ends (not include ended index)
    println(myAnimal.substring(3))
    println(myAnimal.substring(3, 5))
}