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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-dependabot-alert-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-dependabot-alert-created/properties/action
 */
@Serializable(with = InlineWebhookDependabotAlertCreatedActionX7404a35c.Serializer::class)
public sealed class InlineWebhookDependabotAlertCreatedActionX7404a35c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookDependabotAlertCreatedActionX7404a35c() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDependabotAlertCreatedActionX7404a35c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDependabotAlertCreatedActionX7404a35c = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDependabotAlertCreatedActionX7404a35c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDependabotAlertCreatedActionX7404a35c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDependabotAlertCreatedActionX7404a35c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDependabotAlertCreatedActionX7404a35c) {
      encoder.encodeString(value.value)
    }
  }
}
