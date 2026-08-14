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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-locked/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-locked/properties/action
 */
@Serializable(with = InlineWebhookDiscussionLockedActionX429fe32d.Serializer::class)
public sealed class InlineWebhookDiscussionLockedActionX429fe32d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `locked`.
   */
  public data object Locked : InlineWebhookDiscussionLockedActionX429fe32d() {
    public override val `value`: String = "locked"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDiscussionLockedActionX429fe32d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDiscussionLockedActionX429fe32d = when (value) {
      Locked.value -> Locked
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDiscussionLockedActionX429fe32d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDiscussionLockedActionX429fe32d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionLockedActionX429fe32d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionLockedActionX429fe32d) {
      encoder.encodeString(value.value)
    }
  }
}
