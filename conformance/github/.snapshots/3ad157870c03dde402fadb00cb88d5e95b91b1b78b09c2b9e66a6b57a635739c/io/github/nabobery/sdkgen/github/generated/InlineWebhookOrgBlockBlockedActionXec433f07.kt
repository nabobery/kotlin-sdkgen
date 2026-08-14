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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-org-block-blocked/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-org-block-blocked/properties/action
 */
@Serializable(with = InlineWebhookOrgBlockBlockedActionXec433f07.Serializer::class)
public sealed class InlineWebhookOrgBlockBlockedActionXec433f07 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `blocked`.
   */
  public data object Blocked : InlineWebhookOrgBlockBlockedActionXec433f07() {
    public override val `value`: String = "blocked"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookOrgBlockBlockedActionXec433f07()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookOrgBlockBlockedActionXec433f07 = when (value) {
      Blocked.value -> Blocked
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookOrgBlockBlockedActionXec433f07> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookOrgBlockBlockedActionXec433f07", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookOrgBlockBlockedActionXec433f07 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookOrgBlockBlockedActionXec433f07) {
      encoder.encodeString(value.value)
    }
  }
}
