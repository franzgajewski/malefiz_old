val row14 = Array(".",".",".",".",".",".",".",".","G",".",".",".",".",".",".",".",".")
val row13 = Array("O","O","O","O","O","O","O","O","B","O","O","O","O","O","O","O","O")
val row12 = Array("O",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","O")
val row11 = Array("O","O","O","O","O","O","O","O","B","O","O","O","O","O","O","O","O")
val row10 = Array(".",".",".",".",".",".",".",".","B",".",".",".",".",".",".",".",".")
val row09 = Array(".",".",".",".",".",".","O","O","B","O","O",".",".",".",".",".",".")
val row08 = Array(".",".",".",".",".",".","O",".",".",".","O",".",".",".",".",".",".")
val row07 = Array(".",".",".",".","O","O","B","O","O","O","B","O","O",".",".",".",".")
val row06 = Array(".",".",".",".","O",".",".",".",".",".",".",".","O",".",".",".",".")
val row05 = Array(".",".","O","O","O","O","O","O","O","O","O","O","O","O","O",".",".")
val row04 = Array(".",".","O",".",".",".","O",".",".",".","O",".",".",".","O",".",".")
val row03 = Array("B","O","O","O","B","O","O","O","B","O","O","O","B","O","O","O","B")
val row02 = Array("S",".",".",".","S",".",".",".","S",".",".",".","S",".",".",".","S")
val row01 = Array("S","S","S","S","S","S","S","S","S","S","S","S","S","S","S","S","S")
/*
print(row14.mkString(" "))
print(row13.mkString(" "))
print(row12.mkString(" "))
print(row11.mkString(" "))
print(row10.mkString(" "))
print(row09.mkString(" "))
print(row08.mkString(" "))
print(row07.mkString(" "))
print(row06.mkString(" "))
print(row05.mkString(" "))
print(row04.mkString(" "))
print(row03.mkString(" "))
print(row02.mkString(" "))
print(row01.mkString(" "))
*/

//test

val spielbrett =  List(row14, row13, row12, row11, row10, row09, row08, row07, row06, row05, row04, row03, row02, row01)

def update(): Unit = {
  spielbrett.foreach(x => println(x.mkString(" ")))
}
update()