class word {

  def readFile(fileName: String): Iterator[String] = io.Source.fromFile(fileName).getLines

  val ds: Array[Array[String]] = readFile("/home/genzo/example.csv")
    .map(_.split(" "))
    .toArray

  val list = ds.flatMap(fila  => {
    fila.map( word => {
      word.toInt * 2
    })
  })


}
