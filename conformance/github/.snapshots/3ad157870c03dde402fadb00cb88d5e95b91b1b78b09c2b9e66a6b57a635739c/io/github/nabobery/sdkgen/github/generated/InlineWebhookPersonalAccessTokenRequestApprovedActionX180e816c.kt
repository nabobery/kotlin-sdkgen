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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-personal-access-token-request-approved/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-personal-access-token-request-approved/properties/action
 */
@Serializable(with = InlineWebhookPersonalAccessTokenRequestApprovedActionX180e816c.Serializer::class)
public sealed class InlineWebhookPersonalAccessTokenRequestApprovedActionX180e816c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `approved`.
   */
  public data object Approved : InlineWebhookPersonalAccessTokenRequestApprovedActionX180e816c() {
    public override val `value`: String = "approved"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPersonalAccessTokenRequestApprovedActionX180e816c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPersonalAccessTokenRequestApprovedActionX180e816c = when (value) {
      Approved.value -> Approved
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPersonalAccessTokenRequestApprovedActionX180e816c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPersonalAccessTokenRequestApprovedActionX180e816c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPersonalAccessTokenRequestApprovedActionX180e816c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPersonalAccessTokenRequestApprovedActionX180e816c) {
      encoder.encodeString(value.value)
    }
  }
}
