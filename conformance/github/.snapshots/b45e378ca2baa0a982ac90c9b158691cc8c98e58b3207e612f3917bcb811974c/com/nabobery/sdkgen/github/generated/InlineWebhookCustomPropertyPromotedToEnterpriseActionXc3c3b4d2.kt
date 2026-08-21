package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-custom-property-promoted-to-enterprise/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-custom-property-promoted-to-enterprise/properties/action
 */
@Serializable(with = InlineWebhookCustomPropertyPromotedToEnterpriseActionXc3c3b4d2.Serializer::class)
public sealed class InlineWebhookCustomPropertyPromotedToEnterpriseActionXc3c3b4d2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `promote_to_enterprise`.
   */
  public data object PromoteToEnterprise : InlineWebhookCustomPropertyPromotedToEnterpriseActionXc3c3b4d2() {
    public override val `value`: String = "promote_to_enterprise"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCustomPropertyPromotedToEnterpriseActionXc3c3b4d2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCustomPropertyPromotedToEnterpriseActionXc3c3b4d2 = when (value) {
      PromoteToEnterprise.value -> PromoteToEnterprise
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCustomPropertyPromotedToEnterpriseActionXc3c3b4d2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCustomPropertyPromotedToEnterpriseActionXc3c3b4d2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCustomPropertyPromotedToEnterpriseActionXc3c3b4d2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCustomPropertyPromotedToEnterpriseActionXc3c3b4d2) {
      encoder.encodeString(value.value)
    }
  }
}
