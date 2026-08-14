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
 * The policy controlling who can create pull requests: all or collaborators_only.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/head/properties/repo/properties/pull_request_creation_policy
 */
@Serializable(with = InlineWebhookPullRequestRe8581PullRequestHeadPullRequestCreationP824dX786d9eac.Serializer::class)
public sealed class InlineWebhookPullRequestRe8581PullRequestHeadPullRequestCreationP824dX786d9eac {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhookPullRequestRe8581PullRequestHeadPullRequestCreationP824dX786d9eac() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhookPullRequestRe8581PullRequestHeadPullRequestCreationP824dX786d9eac() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe8581PullRequestHeadPullRequestCreationP824dX786d9eac()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe8581PullRequestHeadPullRequestCreationP824dX786d9eac = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe8581PullRequestHeadPullRequestCreationP824dX786d9eac> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe8581PullRequestHeadPullRequestCreationP824dX786d9eac", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe8581PullRequestHeadPullRequestCreationP824dX786d9eac = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe8581PullRequestHeadPullRequestCreationP824dX786d9eac) {
      encoder.encodeString(value.value)
    }
  }
}
