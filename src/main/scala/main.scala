import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object text_similarity {
  def main(args:Array[String]):Unit= {
	val appName = ""
	val conf = new SparkConf().setAppName(appName)
	var sc = new SparkContext(conf)
	val input = sc.textFile("file:///etc/passwd")
	println("Input had " + input.count() + " concerning lines")
  }
}
