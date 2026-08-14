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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-membership-added/properties/sender/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-membership-added/properties/sender/properties/type
 */
@Serializable(with = InlineWebhookMembershipAddedSenderTypeXf71af496.Serializer::class)
public sealed class InlineWebhookMembershipAddedSenderTypeXf71af496 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookMembershipAddedSenderTypeXf71af496() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookMembershipAddedSenderTypeXf71af496() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookMembershipAddedSenderTypeXf71af496() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMembershipAddedSenderTypeXf71af496()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMembershipAddedSenderTypeXf71af496 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookMembershipAddedSenderTypeXf71af496> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookMembershipAddedSenderTypeXf71af496", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMembershipAddedSenderTypeXf71af496 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMembershipAddedSenderTypeXf71af496) {
      encoder.encodeString(value.value)
    }
  }
}
