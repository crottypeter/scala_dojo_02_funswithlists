package dojo

import collection.immutable.List

object FunsWithLists {

  def labels(ls: List[Game]) = {
    ls.map(item => item.label)
  }

//  The long way {
//    var names:List[String] = List()
//    ls foreach(game => names = game.label :: names)
//    names.reverse
//  }

  def averageRatingsOf(l:String,  ls:List[Game]) = {
    var runningTotal = 0
    var count = 0
    for (game <- ls if game.label.equals(l)) {
      runningTotal += game.rating;
      count += 1;
    }
    runningTotal / count
  }

  def totalRatingsOf(ls: List[Game]):Int = {
    ls.map(item => item.rating).sum
  }

  def totalRatingsOfLabel(label: String, list: List[Game]):Int = {
    var runningTotal = 0
    for (game <- list if game.label.equals(label)) {
      runningTotal += game.rating;
    }
    runningTotal
}

  def increaseRatingBy(inc: Int, ls: List[Game]) = {
    ls.map(item => Game(item.label, item.rating + inc))
  }

  def decreaseRatingBy(i: Int, s: String, list: List[Game]) = {
    list.map(item => if (item.label.equals(s)) Game(item.label, item.rating - i) else item)
  }

  def createFunctionToFindGamesByLabel(label: String):(List[Game]) => List[Game] = identity(_)

  def zipWithKey = (f: (Game) => String, ls: List[Game]) => Nil

}
