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
    totalRatingsOf(ls)  / ls.length
  }

  def totalRatingsOf(ls: List[Game]):Int = {
    ls.map(item =>item.rating).sum
  }

  def totalRatingsOfLabel(label: String, list: List[Game]):Int = 0

  def increaseRatingBy(inc: Int, ls: List[Game]) = Nil

  def decreaseRatingBy(i: Int, s: String, list: List[Game]) = Nil

  def createFunctionToFindGamesByLabel(label: String):(List[Game]) => List[Game] = identity(_)

  def zipWithKey = (f: (Game) => String, ls: List[Game]) => Nil

}
