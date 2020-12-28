package mypkg

import scalapb.TypeMapper

final case class PositiveInt(n: Int)

object PositiveInt {
  implicit val tm = TypeMapper[Int, PositiveInt](PositiveInt(_))(_.n)
  implicit val ordering =
    Ordering.fromLessThan[PositiveInt]((x, y) => x.n < y.n)
}
