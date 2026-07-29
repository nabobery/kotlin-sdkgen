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
 * The status of the giropay payments capability of the account, or whether the account can directly process giropay
 * charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/giropay_payments
 */
@Serializable(with = InlineAccountCapabilitiesGiropayPaymentsX9c3ada7e.Serializer::class)
public sealed class InlineAccountCapabilitiesGiropayPaymentsX9c3ada7e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesGiropayPaymentsX9c3ada7e() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesGiropayPaymentsX9c3ada7e() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesGiropayPaymentsX9c3ada7e() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesGiropayPaymentsX9c3ada7e()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesGiropayPaymentsX9c3ada7e = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesGiropayPaymentsX9c3ada7e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesGiropayPaymentsX9c3ada7e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesGiropayPaymentsX9c3ada7e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesGiropayPaymentsX9c3ada7e) {
      encoder.encodeString(value.value)
    }
  }
}
