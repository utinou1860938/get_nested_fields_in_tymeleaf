# get_nested_fields_in_tymeleaf
ネストされたオブジェクトの要素をバインドするためのサンプル処理

spring + Thymeleaf + jquery

オブジェクト内のn個のサーバー内のm個のミドルウェアをバインドし、
n個のサーバーはクライアントで増やしてもデータ取得可能
さらにm個のミドルウェアもクライアントで増やしてmpデータ取得可能です。

Myform.javaがmodelに追加するクラスで、
内部に`List<SeverDate>`のオブジェクトをフィールドとして持たせています。
さらにSeverDate.javaクラスの内部に`List<middleware>`のオブジェクトをフィールドとして持たすことで、
構成管理情報画面のデータ構造を表現しました。

今回のサンプルデータでは、Myform.javaは`List<SeverDate>`しかフィールドがありませんが、
実際のプログラムでは、hiddenで申請コードなどを持たしたり、基本情報を持したりすることを想定したためです。

※ 今回の検証はThymeleafでバインドした後にjqueryで動的に増やしたデータを送受信できるかの検証だったので、
cloneの挙動についてはあまり整備しませんでした。
valueを空にしたり、middlewareのレコード数の制御はやってません。
