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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/changes/properties/old_repository/p
 * roperties/pull_request_creation_policy
 */
@Serializable(with = InlineWebhookIssuesOpenedChangesOldRepositoryPullRequestCreationPolicyX2ecbaff9.Serializer::class)
public sealed class InlineWebhookIssuesOpenedChangesOldRepositoryPullRequestCreationPolicyX2ecbaff9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhookIssuesOpenedChangesOldRepositoryPullRequestCreationPolicyX2ecbaff9() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhookIssuesOpenedChangesOldRepositoryPullRequestCreationPolicyX2ecbaff9() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesOpenedChangesOldRepositoryPullRequestCreationPolicyX2ecbaff9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesOpenedChangesOldRepositoryPullRequestCreationPolicyX2ecbaff9 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesOpenedChangesOldRepositoryPullRequestCreationPolicyX2ecbaff9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesOpenedChangesOldRepositoryPullRequestCreationPolicyX2ecbaff9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedChangesOldRepositoryPullRequestCreationPolicyX2ecbaff9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedChangesOldRepositoryPullRequestCreationPolicyX2ecbaff9) {
      encoder.encodeString(value.value)
    }
  }
}
