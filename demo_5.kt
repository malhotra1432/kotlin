import com.sun.xml.internal.fastinfoset.util.StringArray

/*
 * Bubble sort
 */

fun main(args: Array<String>)
{
	val numbersArrayList = ArrayList<Int>()
	numbersArrayList.add(23)
	numbersArrayList.add(45)
	numbersArrayList.add(4)
	numbersArrayList.add(33)
	numbersArrayList.add(1)
	numbersArrayList.add(18)
	//val numbersList: List<Int> = listOf<Int>(23, 45, 2, 4, 1, 18)
	var pass: Int = 0
	for (currentPosition in 0 until (numbersArrayList.size - 1))
	{
		if (numbersArrayList[currentPosition] > numbersArrayList[currentPosition + 1])
		{
			val temp = numbersArrayList[currentPosition]
			numbersArrayList[currentPosition] = numbersArrayList[currentPosition + 1]
			numbersArrayList[currentPosition + 1] = temp
		}
		println("Pass ${++pass} : $numbersArrayList ")
	}

//	val nums = listOf(4, 5, 3, 2, 1, -1, 7, 6, -8, 9, -12)
//
//	val len = nums.count()
//	println("There are $len elements")
//
//	val size = nums.size
//	println("The size of the list is $size")
//
//	val n1 = nums.count { e -> e < 0 }
//	println("There are $n1 negative values")
//
//	val n2 = nums.count { e -> e % 2 == 0 }
//	println("There are $n2 even values")
	
}

