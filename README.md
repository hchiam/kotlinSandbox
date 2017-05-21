# Learning Kotlin Programming Language

## Set Up Kotlin for Testing with Terminal / Command Line

What I did:

1. I created `Test.kt`.

2. And then I did this in Terminal:

```
brew update
brew install kotlin
kotlinc Test.kt -include-runtime -d Test.jar; java -jar Test.jar
```

--> This prints: `It works!`

## Links:

More command line info: https://kotlinlang.org/docs/tutorials/command-line.html

Try out Kotlin examples in your browser: https://try.kotlinlang.org

Kotlin documentation: https://kotlinlang.org

Install that `brew` command (Mac): https://brew.sh
