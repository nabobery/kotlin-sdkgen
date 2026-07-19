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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/status/anyOf/1.
 */
@Serializable(with = InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1.Serializer::class)
public sealed class InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `incomplete`.
   */
  public data object Incomplete : InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1() {
    public override val `value`: String = "incomplete"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1 = when (value) {
      Incomplete.value -> Incomplete
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputMessagePropertiesStatusAnyOf1) {
      encoder.encodeString(value.value)
    }
  }
}
