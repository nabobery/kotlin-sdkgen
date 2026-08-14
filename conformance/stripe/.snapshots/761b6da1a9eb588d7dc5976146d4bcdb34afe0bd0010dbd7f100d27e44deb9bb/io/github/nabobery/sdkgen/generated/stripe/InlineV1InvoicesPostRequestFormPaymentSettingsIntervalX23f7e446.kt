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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/installm
 * ents/properties/plan/anyOf/0/properties/interval.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/installm
 * ents/properties/plan/anyOf/0/properties/interval
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsIntervalX23f7e446.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsIntervalX23f7e446 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineV1InvoicesPostRequestFormPaymentSettingsIntervalX23f7e446() {
    public override val `value`: String = "month"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesPostRequestFormPaymentSettingsIntervalX23f7e446()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormPaymentSettingsIntervalX23f7e446 = when (value) {
      Month.value -> Month
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsIntervalX23f7e446> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormPaymentSettingsIntervalX23f7e446", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsIntervalX23f7e446 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsIntervalX23f7e446) {
      encoder.encodeString(value.value)
    }
  }
}
