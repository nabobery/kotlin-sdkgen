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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/ass
 * ignees/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/ass
 * ignees/items/properties/type
 */
@Serializable(with = InlineWebhookPullRequestUnlockedPullRequestAssigneesItemTypeXcd16d418.Serializer::class)
public sealed class InlineWebhookPullRequestUnlockedPullRequestAssigneesItemTypeXcd16d418 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestUnlockedPullRequestAssigneesItemTypeXcd16d418() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestUnlockedPullRequestAssigneesItemTypeXcd16d418() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestUnlockedPullRequestAssigneesItemTypeXcd16d418() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnlockedPullRequestAssigneesItemTypeXcd16d418()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnlockedPullRequestAssigneesItemTypeXcd16d418 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnlockedPullRequestAssigneesItemTypeXcd16d418> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnlockedPullRequestAssigneesItemTypeXcd16d418", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlockedPullRequestAssigneesItemTypeXcd16d418 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlockedPullRequestAssigneesItemTypeXcd16d418) {
      encoder.encodeString(value.value)
    }
  }
}
