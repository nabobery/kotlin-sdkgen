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
 * Indicates whether the transaction is eligible for PayPal's seller protection.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/paypal_seller_protection/properties/status
 */
@Serializable(with = InlinePaypalSellerProtectionStatusX8b3cff4a.Serializer::class)
public sealed class InlinePaypalSellerProtectionStatusX8b3cff4a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `eligible`.
   */
  public data object Eligible : InlinePaypalSellerProtectionStatusX8b3cff4a() {
    public override val `value`: String = "eligible"
  }

  /**
   * Documented value. Wire value: `not_eligible`.
   */
  public data object NotEligible : InlinePaypalSellerProtectionStatusX8b3cff4a() {
    public override val `value`: String = "not_eligible"
  }

  /**
   * Documented value. Wire value: `partially_eligible`.
   */
  public data object PartiallyEligible : InlinePaypalSellerProtectionStatusX8b3cff4a() {
    public override val `value`: String = "partially_eligible"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaypalSellerProtectionStatusX8b3cff4a()

  public companion object {
    public fun fromValue(`value`: String): InlinePaypalSellerProtectionStatusX8b3cff4a = when (value) {
      Eligible.value -> Eligible
      NotEligible.value -> NotEligible
      PartiallyEligible.value -> PartiallyEligible
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaypalSellerProtectionStatusX8b3cff4a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaypalSellerProtectionStatusX8b3cff4a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaypalSellerProtectionStatusX8b3cff4a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaypalSellerProtectionStatusX8b3cff4a) {
      encoder.encodeString(value.value)
    }
  }
}
