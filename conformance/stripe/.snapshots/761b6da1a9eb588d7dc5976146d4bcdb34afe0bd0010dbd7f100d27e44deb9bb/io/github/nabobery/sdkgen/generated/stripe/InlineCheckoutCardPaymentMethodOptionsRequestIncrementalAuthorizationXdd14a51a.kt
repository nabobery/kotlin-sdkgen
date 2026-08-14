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
 * Request ability to [increment the authorization](/payments/incremental-authorization) for this CheckoutSession.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/checkout_card_payment_method_options/properties/request_incremental_
 * authorization
 */
@Serializable(with = InlineCheckoutCardPaymentMethodOptionsRequestIncrementalAuthorizationXdd14a51a.Serializer::class)
public sealed class InlineCheckoutCardPaymentMethodOptionsRequestIncrementalAuthorizationXdd14a51a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `if_available`.
   */
  public data object IfAvailable : InlineCheckoutCardPaymentMethodOptionsRequestIncrementalAuthorizationXdd14a51a() {
    public override val `value`: String = "if_available"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineCheckoutCardPaymentMethodOptionsRequestIncrementalAuthorizationXdd14a51a() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutCardPaymentMethodOptionsRequestIncrementalAuthorizationXdd14a51a()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutCardPaymentMethodOptionsRequestIncrementalAuthorizationXdd14a51a = when (value) {
      IfAvailable.value -> IfAvailable
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutCardPaymentMethodOptionsRequestIncrementalAuthorizationXdd14a51a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCheckoutCardPaymentMethodOptionsRequestIncrementalAuthorizationXdd14a51a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutCardPaymentMethodOptionsRequestIncrementalAuthorizationXdd14a51a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutCardPaymentMethodOptionsRequestIncrementalAuthorizationXdd14a51a) {
      encoder.encodeString(value.value)
    }
  }
}
