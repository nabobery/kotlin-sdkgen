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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-github-app-authorization-revoked/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-github-app-authorization-revoked/properties/action
 */
@Serializable(with = InlineWebhookGithubAppAuthorizationRevokedActionXfb6132e4.Serializer::class)
public sealed class InlineWebhookGithubAppAuthorizationRevokedActionXfb6132e4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `revoked`.
   */
  public data object Revoked : InlineWebhookGithubAppAuthorizationRevokedActionXfb6132e4() {
    public override val `value`: String = "revoked"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookGithubAppAuthorizationRevokedActionXfb6132e4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookGithubAppAuthorizationRevokedActionXfb6132e4 = when (value) {
      Revoked.value -> Revoked
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookGithubAppAuthorizationRevokedActionXfb6132e4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookGithubAppAuthorizationRevokedActionXfb6132e4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookGithubAppAuthorizationRevokedActionXfb6132e4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookGithubAppAuthorizationRevokedActionXfb6132e4) {
      encoder.encodeString(value.value)
    }
  }
}
