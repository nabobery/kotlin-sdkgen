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
 * The status of the MobilePay capability of the account, or whether the account can directly process MobilePay charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/mobilepay_payments
 */
@Serializable(with = InlineAccountCapabilitiesMobilepayPaymentsXb3763aad.Serializer::class)
public sealed class InlineAccountCapabilitiesMobilepayPaymentsXb3763aad {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesMobilepayPaymentsXb3763aad() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesMobilepayPaymentsXb3763aad() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesMobilepayPaymentsXb3763aad() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesMobilepayPaymentsXb3763aad()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesMobilepayPaymentsXb3763aad = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesMobilepayPaymentsXb3763aad> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesMobilepayPaymentsXb3763aad", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesMobilepayPaymentsXb3763aad = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesMobilepayPaymentsXb3763aad) {
      encoder.encodeString(value.value)
    }
  }
}
