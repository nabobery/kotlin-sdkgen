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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/action
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeDisabledActionX74f18b76.Serializer::class)
public sealed class InlineWebhookPullRequestAutoMergeDisabledActionX74f18b76 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto_merge_disabled`.
   */
  public data object AutoMergeDisabled : InlineWebhookPullRequestAutoMergeDisabledActionX74f18b76() {
    public override val `value`: String = "auto_merge_disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAutoMergeDisabledActionX74f18b76()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAutoMergeDisabledActionX74f18b76 = when (value) {
      AutoMergeDisabled.value -> AutoMergeDisabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeDisabledActionX74f18b76> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAutoMergeDisabledActionX74f18b76", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeDisabledActionX74f18b76 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeDisabledActionX74f18b76) {
      encoder.encodeString(value.value)
    }
  }
}
