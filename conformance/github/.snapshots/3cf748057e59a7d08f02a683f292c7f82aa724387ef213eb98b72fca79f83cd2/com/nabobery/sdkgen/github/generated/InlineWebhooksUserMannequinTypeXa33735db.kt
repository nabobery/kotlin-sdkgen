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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhooks_user_mannequin/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_user_mannequin/properties/type
 */
@Serializable(with = InlineWebhooksUserMannequinTypeXa33735db.Serializer::class)
public sealed class InlineWebhooksUserMannequinTypeXa33735db {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksUserMannequinTypeXa33735db() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksUserMannequinTypeXa33735db() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksUserMannequinTypeXa33735db() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhooksUserMannequinTypeXa33735db() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksUserMannequinTypeXa33735db()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksUserMannequinTypeXa33735db = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksUserMannequinTypeXa33735db> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksUserMannequinTypeXa33735db", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksUserMannequinTypeXa33735db = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksUserMannequinTypeXa33735db) {
      encoder.encodeString(value.value)
    }
  }
}
