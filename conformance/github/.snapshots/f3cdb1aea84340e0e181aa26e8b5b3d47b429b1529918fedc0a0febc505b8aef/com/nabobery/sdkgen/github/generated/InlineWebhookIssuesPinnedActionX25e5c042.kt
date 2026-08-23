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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-pinned/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-pinned/properties/action
 */
@Serializable(with = InlineWebhookIssuesPinnedActionX25e5c042.Serializer::class)
public sealed class InlineWebhookIssuesPinnedActionX25e5c042 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pinned`.
   */
  public data object Pinned : InlineWebhookIssuesPinnedActionX25e5c042() {
    public override val `value`: String = "pinned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesPinnedActionX25e5c042()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesPinnedActionX25e5c042 = when (value) {
      Pinned.value -> Pinned
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesPinnedActionX25e5c042> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesPinnedActionX25e5c042", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesPinnedActionX25e5c042 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesPinnedActionX25e5c042) {
      encoder.encodeString(value.value)
    }
  }
}
