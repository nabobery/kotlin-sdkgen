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
 * The status of the AmazonPay capability of the account, or whether the account can directly process AmazonPay
 * payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/amazon_pay_payments
 */
@Serializable(with = InlineAccountCapabilitiesAmazonPayPaymentsXefe1641d.Serializer::class)
public sealed class InlineAccountCapabilitiesAmazonPayPaymentsXefe1641d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesAmazonPayPaymentsXefe1641d() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesAmazonPayPaymentsXefe1641d() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesAmazonPayPaymentsXefe1641d() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesAmazonPayPaymentsXefe1641d()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesAmazonPayPaymentsXefe1641d = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesAmazonPayPaymentsXefe1641d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesAmazonPayPaymentsXefe1641d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesAmazonPayPaymentsXefe1641d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesAmazonPayPaymentsXefe1641d) {
      encoder.encodeString(value.value)
    }
  }
}
