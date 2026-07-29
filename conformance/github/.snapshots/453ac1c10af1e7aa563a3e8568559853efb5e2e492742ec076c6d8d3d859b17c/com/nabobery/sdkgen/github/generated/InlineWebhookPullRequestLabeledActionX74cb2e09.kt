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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/action
 */
@Serializable(with = InlineWebhookPullRequestLabeledActionX74cb2e09.Serializer::class)
public sealed class InlineWebhookPullRequestLabeledActionX74cb2e09 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `labeled`.
   */
  public data object Labeled : InlineWebhookPullRequestLabeledActionX74cb2e09() {
    public override val `value`: String = "labeled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLabeledActionX74cb2e09()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLabeledActionX74cb2e09 = when (value) {
      Labeled.value -> Labeled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestLabeledActionX74cb2e09> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLabeledActionX74cb2e09", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLabeledActionX74cb2e09 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLabeledActionX74cb2e09) {
      encoder.encodeString(value.value)
    }
  }
}
