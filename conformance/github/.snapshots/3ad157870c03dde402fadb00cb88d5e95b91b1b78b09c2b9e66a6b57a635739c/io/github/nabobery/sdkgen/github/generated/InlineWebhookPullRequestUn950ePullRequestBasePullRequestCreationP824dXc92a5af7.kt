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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/ba
 * se/properties/repo/properties/pull_request_creation_policy
 */
@Serializable(with = InlineWebhookPullRequestUn950ePullRequestBasePullRequestCreationP824dXc92a5af7.Serializer::class)
public sealed class InlineWebhookPullRequestUn950ePullRequestBasePullRequestCreationP824dXc92a5af7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhookPullRequestUn950ePullRequestBasePullRequestCreationP824dXc92a5af7() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhookPullRequestUn950ePullRequestBasePullRequestCreationP824dXc92a5af7() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUn950ePullRequestBasePullRequestCreationP824dXc92a5af7()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUn950ePullRequestBasePullRequestCreationP824dXc92a5af7 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUn950ePullRequestBasePullRequestCreationP824dXc92a5af7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUn950ePullRequestBasePullRequestCreationP824dXc92a5af7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUn950ePullRequestBasePullRequestCreationP824dXc92a5af7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUn950ePullRequestBasePullRequestCreationP824dXc92a5af7) {
      encoder.encodeString(value.value)
    }
  }
}
