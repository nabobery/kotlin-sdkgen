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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/NamespaceFunctionTool/properties/type.
 */
@Serializable(with = InlineComponentsSchemasNamespaceFunctionToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasNamespaceFunctionToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `function`.
   */
  public data object Function : InlineComponentsSchemasNamespaceFunctionToolPropertiesType() {
    public override val `value`: String = "function"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasNamespaceFunctionToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasNamespaceFunctionToolPropertiesType = when (value) {
      Function.value -> Function
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasNamespaceFunctionToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasNamespaceFunctionToolPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasNamespaceFunctionToolPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasNamespaceFunctionToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
