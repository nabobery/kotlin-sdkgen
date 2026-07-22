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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/action
 */
@Serializable(with = InlineWebhookPullRequestUnlockedActionXa6295caf.Serializer::class)
public sealed class InlineWebhookPullRequestUnlockedActionXa6295caf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unlocked`.
   */
  public data object Unlocked : InlineWebhookPullRequestUnlockedActionXa6295caf() {
    public override val `value`: String = "unlocked"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnlockedActionXa6295caf()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnlockedActionXa6295caf = when (value) {
      Unlocked.value -> Unlocked
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestUnlockedActionXa6295caf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnlockedActionXa6295caf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlockedActionXa6295caf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlockedActionXa6295caf) {
      encoder.encodeString(value.value)
    }
  }
}
