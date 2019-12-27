fun main(args: Array<String>)
{
//    val myArray = Array<Int>(5) { 0 } // Fixed size defined
//    myArray[1] = 32
//    myArray[2] = 30
//
//    for (element in myArray) {
//        print("$element ")
//    }
//    println()
//
//    for (index in 0..myArray.size - 1) {
//        print("$index ")
//    }
//
//    println()
//
//    val list = listOf<String>("prabhat", "Ana", "Amie") //Immutable, Fixed size, READ only
//    for (index in 0..list.size - 1) {
//        //print(list[index])
//        print(list.get(index))
//    }
//
//    println()
//
//    val mutableList =
//        mutableListOf<String>("prabhat", "Ana", "Amie", "mutable") //mutable, no Fixed size, can add remove elements
//    mutableList.add("added new one")
//    mutableList.remove("prabhat")
//    mutableList.add(1, "raz")
//    for (index in 0..mutableList.size - 1) {
//        //print(list[index])
//        print(mutableList.get(index))
//    }
//
//    println()
//
//    val mutableArrayList = ArrayList<String>() //mutable, no Fixed size, can add remove elements
//    mutableArrayList.add("added new one")
//    mutableArrayList.add("prabhat")
//    mutableArrayList.add(1, "raz")
//    for (index in 0..mutableArrayList.size - 1) {
//        //print(list[index])
//        print(mutableArrayList.get(index))
//    }

//    val myMap = mapOf<Int, String>(2 to "A", 3 to "B", 4 to "C") // immutable , fixed
//    for (key in myMap.keys) {
//        //println("Element at key $key is ${myMap[key]}")
//        println("Element at key $key is ${myMap.get(key)}")
//    }

//    val myMap = HashMap<Int, String>() // mutable , not fixed , read and write
//    myMap.put(2,"x")
//    myMap.put(4,"y")
//    myMap.put(5,"z")
//    myMap.replace(2, "prabhat")
//    for (key in myMap.keys) {
//        //println("Element at key $key is ${myMap[key]}")
//        println("Element at key $key is ${myMap.get(key)}")
//    }
//
//    val myset = setOf<Int>(2,3,4,5,6,3,3,4,5,5,7,8,9,0) // Immutable and read only
//    for (element in myset){
//        print(element)
//    }
	
	val myMutableSet = mutableSetOf<Int>(2, 3, 4, 5, 6, 3, 3, 4, 5, 5, 7, 8, 9, 0) // Immutable and read only
	myMutableSet.remove(5)
	for (element in myMutableSet)
	{
		print(element)
	}
	
}
