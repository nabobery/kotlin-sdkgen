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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-unlabeled/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-unlabeled/properties/action
 */
@Serializable(with = InlineWebhookDiscussionUnlabeledActionXe9be33c9.Serializer::class)
public sealed class InlineWebhookDiscussionUnlabeledActionXe9be33c9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unlabeled`.
   */
  public data object Unlabeled : InlineWebhookDiscussionUnlabeledActionXe9be33c9() {
    public override val `value`: String = "unlabeled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDiscussionUnlabeledActionXe9be33c9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDiscussionUnlabeledActionXe9be33c9 = when (value) {
      Unlabeled.value -> Unlabeled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDiscussionUnlabeledActionXe9be33c9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDiscussionUnlabeledActionXe9be33c9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionUnlabeledActionXe9be33c9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionUnlabeledActionXe9be33c9) {
      encoder.encodeString(value.value)
    }
  }
}
