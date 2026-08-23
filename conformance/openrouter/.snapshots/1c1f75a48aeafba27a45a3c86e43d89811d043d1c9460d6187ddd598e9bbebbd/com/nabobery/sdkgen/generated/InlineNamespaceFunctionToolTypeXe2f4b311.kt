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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/NamespaceFunctionTool/properties/type
 */
@Serializable(with = InlineNamespaceFunctionToolTypeXe2f4b311.Serializer::class)
public sealed class InlineNamespaceFunctionToolTypeXe2f4b311 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `function`.
   */
  public data object Function : InlineNamespaceFunctionToolTypeXe2f4b311() {
    public override val `value`: String = "function"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNamespaceFunctionToolTypeXe2f4b311()

  public companion object {
    public fun fromValue(`value`: String): InlineNamespaceFunctionToolTypeXe2f4b311 = when (value) {
      Function.value -> Function
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineNamespaceFunctionToolTypeXe2f4b311> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineNamespaceFunctionToolTypeXe2f4b311", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNamespaceFunctionToolTypeXe2f4b311 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNamespaceFunctionToolTypeXe2f4b311) {
      encoder.encodeString(value.value)
    }
  }
}
