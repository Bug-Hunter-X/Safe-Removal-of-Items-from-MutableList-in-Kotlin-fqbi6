# Safe Removal of Items from MutableList in Kotlin

This example demonstrates a common pitfall when removing items from a `MutableList` in Kotlin while iterating.  The `removeIf` method might not be suitable for all cases because it modifies the list while iterating directly. This can lead to unexpected behavior or exceptions.

The solution showcases a safer approach by using an iterator, ensuring correct list manipulation during iteration.

## Problem

Directly modifying a list while iterating using a for loop or `removeIf` can lead to unexpected behavior or `ConcurrentModificationException`. Consider the following example using `removeIf`:

```kotlin
val list = mutableListOf<Int>(1, 2, 3, 4, 5)
list.removeIf { it > 2 } // This can be unsafe
```

## Solution

The best approach is using an iterator.  The iterator's `remove()` method is designed for safe list modification during iteration.

```kotlin
val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
val iterator = list2.iterator()
while (iterator.hasNext()) {
    val item = iterator.next()
    if (item > 2) {
        iterator.remove()
    }
}
```