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
 * The status of the card payments capability of the account, or whether the account can directly process credit and
 * debit card charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/card_payments
 */
@Serializable(with = InlineAccountCapabilitiesCardPaymentsX303e4dae.Serializer::class)
public sealed class InlineAccountCapabilitiesCardPaymentsX303e4dae {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesCardPaymentsX303e4dae() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesCardPaymentsX303e4dae() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesCardPaymentsX303e4dae() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesCardPaymentsX303e4dae()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesCardPaymentsX303e4dae = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesCardPaymentsX303e4dae> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesCardPaymentsX303e4dae", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesCardPaymentsX303e4dae = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesCardPaymentsX303e4dae) {
      encoder.encodeString(value.value)
    }
  }
}
