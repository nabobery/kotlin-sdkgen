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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhook-team-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-team-created/properties/action
 */
@Serializable(with = InlineWebhookTeamCreatedActionX5beaa19d.Serializer::class)
public sealed class InlineWebhookTeamCreatedActionX5beaa19d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookTeamCreatedActionX5beaa19d() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookTeamCreatedActionX5beaa19d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookTeamCreatedActionX5beaa19d = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookTeamCreatedActionX5beaa19d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookTeamCreatedActionX5beaa19d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookTeamCreatedActionX5beaa19d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamCreatedActionX5beaa19d) {
      encoder.encodeString(value.value)
    }
  }
}
