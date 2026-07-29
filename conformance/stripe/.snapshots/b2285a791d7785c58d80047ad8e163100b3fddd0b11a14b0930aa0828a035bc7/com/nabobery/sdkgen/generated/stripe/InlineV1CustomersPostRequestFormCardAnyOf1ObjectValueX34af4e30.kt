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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/card/anyOf/0/properties/object.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/card/anyOf/0/properties/object
 */
@Serializable(with = InlineV1CustomersPostRequestFormCardAnyOf1ObjectValueX34af4e30.Serializer::class)
public sealed class InlineV1CustomersPostRequestFormCardAnyOf1ObjectValueX34af4e30 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineV1CustomersPostRequestFormCardAnyOf1ObjectValueX34af4e30() {
    public override val `value`: String = "card"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersPostRequestFormCardAnyOf1ObjectValueX34af4e30()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersPostRequestFormCardAnyOf1ObjectValueX34af4e30 = when (value) {
      Card.value -> Card
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersPostRequestFormCardAnyOf1ObjectValueX34af4e30> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersPostRequestFormCardAnyOf1ObjectValueX34af4e30", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormCardAnyOf1ObjectValueX34af4e30 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormCardAnyOf1ObjectValueX34af4e30) {
      encoder.encodeString(value.value)
    }
  }
}
