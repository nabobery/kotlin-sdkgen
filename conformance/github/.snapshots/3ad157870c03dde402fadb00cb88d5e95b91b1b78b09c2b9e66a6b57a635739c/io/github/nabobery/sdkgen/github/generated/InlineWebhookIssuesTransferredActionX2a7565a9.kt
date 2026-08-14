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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-transferred/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-transferred/properties/action
 */
@Serializable(with = InlineWebhookIssuesTransferredActionX2a7565a9.Serializer::class)
public sealed class InlineWebhookIssuesTransferredActionX2a7565a9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `transferred`.
   */
  public data object Transferred : InlineWebhookIssuesTransferredActionX2a7565a9() {
    public override val `value`: String = "transferred"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesTransferredActionX2a7565a9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesTransferredActionX2a7565a9 = when (value) {
      Transferred.value -> Transferred
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesTransferredActionX2a7565a9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesTransferredActionX2a7565a9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesTransferredActionX2a7565a9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesTransferredActionX2a7565a9) {
      encoder.encodeString(value.value)
    }
  }
}
