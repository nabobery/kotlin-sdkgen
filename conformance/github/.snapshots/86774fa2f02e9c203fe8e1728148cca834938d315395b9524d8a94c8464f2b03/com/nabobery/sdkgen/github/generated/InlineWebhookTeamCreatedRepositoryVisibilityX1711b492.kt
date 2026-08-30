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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-created/properties/repository/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-created/properties/repository/properties/visibility
 */
@Serializable(with = InlineWebhookTeamCreatedRepositoryVisibilityX1711b492.Serializer::class)
public sealed class InlineWebhookTeamCreatedRepositoryVisibilityX1711b492 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookTeamCreatedRepositoryVisibilityX1711b492() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookTeamCreatedRepositoryVisibilityX1711b492() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookTeamCreatedRepositoryVisibilityX1711b492() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookTeamCreatedRepositoryVisibilityX1711b492()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookTeamCreatedRepositoryVisibilityX1711b492 = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookTeamCreatedRepositoryVisibilityX1711b492> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookTeamCreatedRepositoryVisibilityX1711b492", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookTeamCreatedRepositoryVisibilityX1711b492 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamCreatedRepositoryVisibilityX1711b492) {
      encoder.encodeString(value.value)
    }
  }
}
