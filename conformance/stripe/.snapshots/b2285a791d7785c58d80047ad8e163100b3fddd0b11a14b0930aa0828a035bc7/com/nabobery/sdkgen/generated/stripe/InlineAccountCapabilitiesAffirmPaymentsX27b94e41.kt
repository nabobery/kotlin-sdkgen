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
 * The status of the Affirm capability of the account, or whether the account can directly process Affirm charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/affirm_payments
 */
@Serializable(with = InlineAccountCapabilitiesAffirmPaymentsX27b94e41.Serializer::class)
public sealed class InlineAccountCapabilitiesAffirmPaymentsX27b94e41 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesAffirmPaymentsX27b94e41() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesAffirmPaymentsX27b94e41() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesAffirmPaymentsX27b94e41() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesAffirmPaymentsX27b94e41()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesAffirmPaymentsX27b94e41 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesAffirmPaymentsX27b94e41> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesAffirmPaymentsX27b94e41", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesAffirmPaymentsX27b94e41 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesAffirmPaymentsX27b94e41) {
      encoder.encodeString(value.value)
    }
  }
}
