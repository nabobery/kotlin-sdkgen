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
 * The status of the Crypto capability of the account, or whether the account can directly process Crypto payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/crypto_payments
 */
@Serializable(with = InlineAccountCapabilitiesCryptoPaymentsXa11984a6.Serializer::class)
public sealed class InlineAccountCapabilitiesCryptoPaymentsXa11984a6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesCryptoPaymentsXa11984a6() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesCryptoPaymentsXa11984a6() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesCryptoPaymentsXa11984a6() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesCryptoPaymentsXa11984a6()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesCryptoPaymentsXa11984a6 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesCryptoPaymentsXa11984a6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesCryptoPaymentsXa11984a6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesCryptoPaymentsXa11984a6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesCryptoPaymentsXa11984a6) {
      encoder.encodeString(value.value)
    }
  }
}
