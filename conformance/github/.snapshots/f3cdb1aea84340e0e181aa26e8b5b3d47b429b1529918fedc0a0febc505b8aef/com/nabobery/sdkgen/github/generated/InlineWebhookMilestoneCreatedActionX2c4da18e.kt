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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-milestone-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-milestone-created/properties/action
 */
@Serializable(with = InlineWebhookMilestoneCreatedActionX2c4da18e.Serializer::class)
public sealed class InlineWebhookMilestoneCreatedActionX2c4da18e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookMilestoneCreatedActionX2c4da18e() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMilestoneCreatedActionX2c4da18e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMilestoneCreatedActionX2c4da18e = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookMilestoneCreatedActionX2c4da18e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMilestoneCreatedActionX2c4da18e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMilestoneCreatedActionX2c4da18e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMilestoneCreatedActionX2c4da18e) {
      encoder.encodeString(value.value)
    }
  }
}
