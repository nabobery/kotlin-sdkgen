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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-run-requested-action/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-check-run-requested-action/properties/action
 */
@Serializable(with = InlineWebhookCheckRunRequestedActionActionX6856acab.Serializer::class)
public sealed class InlineWebhookCheckRunRequestedActionActionX6856acab {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `requested_action`.
   */
  public data object RequestedAction : InlineWebhookCheckRunRequestedActionActionX6856acab() {
    public override val `value`: String = "requested_action"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckRunRequestedActionActionX6856acab()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckRunRequestedActionActionX6856acab = when (value) {
      RequestedAction.value -> RequestedAction
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckRunRequestedActionActionX6856acab> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckRunRequestedActionActionX6856acab", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckRunRequestedActionActionX6856acab = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckRunRequestedActionActionX6856acab) {
      encoder.encodeString(value.value)
    }
  }
}
