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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-reopened/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-reopened/properties/action
 */
@Serializable(with = InlineWebhookPullRequestReopenedActionX58a0a2da.Serializer::class)
public sealed class InlineWebhookPullRequestReopenedActionX58a0a2da {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reopened`.
   */
  public data object Reopened : InlineWebhookPullRequestReopenedActionX58a0a2da() {
    public override val `value`: String = "reopened"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReopenedActionX58a0a2da()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReopenedActionX58a0a2da = when (value) {
      Reopened.value -> Reopened
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReopenedActionX58a0a2da> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReopenedActionX58a0a2da", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReopenedActionX58a0a2da = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReopenedActionX58a0a2da) {
      encoder.encodeString(value.value)
    }
  }
}
