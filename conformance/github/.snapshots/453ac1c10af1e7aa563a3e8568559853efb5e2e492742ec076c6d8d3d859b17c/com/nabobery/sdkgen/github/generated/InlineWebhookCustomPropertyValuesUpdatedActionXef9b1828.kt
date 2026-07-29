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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-custom-property-values-updated/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-custom-property-values-updated/properties/action
 */
@Serializable(with = InlineWebhookCustomPropertyValuesUpdatedActionXef9b1828.Serializer::class)
public sealed class InlineWebhookCustomPropertyValuesUpdatedActionXef9b1828 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineWebhookCustomPropertyValuesUpdatedActionXef9b1828() {
    public override val `value`: String = "updated"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCustomPropertyValuesUpdatedActionXef9b1828()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCustomPropertyValuesUpdatedActionXef9b1828 = when (value) {
      Updated.value -> Updated
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookCustomPropertyValuesUpdatedActionXef9b1828> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCustomPropertyValuesUpdatedActionXef9b1828", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCustomPropertyValuesUpdatedActionXef9b1828 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCustomPropertyValuesUpdatedActionXef9b1828) {
      encoder.encodeString(value.value)
    }
  }
}
