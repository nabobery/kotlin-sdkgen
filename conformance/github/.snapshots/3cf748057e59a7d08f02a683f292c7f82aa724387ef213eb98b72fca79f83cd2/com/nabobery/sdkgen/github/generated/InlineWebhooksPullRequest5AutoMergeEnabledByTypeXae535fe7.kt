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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/auto_merge/properties/enabled_by/
 * properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/auto_merge/properties/enabled_by/
 * properties/type
 */
@Serializable(with = InlineWebhooksPullRequest5AutoMergeEnabledByTypeXae535fe7.Serializer::class)
public sealed class InlineWebhooksPullRequest5AutoMergeEnabledByTypeXae535fe7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksPullRequest5AutoMergeEnabledByTypeXae535fe7() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksPullRequest5AutoMergeEnabledByTypeXae535fe7() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksPullRequest5AutoMergeEnabledByTypeXae535fe7() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPullRequest5AutoMergeEnabledByTypeXae535fe7()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPullRequest5AutoMergeEnabledByTypeXae535fe7 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksPullRequest5AutoMergeEnabledByTypeXae535fe7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksPullRequest5AutoMergeEnabledByTypeXae535fe7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5AutoMergeEnabledByTypeXae535fe7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5AutoMergeEnabledByTypeXae535fe7) {
      encoder.encodeString(value.value)
    }
  }
}
