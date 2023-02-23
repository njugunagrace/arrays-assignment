fun main(){
    printArray("Kenya","Rwanda","Tanzania","Uganda")
  printInCaps()
    printNumbers()
    printNames("table,chair,stool")


}
fun printArray(a:String,b:String,c:String,d:String){
    var name= arrayOf(a,b,c,d)
    println(name.contentToString())


}
fun printInCaps(){
       var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    for (city in cities) {
       println(city.capitalize())}


}
fun printNumbers(){
    var numb = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = (numb[1] + numb[4])
    println(sum)
    println(numb.indexOf(158))
    println(numb.sortedArray().contentToString())
}
fun printNames(name: String):String{
    var words = arrayOf(String)
    return (words.contentToString())
}
