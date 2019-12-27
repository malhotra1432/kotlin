fun main(args: Array<String>)
{
	val myNUmbers = listOf<Int>(2, 3, 4, 5, 5, 6, 78, 90)
	//val smallNumbers = myNUmbers.filter { v -> v < 10 }
	val smallNumbers: List<Int> = myNUmbers.filter { it < 10 }
//    for (num in smallNumbers) {
//        println("small numbers : $num ")
//    }
	println(smallNumbers)
	
	//val mySquarenumbers = myNUmbers.map { num -> num * num }
//    val mySquarenumbers = myNUmbers.map { it * it }
//    println(mySquarenumbers)
//
//    val myFilteredMapNumbers = myNUmbers.filter { it < 10 }.map { it * it }
//    println(myFilteredMapNumbers)
	
	val people: List<Person> = listOf<Person>(Person("Prabhat", 10), Person("Anie", 20))
	val peopleName = people.map { it.name }
	val peopleAge = people.map { it.age }
	println(peopleName)
	println(peopleAge)
	
	//val firstNameFilter = people.filter { person -> person.name.startsWith("P") }.map { it.name }
	val firstNameFilter = people.filter { it.name.startsWith("P") }.map { it.name }
	println(firstNameFilter)
}

class Person(var name: String, var age: Int)
{
	// pass
}

