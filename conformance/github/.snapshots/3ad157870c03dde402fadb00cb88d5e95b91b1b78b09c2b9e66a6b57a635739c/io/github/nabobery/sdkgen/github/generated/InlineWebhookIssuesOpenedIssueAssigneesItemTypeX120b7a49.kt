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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/issue/properties/assignees/items/pr
 * operties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/issue/properties/assignees/items/pr
 * operties/type
 */
@Serializable(with = InlineWebhookIssuesOpenedIssueAssigneesItemTypeX120b7a49.Serializer::class)
public sealed class InlineWebhookIssuesOpenedIssueAssigneesItemTypeX120b7a49 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssuesOpenedIssueAssigneesItemTypeX120b7a49() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssuesOpenedIssueAssigneesItemTypeX120b7a49() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssuesOpenedIssueAssigneesItemTypeX120b7a49() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesOpenedIssueAssigneesItemTypeX120b7a49()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesOpenedIssueAssigneesItemTypeX120b7a49 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesOpenedIssueAssigneesItemTypeX120b7a49> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesOpenedIssueAssigneesItemTypeX120b7a49", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedIssueAssigneesItemTypeX120b7a49 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedIssueAssigneesItemTypeX120b7a49) {
      encoder.encodeString(value.value)
    }
  }
}
