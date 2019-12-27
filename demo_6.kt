fun main(args: Array<String>)
{
	val country = Country()
	//country.name = "India"
	country.setUp()
	print(country.name)
	
}

class Country
{
	lateinit var name: String
	fun setUp()
	{
		name = "usa"
	}
}

// lateinit can be used only with mutable data type(var)
//lateinit can be used only with non-nullable data type
//lateinit values must be initialized before you use it
