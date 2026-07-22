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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-org-block-unblocked/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-org-block-unblocked/properties/action
 */
@Serializable(with = InlineWebhookOrgBlockUnblockedActionX1e785489.Serializer::class)
public sealed class InlineWebhookOrgBlockUnblockedActionX1e785489 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unblocked`.
   */
  public data object Unblocked : InlineWebhookOrgBlockUnblockedActionX1e785489() {
    public override val `value`: String = "unblocked"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookOrgBlockUnblockedActionX1e785489()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookOrgBlockUnblockedActionX1e785489 = when (value) {
      Unblocked.value -> Unblocked
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookOrgBlockUnblockedActionX1e785489> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookOrgBlockUnblockedActionX1e785489", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookOrgBlockUnblockedActionX1e785489 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookOrgBlockUnblockedActionX1e785489) {
      encoder.encodeString(value.value)
    }
  }
}
