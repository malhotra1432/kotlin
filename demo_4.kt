/*
* WAP to find length of the name
 */

fun main(args: Array<String>)
{
	val name: String? = "null"
	
	/*
	 * 1. Safe call (?.)
	 * returns themeClient length if 'name' is not null else returns NULL
	 * Use it if you don't mind getting null value
	 */
	
	println("The length of the name is ${name?.length}")
	
	/*
     * 2. Safe call with let (?.let)
     * It executes the block only if name is NOT NULL
	 */
	
	val name2: String? = null
	name2?.let {
		println("${name2.length}")
	}
	
	/*
	 * 3. Elvis-operator (?:)
	 * when we have nullable reference "name", we can say "is name is not null", use it,
	 * otherwise use some non-null value
	 */
	val name3: String? = "Prabhat"


//	val len = if (name3 != null)
//                        name3.length
//                    else
//                        -1
	val len = name3?.length ?: -1
	println("$len")
	
	/*
	 * 4. Non-null assertion operator (!!)
	 * use it when you are sure that value is not null
	 * Throws nullPointerException if the value is NULL
	 */
	val name4: String? = "null"
	println("name is ${name4!!.length}")
	
	
}
