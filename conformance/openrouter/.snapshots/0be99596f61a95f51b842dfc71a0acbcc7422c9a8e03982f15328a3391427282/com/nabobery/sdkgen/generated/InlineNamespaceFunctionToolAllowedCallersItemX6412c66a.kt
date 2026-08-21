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
 * sdkgen://source/openapi.yaml#/components/schemas/NamespaceFunctionTool/properties/allowed_callers/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/NamespaceFunctionTool/properties/allowed_callers/items
 */
@Serializable(with = InlineNamespaceFunctionToolAllowedCallersItemX6412c66a.Serializer::class)
public sealed class InlineNamespaceFunctionToolAllowedCallersItemX6412c66a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `direct`.
   */
  public data object Direct : InlineNamespaceFunctionToolAllowedCallersItemX6412c66a() {
    public override val `value`: String = "direct"
  }

  /**
   * Documented value. Wire value: `programmatic`.
   */
  public data object Programmatic : InlineNamespaceFunctionToolAllowedCallersItemX6412c66a() {
    public override val `value`: String = "programmatic"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNamespaceFunctionToolAllowedCallersItemX6412c66a()

  public companion object {
    public fun fromValue(`value`: String): InlineNamespaceFunctionToolAllowedCallersItemX6412c66a = when (value) {
      Direct.value -> Direct
      Programmatic.value -> Programmatic
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineNamespaceFunctionToolAllowedCallersItemX6412c66a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineNamespaceFunctionToolAllowedCallersItemX6412c66a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNamespaceFunctionToolAllowedCallersItemX6412c66a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNamespaceFunctionToolAllowedCallersItemX6412c66a) {
      encoder.encodeString(value.value)
    }
  }
}
