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
 * The status of the Swish capability of the account, or whether the account can directly process Swish payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/swish_payments
 */
@Serializable(with = InlineAccountCapabilitiesSwishPaymentsX7f4ed8cd.Serializer::class)
public sealed class InlineAccountCapabilitiesSwishPaymentsX7f4ed8cd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesSwishPaymentsX7f4ed8cd() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesSwishPaymentsX7f4ed8cd() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesSwishPaymentsX7f4ed8cd() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesSwishPaymentsX7f4ed8cd()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesSwishPaymentsX7f4ed8cd = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesSwishPaymentsX7f4ed8cd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesSwishPaymentsX7f4ed8cd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesSwishPaymentsX7f4ed8cd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesSwishPaymentsX7f4ed8cd) {
      encoder.encodeString(value.value)
    }
  }
}
