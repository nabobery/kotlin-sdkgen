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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-updated/properties/package/properties/owner/properti
 * es/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-updated/properties/package/properties/owner/properti
 * es/type
 */
@Serializable(with = InlineWebhookPackageUpdatedPackageValueOwnerTypeX58c001bc.Serializer::class)
public sealed class InlineWebhookPackageUpdatedPackageValueOwnerTypeX58c001bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPackageUpdatedPackageValueOwnerTypeX58c001bc() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPackageUpdatedPackageValueOwnerTypeX58c001bc() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPackageUpdatedPackageValueOwnerTypeX58c001bc() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPackageUpdatedPackageValueOwnerTypeX58c001bc()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPackageUpdatedPackageValueOwnerTypeX58c001bc = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPackageUpdatedPackageValueOwnerTypeX58c001bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPackageUpdatedPackageValueOwnerTypeX58c001bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPackageUpdatedPackageValueOwnerTypeX58c001bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackageUpdatedPackageValueOwnerTypeX58c001bc) {
      encoder.encodeString(value.value)
    }
  }
}
