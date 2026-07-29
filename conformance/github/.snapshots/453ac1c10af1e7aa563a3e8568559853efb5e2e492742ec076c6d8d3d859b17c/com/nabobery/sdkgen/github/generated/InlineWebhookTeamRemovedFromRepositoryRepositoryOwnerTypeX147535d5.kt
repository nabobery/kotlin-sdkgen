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
 * s/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-removed-from-repository/properties/repository/propertie
 * s/owner/properties/type
 */
@Serializable(with = InlineWebhookTeamRemovedFromRepositoryRepositoryOwnerTypeX147535d5.Serializer::class)
public sealed class InlineWebhookTeamRemovedFromRepositoryRepositoryOwnerTypeX147535d5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookTeamRemovedFromRepositoryRepositoryOwnerTypeX147535d5() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookTeamRemovedFromRepositoryRepositoryOwnerTypeX147535d5() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookTeamRemovedFromRepositoryRepositoryOwnerTypeX147535d5() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookTeamRemovedFromRepositoryRepositoryOwnerTypeX147535d5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookTeamRemovedFromRepositoryRepositoryOwnerTypeX147535d5 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookTeamRemovedFromRepositoryRepositoryOwnerTypeX147535d5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookTeamRemovedFromRepositoryRepositoryOwnerTypeX147535d5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookTeamRemovedFromRepositoryRepositoryOwnerTypeX147535d5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamRemovedFromRepositoryRepositoryOwnerTypeX147535d5) {
      encoder.encodeString(value.value)
    }
  }
}
