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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemFunctionCall/properties/type
 */
@Serializable(with = InlineOutputItemFunctionCallTypeX494d8eba.Serializer::class)
public sealed class InlineOutputItemFunctionCallTypeX494d8eba {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `function_call`.
   */
  public data object FunctionCall : InlineOutputItemFunctionCallTypeX494d8eba() {
    public override val `value`: String = "function_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemFunctionCallTypeX494d8eba()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemFunctionCallTypeX494d8eba = when (value) {
      FunctionCall.value -> FunctionCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemFunctionCallTypeX494d8eba> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputItemFunctionCallTypeX494d8eba", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemFunctionCallTypeX494d8eba = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemFunctionCallTypeX494d8eba) {
      encoder.encodeString(value.value)
    }
  }
}
