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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-deleted/properties/repository/properties/owner/properti
 * es/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-deleted/properties/repository/properties/owner/properti
 * es/type
 */
@Serializable(with = InlineWebhookTeamDeletedRepositoryOwnerTypeX9ebb7a55.Serializer::class)
public sealed class InlineWebhookTeamDeletedRepositoryOwnerTypeX9ebb7a55 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookTeamDeletedRepositoryOwnerTypeX9ebb7a55() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookTeamDeletedRepositoryOwnerTypeX9ebb7a55() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookTeamDeletedRepositoryOwnerTypeX9ebb7a55() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookTeamDeletedRepositoryOwnerTypeX9ebb7a55()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookTeamDeletedRepositoryOwnerTypeX9ebb7a55 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookTeamDeletedRepositoryOwnerTypeX9ebb7a55> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookTeamDeletedRepositoryOwnerTypeX9ebb7a55", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookTeamDeletedRepositoryOwnerTypeX9ebb7a55 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamDeletedRepositoryOwnerTypeX9ebb7a55) {
      encoder.encodeString(value.value)
    }
  }
}
