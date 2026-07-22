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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/repository/properties/owner/propertie
 * s/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/repository/properties/owner/propertie
 * s/type
 */
@Serializable(with = InlineWebhookTeamEditedRepositoryOwnerTypeX99d7858b.Serializer::class)
public sealed class InlineWebhookTeamEditedRepositoryOwnerTypeX99d7858b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookTeamEditedRepositoryOwnerTypeX99d7858b() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookTeamEditedRepositoryOwnerTypeX99d7858b() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookTeamEditedRepositoryOwnerTypeX99d7858b() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookTeamEditedRepositoryOwnerTypeX99d7858b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookTeamEditedRepositoryOwnerTypeX99d7858b = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookTeamEditedRepositoryOwnerTypeX99d7858b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookTeamEditedRepositoryOwnerTypeX99d7858b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookTeamEditedRepositoryOwnerTypeX99d7858b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamEditedRepositoryOwnerTypeX99d7858b) {
      encoder.encodeString(value.value)
    }
  }
}
