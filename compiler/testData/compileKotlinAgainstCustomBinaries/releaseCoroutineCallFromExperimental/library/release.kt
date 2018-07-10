suspend fun dummy() {}

class C {
    suspend fun dummy() = "OK"

    class Nested {
        suspend fun dummy() = "OK"
    }

    inner class Inner {
        suspend fun dummy() = "OK"
    }
}
