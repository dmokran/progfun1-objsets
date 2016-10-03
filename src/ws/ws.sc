import objsets._

val set1 = new Empty
val set2 = set1.incl(new Tweet("c", "c body", 20))
val set3 = set2.incl(new Tweet("b", "b body", 20))
val a = new Tweet("a", "a body", 7)
val d = new Tweet("d", "d body", 9)
val set4a = set3.incl(a)
val set4d = set3.incl(d)
val set5 = set4a.incl(d)
val set6 = set5.incl(new Tweet("tweeter", "tweet body", 100))

val tw1 = new Tweet("daniel", "blah blah", 13)

val sset1 = new Empty
val sset2 = sset1.incl(new Tweet("m", "m body", 5))
val sset3 = sset2.incl(new Tweet("d2", "d body", 43))
val h = new Tweet("h", "h body", 27)
val t = new Tweet("t", "t body", 19)
val sset4h = sset3.incl(h)
val sset4t = sset3.incl(t)
val sset5 = sset4h.incl(t)


set5.mostRetweeted

val grrr = set6.union(sset5)

grrr.foreach(println)




