package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The status of the tax reporting 1099-MISC (US) capability of the account.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/tax_reporting_us_1099_misc
 */
@Serializable(with = InlineAccountCapabilitiesTaxReportingUs1099MiscX0df3d0a4.Serializer::class)
public sealed class InlineAccountCapabilitiesTaxReportingUs1099MiscX0df3d0a4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesTaxReportingUs1099MiscX0df3d0a4() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesTaxReportingUs1099MiscX0df3d0a4() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesTaxReportingUs1099MiscX0df3d0a4() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesTaxReportingUs1099MiscX0df3d0a4()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesTaxReportingUs1099MiscX0df3d0a4 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesTaxReportingUs1099MiscX0df3d0a4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesTaxReportingUs1099MiscX0df3d0a4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesTaxReportingUs1099MiscX0df3d0a4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesTaxReportingUs1099MiscX0df3d0a4) {
      encoder.encodeString(value.value)
    }
  }
}
