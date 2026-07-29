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
 * The status of the tax reporting 1099-K (US) capability of the account.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/tax_reporting_us_1099_k
 */
@Serializable(with = InlineAccountCapabilitiesTaxReportingUs1099KXb46ba7e9.Serializer::class)
public sealed class InlineAccountCapabilitiesTaxReportingUs1099KXb46ba7e9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesTaxReportingUs1099KXb46ba7e9() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesTaxReportingUs1099KXb46ba7e9() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesTaxReportingUs1099KXb46ba7e9() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesTaxReportingUs1099KXb46ba7e9()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesTaxReportingUs1099KXb46ba7e9 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesTaxReportingUs1099KXb46ba7e9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesTaxReportingUs1099KXb46ba7e9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesTaxReportingUs1099KXb46ba7e9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesTaxReportingUs1099KXb46ba7e9) {
      encoder.encodeString(value.value)
    }
  }
}
