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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/action
 */
@Serializable(with = InlineWebhookIssuesDemilestonedActionX1ebba111.Serializer::class)
public sealed class InlineWebhookIssuesDemilestonedActionX1ebba111 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `demilestoned`.
   */
  public data object Demilestoned : InlineWebhookIssuesDemilestonedActionX1ebba111() {
    public override val `value`: String = "demilestoned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDemilestonedActionX1ebba111()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDemilestonedActionX1ebba111 = when (value) {
      Demilestoned.value -> Demilestoned
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookIssuesDemilestonedActionX1ebba111> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesDemilestonedActionX1ebba111", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDemilestonedActionX1ebba111 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDemilestonedActionX1ebba111) {
      encoder.encodeString(value.value)
    }
  }
}
