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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/issue/properties/milestone/properti
 * es/creator/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/issue/properties/milestone/properti
 * es/creator/properties/type
 */
@Serializable(with = InlineWebhookIssuesOpenedIssueMilestoneCreatorTypeXd74dc15a.Serializer::class)
public sealed class InlineWebhookIssuesOpenedIssueMilestoneCreatorTypeXd74dc15a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssuesOpenedIssueMilestoneCreatorTypeXd74dc15a() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssuesOpenedIssueMilestoneCreatorTypeXd74dc15a() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssuesOpenedIssueMilestoneCreatorTypeXd74dc15a() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssuesOpenedIssueMilestoneCreatorTypeXd74dc15a() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesOpenedIssueMilestoneCreatorTypeXd74dc15a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesOpenedIssueMilestoneCreatorTypeXd74dc15a = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesOpenedIssueMilestoneCreatorTypeXd74dc15a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesOpenedIssueMilestoneCreatorTypeXd74dc15a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedIssueMilestoneCreatorTypeXd74dc15a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedIssueMilestoneCreatorTypeXd74dc15a) {
      encoder.encodeString(value.value)
    }
  }
}
