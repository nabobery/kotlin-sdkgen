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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-added-to-repository/properties/repository/properties/vi
 * sibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-added-to-repository/properties/repository/properties/vi
 * sibility
 */
@Serializable(with = InlineWebhookTeamAddedToRepositoryRepositoryVisibilityXb7b6a0a2.Serializer::class)
public sealed class InlineWebhookTeamAddedToRepositoryRepositoryVisibilityXb7b6a0a2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookTeamAddedToRepositoryRepositoryVisibilityXb7b6a0a2() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookTeamAddedToRepositoryRepositoryVisibilityXb7b6a0a2() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookTeamAddedToRepositoryRepositoryVisibilityXb7b6a0a2() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookTeamAddedToRepositoryRepositoryVisibilityXb7b6a0a2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookTeamAddedToRepositoryRepositoryVisibilityXb7b6a0a2 = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookTeamAddedToRepositoryRepositoryVisibilityXb7b6a0a2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookTeamAddedToRepositoryRepositoryVisibilityXb7b6a0a2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookTeamAddedToRepositoryRepositoryVisibilityXb7b6a0a2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamAddedToRepositoryRepositoryVisibilityXb7b6a0a2) {
      encoder.encodeString(value.value)
    }
  }
}
