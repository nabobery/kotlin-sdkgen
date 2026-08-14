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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-transferred/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-transferred/properties/action
 */
@Serializable(with = InlineWebhookDiscussionTransferredActionXef4860a3.Serializer::class)
public sealed class InlineWebhookDiscussionTransferredActionXef4860a3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `transferred`.
   */
  public data object Transferred : InlineWebhookDiscussionTransferredActionXef4860a3() {
    public override val `value`: String = "transferred"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDiscussionTransferredActionXef4860a3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDiscussionTransferredActionXef4860a3 = when (value) {
      Transferred.value -> Transferred
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDiscussionTransferredActionXef4860a3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDiscussionTransferredActionXef4860a3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionTransferredActionXef4860a3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionTransferredActionXef4860a3) {
      encoder.encodeString(value.value)
    }
  }
}
