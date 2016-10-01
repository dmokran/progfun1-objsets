import objsets._

val set1 = new Empty
val set2 = set1.incl(new Tweet("c", "c body", 20))
val set3 = set2.incl(new Tweet("b", "b body", 20))
val c = new Tweet("a", "a body", 7)
val d = new Tweet("d", "d body", 9)
val set4c = set3.incl(c)
val set4d = set3.incl(d)
val set5 = set4c.incl(d)
val set6 = set5.incl(new Tweet("tweeter", "tweet body", 100))

val tw1 = new Tweet("daniel", "blah blah", 13)

set3.foreach(println)

val grrr = set6.filter(tw => tw.retweets < 100)


grrr.foreach(println)




