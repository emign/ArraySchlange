import java.util.*

fun main(){
	val hans = Person("Hans")
	val peter = Person("Peter")
	val maria = Person("Maria")
	val gunter = Person("Gunter")
	val donald = Person("Donald")
	val petra = Person("Petra")

	val schlange : Queue<Person> = VerweisSchlange(hans)

	schlange.add(peter)

	schlange.add(maria)
	schlange.add(gunter)
	schlange.add(donald)
	schlange.add(petra)
	println(schlange.remove())


	println(schlange.size)

}