package models

import java.sql.Timestamp
import play.api.data.Form
import play.api.data.Forms._

object Check {
  // ユーザ名を受け取るフォーム
  val checkForm: Form[CheckForm] = Form {
    mapping(
      "userName" -> nonEmptyText
        .verifying(error="15文字以内で入力してください", constraint=_.length <= 15)
        .verifying(error="Twitterと同じ形式で入力してください。", constraint=_.matches("""[\\w]+"""))
    )(CheckForm.apply)(CheckForm.unapply)
  }
}

// フォーム用クラス
case class CheckForm(userName: String)

// DBのレコードと対応するモデル用クラス
case class Check(id: Int, userName: String, result: String, createDate: Timestamp, modified: Timestamp) {
  // レコードに関わる処理（repositoryに定義しserviceを経由して呼び出すのが主流か？今回はドメイン駆動開発チックにモデルクラス内にまとめてみる(ビジネスロジックもモデル内に)？）
  /*
   * 診断結果の取得
   */
  def resultOfDiagnosis: Option[String] = {
    // ここで結果を取得するSQL
    None
  }

  /*
   *診断結果の保存
   */
  def saveResult: Option[Check] = {
    // ここで結果を保存するSQL（レコードの追加）
    None
  }

  /*
   * id検索
   */
  def unique: Option[Check] = {
    // ここでidに合致するレコードを取得するSQL
    None
  }
}
