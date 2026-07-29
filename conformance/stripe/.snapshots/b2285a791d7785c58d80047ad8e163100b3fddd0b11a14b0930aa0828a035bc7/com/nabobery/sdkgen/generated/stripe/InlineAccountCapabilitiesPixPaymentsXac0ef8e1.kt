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
 * The status of the pix payments capability of the account, or whether the account can directly process pix charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/pix_payments
 */
@Serializable(with = InlineAccountCapabilitiesPixPaymentsXac0ef8e1.Serializer::class)
public sealed class InlineAccountCapabilitiesPixPaymentsXac0ef8e1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesPixPaymentsXac0ef8e1() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesPixPaymentsXac0ef8e1() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesPixPaymentsXac0ef8e1() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesPixPaymentsXac0ef8e1()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesPixPaymentsXac0ef8e1 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesPixPaymentsXac0ef8e1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesPixPaymentsXac0ef8e1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesPixPaymentsXac0ef8e1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesPixPaymentsXac0ef8e1) {
      encoder.encodeString(value.value)
    }
  }
}
