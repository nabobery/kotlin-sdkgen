package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-answered/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-answered/properties/action
 */
@Serializable(with = InlineWebhookDiscussionAnsweredActionX35c07c5c.Serializer::class)
public sealed class InlineWebhookDiscussionAnsweredActionX35c07c5c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `answered`.
   */
  public data object Answered : InlineWebhookDiscussionAnsweredActionX35c07c5c() {
    public override val `value`: String = "answered"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDiscussionAnsweredActionX35c07c5c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDiscussionAnsweredActionX35c07c5c = when (value) {
      Answered.value -> Answered
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDiscussionAnsweredActionX35c07c5c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDiscussionAnsweredActionX35c07c5c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionAnsweredActionX35c07c5c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionAnsweredActionX35c07c5c) {
      encoder.encodeString(value.value)
    }
  }
}
