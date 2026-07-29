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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-push/properties/repository/properties/pull_request_creation_
 * policy
 */
@Serializable(with = InlineWebhookPushRepositoryPullRequestCreationPolicyXcf779631.Serializer::class)
public sealed class InlineWebhookPushRepositoryPullRequestCreationPolicyXcf779631 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhookPushRepositoryPullRequestCreationPolicyXcf779631() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhookPushRepositoryPullRequestCreationPolicyXcf779631() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPushRepositoryPullRequestCreationPolicyXcf779631()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPushRepositoryPullRequestCreationPolicyXcf779631 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPushRepositoryPullRequestCreationPolicyXcf779631> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPushRepositoryPullRequestCreationPolicyXcf779631", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPushRepositoryPullRequestCreationPolicyXcf779631 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPushRepositoryPullRequestCreationPolicyXcf779631) {
      encoder.encodeString(value.value)
    }
  }
}
