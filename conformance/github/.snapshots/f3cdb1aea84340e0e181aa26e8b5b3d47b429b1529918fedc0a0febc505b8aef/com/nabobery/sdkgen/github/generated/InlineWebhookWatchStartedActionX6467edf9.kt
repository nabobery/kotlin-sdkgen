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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhook-watch-started/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-watch-started/properties/action
 */
@Serializable(with = InlineWebhookWatchStartedActionX6467edf9.Serializer::class)
public sealed class InlineWebhookWatchStartedActionX6467edf9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `started`.
   */
  public data object Started : InlineWebhookWatchStartedActionX6467edf9() {
    public override val `value`: String = "started"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWatchStartedActionX6467edf9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWatchStartedActionX6467edf9 = when (value) {
      Started.value -> Started
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWatchStartedActionX6467edf9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWatchStartedActionX6467edf9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWatchStartedActionX6467edf9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWatchStartedActionX6467edf9) {
      encoder.encodeString(value.value)
    }
  }
}
