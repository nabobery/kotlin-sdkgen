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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-demilestoned/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-demilestoned/properties/action
 */
@Serializable(with = InlineWebhookPullRequestDemilestonedActionXf215b58b.Serializer::class)
public sealed class InlineWebhookPullRequestDemilestonedActionXf215b58b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `demilestoned`.
   */
  public data object Demilestoned : InlineWebhookPullRequestDemilestonedActionXf215b58b() {
    public override val `value`: String = "demilestoned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestDemilestonedActionXf215b58b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestDemilestonedActionXf215b58b = when (value) {
      Demilestoned.value -> Demilestoned
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestDemilestonedActionXf215b58b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestDemilestonedActionXf215b58b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDemilestonedActionXf215b58b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDemilestonedActionXf215b58b) {
      encoder.encodeString(value.value)
    }
  }
}
