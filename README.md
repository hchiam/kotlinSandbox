# Learning the Kotlin Programming Language
Just on of the things I'm learning. https://github.com/hchiam/learning

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

Google I/O '17 intro: https://www.youtube.com/watch?v=X1RVYt2QKQE
