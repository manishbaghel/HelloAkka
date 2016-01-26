package sample.hello.mycode

import java.io.DataInputStream

/**
  * Created by mb00549 on 1/25/2016.
  */
object TestLZ4 {

  def main(args: Array[String]) {
    readFromFile("55657B4E000010007F8AE1E1E118D028_0_20001_24530.LZ4")
  }

  private def readFromFile(fileName: String) = {
    val inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName)
    val dis = new DataInputStream(inputStream)
    // available stream to be read
    val length = dis.available()
    // create buffer
    val buf = new Array[Byte](length)
    // read the full data into the buffer
    dis.readFully(buf)
    dis.close()
    buf
  }

}
