package models.services.Check

import models.services.Model.ModelService

class CheckModelService extends ModelService {

  override def findById(id: Long): Option[Check]

  override def save(entry: Check): Option[Check]

  override def findWithPage(pageSource: Int): Option[List[T]] = ???

  def getMaxPage: Option[Int]

}
