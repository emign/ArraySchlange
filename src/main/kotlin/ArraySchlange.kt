import java.util.*

class Person (val name: String) {
    override fun toString(): String {
        return name.toString()
    }
}

fun main(){
    val hans = Person("Hans")
    val peter = Person("Peter")
    val maria = Person("Maria")
    val gunter = Person("Gunter")
    val donald = Person("Donald")
    val petra = Person("Petra")

    val schlange : Queue<Person> = ArraySchlange()

    schlange.add(hans)
    schlange.add(peter)
    schlange.add(maria)
    schlange.add(gunter)
    schlange.add(donald)
    schlange.add(petra)

    println(schlange.size)
    println(schlange.remove())
    println(schlange.remove())
    println(schlange.remove())
    println(schlange.remove())
}

class ArraySchlange(size : Int = 10) : Queue<Person>{


    // Unschöner Workaround um nullables zu vermeiden
    var schlange = Array<Person>(size){Person("DUMMY")}

    // Erstes leeres Feld der Schlange
    var pos = 0

    override fun add(element: Person?): Boolean {
        if (pos >= schlange.size-1){
            println("Fehler: Schlange voll")
            return false
        }
        if (element != null) {
            schlange[pos] = element
            pos++
            return true
        }
        return false
    }

    override fun remove(): Person {
        val first = schlange[0]
        for (i in 0..schlange.size-2){
           schlange[i] = schlange[i+1]
       }
        return first
    }

    override val size: Int
        get()  {
            var counter = 0
            for (element in schlange){
                if (element.name != "DUMMY"){
                    counter++
                }
            }
            return counter
        }

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

}