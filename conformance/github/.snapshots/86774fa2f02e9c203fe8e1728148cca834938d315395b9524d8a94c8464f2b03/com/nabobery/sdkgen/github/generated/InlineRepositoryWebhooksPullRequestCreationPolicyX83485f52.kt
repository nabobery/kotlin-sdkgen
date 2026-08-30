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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-webhooks/properties/pull_request_creation_policy
 */
@Serializable(with = InlineRepositoryWebhooksPullRequestCreationPolicyX83485f52.Serializer::class)
public sealed class InlineRepositoryWebhooksPullRequestCreationPolicyX83485f52 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineRepositoryWebhooksPullRequestCreationPolicyX83485f52() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineRepositoryWebhooksPullRequestCreationPolicyX83485f52() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryWebhooksPullRequestCreationPolicyX83485f52()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryWebhooksPullRequestCreationPolicyX83485f52 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryWebhooksPullRequestCreationPolicyX83485f52> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryWebhooksPullRequestCreationPolicyX83485f52", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryWebhooksPullRequestCreationPolicyX83485f52 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryWebhooksPullRequestCreationPolicyX83485f52) {
      encoder.encodeString(value.value)
    }
  }
}
