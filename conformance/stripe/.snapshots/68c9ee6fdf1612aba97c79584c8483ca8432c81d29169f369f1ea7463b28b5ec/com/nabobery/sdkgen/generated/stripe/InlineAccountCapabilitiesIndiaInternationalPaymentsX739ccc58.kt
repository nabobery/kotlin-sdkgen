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
 * The status of the india_international_payments capability of the account, or whether the account can process
 * international charges (non INR) in India.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/india_international_payments
 */
@Serializable(with = InlineAccountCapabilitiesIndiaInternationalPaymentsX739ccc58.Serializer::class)
public sealed class InlineAccountCapabilitiesIndiaInternationalPaymentsX739ccc58 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesIndiaInternationalPaymentsX739ccc58() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesIndiaInternationalPaymentsX739ccc58() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesIndiaInternationalPaymentsX739ccc58() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesIndiaInternationalPaymentsX739ccc58()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesIndiaInternationalPaymentsX739ccc58 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesIndiaInternationalPaymentsX739ccc58> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesIndiaInternationalPaymentsX739ccc58", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesIndiaInternationalPaymentsX739ccc58 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesIndiaInternationalPaymentsX739ccc58) {
      encoder.encodeString(value.value)
    }
  }
}
