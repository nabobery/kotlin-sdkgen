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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-deleted/properties/project_card/properties/crea
 * tor/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-deleted/properties/project_card/properties/crea
 * tor/properties/type
 */
@Serializable(with = InlineWebhookProjectCardDeletedProjectCardCreatorTypeXfb9b7183.Serializer::class)
public sealed class InlineWebhookProjectCardDeletedProjectCardCreatorTypeXfb9b7183 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookProjectCardDeletedProjectCardCreatorTypeXfb9b7183() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookProjectCardDeletedProjectCardCreatorTypeXfb9b7183() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookProjectCardDeletedProjectCardCreatorTypeXfb9b7183() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookProjectCardDeletedProjectCardCreatorTypeXfb9b7183() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectCardDeletedProjectCardCreatorTypeXfb9b7183()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectCardDeletedProjectCardCreatorTypeXfb9b7183 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookProjectCardDeletedProjectCardCreatorTypeXfb9b7183> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookProjectCardDeletedProjectCardCreatorTypeXfb9b7183", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectCardDeletedProjectCardCreatorTypeXfb9b7183 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectCardDeletedProjectCardCreatorTypeXfb9b7183) {
      encoder.encodeString(value.value)
    }
  }
}
