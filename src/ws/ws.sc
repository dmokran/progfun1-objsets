import objsets._

val set1: Empty = new Empty
val set2: TweetSet = set1.incl(new Tweet("c", "c body", 21))
val set3: TweetSet = set2.incl(new Tweet("b", "b body", 20))
val a: Tweet = new Tweet("a", "a body", 7)
val d: Tweet = new Tweet("d", "d body", 9)
val set4a: TweetSet = set3.incl(a)
val set4d: TweetSet = set3.incl(d)
val set5: TweetSet = set4a.incl(d)
val set6: TweetSet = set5.incl(new Tweet("tweeter", "tweet body", 100))

val tw1: Tweet = new Tweet("daniel", "blah blah", 13)

val sset1: Empty = new Empty
val sset2: TweetSet = sset1.incl(new Tweet("m", "m body", 0))
val sset3: TweetSet = sset2.incl(new Tweet("d2", "d body", 43))
val h: Tweet = new Tweet("h", "h body", 27)
val t: Tweet = new Tweet("t", "t body", 19)
val sset4h: TweetSet = sset3.incl(h)
val sset4t: TweetSet = sset3.incl(t)
val sset5: TweetSet = sset4h.incl(t)

val what = sset5.union(set6)
what.foreach(println)










