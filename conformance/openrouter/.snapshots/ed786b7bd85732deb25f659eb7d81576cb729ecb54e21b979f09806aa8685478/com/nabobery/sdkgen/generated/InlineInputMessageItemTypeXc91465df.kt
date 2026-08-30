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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/InputMessageItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputMessageItem/properties/type
 */
@Serializable(with = InlineInputMessageItemTypeXc91465df.Serializer::class)
public sealed class InlineInputMessageItemTypeXc91465df {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `message`.
   */
  public data object Message : InlineInputMessageItemTypeXc91465df() {
    public override val `value`: String = "message"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInputMessageItemTypeXc91465df()

  public companion object {
    public fun fromValue(`value`: String): InlineInputMessageItemTypeXc91465df = when (value) {
      Message.value -> Message
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInputMessageItemTypeXc91465df> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineInputMessageItemTypeXc91465df", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInputMessageItemTypeXc91465df = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInputMessageItemTypeXc91465df) {
      encoder.encodeString(value.value)
    }
  }
}
