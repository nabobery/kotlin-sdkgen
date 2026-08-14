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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/on_behalf_of/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/on_behalf_of/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormOnBehalfOfAnyOf2X1b88b464) {
      encoder.encodeString(value.value)
    }
  }
}
