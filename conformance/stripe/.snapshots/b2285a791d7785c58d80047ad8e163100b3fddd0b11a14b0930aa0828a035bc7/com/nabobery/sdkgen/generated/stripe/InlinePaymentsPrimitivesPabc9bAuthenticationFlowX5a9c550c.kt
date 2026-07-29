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
 * For authenticated transactions: Indicates how the issuing bank authenticated the customer.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails_resource_three_d_secure/properties/authentication_flow
 */
@Serializable(with = InlinePaymentsPrimitivesPabc9bAuthenticationFlowX5a9c550c.Serializer::class)
public sealed class InlinePaymentsPrimitivesPabc9bAuthenticationFlowX5a9c550c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `challenge`.
   */
  public data object Challenge : InlinePaymentsPrimitivesPabc9bAuthenticationFlowX5a9c550c() {
    public override val `value`: String = "challenge"
  }

  /**
   * Documented value. Wire value: `frictionless`.
   */
  public data object Frictionless : InlinePaymentsPrimitivesPabc9bAuthenticationFlowX5a9c550c() {
    public override val `value`: String = "frictionless"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentsPrimitivesPabc9bAuthenticationFlowX5a9c550c()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentsPrimitivesPabc9bAuthenticationFlowX5a9c550c = when (value) {
      Challenge.value -> Challenge
      Frictionless.value -> Frictionless
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentsPrimitivesPabc9bAuthenticationFlowX5a9c550c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentsPrimitivesPabc9bAuthenticationFlowX5a9c550c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPabc9bAuthenticationFlowX5a9c550c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPabc9bAuthenticationFlowX5a9c550c) {
      encoder.encodeString(value.value)
    }
  }
}
