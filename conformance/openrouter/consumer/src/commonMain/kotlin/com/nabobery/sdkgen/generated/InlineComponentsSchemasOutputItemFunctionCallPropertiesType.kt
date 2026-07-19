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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputItemFunctionCall/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputItemFunctionCallPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputItemFunctionCallPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `function_call`.
   */
  public data object FunctionCall : InlineComponentsSchemasOutputItemFunctionCallPropertiesType() {
    public override val `value`: String = "function_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputItemFunctionCallPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputItemFunctionCallPropertiesType = when (value) {
      FunctionCall.value -> FunctionCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemFunctionCallPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputItemFunctionCallPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemFunctionCallPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputItemFunctionCallPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
