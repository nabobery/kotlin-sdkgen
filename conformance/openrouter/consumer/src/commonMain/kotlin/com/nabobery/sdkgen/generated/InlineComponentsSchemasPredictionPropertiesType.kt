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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/Prediction/properties/type.
 */
@Serializable(with = InlineComponentsSchemasPredictionPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasPredictionPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `content`.
   */
  public data object Content : InlineComponentsSchemasPredictionPropertiesType() {
    public override val `value`: String = "content"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasPredictionPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasPredictionPropertiesType = when (value) {
      Content.value -> Content
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasPredictionPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasPredictionPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasPredictionPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasPredictionPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
