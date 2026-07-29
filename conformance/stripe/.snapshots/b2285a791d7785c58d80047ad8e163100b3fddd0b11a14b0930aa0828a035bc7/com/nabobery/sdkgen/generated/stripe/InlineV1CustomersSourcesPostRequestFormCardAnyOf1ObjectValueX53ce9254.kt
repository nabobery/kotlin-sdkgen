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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1sources/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/card/anyOf/0/properties/object.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1sources/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/card/anyOf/0/properties/object
 */
@Serializable(with = InlineV1CustomersSourcesPostRequestFormCardAnyOf1ObjectValueX53ce9254.Serializer::class)
public sealed class InlineV1CustomersSourcesPostRequestFormCardAnyOf1ObjectValueX53ce9254 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineV1CustomersSourcesPostRequestFormCardAnyOf1ObjectValueX53ce9254() {
    public override val `value`: String = "card"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersSourcesPostRequestFormCardAnyOf1ObjectValueX53ce9254()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersSourcesPostRequestFormCardAnyOf1ObjectValueX53ce9254 = when (value) {
      Card.value -> Card
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersSourcesPostRequestFormCardAnyOf1ObjectValueX53ce9254> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSourcesPostRequestFormCardAnyOf1ObjectValueX53ce9254", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersSourcesPostRequestFormCardAnyOf1ObjectValueX53ce9254 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSourcesPostRequestFormCardAnyOf1ObjectValueX53ce9254) {
      encoder.encodeString(value.value)
    }
  }
}
