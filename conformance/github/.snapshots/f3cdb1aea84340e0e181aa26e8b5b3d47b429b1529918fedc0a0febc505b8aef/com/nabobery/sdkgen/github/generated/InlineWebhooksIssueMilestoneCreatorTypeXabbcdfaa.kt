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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/milestone/properties/creator/properties/ty
 * pe.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/milestone/properties/creator/properties/ty
 * pe
 */
@Serializable(with = InlineWebhooksIssueMilestoneCreatorTypeXabbcdfaa.Serializer::class)
public sealed class InlineWebhooksIssueMilestoneCreatorTypeXabbcdfaa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksIssueMilestoneCreatorTypeXabbcdfaa() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksIssueMilestoneCreatorTypeXabbcdfaa() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksIssueMilestoneCreatorTypeXabbcdfaa() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhooksIssueMilestoneCreatorTypeXabbcdfaa() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssueMilestoneCreatorTypeXabbcdfaa()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssueMilestoneCreatorTypeXabbcdfaa = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksIssueMilestoneCreatorTypeXabbcdfaa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksIssueMilestoneCreatorTypeXabbcdfaa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssueMilestoneCreatorTypeXabbcdfaa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssueMilestoneCreatorTypeXabbcdfaa) {
      encoder.encodeString(value.value)
    }
  }
}
