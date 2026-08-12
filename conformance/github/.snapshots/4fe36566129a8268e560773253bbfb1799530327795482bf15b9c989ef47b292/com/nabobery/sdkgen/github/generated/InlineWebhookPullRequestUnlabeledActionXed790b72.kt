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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/action
 */
@Serializable(with = InlineWebhookPullRequestUnlabeledActionXed790b72.Serializer::class)
public sealed class InlineWebhookPullRequestUnlabeledActionXed790b72 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unlabeled`.
   */
  public data object Unlabeled : InlineWebhookPullRequestUnlabeledActionXed790b72() {
    public override val `value`: String = "unlabeled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnlabeledActionXed790b72()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnlabeledActionXed790b72 = when (value) {
      Unlabeled.value -> Unlabeled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnlabeledActionXed790b72> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnlabeledActionXed790b72", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlabeledActionXed790b72 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlabeledActionXed790b72) {
      encoder.encodeString(value.value)
    }
  }
}
