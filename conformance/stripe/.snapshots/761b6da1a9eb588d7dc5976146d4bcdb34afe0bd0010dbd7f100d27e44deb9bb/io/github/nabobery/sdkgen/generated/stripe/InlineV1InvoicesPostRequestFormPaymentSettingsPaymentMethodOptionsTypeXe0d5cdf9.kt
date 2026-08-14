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
 * ents/properties/plan/anyOf/0/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/installm
 * ents/properties/plan/anyOf/0/properties/type
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsTypeXe0d5cdf9.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsTypeXe0d5cdf9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bonus`.
   */
  public data object Bonus : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsTypeXe0d5cdf9() {
    public override val `value`: String = "bonus"
  }

  /**
   * Documented value. Wire value: `fixed_count`.
   */
  public data object FixedCount : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsTypeXe0d5cdf9() {
    public override val `value`: String = "fixed_count"
  }

  /**
   * Documented value. Wire value: `revolving`.
   */
  public data object Revolving : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsTypeXe0d5cdf9() {
    public override val `value`: String = "revolving"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsTypeXe0d5cdf9()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsTypeXe0d5cdf9 = when (value) {
      Bonus.value -> Bonus
      FixedCount.value -> FixedCount
      Revolving.value -> Revolving
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsTypeXe0d5cdf9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsTypeXe0d5cdf9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsTypeXe0d5cdf9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsTypeXe0d5cdf9) {
      encoder.encodeString(value.value)
    }
  }
}
