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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-project-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-project-created/properties/action
 */
@Serializable(with = InlineWebhookProjectsV2ProjectCreatedActionX3e18171e.Serializer::class)
public sealed class InlineWebhookProjectsV2ProjectCreatedActionX3e18171e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookProjectsV2ProjectCreatedActionX3e18171e() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectsV2ProjectCreatedActionX3e18171e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectsV2ProjectCreatedActionX3e18171e = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookProjectsV2ProjectCreatedActionX3e18171e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookProjectsV2ProjectCreatedActionX3e18171e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ProjectCreatedActionX3e18171e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ProjectCreatedActionX3e18171e) {
      encoder.encodeString(value.value)
    }
  }
}
