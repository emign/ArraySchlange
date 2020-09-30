
import java.util.*

fun main(){
	val hans = Person("Hans")
	val peter = Person("Peter")
	val maria = Person("Maria")
	val gunter = Person("Gunter")
	val donald = Person("Donald")
	val petra = Person("Petra")
	val petra2 = Person("Pe2tra")

	val neu = Person("NEU")

	val schlange  = VerweisSchlange(hans)
	schlange.add(peter)

	schlange.add(maria)
	schlange.add(gunter)
	schlange.add(donald)
	schlange.add(petra)
	schlange.print()
	schlange.remove(peter)
	schlange.print()



	schlange.print()



}
