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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_team/properties/parent/properties/privacy.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_team/properties/parent/properties/privacy
 */
@Serializable(with = InlineWebhooksTeamParentPrivacyXb491fa22.Serializer::class)
public sealed class InlineWebhooksTeamParentPrivacyXb491fa22 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhooksTeamParentPrivacyXb491fa22() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhooksTeamParentPrivacyXb491fa22() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhooksTeamParentPrivacyXb491fa22() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksTeamParentPrivacyXb491fa22()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksTeamParentPrivacyXb491fa22 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksTeamParentPrivacyXb491fa22> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksTeamParentPrivacyXb491fa22", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksTeamParentPrivacyXb491fa22 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksTeamParentPrivacyXb491fa22) {
      encoder.encodeString(value.value)
    }
  }
}
