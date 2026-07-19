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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseFunctionCallArgsDoneEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasBaseFunctionCallArgsDoneEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBaseFunctionCallArgsDoneEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.function_call_arguments.done`.
   */
  public data object ResponseFunctionCallArgumentsDone : InlineComponentsSchemasBaseFunctionCallArgsDoneEventPropertiesType() {
    public override val `value`: String = "response.function_call_arguments.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseFunctionCallArgsDoneEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseFunctionCallArgsDoneEventPropertiesType =
      when (value) {
      ResponseFunctionCallArgumentsDone.value -> ResponseFunctionCallArgumentsDone
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseFunctionCallArgsDoneEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseFunctionCallArgsDoneEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseFunctionCallArgsDoneEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasBaseFunctionCallArgsDoneEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
