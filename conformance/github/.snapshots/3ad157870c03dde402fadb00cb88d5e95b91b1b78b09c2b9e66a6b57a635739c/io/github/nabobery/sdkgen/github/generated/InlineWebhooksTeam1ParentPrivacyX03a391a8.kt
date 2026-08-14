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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_team_1/properties/parent/properties/privacy.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_team_1/properties/parent/properties/privacy
 */
@Serializable(with = InlineWebhooksTeam1ParentPrivacyX03a391a8.Serializer::class)
public sealed class InlineWebhooksTeam1ParentPrivacyX03a391a8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhooksTeam1ParentPrivacyX03a391a8() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhooksTeam1ParentPrivacyX03a391a8() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhooksTeam1ParentPrivacyX03a391a8() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksTeam1ParentPrivacyX03a391a8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksTeam1ParentPrivacyX03a391a8 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksTeam1ParentPrivacyX03a391a8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksTeam1ParentPrivacyX03a391a8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksTeam1ParentPrivacyX03a391a8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksTeam1ParentPrivacyX03a391a8) {
      encoder.encodeString(value.value)
    }
  }
}
