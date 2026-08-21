package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/tiers/items/properties/up_to/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/tiers/items/properties/up_to/anyOf/0
 */
@Serializable(with = InlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48.Serializer::class)
public sealed class InlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `inf`.
   */
  public data object Inf : InlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48() {
    public override val `value`: String = "inf"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48 = when (value) {
      Inf.value -> Inf
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48) {
      encoder.encodeString(value.value)
    }
  }
}
