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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-removed-from-repository/properties/repository/propertie
 * s/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-removed-from-repository/properties/repository/propertie
 * s/visibility
 */
@Serializable(with = InlineWebhookTeamRemovedFromRepositoryRepositoryVisibilityX5e30c2a4.Serializer::class)
public sealed class InlineWebhookTeamRemovedFromRepositoryRepositoryVisibilityX5e30c2a4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookTeamRemovedFromRepositoryRepositoryVisibilityX5e30c2a4() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookTeamRemovedFromRepositoryRepositoryVisibilityX5e30c2a4() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookTeamRemovedFromRepositoryRepositoryVisibilityX5e30c2a4() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookTeamRemovedFromRepositoryRepositoryVisibilityX5e30c2a4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookTeamRemovedFromRepositoryRepositoryVisibilityX5e30c2a4 = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookTeamRemovedFromRepositoryRepositoryVisibilityX5e30c2a4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookTeamRemovedFromRepositoryRepositoryVisibilityX5e30c2a4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookTeamRemovedFromRepositoryRepositoryVisibilityX5e30c2a4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamRemovedFromRepositoryRepositoryVisibilityX5e30c2a4) {
      encoder.encodeString(value.value)
    }
  }
}
