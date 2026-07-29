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
 * The status of the TWINT capability of the account, or whether the account can directly process TWINT charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/twint_payments
 */
@Serializable(with = InlineAccountCapabilitiesTwintPaymentsXa9dbfff6.Serializer::class)
public sealed class InlineAccountCapabilitiesTwintPaymentsXa9dbfff6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesTwintPaymentsXa9dbfff6() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesTwintPaymentsXa9dbfff6() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesTwintPaymentsXa9dbfff6() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesTwintPaymentsXa9dbfff6()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesTwintPaymentsXa9dbfff6 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesTwintPaymentsXa9dbfff6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesTwintPaymentsXa9dbfff6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesTwintPaymentsXa9dbfff6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesTwintPaymentsXa9dbfff6) {
      encoder.encodeString(value.value)
    }
  }
}
