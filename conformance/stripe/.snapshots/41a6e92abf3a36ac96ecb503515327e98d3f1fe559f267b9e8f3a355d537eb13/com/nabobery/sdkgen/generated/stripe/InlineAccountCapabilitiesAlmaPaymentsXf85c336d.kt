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
 * The status of the Alma capability of the account, or whether the account can directly process Alma payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/alma_payments
 */
@Serializable(with = InlineAccountCapabilitiesAlmaPaymentsXf85c336d.Serializer::class)
public sealed class InlineAccountCapabilitiesAlmaPaymentsXf85c336d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesAlmaPaymentsXf85c336d() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesAlmaPaymentsXf85c336d() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesAlmaPaymentsXf85c336d() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesAlmaPaymentsXf85c336d()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesAlmaPaymentsXf85c336d = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesAlmaPaymentsXf85c336d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesAlmaPaymentsXf85c336d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesAlmaPaymentsXf85c336d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesAlmaPaymentsXf85c336d) {
      encoder.encodeString(value.value)
    }
  }
}
