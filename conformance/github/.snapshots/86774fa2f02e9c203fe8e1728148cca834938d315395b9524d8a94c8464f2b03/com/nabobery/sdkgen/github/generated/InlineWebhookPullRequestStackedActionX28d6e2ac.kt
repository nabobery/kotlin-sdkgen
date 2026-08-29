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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/action
 */
@Serializable(with = InlineWebhookPullRequestStackedActionX28d6e2ac.Serializer::class)
public sealed class InlineWebhookPullRequestStackedActionX28d6e2ac {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `stacked`.
   */
  public data object Stacked : InlineWebhookPullRequestStackedActionX28d6e2ac() {
    public override val `value`: String = "stacked"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestStackedActionX28d6e2ac()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestStackedActionX28d6e2ac = when (value) {
      Stacked.value -> Stacked
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestStackedActionX28d6e2ac> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestStackedActionX28d6e2ac", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStackedActionX28d6e2ac = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStackedActionX28d6e2ac) {
      encoder.encodeString(value.value)
    }
  }
}
