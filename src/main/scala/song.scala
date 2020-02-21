class song {
  object  transformations  extends  App {

    def readFile(fileName: String): Iterator[String] = io.Source.fromFile(fileName).getLines
    val ds: Array[Array[String]] = readFile("/home/charly/Documentos/dummy_csv.csv")
      .map(_.split(","))
      .toArray
      .take(100)
  }
}
