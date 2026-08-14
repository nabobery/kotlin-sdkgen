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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_milestone/properties/creator/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_milestone/properties/creator/properties/type
 */
@Serializable(with = InlineWebhooksMilestoneCreatorTypeX20c04496.Serializer::class)
public sealed class InlineWebhooksMilestoneCreatorTypeX20c04496 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksMilestoneCreatorTypeX20c04496() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksMilestoneCreatorTypeX20c04496() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksMilestoneCreatorTypeX20c04496() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhooksMilestoneCreatorTypeX20c04496() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksMilestoneCreatorTypeX20c04496()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksMilestoneCreatorTypeX20c04496 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksMilestoneCreatorTypeX20c04496> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksMilestoneCreatorTypeX20c04496", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksMilestoneCreatorTypeX20c04496 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksMilestoneCreatorTypeX20c04496) {
      encoder.encodeString(value.value)
    }
  }
}
