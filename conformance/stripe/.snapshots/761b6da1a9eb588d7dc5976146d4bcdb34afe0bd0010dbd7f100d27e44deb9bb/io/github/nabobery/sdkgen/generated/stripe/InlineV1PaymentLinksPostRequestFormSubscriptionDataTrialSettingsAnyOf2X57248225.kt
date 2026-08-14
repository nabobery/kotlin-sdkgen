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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/subscription_data/properties/trial_settings/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/subscription_data/properties/trial_settings/anyOf/1
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225) {
      encoder.encodeString(value.value)
    }
  }
}
