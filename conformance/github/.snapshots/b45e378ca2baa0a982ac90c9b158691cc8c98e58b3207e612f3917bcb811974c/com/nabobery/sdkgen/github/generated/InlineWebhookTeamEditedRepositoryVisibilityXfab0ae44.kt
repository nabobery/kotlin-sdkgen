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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/repository/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/repository/properties/visibility
 */
@Serializable(with = InlineWebhookTeamEditedRepositoryVisibilityXfab0ae44.Serializer::class)
public sealed class InlineWebhookTeamEditedRepositoryVisibilityXfab0ae44 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookTeamEditedRepositoryVisibilityXfab0ae44() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookTeamEditedRepositoryVisibilityXfab0ae44() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookTeamEditedRepositoryVisibilityXfab0ae44() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookTeamEditedRepositoryVisibilityXfab0ae44()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookTeamEditedRepositoryVisibilityXfab0ae44 = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookTeamEditedRepositoryVisibilityXfab0ae44> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookTeamEditedRepositoryVisibilityXfab0ae44", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookTeamEditedRepositoryVisibilityXfab0ae44 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamEditedRepositoryVisibilityXfab0ae44) {
      encoder.encodeString(value.value)
    }
  }
}
