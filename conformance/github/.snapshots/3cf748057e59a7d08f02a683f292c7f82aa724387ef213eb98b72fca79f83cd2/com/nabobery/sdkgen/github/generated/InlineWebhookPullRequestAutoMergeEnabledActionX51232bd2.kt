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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/action
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeEnabledActionX51232bd2.Serializer::class)
public sealed class InlineWebhookPullRequestAutoMergeEnabledActionX51232bd2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto_merge_enabled`.
   */
  public data object AutoMergeEnabled : InlineWebhookPullRequestAutoMergeEnabledActionX51232bd2() {
    public override val `value`: String = "auto_merge_enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAutoMergeEnabledActionX51232bd2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAutoMergeEnabledActionX51232bd2 = when (value) {
      AutoMergeEnabled.value -> AutoMergeEnabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeEnabledActionX51232bd2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAutoMergeEnabledActionX51232bd2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeEnabledActionX51232bd2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeEnabledActionX51232bd2) {
      encoder.encodeString(value.value)
    }
  }
}
