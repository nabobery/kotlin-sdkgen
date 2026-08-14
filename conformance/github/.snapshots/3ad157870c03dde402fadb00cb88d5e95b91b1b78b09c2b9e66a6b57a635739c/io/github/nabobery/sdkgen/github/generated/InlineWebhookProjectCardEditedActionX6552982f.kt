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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-edited/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-edited/properties/action
 */
@Serializable(with = InlineWebhookProjectCardEditedActionX6552982f.Serializer::class)
public sealed class InlineWebhookProjectCardEditedActionX6552982f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `edited`.
   */
  public data object Edited : InlineWebhookProjectCardEditedActionX6552982f() {
    public override val `value`: String = "edited"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectCardEditedActionX6552982f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectCardEditedActionX6552982f = when (value) {
      Edited.value -> Edited
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookProjectCardEditedActionX6552982f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookProjectCardEditedActionX6552982f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectCardEditedActionX6552982f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectCardEditedActionX6552982f) {
      encoder.encodeString(value.value)
    }
  }
}
