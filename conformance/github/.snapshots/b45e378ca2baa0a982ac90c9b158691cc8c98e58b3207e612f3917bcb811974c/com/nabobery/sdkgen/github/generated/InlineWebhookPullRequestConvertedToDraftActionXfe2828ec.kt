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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-converted-to-draft/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-converted-to-draft/properties/action
 */
@Serializable(with = InlineWebhookPullRequestConvertedToDraftActionXfe2828ec.Serializer::class)
public sealed class InlineWebhookPullRequestConvertedToDraftActionXfe2828ec {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `converted_to_draft`.
   */
  public data object ConvertedToDraft : InlineWebhookPullRequestConvertedToDraftActionXfe2828ec() {
    public override val `value`: String = "converted_to_draft"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestConvertedToDraftActionXfe2828ec()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestConvertedToDraftActionXfe2828ec = when (value) {
      ConvertedToDraft.value -> ConvertedToDraft
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestConvertedToDraftActionXfe2828ec> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestConvertedToDraftActionXfe2828ec", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestConvertedToDraftActionXfe2828ec = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestConvertedToDraftActionXfe2828ec) {
      encoder.encodeString(value.value)
    }
  }
}
