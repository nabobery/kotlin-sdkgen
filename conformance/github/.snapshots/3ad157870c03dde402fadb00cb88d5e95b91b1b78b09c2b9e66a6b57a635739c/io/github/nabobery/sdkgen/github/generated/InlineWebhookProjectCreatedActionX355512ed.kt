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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-created/properties/action
 */
@Serializable(with = InlineWebhookProjectCreatedActionX355512ed.Serializer::class)
public sealed class InlineWebhookProjectCreatedActionX355512ed {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookProjectCreatedActionX355512ed() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectCreatedActionX355512ed()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectCreatedActionX355512ed = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookProjectCreatedActionX355512ed> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookProjectCreatedActionX355512ed", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectCreatedActionX355512ed = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectCreatedActionX355512ed) {
      encoder.encodeString(value.value)
    }
  }
}
