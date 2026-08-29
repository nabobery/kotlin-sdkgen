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
 * The action that was performed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-closed/properties/action
 */
@Serializable(with = InlineWebhookIssuesClosedActionX341b7678.Serializer::class)
public sealed class InlineWebhookIssuesClosedActionX341b7678 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookIssuesClosedActionX341b7678() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesClosedActionX341b7678()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesClosedActionX341b7678 = when (value) {
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesClosedActionX341b7678> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesClosedActionX341b7678", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesClosedActionX341b7678 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesClosedActionX341b7678) {
      encoder.encodeString(value.value)
    }
  }
}
