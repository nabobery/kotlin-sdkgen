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
 * A value indicating who is liable when this account can't pay back negative balances from payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/account_unification_account_controller_losses/properties/payments
 */
@Serializable(with = InlineAccountUnificationAccountControllerLossesPaymentsX6a854391.Serializer::class)
public sealed class InlineAccountUnificationAccountControllerLossesPaymentsX6a854391 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `application`.
   */
  public data object Application : InlineAccountUnificationAccountControllerLossesPaymentsX6a854391() {
    public override val `value`: String = "application"
  }

  /**
   * Documented value. Wire value: `stripe`.
   */
  public data object Stripe : InlineAccountUnificationAccountControllerLossesPaymentsX6a854391() {
    public override val `value`: String = "stripe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountUnificationAccountControllerLossesPaymentsX6a854391()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountUnificationAccountControllerLossesPaymentsX6a854391 = when (value) {
      Application.value -> Application
      Stripe.value -> Stripe
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountUnificationAccountControllerLossesPaymentsX6a854391> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountUnificationAccountControllerLossesPaymentsX6a854391", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountUnificationAccountControllerLossesPaymentsX6a854391 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountUnificationAccountControllerLossesPaymentsX6a854391) {
      encoder.encodeString(value.value)
    }
  }
}
