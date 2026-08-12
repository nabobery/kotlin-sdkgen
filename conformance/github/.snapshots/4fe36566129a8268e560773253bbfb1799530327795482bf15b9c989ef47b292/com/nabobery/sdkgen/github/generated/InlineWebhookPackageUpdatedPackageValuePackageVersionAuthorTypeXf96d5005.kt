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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-updated/properties/package/properties/package_versio
 * n/properties/author/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-updated/properties/package/properties/package_versio
 * n/properties/author/properties/type
 */
@Serializable(with = InlineWebhookPackageUpdatedPackageValuePackageVersionAuthorTypeXf96d5005.Serializer::class)
public sealed class InlineWebhookPackageUpdatedPackageValuePackageVersionAuthorTypeXf96d5005 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPackageUpdatedPackageValuePackageVersionAuthorTypeXf96d5005() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPackageUpdatedPackageValuePackageVersionAuthorTypeXf96d5005() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPackageUpdatedPackageValuePackageVersionAuthorTypeXf96d5005() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPackageUpdatedPackageValuePackageVersionAuthorTypeXf96d5005()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPackageUpdatedPackageValuePackageVersionAuthorTypeXf96d5005 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPackageUpdatedPackageValuePackageVersionAuthorTypeXf96d5005> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPackageUpdatedPackageValuePackageVersionAuthorTypeXf96d5005", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPackageUpdatedPackageValuePackageVersionAuthorTypeXf96d5005 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackageUpdatedPackageValuePackageVersionAuthorTypeXf96d5005) {
      encoder.encodeString(value.value)
    }
  }
}
