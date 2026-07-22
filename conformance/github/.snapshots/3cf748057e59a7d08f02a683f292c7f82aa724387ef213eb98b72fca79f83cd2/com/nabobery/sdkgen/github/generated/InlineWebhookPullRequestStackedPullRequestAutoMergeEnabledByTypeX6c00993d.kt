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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/auto
 * _merge/properties/enabled_by/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/auto
 * _merge/properties/enabled_by/properties/type
 */
@Serializable(with = InlineWebhookPullRequestStackedPullRequestAutoMergeEnabledByTypeX6c00993d.Serializer::class)
public sealed class InlineWebhookPullRequestStackedPullRequestAutoMergeEnabledByTypeX6c00993d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestStackedPullRequestAutoMergeEnabledByTypeX6c00993d() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestStackedPullRequestAutoMergeEnabledByTypeX6c00993d() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestStackedPullRequestAutoMergeEnabledByTypeX6c00993d() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestStackedPullRequestAutoMergeEnabledByTypeX6c00993d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestStackedPullRequestAutoMergeEnabledByTypeX6c00993d = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestStackedPullRequestAutoMergeEnabledByTypeX6c00993d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestStackedPullRequestAutoMergeEnabledByTypeX6c00993d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStackedPullRequestAutoMergeEnabledByTypeX6c00993d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStackedPullRequestAutoMergeEnabledByTypeX6c00993d) {
      encoder.encodeString(value.value)
    }
  }
}
