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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/action/oneOf/0/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/action/oneOf/0/properties/type
 */
@Serializable(with = InlineOutputItemWebSearchCallActionOneOf1TypeXc38305ba.Serializer::class)
public sealed class InlineOutputItemWebSearchCallActionOneOf1TypeXc38305ba {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `search`.
   */
  public data object Search : InlineOutputItemWebSearchCallActionOneOf1TypeXc38305ba() {
    public override val `value`: String = "search"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemWebSearchCallActionOneOf1TypeXc38305ba()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemWebSearchCallActionOneOf1TypeXc38305ba = when (value) {
      Search.value -> Search
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemWebSearchCallActionOneOf1TypeXc38305ba> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputItemWebSearchCallActionOneOf1TypeXc38305ba", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemWebSearchCallActionOneOf1TypeXc38305ba = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemWebSearchCallActionOneOf1TypeXc38305ba) {
      encoder.encodeString(value.value)
    }
  }
}
