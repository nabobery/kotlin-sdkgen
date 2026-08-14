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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-run-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-check-run-created/properties/action
 */
@Serializable(with = InlineWebhookCheckRunCreatedActionXf5b121b7.Serializer::class)
public sealed class InlineWebhookCheckRunCreatedActionXf5b121b7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookCheckRunCreatedActionXf5b121b7() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckRunCreatedActionXf5b121b7()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckRunCreatedActionXf5b121b7 = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckRunCreatedActionXf5b121b7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckRunCreatedActionXf5b121b7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckRunCreatedActionXf5b121b7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckRunCreatedActionXf5b121b7) {
      encoder.encodeString(value.value)
    }
  }
}
