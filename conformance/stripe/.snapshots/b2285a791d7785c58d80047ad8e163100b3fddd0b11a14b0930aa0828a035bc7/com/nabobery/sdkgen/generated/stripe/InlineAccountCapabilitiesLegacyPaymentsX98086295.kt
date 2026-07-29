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
 * The status of the legacy payments capability of the account.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/legacy_payments
 */
@Serializable(with = InlineAccountCapabilitiesLegacyPaymentsX98086295.Serializer::class)
public sealed class InlineAccountCapabilitiesLegacyPaymentsX98086295 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesLegacyPaymentsX98086295() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesLegacyPaymentsX98086295() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesLegacyPaymentsX98086295() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesLegacyPaymentsX98086295()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesLegacyPaymentsX98086295 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesLegacyPaymentsX98086295> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesLegacyPaymentsX98086295", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesLegacyPaymentsX98086295 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesLegacyPaymentsX98086295) {
      encoder.encodeString(value.value)
    }
  }
}
