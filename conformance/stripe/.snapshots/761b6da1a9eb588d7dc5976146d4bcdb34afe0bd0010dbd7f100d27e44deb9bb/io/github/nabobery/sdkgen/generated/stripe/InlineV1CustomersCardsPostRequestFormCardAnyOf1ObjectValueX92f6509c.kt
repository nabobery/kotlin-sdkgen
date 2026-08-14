package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cards/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/card/anyOf/0/properties/object.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cards/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/card/anyOf/0/properties/object
 */
@Serializable(with = InlineV1CustomersCardsPostRequestFormCardAnyOf1ObjectValueX92f6509c.Serializer::class)
public sealed class InlineV1CustomersCardsPostRequestFormCardAnyOf1ObjectValueX92f6509c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineV1CustomersCardsPostRequestFormCardAnyOf1ObjectValueX92f6509c() {
    public override val `value`: String = "card"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersCardsPostRequestFormCardAnyOf1ObjectValueX92f6509c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersCardsPostRequestFormCardAnyOf1ObjectValueX92f6509c = when (value) {
      Card.value -> Card
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersCardsPostRequestFormCardAnyOf1ObjectValueX92f6509c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersCardsPostRequestFormCardAnyOf1ObjectValueX92f6509c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersCardsPostRequestFormCardAnyOf1ObjectValueX92f6509c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersCardsPostRequestFormCardAnyOf1ObjectValueX92f6509c) {
      encoder.encodeString(value.value)
    }
  }
}
