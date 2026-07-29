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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhooks_team_1/properties/privacy.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_team_1/properties/privacy
 */
@Serializable(with = InlineWebhooksTeam1PrivacyXec81d14c.Serializer::class)
public sealed class InlineWebhooksTeam1PrivacyXec81d14c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhooksTeam1PrivacyXec81d14c() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhooksTeam1PrivacyXec81d14c() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhooksTeam1PrivacyXec81d14c() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksTeam1PrivacyXec81d14c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksTeam1PrivacyXec81d14c = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksTeam1PrivacyXec81d14c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksTeam1PrivacyXec81d14c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksTeam1PrivacyXec81d14c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksTeam1PrivacyXec81d14c) {
      encoder.encodeString(value.value)
    }
  }
}
