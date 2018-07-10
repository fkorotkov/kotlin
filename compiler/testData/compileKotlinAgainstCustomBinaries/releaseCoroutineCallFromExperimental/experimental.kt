suspend fun callRelease() {
    dummy()

    C().dummy()

    C.Nested().dummy()

    C().Inner().dummy()
}