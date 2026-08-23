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
 * The policy controlling who can create pull requests: all or collaborators_only.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/0/properties/pull_
 * request/properties/head/properties/repo/properties/pull_request_creation_policy
 */
@Serializable(with = InlineWebhookPullRequestReacd1OneOf1PullRequestPullRequestCreationP824dX3448c981.Serializer::class)
public sealed class InlineWebhookPullRequestReacd1OneOf1PullRequestPullRequestCreationP824dX3448c981 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhookPullRequestReacd1OneOf1PullRequestPullRequestCreationP824dX3448c981() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhookPullRequestReacd1OneOf1PullRequestPullRequestCreationP824dX3448c981() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReacd1OneOf1PullRequestPullRequestCreationP824dX3448c981()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReacd1OneOf1PullRequestPullRequestCreationP824dX3448c981 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReacd1OneOf1PullRequestPullRequestCreationP824dX3448c981> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReacd1OneOf1PullRequestPullRequestCreationP824dX3448c981", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReacd1OneOf1PullRequestPullRequestCreationP824dX3448c981 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReacd1OneOf1PullRequestPullRequestCreationP824dX3448c981) {
      encoder.encodeString(value.value)
    }
  }
}
