package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/o
 * rder_by/properties/direction.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/o
 * rder_by/properties/direction
 */
@Serializable(with = InlineAnalyticsQueryPostRequestJsonOrderByDirectionXb7a79682.Serializer::class)
public sealed class InlineAnalyticsQueryPostRequestJsonOrderByDirectionXb7a79682 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `asc`.
   */
  public data object Asc : InlineAnalyticsQueryPostRequestJsonOrderByDirectionXb7a79682() {
    public override val `value`: String = "asc"
  }

  /**
   * Documented value. Wire value: `desc`.
   */
  public data object Desc : InlineAnalyticsQueryPostRequestJsonOrderByDirectionXb7a79682() {
    public override val `value`: String = "desc"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnalyticsQueryPostRequestJsonOrderByDirectionXb7a79682()

  public companion object {
    public fun fromValue(`value`: String): InlineAnalyticsQueryPostRequestJsonOrderByDirectionXb7a79682 = when (value) {
      Asc.value -> Asc
      Desc.value -> Desc
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnalyticsQueryPostRequestJsonOrderByDirectionXb7a79682> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnalyticsQueryPostRequestJsonOrderByDirectionXb7a79682", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnalyticsQueryPostRequestJsonOrderByDirectionXb7a79682 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsQueryPostRequestJsonOrderByDirectionXb7a79682) {
      encoder.encodeString(value.value)
    }
  }
}
