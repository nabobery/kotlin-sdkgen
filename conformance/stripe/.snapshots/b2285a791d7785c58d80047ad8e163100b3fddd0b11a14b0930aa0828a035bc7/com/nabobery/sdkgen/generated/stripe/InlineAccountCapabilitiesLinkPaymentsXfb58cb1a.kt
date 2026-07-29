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
 * The status of the link_payments capability of the account, or whether the account can directly process Link charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/link_payments
 */
@Serializable(with = InlineAccountCapabilitiesLinkPaymentsXfb58cb1a.Serializer::class)
public sealed class InlineAccountCapabilitiesLinkPaymentsXfb58cb1a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesLinkPaymentsXfb58cb1a() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesLinkPaymentsXfb58cb1a() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesLinkPaymentsXfb58cb1a() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesLinkPaymentsXfb58cb1a()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesLinkPaymentsXfb58cb1a = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesLinkPaymentsXfb58cb1a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesLinkPaymentsXfb58cb1a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesLinkPaymentsXfb58cb1a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesLinkPaymentsXfb58cb1a) {
      encoder.encodeString(value.value)
    }
  }
}
