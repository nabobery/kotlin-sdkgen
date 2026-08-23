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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-publicized/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-publicized/properties/action
 */
@Serializable(with = InlineWebhookRepositoryPublicizedActionX0b3d2c33.Serializer::class)
public sealed class InlineWebhookRepositoryPublicizedActionX0b3d2c33 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `publicized`.
   */
  public data object Publicized : InlineWebhookRepositoryPublicizedActionX0b3d2c33() {
    public override val `value`: String = "publicized"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookRepositoryPublicizedActionX0b3d2c33()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookRepositoryPublicizedActionX0b3d2c33 = when (value) {
      Publicized.value -> Publicized
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryPublicizedActionX0b3d2c33> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookRepositoryPublicizedActionX0b3d2c33", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryPublicizedActionX0b3d2c33 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryPublicizedActionX0b3d2c33) {
      encoder.encodeString(value.value)
    }
  }
}
