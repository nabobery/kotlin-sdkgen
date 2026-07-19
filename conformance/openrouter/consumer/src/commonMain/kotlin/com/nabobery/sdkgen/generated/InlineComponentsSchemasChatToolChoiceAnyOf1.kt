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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatToolChoice/anyOf/1.
 */
@Serializable(with = InlineComponentsSchemasChatToolChoiceAnyOf1.Serializer::class)
public sealed class InlineComponentsSchemasChatToolChoiceAnyOf1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineComponentsSchemasChatToolChoiceAnyOf1() {
    public override val `value`: String = "auto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatToolChoiceAnyOf1()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatToolChoiceAnyOf1 = when (value) {
      Auto.value -> Auto
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatToolChoiceAnyOf1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatToolChoiceAnyOf1",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatToolChoiceAnyOf1 = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatToolChoiceAnyOf1) {
      encoder.encodeString(value.value)
    }
  }
}
