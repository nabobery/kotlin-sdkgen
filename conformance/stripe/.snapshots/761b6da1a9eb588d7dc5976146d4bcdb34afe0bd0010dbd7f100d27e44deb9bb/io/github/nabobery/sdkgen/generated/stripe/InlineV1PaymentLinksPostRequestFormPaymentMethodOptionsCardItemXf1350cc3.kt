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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card/properties/restrictions/properties/brands_blocked/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card/properties/restrictions/properties/brands_blocked/items
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardItemXf1350cc3.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardItemXf1350cc3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `american_express`.
   */
  public data object AmericanExpress : InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardItemXf1350cc3() {
    public override val `value`: String = "american_express"
  }

  /**
   * Documented value. Wire value: `discover_global_network`.
   */
  public data object DiscoverGlobalNetwork : InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardItemXf1350cc3() {
    public override val `value`: String = "discover_global_network"
  }

  /**
   * Documented value. Wire value: `mastercard`.
   */
  public data object Mastercard : InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardItemXf1350cc3() {
    public override val `value`: String = "mastercard"
  }

  /**
   * Documented value. Wire value: `visa`.
   */
  public data object Visa : InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardItemXf1350cc3() {
    public override val `value`: String = "visa"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardItemXf1350cc3()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardItemXf1350cc3 = when (value) {
      AmericanExpress.value -> AmericanExpress
      DiscoverGlobalNetwork.value -> DiscoverGlobalNetwork
      Mastercard.value -> Mastercard
      Visa.value -> Visa
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardItemXf1350cc3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardItemXf1350cc3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardItemXf1350cc3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardItemXf1350cc3) {
      encoder.encodeString(value.value)
    }
  }
}
