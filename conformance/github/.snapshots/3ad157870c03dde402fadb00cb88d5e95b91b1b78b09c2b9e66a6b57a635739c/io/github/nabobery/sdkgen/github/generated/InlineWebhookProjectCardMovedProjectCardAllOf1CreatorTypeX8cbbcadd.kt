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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-moved/properties/project_card/allOf/0/propertie
 * s/creator/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-moved/properties/project_card/allOf/0/propertie
 * s/creator/properties/type
 */
@Serializable(with = InlineWebhookProjectCardMovedProjectCardAllOf1CreatorTypeX8cbbcadd.Serializer::class)
public sealed class InlineWebhookProjectCardMovedProjectCardAllOf1CreatorTypeX8cbbcadd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookProjectCardMovedProjectCardAllOf1CreatorTypeX8cbbcadd() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookProjectCardMovedProjectCardAllOf1CreatorTypeX8cbbcadd() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookProjectCardMovedProjectCardAllOf1CreatorTypeX8cbbcadd() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookProjectCardMovedProjectCardAllOf1CreatorTypeX8cbbcadd() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectCardMovedProjectCardAllOf1CreatorTypeX8cbbcadd()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectCardMovedProjectCardAllOf1CreatorTypeX8cbbcadd = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookProjectCardMovedProjectCardAllOf1CreatorTypeX8cbbcadd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookProjectCardMovedProjectCardAllOf1CreatorTypeX8cbbcadd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectCardMovedProjectCardAllOf1CreatorTypeX8cbbcadd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectCardMovedProjectCardAllOf1CreatorTypeX8cbbcadd) {
      encoder.encodeString(value.value)
    }
  }
}
