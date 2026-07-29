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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-custom-property-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-custom-property-deleted/properties/action
 */
@Serializable(with = InlineWebhookCustomPropertyDeletedActionX325b6cf0.Serializer::class)
public sealed class InlineWebhookCustomPropertyDeletedActionX325b6cf0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookCustomPropertyDeletedActionX325b6cf0() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCustomPropertyDeletedActionX325b6cf0()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCustomPropertyDeletedActionX325b6cf0 = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookCustomPropertyDeletedActionX325b6cf0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCustomPropertyDeletedActionX325b6cf0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCustomPropertyDeletedActionX325b6cf0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCustomPropertyDeletedActionX325b6cf0) {
      encoder.encodeString(value.value)
    }
  }
}
