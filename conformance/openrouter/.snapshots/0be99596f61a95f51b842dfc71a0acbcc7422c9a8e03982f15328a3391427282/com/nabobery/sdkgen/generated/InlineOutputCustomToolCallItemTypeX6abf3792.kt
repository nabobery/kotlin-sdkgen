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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputCustomToolCallItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputCustomToolCallItem/properties/type
 */
@Serializable(with = InlineOutputCustomToolCallItemTypeX6abf3792.Serializer::class)
public sealed class InlineOutputCustomToolCallItemTypeX6abf3792 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom_tool_call`.
   */
  public data object CustomToolCall : InlineOutputCustomToolCallItemTypeX6abf3792() {
    public override val `value`: String = "custom_tool_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputCustomToolCallItemTypeX6abf3792()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputCustomToolCallItemTypeX6abf3792 = when (value) {
      CustomToolCall.value -> CustomToolCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputCustomToolCallItemTypeX6abf3792> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputCustomToolCallItemTypeX6abf3792", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputCustomToolCallItemTypeX6abf3792 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputCustomToolCallItemTypeX6abf3792) {
      encoder.encodeString(value.value)
    }
  }
}
