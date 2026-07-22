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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-added/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-added/properties/action
 */
@Serializable(with = InlineWebhookIssuesFieldAddedActionX202b77c1.Serializer::class)
public sealed class InlineWebhookIssuesFieldAddedActionX202b77c1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `field_added`.
   */
  public data object FieldAdded : InlineWebhookIssuesFieldAddedActionX202b77c1() {
    public override val `value`: String = "field_added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesFieldAddedActionX202b77c1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesFieldAddedActionX202b77c1 = when (value) {
      FieldAdded.value -> FieldAdded
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookIssuesFieldAddedActionX202b77c1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesFieldAddedActionX202b77c1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesFieldAddedActionX202b77c1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesFieldAddedActionX202b77c1) {
      encoder.encodeString(value.value)
    }
  }
}
