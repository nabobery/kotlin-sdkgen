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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-personal-access-token-request-created/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-personal-access-token-request-created/properties/action
 */
@Serializable(with = InlineWebhookPersonalAccessTokenRequestCreatedActionXf151e32e.Serializer::class)
public sealed class InlineWebhookPersonalAccessTokenRequestCreatedActionXf151e32e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookPersonalAccessTokenRequestCreatedActionXf151e32e() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPersonalAccessTokenRequestCreatedActionXf151e32e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPersonalAccessTokenRequestCreatedActionXf151e32e = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPersonalAccessTokenRequestCreatedActionXf151e32e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPersonalAccessTokenRequestCreatedActionXf151e32e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPersonalAccessTokenRequestCreatedActionXf151e32e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPersonalAccessTokenRequestCreatedActionXf151e32e) {
      encoder.encodeString(value.value)
    }
  }
}
