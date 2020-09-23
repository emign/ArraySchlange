import java.util.*

class Person (val name: String){
    override fun toString(): String = name
}

fun main(){
    val hans = Person("Hans")
    val peter = Person("Peter")
    val maria = Person("Maria")
    val gunter = Person("Gunter")
    val donald = Person("Donald")
    val petra = Person("Petra")
    val michael = Person("Michael")


    val schlange = ArrayWickelSchlange()

    schlange.add(hans)
    println(schlange.size)
    schlange.add(peter)
    println(schlange.size)
    println(schlange.remove())
    println(schlange.remove())
    schlange.add(maria)
    println(schlange.size)
    schlange.add(gunter)
    println(schlange.size)
    schlange.add(donald)
    println(schlange.size)
    schlange.add(petra)
    println(schlange.size)
    schlange.add(michael)

    println(schlange.remove())
    println(schlange.remove())
    schlange.add(michael)

    println(schlange)



}

class ArrayWickelSchlange(size : Int = 6) : Queue<Person>{

    var schlange = Array<Person>(size){Person("DUMMY")}
    var head = 0
    var count = 0

    override fun add(element: Person?): Boolean {
        if (count >= schlange.size){
            println("Schlange voll")
            return false
        }
        if (element != null){
            schlange[(head+count)%schlange.size]=element
            count++
        }
        return false

    }

    override fun remove(): Person {
        if (count > 0) {
            val first = schlange[head]
            schlange[head] = Person("DUMMY")
            head = (head+1)%schlange.size
            count--
            return first
        }
        println("Schlange leer. Nimm dennoch einen dummy")
        return Person("DUMMY")
    }

    override val size: Int
        get() = count

    override fun addAll(elements: Collection<Person>): Boolean {
       return true
    }

    override fun clear() {

    }

    override fun iterator(): MutableIterator<Person> {
        return schlange.toMutableList().iterator()
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

    override fun toString(): String = schlange.toList().toString()


}

