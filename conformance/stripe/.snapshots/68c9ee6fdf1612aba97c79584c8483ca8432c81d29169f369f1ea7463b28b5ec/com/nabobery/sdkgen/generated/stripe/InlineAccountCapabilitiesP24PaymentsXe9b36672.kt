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
 * The status of the P24 payments capability of the account, or whether the account can directly process P24 charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/p24_payments
 */
@Serializable(with = InlineAccountCapabilitiesP24PaymentsXe9b36672.Serializer::class)
public sealed class InlineAccountCapabilitiesP24PaymentsXe9b36672 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesP24PaymentsXe9b36672() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesP24PaymentsXe9b36672() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesP24PaymentsXe9b36672() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesP24PaymentsXe9b36672()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesP24PaymentsXe9b36672 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesP24PaymentsXe9b36672> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesP24PaymentsXe9b36672", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesP24PaymentsXe9b36672 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesP24PaymentsXe9b36672) {
      encoder.encodeString(value.value)
    }
  }
}
