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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-privatized/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-privatized/properties/action
 */
@Serializable(with = InlineWebhookRepositoryPrivatizedActionX9c722200.Serializer::class)
public sealed class InlineWebhookRepositoryPrivatizedActionX9c722200 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `privatized`.
   */
  public data object Privatized : InlineWebhookRepositoryPrivatizedActionX9c722200() {
    public override val `value`: String = "privatized"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookRepositoryPrivatizedActionX9c722200()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookRepositoryPrivatizedActionX9c722200 = when (value) {
      Privatized.value -> Privatized
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookRepositoryPrivatizedActionX9c722200> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookRepositoryPrivatizedActionX9c722200", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryPrivatizedActionX9c722200 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryPrivatizedActionX9c722200) {
      encoder.encodeString(value.value)
    }
  }
}
