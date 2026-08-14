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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/default_tax_rates/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/default_tax_rates/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormDefaultTaxRatesAnyOf2X51065ada) {
      encoder.encodeString(value.value)
    }
  }
}
