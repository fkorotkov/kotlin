val x = foo.bar()
        .baz()
        .quux()

val y = xyzzy(foo.bar().baz().quux())

fun foo() {
    foo.bar()
            .baz()
            .quux()

    z = foo.bar()
            .baz()
            .quux()

    z += foo.bar()
            .baz()
            .quux()

    return foo.bar()
            .baz()
            .quux()
}

// SET_INT: METHOD_CALL_CHAIN_WRAP = 2
// SET_FALSE: WRAP_FIRST_METHOD_IN_CALL_CHAIN