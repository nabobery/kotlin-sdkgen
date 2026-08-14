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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * base/properties/repo/properties/pull_request_creation_policy
 */
@Serializable(with = InlineWebhookPullRequestSy92fbPullRequestBasePullRequestCreationP824dX188165ad.Serializer::class)
public sealed class InlineWebhookPullRequestSy92fbPullRequestBasePullRequestCreationP824dX188165ad {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhookPullRequestSy92fbPullRequestBasePullRequestCreationP824dX188165ad() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhookPullRequestSy92fbPullRequestBasePullRequestCreationP824dX188165ad() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestSy92fbPullRequestBasePullRequestCreationP824dX188165ad()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestSy92fbPullRequestBasePullRequestCreationP824dX188165ad = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestSy92fbPullRequestBasePullRequestCreationP824dX188165ad> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestSy92fbPullRequestBasePullRequestCreationP824dX188165ad", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestSy92fbPullRequestBasePullRequestCreationP824dX188165ad = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestSy92fbPullRequestBasePullRequestCreationP824dX188165ad) {
      encoder.encodeString(value.value)
    }
  }
}
