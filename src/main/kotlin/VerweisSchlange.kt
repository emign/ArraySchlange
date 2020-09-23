import java.util.*

class VerweisSchlange : Queue<Person> {
	override fun add(element: Person?): Boolean {
		TODO("Not yet implemented")
	}

	override fun remove(): Person {
		TODO("Not yet implemented")
	}

	override val size: Int
		get() = TODO("Not yet implemented")

	override fun addAll(elements: Collection<Person>): Boolean {
		return true
	}

	override fun clear() {

	}

	override fun iterator(): MutableIterator<Person> {
		return mutableListOf(Person("DUMMY")).iterator()
	}

	override fun contains(element: Person?): Boolean {
		return true
	}

	override fun containsAll(elements: Collection<Person>): Boolean {
		return true
	}

	override fun isEmpty(): Boolean {
		return true
	}

	override fun remove(element: Person?): Boolean {
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



}