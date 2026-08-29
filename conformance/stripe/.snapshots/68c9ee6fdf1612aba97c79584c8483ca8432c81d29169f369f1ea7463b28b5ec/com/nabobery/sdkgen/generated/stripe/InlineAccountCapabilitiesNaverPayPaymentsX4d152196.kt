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
 * The status of the NaverPay capability of the account, or whether the account can directly process NaverPay payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/naver_pay_payments
 */
@Serializable(with = InlineAccountCapabilitiesNaverPayPaymentsX4d152196.Serializer::class)
public sealed class InlineAccountCapabilitiesNaverPayPaymentsX4d152196 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesNaverPayPaymentsX4d152196() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesNaverPayPaymentsX4d152196() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesNaverPayPaymentsX4d152196() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesNaverPayPaymentsX4d152196()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesNaverPayPaymentsX4d152196 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesNaverPayPaymentsX4d152196> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesNaverPayPaymentsX4d152196", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesNaverPayPaymentsX4d152196 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesNaverPayPaymentsX4d152196) {
      encoder.encodeString(value.value)
    }
  }
}
