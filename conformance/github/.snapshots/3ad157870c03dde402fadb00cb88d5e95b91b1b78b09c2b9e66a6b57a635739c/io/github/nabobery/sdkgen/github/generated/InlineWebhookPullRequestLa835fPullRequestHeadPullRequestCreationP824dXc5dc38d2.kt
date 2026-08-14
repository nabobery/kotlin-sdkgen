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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/head
 * /properties/repo/properties/pull_request_creation_policy
 */
@Serializable(with = InlineWebhookPullRequestLa835fPullRequestHeadPullRequestCreationP824dXc5dc38d2.Serializer::class)
public sealed class InlineWebhookPullRequestLa835fPullRequestHeadPullRequestCreationP824dXc5dc38d2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineWebhookPullRequestLa835fPullRequestHeadPullRequestCreationP824dXc5dc38d2() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InlineWebhookPullRequestLa835fPullRequestHeadPullRequestCreationP824dXc5dc38d2() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLa835fPullRequestHeadPullRequestCreationP824dXc5dc38d2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLa835fPullRequestHeadPullRequestCreationP824dXc5dc38d2 = when (value) {
      All.value -> All
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLa835fPullRequestHeadPullRequestCreationP824dXc5dc38d2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLa835fPullRequestHeadPullRequestCreationP824dXc5dc38d2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLa835fPullRequestHeadPullRequestCreationP824dXc5dc38d2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLa835fPullRequestHeadPullRequestCreationP824dXc5dc38d2) {
      encoder.encodeString(value.value)
    }
  }
}
