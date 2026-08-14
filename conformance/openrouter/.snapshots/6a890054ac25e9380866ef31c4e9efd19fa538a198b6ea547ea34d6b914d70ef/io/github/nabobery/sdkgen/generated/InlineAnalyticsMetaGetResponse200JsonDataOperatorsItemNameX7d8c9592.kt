package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Operator identifier used in filter definitions
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1meta/get/responses/200/content/application~1json/schema/properties/d
 * ata/properties/operators/items/properties/name
 */
@Serializable(with = InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592.Serializer::class)
public sealed class InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `eq`.
   */
  public data object Eq : InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592() {
    public override val `value`: String = "eq"
  }

  /**
   * Documented value. Wire value: `neq`.
   */
  public data object Neq : InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592() {
    public override val `value`: String = "neq"
  }

  /**
   * Documented value. Wire value: `in`.
   */
  public data object InValue : InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592() {
    public override val `value`: String = "in"
  }

  /**
   * Documented value. Wire value: `not_in`.
   */
  public data object NotIn : InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592() {
    public override val `value`: String = "not_in"
  }

  /**
   * Documented value. Wire value: `gt`.
   */
  public data object Gt : InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592() {
    public override val `value`: String = "gt"
  }

  /**
   * Documented value. Wire value: `gte`.
   */
  public data object Gte : InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592() {
    public override val `value`: String = "gte"
  }

  /**
   * Documented value. Wire value: `lt`.
   */
  public data object Lt : InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592() {
    public override val `value`: String = "lt"
  }

  /**
   * Documented value. Wire value: `lte`.
   */
  public data object Lte : InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592() {
    public override val `value`: String = "lte"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592()

  public companion object {
    public fun fromValue(`value`: String): InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592 = when (value) {
      Eq.value -> Eq
      Neq.value -> Neq
      InValue.value -> InValue
      NotIn.value -> NotIn
      Gt.value -> Gt
      Gte.value -> Gte
      Lt.value -> Lt
      Lte.value -> Lte
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemNameX7d8c9592) {
      encoder.encodeString(value.value)
    }
  }
}
