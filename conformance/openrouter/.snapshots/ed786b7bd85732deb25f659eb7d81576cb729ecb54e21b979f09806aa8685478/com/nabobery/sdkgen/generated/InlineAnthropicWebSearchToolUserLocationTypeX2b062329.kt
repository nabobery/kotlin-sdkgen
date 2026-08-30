package com.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchToolUserLocation/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchToolUserLocation/properties/type
 */
@Serializable(with = InlineAnthropicWebSearchToolUserLocationTypeX2b062329.Serializer::class)
public sealed class InlineAnthropicWebSearchToolUserLocationTypeX2b062329 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `approximate`.
   */
  public data object Approximate : InlineAnthropicWebSearchToolUserLocationTypeX2b062329() {
    public override val `value`: String = "approximate"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicWebSearchToolUserLocationTypeX2b062329()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicWebSearchToolUserLocationTypeX2b062329 = when (value) {
      Approximate.value -> Approximate
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicWebSearchToolUserLocationTypeX2b062329> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicWebSearchToolUserLocationTypeX2b062329", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicWebSearchToolUserLocationTypeX2b062329 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicWebSearchToolUserLocationTypeX2b062329) {
      encoder.encodeString(value.value)
    }
  }
}
