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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unpinned/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unpinned/properties/action
 */
@Serializable(with = InlineWebhookIssuesUnpinnedActionX41e24757.Serializer::class)
public sealed class InlineWebhookIssuesUnpinnedActionX41e24757 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unpinned`.
   */
  public data object Unpinned : InlineWebhookIssuesUnpinnedActionX41e24757() {
    public override val `value`: String = "unpinned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesUnpinnedActionX41e24757()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesUnpinnedActionX41e24757 = when (value) {
      Unpinned.value -> Unpinned
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesUnpinnedActionX41e24757> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesUnpinnedActionX41e24757", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesUnpinnedActionX41e24757 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesUnpinnedActionX41e24757) {
      encoder.encodeString(value.value)
    }
  }
}
