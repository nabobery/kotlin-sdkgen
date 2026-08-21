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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-added-to-repository/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-team-added-to-repository/properties/action
 */
@Serializable(with = InlineWebhookTeamAddedToRepositoryActionX4309a3ed.Serializer::class)
public sealed class InlineWebhookTeamAddedToRepositoryActionX4309a3ed {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `added_to_repository`.
   */
  public data object AddedToRepository : InlineWebhookTeamAddedToRepositoryActionX4309a3ed() {
    public override val `value`: String = "added_to_repository"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookTeamAddedToRepositoryActionX4309a3ed()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookTeamAddedToRepositoryActionX4309a3ed = when (value) {
      AddedToRepository.value -> AddedToRepository
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookTeamAddedToRepositoryActionX4309a3ed> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookTeamAddedToRepositoryActionX4309a3ed", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookTeamAddedToRepositoryActionX4309a3ed = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamAddedToRepositoryActionX4309a3ed) {
      encoder.encodeString(value.value)
    }
  }
}
