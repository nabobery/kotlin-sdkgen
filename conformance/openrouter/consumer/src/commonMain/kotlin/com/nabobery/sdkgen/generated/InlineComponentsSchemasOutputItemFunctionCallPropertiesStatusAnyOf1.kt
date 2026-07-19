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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemFunctionCall/properties/status/anyOf/1.
 */
@Serializable(with = InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1.Serializer::class)
public sealed class InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `incomplete`.
   */
  public data object Incomplete : InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1() {
    public override val `value`: String = "incomplete"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1 =
      when (value) {
      Incomplete.value -> Incomplete
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputItemFunctionCallPropertiesStatusAnyOf1) {
      encoder.encodeString(value.value)
    }
  }
}
