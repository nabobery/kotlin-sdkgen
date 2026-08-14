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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/owner/proper
 * ties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/owner/proper
 * ties/type
 */
@Serializable(with = InlineWebhookPackagePublishedPackageValueOwnerTypeXfc84d5a1.Serializer::class)
public sealed class InlineWebhookPackagePublishedPackageValueOwnerTypeXfc84d5a1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPackagePublishedPackageValueOwnerTypeXfc84d5a1() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPackagePublishedPackageValueOwnerTypeXfc84d5a1() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPackagePublishedPackageValueOwnerTypeXfc84d5a1() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPackagePublishedPackageValueOwnerTypeXfc84d5a1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPackagePublishedPackageValueOwnerTypeXfc84d5a1 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPackagePublishedPackageValueOwnerTypeXfc84d5a1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPackagePublishedPackageValueOwnerTypeXfc84d5a1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPackagePublishedPackageValueOwnerTypeXfc84d5a1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackagePublishedPackageValueOwnerTypeXfc84d5a1) {
      encoder.encodeString(value.value)
    }
  }
}
