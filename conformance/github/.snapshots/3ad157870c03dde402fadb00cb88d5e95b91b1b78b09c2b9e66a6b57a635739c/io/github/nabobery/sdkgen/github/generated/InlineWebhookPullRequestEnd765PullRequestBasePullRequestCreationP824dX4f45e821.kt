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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/bas
 * e/properties/repo/properties/pull_request_creation_policy
 */
@Serializable(with = InlineWebhookPullRequestEnd765PullRequestBasePullRequestCreationP824dX4f45e821.Serializer::class)
public sealed class InlineWebhookPullRequestEnd765PullRequestBasePullRequestCreationP824dX4f45e821 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhookPullRequestEnd765PullRequestBasePullRequestCreationP824dX4f45e821() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhookPullRequestEnd765PullRequestBasePullRequestCreationP824dX4f45e821() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestEnd765PullRequestBasePullRequestCreationP824dX4f45e821()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestEnd765PullRequestBasePullRequestCreationP824dX4f45e821 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestEnd765PullRequestBasePullRequestCreationP824dX4f45e821> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestEnd765PullRequestBasePullRequestCreationP824dX4f45e821", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnd765PullRequestBasePullRequestCreationP824dX4f45e821 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnd765PullRequestBasePullRequestCreationP824dX4f45e821) {
      encoder.encodeString(value.value)
    }
  }
}
