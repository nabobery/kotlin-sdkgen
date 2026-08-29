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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned/properties/action
 */
@Serializable(with = InlineWebhookIssuesMilestonedActionX48af13bc.Serializer::class)
public sealed class InlineWebhookIssuesMilestonedActionX48af13bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `milestoned`.
   */
  public data object Milestoned : InlineWebhookIssuesMilestonedActionX48af13bc() {
    public override val `value`: String = "milestoned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesMilestonedActionX48af13bc()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesMilestonedActionX48af13bc = when (value) {
      Milestoned.value -> Milestoned
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesMilestonedActionX48af13bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesMilestonedActionX48af13bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesMilestonedActionX48af13bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesMilestonedActionX48af13bc) {
      encoder.encodeString(value.value)
    }
  }
}
