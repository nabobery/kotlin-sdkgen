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
 * sdkgen://source/openapi.yaml#/components/schemas/WebSearchUserLocationServerTool/properties/type.
 */
@Serializable(with = InlineComponentsSchemasWebSearchUserLocationServerToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasWebSearchUserLocationServerToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `approximate`.
   */
  public data object Approximate : InlineComponentsSchemasWebSearchUserLocationServerToolPropertiesType() {
    public override val `value`: String = "approximate"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasWebSearchUserLocationServerToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasWebSearchUserLocationServerToolPropertiesType =
      when (value) {
      Approximate.value -> Approximate
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasWebSearchUserLocationServerToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasWebSearchUserLocationServerToolPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasWebSearchUserLocationServerToolPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasWebSearchUserLocationServerToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
