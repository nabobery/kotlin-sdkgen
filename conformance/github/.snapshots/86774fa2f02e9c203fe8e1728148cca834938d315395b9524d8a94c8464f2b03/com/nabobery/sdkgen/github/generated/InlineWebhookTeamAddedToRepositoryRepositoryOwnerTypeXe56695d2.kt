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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-added-to-repository/properties/repository/properties/ow
 * ner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-added-to-repository/properties/repository/properties/ow
 * ner/properties/type
 */
@Serializable(with = InlineWebhookTeamAddedToRepositoryRepositoryOwnerTypeXe56695d2.Serializer::class)
public sealed class InlineWebhookTeamAddedToRepositoryRepositoryOwnerTypeXe56695d2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookTeamAddedToRepositoryRepositoryOwnerTypeXe56695d2() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookTeamAddedToRepositoryRepositoryOwnerTypeXe56695d2() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookTeamAddedToRepositoryRepositoryOwnerTypeXe56695d2() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookTeamAddedToRepositoryRepositoryOwnerTypeXe56695d2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookTeamAddedToRepositoryRepositoryOwnerTypeXe56695d2 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookTeamAddedToRepositoryRepositoryOwnerTypeXe56695d2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookTeamAddedToRepositoryRepositoryOwnerTypeXe56695d2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookTeamAddedToRepositoryRepositoryOwnerTypeXe56695d2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamAddedToRepositoryRepositoryOwnerTypeXe56695d2) {
      encoder.encodeString(value.value)
    }
  }
}
