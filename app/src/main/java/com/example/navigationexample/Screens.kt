package com.example.navigationexample

/* As the word sealed suggests, sealed classes conform to restricted or bounded class hierarchies.
A sealed class defines a set of subclasses within it.
 It is used when it is known in advance that a type will conform to one of the subclass types.
 Sealed classes ensure type safety by restricting the types to be matched at compile-time rather than at runtime.
 */
sealed class Screens (val route: String) {
    object WelcomeScreen: Screens (route = "welcome_screen")
    object DetailsScreen: Screens (route = "details_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg -> append( "/$arg") }
        }
    }
}