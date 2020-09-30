import java.util.*

class VerweisSchlange(var anfang : Person?) : Queue<Person> {
	override fun add(element: Person): Boolean {
		if (anfang == null){
			anfang = element
			return true
		}
		anfang?.add(element)
		return true
	}

	override fun remove(): Person? {
		val gemerkterAnfang = anfang
		anfang = anfang?.nachfolger
		return gemerkterAnfang
	}

	override val size: Int
		get() {
		if (anfang == null){
			return 0
		} else {
			return anfang!!.count()+1
		}
	}

	override fun addAll(elements: Collection<Person>): Boolean {
		return true
	}

	override fun clear() {

	}

	fun insert(element: Person, before: Person ){
		anfang = anfang?.insert(element, before)
	}

	override fun iterator(): MutableIterator<Person> {
		return mutableListOf(Person("DUMMY")).iterator()
	}

	override fun contains(element: Person?): Boolean {
		if (anfang != null){
			return anfang!!.contains(element!!)
		}
		return false
	}

	override fun containsAll(elements: Collection<Person>): Boolean {
		return true
	}

	override fun isEmpty(): Boolean {
		return true
	}

	override fun remove(element: Person): Boolean {
		anfang = anfang?.remove(element)
		return true
	}

	override fun removeAll(elements: Collection<Person>): Boolean {
		return true
	}

	override fun retainAll(elements: Collection<Person>): Boolean {
		return true
	}

	override fun offer(e: Person?): Boolean {
		return true
	}

	override fun poll(): Person {
		return Person("Dummy")
	}

	override fun element(): Person {
		return Person("Dummy")
	}

	override fun peek(): Person {
		return Person("Dummy")
	}

	fun print(){
		println("Schlange:")
		anfang?.print()
	}


}