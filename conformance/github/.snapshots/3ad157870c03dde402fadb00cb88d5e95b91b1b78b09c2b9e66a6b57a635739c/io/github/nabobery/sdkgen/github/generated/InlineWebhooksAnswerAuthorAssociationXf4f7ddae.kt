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
 * How the author is associated with the repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_answer/properties/author_association
 */
@Serializable(with = InlineWebhooksAnswerAuthorAssociationXf4f7ddae.Serializer::class)
public sealed class InlineWebhooksAnswerAuthorAssociationXf4f7ddae {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `COLLABORATOR`.
   */
  public data object Collaborator : InlineWebhooksAnswerAuthorAssociationXf4f7ddae() {
    public override val `value`: String = "COLLABORATOR"
  }

  /**
   * Documented value. Wire value: `CONTRIBUTOR`.
   */
  public data object Contributor : InlineWebhooksAnswerAuthorAssociationXf4f7ddae() {
    public override val `value`: String = "CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `FIRST_TIMER`.
   */
  public data object FirstTimer : InlineWebhooksAnswerAuthorAssociationXf4f7ddae() {
    public override val `value`: String = "FIRST_TIMER"
  }

  /**
   * Documented value. Wire value: `FIRST_TIME_CONTRIBUTOR`.
   */
  public data object FirstTimeContributor : InlineWebhooksAnswerAuthorAssociationXf4f7ddae() {
    public override val `value`: String = "FIRST_TIME_CONTRIBUTOR"
  }

  /**
   * Documented value. Wire value: `MANNEQUIN`.
   */
  public data object Mannequin : InlineWebhooksAnswerAuthorAssociationXf4f7ddae() {
    public override val `value`: String = "MANNEQUIN"
  }

  /**
   * Documented value. Wire value: `MEMBER`.
   */
  public data object Member : InlineWebhooksAnswerAuthorAssociationXf4f7ddae() {
    public override val `value`: String = "MEMBER"
  }

  /**
   * Documented value. Wire value: `NONE`.
   */
  public data object None : InlineWebhooksAnswerAuthorAssociationXf4f7ddae() {
    public override val `value`: String = "NONE"
  }

  /**
   * Documented value. Wire value: `OWNER`.
   */
  public data object Owner : InlineWebhooksAnswerAuthorAssociationXf4f7ddae() {
    public override val `value`: String = "OWNER"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksAnswerAuthorAssociationXf4f7ddae()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksAnswerAuthorAssociationXf4f7ddae = when (value) {
      Collaborator.value -> Collaborator
      Contributor.value -> Contributor
      FirstTimer.value -> FirstTimer
      FirstTimeContributor.value -> FirstTimeContributor
      Mannequin.value -> Mannequin
      Member.value -> Member
      None.value -> None
      Owner.value -> Owner
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksAnswerAuthorAssociationXf4f7ddae> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksAnswerAuthorAssociationXf4f7ddae", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksAnswerAuthorAssociationXf4f7ddae = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksAnswerAuthorAssociationXf4f7ddae) {
      encoder.encodeString(value.value)
    }
  }
}
