fun main(args: Array<String>)
{
	val myNubers: List<Int> = listOf<Int>(1, 2, 34, 5, 6, 78, 99, 9, 0)
	
	val myPredictaeLambda = { num: Int -> num > 10 }
	
	//val check_1: Boolean = myNubers.all { number -> number > 10 }
	//val check_1: Boolean = myNubers.all { it > 10 }
	val check_1: Boolean = myNubers.all(myPredictaeLambda)
	println(check_1)
	
	//val check2: Boolean = myNubers.any{ it > 10 }
	val check2: Boolean = myNubers.any(myPredictaeLambda)
	println(check2)
	
	//val check3 = myNubers.count { it > 10 }
	val check3 = myNubers.count(myPredictaeLambda)
	println(check3)
	
	//val num: Int? = myNubers.find { it > 10 }
	val num: Int? = myNubers.find(myPredictaeLambda)
	println(num)
	
}
