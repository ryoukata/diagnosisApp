package models.services.Model

/*
 * モデルに関するトレイト（他のサービスクラスでも利用可能にしている）
 * T: モデルクラスを継承したものとして定義
 */
trait ModelService {
  // 指定のIDのレコードを１つ抽出
  def findById(id: Long): Option[T]

  // 対象のModelインスタンスを保存
  def save(entry: T): Option[T]

  // 一覧ページを番号付きで取得
  def findWithPage(pageSource: Int): Option[List[T]]
}
