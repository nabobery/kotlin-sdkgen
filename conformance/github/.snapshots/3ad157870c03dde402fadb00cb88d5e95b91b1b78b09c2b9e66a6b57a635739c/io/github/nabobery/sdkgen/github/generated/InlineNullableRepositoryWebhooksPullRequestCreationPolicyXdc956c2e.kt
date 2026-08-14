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
 * sdkgen://source/openapi.yaml#/components/schemas/nullable-repository-webhooks/properties/pull_request_creation_policy
 */
@Serializable(with = InlineNullableRepositoryWebhooksPullRequestCreationPolicyXdc956c2e.Serializer::class)
public sealed class InlineNullableRepositoryWebhooksPullRequestCreationPolicyXdc956c2e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineNullableRepositoryWebhooksPullRequestCreationPolicyXdc956c2e() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineNullableRepositoryWebhooksPullRequestCreationPolicyXdc956c2e() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNullableRepositoryWebhooksPullRequestCreationPolicyXdc956c2e()

  public companion object {
    public fun fromValue(`value`: String): InlineNullableRepositoryWebhooksPullRequestCreationPolicyXdc956c2e = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineNullableRepositoryWebhooksPullRequestCreationPolicyXdc956c2e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineNullableRepositoryWebhooksPullRequestCreationPolicyXdc956c2e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNullableRepositoryWebhooksPullRequestCreationPolicyXdc956c2e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNullableRepositoryWebhooksPullRequestCreationPolicyXdc956c2e) {
      encoder.encodeString(value.value)
    }
  }
}
