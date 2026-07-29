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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-transferred/properties/changes/properties/owner/p
 * roperties/from/properties/user/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-transferred/properties/changes/properties/owner/p
 * roperties/from/properties/user/properties/type
 */
@Serializable(with = InlineWebhookRepositoryTransferredChangesOwnerFromUserTypeXfe8eb1d5.Serializer::class)
public sealed class InlineWebhookRepositoryTransferredChangesOwnerFromUserTypeXfe8eb1d5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookRepositoryTransferredChangesOwnerFromUserTypeXfe8eb1d5() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookRepositoryTransferredChangesOwnerFromUserTypeXfe8eb1d5() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookRepositoryTransferredChangesOwnerFromUserTypeXfe8eb1d5() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookRepositoryTransferredChangesOwnerFromUserTypeXfe8eb1d5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookRepositoryTransferredChangesOwnerFromUserTypeXfe8eb1d5 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookRepositoryTransferredChangesOwnerFromUserTypeXfe8eb1d5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookRepositoryTransferredChangesOwnerFromUserTypeXfe8eb1d5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryTransferredChangesOwnerFromUserTypeXfe8eb1d5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryTransferredChangesOwnerFromUserTypeXfe8eb1d5) {
      encoder.encodeString(value.value)
    }
  }
}
