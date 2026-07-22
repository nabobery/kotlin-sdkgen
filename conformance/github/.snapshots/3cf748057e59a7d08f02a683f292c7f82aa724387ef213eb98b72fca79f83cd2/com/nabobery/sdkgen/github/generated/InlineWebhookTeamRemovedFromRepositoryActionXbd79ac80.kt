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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-removed-from-repository/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-team-removed-from-repository/properties/action
 */
@Serializable(with = InlineWebhookTeamRemovedFromRepositoryActionXbd79ac80.Serializer::class)
public sealed class InlineWebhookTeamRemovedFromRepositoryActionXbd79ac80 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `removed_from_repository`.
   */
  public data object RemovedFromRepository : InlineWebhookTeamRemovedFromRepositoryActionXbd79ac80() {
    public override val `value`: String = "removed_from_repository"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookTeamRemovedFromRepositoryActionXbd79ac80()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookTeamRemovedFromRepositoryActionXbd79ac80 = when (value) {
      RemovedFromRepository.value -> RemovedFromRepository
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookTeamRemovedFromRepositoryActionXbd79ac80> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookTeamRemovedFromRepositoryActionXbd79ac80", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookTeamRemovedFromRepositoryActionXbd79ac80 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamRemovedFromRepositoryActionXbd79ac80) {
      encoder.encodeString(value.value)
    }
  }
}
