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
 * The status of the Scalapay capability of the account, or whether the account can directly process Scalapay payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/scalapay_payments
 */
@Serializable(with = InlineAccountCapabilitiesScalapayPaymentsX3cd8a7f4.Serializer::class)
public sealed class InlineAccountCapabilitiesScalapayPaymentsX3cd8a7f4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesScalapayPaymentsX3cd8a7f4() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesScalapayPaymentsX3cd8a7f4() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesScalapayPaymentsX3cd8a7f4() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesScalapayPaymentsX3cd8a7f4()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesScalapayPaymentsX3cd8a7f4 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesScalapayPaymentsX3cd8a7f4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesScalapayPaymentsX3cd8a7f4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesScalapayPaymentsX3cd8a7f4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesScalapayPaymentsX3cd8a7f4) {
      encoder.encodeString(value.value)
    }
  }
}
