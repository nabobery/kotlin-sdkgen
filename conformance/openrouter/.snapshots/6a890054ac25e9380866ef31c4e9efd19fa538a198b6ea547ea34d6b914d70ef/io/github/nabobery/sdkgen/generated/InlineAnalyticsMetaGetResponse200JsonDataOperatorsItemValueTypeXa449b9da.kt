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
 * Whether the operator expects a single value or an array
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1meta/get/responses/200/content/application~1json/schema/properties/d
 * ata/properties/operators/items/properties/value_type
 */
@Serializable(with = InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemValueTypeXa449b9da.Serializer::class)
public sealed class InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemValueTypeXa449b9da {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `scalar`.
   */
  public data object Scalar : InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemValueTypeXa449b9da() {
    public override val `value`: String = "scalar"
  }

  /**
   * Documented value. Wire value: `array`.
   */
  public data object Array : InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemValueTypeXa449b9da() {
    public override val `value`: String = "array"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemValueTypeXa449b9da()

  public companion object {
    public fun fromValue(`value`: String): InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemValueTypeXa449b9da = when (value) {
      Scalar.value -> Scalar
      Array.value -> Array
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemValueTypeXa449b9da> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemValueTypeXa449b9da", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemValueTypeXa449b9da = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemValueTypeXa449b9da) {
      encoder.encodeString(value.value)
    }
  }
}
