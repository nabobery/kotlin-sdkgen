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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseFunctionCallArgsDeltaEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasBaseFunctionCallArgsDeltaEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBaseFunctionCallArgsDeltaEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.function_call_arguments.delta`.
   */
  public data object ResponseFunctionCallArgumentsDelta : InlineComponentsSchemasBaseFunctionCallArgsDeltaEventPropertiesType() {
    public override val `value`: String = "response.function_call_arguments.delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseFunctionCallArgsDeltaEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseFunctionCallArgsDeltaEventPropertiesType =
      when (value) {
      ResponseFunctionCallArgumentsDelta.value -> ResponseFunctionCallArgumentsDelta
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseFunctionCallArgsDeltaEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseFunctionCallArgsDeltaEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseFunctionCallArgsDeltaEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasBaseFunctionCallArgsDeltaEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
