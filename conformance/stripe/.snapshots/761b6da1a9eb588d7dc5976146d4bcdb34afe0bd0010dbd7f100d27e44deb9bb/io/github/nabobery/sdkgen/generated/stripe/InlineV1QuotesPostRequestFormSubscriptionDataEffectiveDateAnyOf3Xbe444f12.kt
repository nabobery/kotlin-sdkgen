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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/subscription_data/properties/effective_date/anyOf/2.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/subscription_data/properties/effective_date/anyOf/2
 */
@Serializable(with = InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12.Serializer::class)
public sealed class InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12()

  public companion object {
    public fun fromValue(`value`: String): InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3Xbe444f12) {
      encoder.encodeString(value.value)
    }
  }
}
