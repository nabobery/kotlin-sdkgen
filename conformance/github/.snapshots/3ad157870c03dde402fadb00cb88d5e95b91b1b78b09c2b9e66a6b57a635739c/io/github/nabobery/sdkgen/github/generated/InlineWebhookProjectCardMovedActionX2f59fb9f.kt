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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-moved/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-moved/properties/action
 */
@Serializable(with = InlineWebhookProjectCardMovedActionX2f59fb9f.Serializer::class)
public sealed class InlineWebhookProjectCardMovedActionX2f59fb9f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `moved`.
   */
  public data object Moved : InlineWebhookProjectCardMovedActionX2f59fb9f() {
    public override val `value`: String = "moved"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectCardMovedActionX2f59fb9f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectCardMovedActionX2f59fb9f = when (value) {
      Moved.value -> Moved
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookProjectCardMovedActionX2f59fb9f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookProjectCardMovedActionX2f59fb9f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectCardMovedActionX2f59fb9f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectCardMovedActionX2f59fb9f) {
      encoder.encodeString(value.value)
    }
  }
}
