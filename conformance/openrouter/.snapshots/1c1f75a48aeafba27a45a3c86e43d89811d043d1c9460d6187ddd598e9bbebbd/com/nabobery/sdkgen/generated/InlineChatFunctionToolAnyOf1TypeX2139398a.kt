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
 * sdkgen://source/openapi.yaml#/components/schemas/ChatFunctionTool/anyOf/0/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatFunctionTool/anyOf/0/properties/type
 */
@Serializable(with = InlineChatFunctionToolAnyOf1TypeX2139398a.Serializer::class)
public sealed class InlineChatFunctionToolAnyOf1TypeX2139398a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `function`.
   */
  public data object Function : InlineChatFunctionToolAnyOf1TypeX2139398a() {
    public override val `value`: String = "function"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatFunctionToolAnyOf1TypeX2139398a()

  public companion object {
    public fun fromValue(`value`: String): InlineChatFunctionToolAnyOf1TypeX2139398a = when (value) {
      Function.value -> Function
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatFunctionToolAnyOf1TypeX2139398a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineChatFunctionToolAnyOf1TypeX2139398a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatFunctionToolAnyOf1TypeX2139398a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatFunctionToolAnyOf1TypeX2139398a) {
      encoder.encodeString(value.value)
    }
  }
}
