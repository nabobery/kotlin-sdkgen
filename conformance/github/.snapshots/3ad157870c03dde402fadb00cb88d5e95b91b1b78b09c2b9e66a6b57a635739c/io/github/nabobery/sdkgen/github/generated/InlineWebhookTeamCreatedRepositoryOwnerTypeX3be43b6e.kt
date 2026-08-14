package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-created/properties/repository/properties/owner/properti
 * es/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-created/properties/repository/properties/owner/properti
 * es/type
 */
@Serializable(with = InlineWebhookTeamCreatedRepositoryOwnerTypeX3be43b6e.Serializer::class)
public sealed class InlineWebhookTeamCreatedRepositoryOwnerTypeX3be43b6e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookTeamCreatedRepositoryOwnerTypeX3be43b6e() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookTeamCreatedRepositoryOwnerTypeX3be43b6e() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookTeamCreatedRepositoryOwnerTypeX3be43b6e() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookTeamCreatedRepositoryOwnerTypeX3be43b6e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookTeamCreatedRepositoryOwnerTypeX3be43b6e = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookTeamCreatedRepositoryOwnerTypeX3be43b6e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookTeamCreatedRepositoryOwnerTypeX3be43b6e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookTeamCreatedRepositoryOwnerTypeX3be43b6e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamCreatedRepositoryOwnerTypeX3be43b6e) {
      encoder.encodeString(value.value)
    }
  }
}
