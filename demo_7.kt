val pi: Float by lazy { 3.14f }

fun main(args: Array<String>)
{
	val araea1 = pi * 4 * 4
	val area2 = pi * 5 * 5 // pi value comes from cache
}

/*
 * lazy
 * 'lazy initialization' wasExperimental designed to prevent unnecessary initialization of objects
 * your variables will not be initialized unless you use it in code
 * It is initialized only once. Next time when you use it, you get the value from cache memory 
 */
