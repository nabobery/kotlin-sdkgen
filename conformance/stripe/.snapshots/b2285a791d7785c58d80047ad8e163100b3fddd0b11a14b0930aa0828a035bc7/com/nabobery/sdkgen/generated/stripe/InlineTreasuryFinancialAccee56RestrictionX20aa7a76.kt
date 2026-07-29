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
 * The `platform_restrictions` that are restricting this Feature.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_toggles_setting_status_details/
 * properties/restriction
 */
@Serializable(with = InlineTreasuryFinancialAccee56RestrictionX20aa7a76.Serializer::class)
public sealed class InlineTreasuryFinancialAccee56RestrictionX20aa7a76 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `inbound_flows`.
   */
  public data object InboundFlows : InlineTreasuryFinancialAccee56RestrictionX20aa7a76() {
    public override val `value`: String = "inbound_flows"
  }

  /**
   * Documented value. Wire value: `outbound_flows`.
   */
  public data object OutboundFlows : InlineTreasuryFinancialAccee56RestrictionX20aa7a76() {
    public override val `value`: String = "outbound_flows"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryFinancialAccee56RestrictionX20aa7a76()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryFinancialAccee56RestrictionX20aa7a76 = when (value) {
      InboundFlows.value -> InboundFlows
      OutboundFlows.value -> OutboundFlows
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTreasuryFinancialAccee56RestrictionX20aa7a76> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryFinancialAccee56RestrictionX20aa7a76", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccee56RestrictionX20aa7a76 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryFinancialAccee56RestrictionX20aa7a76) {
      encoder.encodeString(value.value)
    }
  }
}
