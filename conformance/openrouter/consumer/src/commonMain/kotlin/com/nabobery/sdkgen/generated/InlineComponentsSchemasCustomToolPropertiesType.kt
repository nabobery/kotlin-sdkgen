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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/CustomTool/properties/type.
 */
@Serializable(with = InlineComponentsSchemasCustomToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasCustomToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineComponentsSchemasCustomToolPropertiesType() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasCustomToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasCustomToolPropertiesType = when (value) {
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCustomToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasCustomToolPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCustomToolPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasCustomToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
