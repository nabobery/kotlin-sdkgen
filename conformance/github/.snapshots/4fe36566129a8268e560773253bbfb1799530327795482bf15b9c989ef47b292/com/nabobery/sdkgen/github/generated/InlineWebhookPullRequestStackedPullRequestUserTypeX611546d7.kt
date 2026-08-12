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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/user
 * /properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/user
 * /properties/type
 */
@Serializable(with = InlineWebhookPullRequestStackedPullRequestUserTypeX611546d7.Serializer::class)
public sealed class InlineWebhookPullRequestStackedPullRequestUserTypeX611546d7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestStackedPullRequestUserTypeX611546d7() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestStackedPullRequestUserTypeX611546d7() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestStackedPullRequestUserTypeX611546d7() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestStackedPullRequestUserTypeX611546d7() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestStackedPullRequestUserTypeX611546d7()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestStackedPullRequestUserTypeX611546d7 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestStackedPullRequestUserTypeX611546d7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestStackedPullRequestUserTypeX611546d7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStackedPullRequestUserTypeX611546d7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStackedPullRequestUserTypeX611546d7) {
      encoder.encodeString(value.value)
    }
  }
}
