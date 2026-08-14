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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-membership-removed/properties/sender/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-membership-removed/properties/sender/properties/type
 */
@Serializable(with = InlineWebhookMembershipRemovedSenderTypeXcdc86398.Serializer::class)
public sealed class InlineWebhookMembershipRemovedSenderTypeXcdc86398 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookMembershipRemovedSenderTypeXcdc86398() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookMembershipRemovedSenderTypeXcdc86398() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookMembershipRemovedSenderTypeXcdc86398() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMembershipRemovedSenderTypeXcdc86398()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMembershipRemovedSenderTypeXcdc86398 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookMembershipRemovedSenderTypeXcdc86398> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookMembershipRemovedSenderTypeXcdc86398", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMembershipRemovedSenderTypeXcdc86398 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMembershipRemovedSenderTypeXcdc86398) {
      encoder.encodeString(value.value)
    }
  }
}
