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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-release-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-release-created/properties/action
 */
@Serializable(with = InlineWebhookReleaseCreatedActionXf8f48a82.Serializer::class)
public sealed class InlineWebhookReleaseCreatedActionXf8f48a82 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookReleaseCreatedActionXf8f48a82() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookReleaseCreatedActionXf8f48a82()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookReleaseCreatedActionXf8f48a82 = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookReleaseCreatedActionXf8f48a82> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookReleaseCreatedActionXf8f48a82", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookReleaseCreatedActionXf8f48a82 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookReleaseCreatedActionXf8f48a82) {
      encoder.encodeString(value.value)
    }
  }
}
