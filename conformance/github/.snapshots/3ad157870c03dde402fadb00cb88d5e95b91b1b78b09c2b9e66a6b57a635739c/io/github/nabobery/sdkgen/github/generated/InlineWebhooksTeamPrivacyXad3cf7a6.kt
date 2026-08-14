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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhooks_team/properties/privacy.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_team/properties/privacy
 */
@Serializable(with = InlineWebhooksTeamPrivacyXad3cf7a6.Serializer::class)
public sealed class InlineWebhooksTeamPrivacyXad3cf7a6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhooksTeamPrivacyXad3cf7a6() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhooksTeamPrivacyXad3cf7a6() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhooksTeamPrivacyXad3cf7a6() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksTeamPrivacyXad3cf7a6()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksTeamPrivacyXad3cf7a6 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksTeamPrivacyXad3cf7a6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksTeamPrivacyXad3cf7a6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksTeamPrivacyXad3cf7a6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksTeamPrivacyXad3cf7a6) {
      encoder.encodeString(value.value)
    }
  }
}
