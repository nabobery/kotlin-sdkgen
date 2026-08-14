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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-membership-added/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-membership-added/properties/action
 */
@Serializable(with = InlineWebhookMembershipAddedActionXaa247ac9.Serializer::class)
public sealed class InlineWebhookMembershipAddedActionXaa247ac9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `added`.
   */
  public data object Added : InlineWebhookMembershipAddedActionXaa247ac9() {
    public override val `value`: String = "added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMembershipAddedActionXaa247ac9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMembershipAddedActionXaa247ac9 = when (value) {
      Added.value -> Added
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookMembershipAddedActionXaa247ac9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookMembershipAddedActionXaa247ac9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMembershipAddedActionXaa247ac9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMembershipAddedActionXaa247ac9) {
      encoder.encodeString(value.value)
    }
  }
}
