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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/action
 */
@Serializable(with = InlineWebhookIssuesReopenedActionX08927c78.Serializer::class)
public sealed class InlineWebhookIssuesReopenedActionX08927c78 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reopened`.
   */
  public data object Reopened : InlineWebhookIssuesReopenedActionX08927c78() {
    public override val `value`: String = "reopened"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesReopenedActionX08927c78()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesReopenedActionX08927c78 = when (value) {
      Reopened.value -> Reopened
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesReopenedActionX08927c78> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesReopenedActionX08927c78", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesReopenedActionX08927c78 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesReopenedActionX08927c78) {
      encoder.encodeString(value.value)
    }
  }
}
