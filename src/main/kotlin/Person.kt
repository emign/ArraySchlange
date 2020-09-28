class Person (val name: String, var nachfolger : Person? = null) {

    fun add(person : Person){
        if (nachfolger == null) {
            nachfolger = person
            return
        }
        nachfolger?.add(person)
    }

    fun count() : Int {
        if (nachfolger == null){
            return 0
        }
        else {
            return nachfolger!!.count()+1
        }
    }

    override fun toString(): String {
        return "$name"
    }

}