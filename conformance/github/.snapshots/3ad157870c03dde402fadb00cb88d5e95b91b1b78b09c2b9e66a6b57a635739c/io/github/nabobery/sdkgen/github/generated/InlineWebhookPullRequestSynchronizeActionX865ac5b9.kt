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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/action
 */
@Serializable(with = InlineWebhookPullRequestSynchronizeActionX865ac5b9.Serializer::class)
public sealed class InlineWebhookPullRequestSynchronizeActionX865ac5b9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `synchronize`.
   */
  public data object Synchronize : InlineWebhookPullRequestSynchronizeActionX865ac5b9() {
    public override val `value`: String = "synchronize"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestSynchronizeActionX865ac5b9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestSynchronizeActionX865ac5b9 = when (value) {
      Synchronize.value -> Synchronize
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestSynchronizeActionX865ac5b9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestSynchronizeActionX865ac5b9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestSynchronizeActionX865ac5b9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestSynchronizeActionX865ac5b9) {
      encoder.encodeString(value.value)
    }
  }
}
