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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FunctionTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FunctionTool/properties/type
 */
@Serializable(with = InlineFunctionToolTypeX23edb1b8.Serializer::class)
public sealed class InlineFunctionToolTypeX23edb1b8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `function`.
   */
  public data object Function : InlineFunctionToolTypeX23edb1b8() {
    public override val `value`: String = "function"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFunctionToolTypeX23edb1b8()

  public companion object {
    public fun fromValue(`value`: String): InlineFunctionToolTypeX23edb1b8 = when (value) {
      Function.value -> Function
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFunctionToolTypeX23edb1b8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineFunctionToolTypeX23edb1b8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFunctionToolTypeX23edb1b8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFunctionToolTypeX23edb1b8) {
      encoder.encodeString(value.value)
    }
  }
}
