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
 * The status of the OXXO payments capability of the account, or whether the account can directly process OXXO charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/oxxo_payments
 */
@Serializable(with = InlineAccountCapabilitiesOxxoPaymentsX1aa67b0b.Serializer::class)
public sealed class InlineAccountCapabilitiesOxxoPaymentsX1aa67b0b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesOxxoPaymentsX1aa67b0b() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesOxxoPaymentsX1aa67b0b() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesOxxoPaymentsX1aa67b0b() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesOxxoPaymentsX1aa67b0b()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesOxxoPaymentsX1aa67b0b = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesOxxoPaymentsX1aa67b0b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesOxxoPaymentsX1aa67b0b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesOxxoPaymentsX1aa67b0b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesOxxoPaymentsX1aa67b0b) {
      encoder.encodeString(value.value)
    }
  }
}
