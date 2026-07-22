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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-custom-property-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-custom-property-created/properties/action
 */
@Serializable(with = InlineWebhookCustomPropertyCreatedActionX924d1b96.Serializer::class)
public sealed class InlineWebhookCustomPropertyCreatedActionX924d1b96 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookCustomPropertyCreatedActionX924d1b96() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCustomPropertyCreatedActionX924d1b96()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCustomPropertyCreatedActionX924d1b96 = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookCustomPropertyCreatedActionX924d1b96> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCustomPropertyCreatedActionX924d1b96", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCustomPropertyCreatedActionX924d1b96 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCustomPropertyCreatedActionX924d1b96) {
      encoder.encodeString(value.value)
    }
  }
}
