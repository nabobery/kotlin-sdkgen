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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-column-moved/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-column-moved/properties/action
 */
@Serializable(with = InlineWebhookProjectColumnMovedActionX4726f21f.Serializer::class)
public sealed class InlineWebhookProjectColumnMovedActionX4726f21f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `moved`.
   */
  public data object Moved : InlineWebhookProjectColumnMovedActionX4726f21f() {
    public override val `value`: String = "moved"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectColumnMovedActionX4726f21f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectColumnMovedActionX4726f21f = when (value) {
      Moved.value -> Moved
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookProjectColumnMovedActionX4726f21f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookProjectColumnMovedActionX4726f21f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectColumnMovedActionX4726f21f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectColumnMovedActionX4726f21f) {
      encoder.encodeString(value.value)
    }
  }
}
