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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/assignees/items/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/assignees/items/properties/type
 */
@Serializable(with = InlineWebhooksIssueAssigneesItemTypeX597fc019.Serializer::class)
public sealed class InlineWebhooksIssueAssigneesItemTypeX597fc019 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksIssueAssigneesItemTypeX597fc019() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksIssueAssigneesItemTypeX597fc019() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksIssueAssigneesItemTypeX597fc019() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhooksIssueAssigneesItemTypeX597fc019() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssueAssigneesItemTypeX597fc019()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssueAssigneesItemTypeX597fc019 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksIssueAssigneesItemTypeX597fc019> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksIssueAssigneesItemTypeX597fc019", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssueAssigneesItemTypeX597fc019 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssueAssigneesItemTypeX597fc019) {
      encoder.encodeString(value.value)
    }
  }
}
