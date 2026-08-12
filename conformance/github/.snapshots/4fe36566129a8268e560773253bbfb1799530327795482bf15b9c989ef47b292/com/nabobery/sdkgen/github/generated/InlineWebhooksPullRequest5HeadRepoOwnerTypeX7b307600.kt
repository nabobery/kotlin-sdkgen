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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/head/properties/repo/properties/o
 * wner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/head/properties/repo/properties/o
 * wner/properties/type
 */
@Serializable(with = InlineWebhooksPullRequest5HeadRepoOwnerTypeX7b307600.Serializer::class)
public sealed class InlineWebhooksPullRequest5HeadRepoOwnerTypeX7b307600 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksPullRequest5HeadRepoOwnerTypeX7b307600() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksPullRequest5HeadRepoOwnerTypeX7b307600() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksPullRequest5HeadRepoOwnerTypeX7b307600() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPullRequest5HeadRepoOwnerTypeX7b307600()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPullRequest5HeadRepoOwnerTypeX7b307600 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksPullRequest5HeadRepoOwnerTypeX7b307600> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksPullRequest5HeadRepoOwnerTypeX7b307600", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5HeadRepoOwnerTypeX7b307600 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5HeadRepoOwnerTypeX7b307600) {
      encoder.encodeString(value.value)
    }
  }
}
