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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-personal-access-token-request-denied/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-personal-access-token-request-denied/properties/action
 */
@Serializable(with = InlineWebhookPersonalAccessTokenRequestDeniedActionX3c51329d.Serializer::class)
public sealed class InlineWebhookPersonalAccessTokenRequestDeniedActionX3c51329d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `denied`.
   */
  public data object Denied : InlineWebhookPersonalAccessTokenRequestDeniedActionX3c51329d() {
    public override val `value`: String = "denied"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPersonalAccessTokenRequestDeniedActionX3c51329d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPersonalAccessTokenRequestDeniedActionX3c51329d = when (value) {
      Denied.value -> Denied
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPersonalAccessTokenRequestDeniedActionX3c51329d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPersonalAccessTokenRequestDeniedActionX3c51329d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPersonalAccessTokenRequestDeniedActionX3c51329d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPersonalAccessTokenRequestDeniedActionX3c51329d) {
      encoder.encodeString(value.value)
    }
  }
}
