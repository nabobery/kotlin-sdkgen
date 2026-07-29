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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-untyped/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-untyped/properties/action
 */
@Serializable(with = InlineWebhookIssuesUntypedActionX75e245c1.Serializer::class)
public sealed class InlineWebhookIssuesUntypedActionX75e245c1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `untyped`.
   */
  public data object Untyped : InlineWebhookIssuesUntypedActionX75e245c1() {
    public override val `value`: String = "untyped"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesUntypedActionX75e245c1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesUntypedActionX75e245c1 = when (value) {
      Untyped.value -> Untyped
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookIssuesUntypedActionX75e245c1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesUntypedActionX75e245c1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesUntypedActionX75e245c1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesUntypedActionX75e245c1) {
      encoder.encodeString(value.value)
    }
  }
}
