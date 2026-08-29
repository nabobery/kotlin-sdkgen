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
 * sdkgen://source/openapi.json#/paths/~1v1~1charges/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/card/anyOf/0/properties/object.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/card/anyOf/0/properties/object
 */
@Serializable(with = InlineV1ChargesPostRequestFormCardAnyOf1ObjectValueXe0421c7e.Serializer::class)
public sealed class InlineV1ChargesPostRequestFormCardAnyOf1ObjectValueXe0421c7e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineV1ChargesPostRequestFormCardAnyOf1ObjectValueXe0421c7e() {
    public override val `value`: String = "card"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ChargesPostRequestFormCardAnyOf1ObjectValueXe0421c7e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ChargesPostRequestFormCardAnyOf1ObjectValueXe0421c7e = when (value) {
      Card.value -> Card
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesPostRequestFormCardAnyOf1ObjectValueXe0421c7e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1ChargesPostRequestFormCardAnyOf1ObjectValueXe0421c7e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ChargesPostRequestFormCardAnyOf1ObjectValueXe0421c7e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesPostRequestFormCardAnyOf1ObjectValueXe0421c7e) {
      encoder.encodeString(value.value)
    }
  }
}
