// transcompiled to Kotlin from Java: https://github.com/hchiam/learning-java/blob/master/testFileReader.java

/*
 *In Terminal/Commandline, enter these two commands:
 *kotlinc testFileReader.kt -include-runtime -d testFileReader.jar
 *java -jar testFileReader.jar
 */

import java.io.*
import java.util.StringTokenizer

object testFileReader {
  @Throws(Exception::class)
  @JvmStatic fun main(args: Array<String>) {
    val numOfTokens = 3
    try {
      val file = FileReader("testfile.txt")
      val reader = BufferedReader(file)
      var line: String? = reader.readLine()
      while (line != null) {
        val tokens = StringTokenizer(line)
        if (tokens.countTokens() == numOfTokens) {
          for (i in 1..numOfTokens) {
            println(tokens.nextToken())
          }
        }
        line = reader.readLine()
      }
    } catch (e: Exception) {
      System.err.println("Exception")
      // do something
    }
  }
}
