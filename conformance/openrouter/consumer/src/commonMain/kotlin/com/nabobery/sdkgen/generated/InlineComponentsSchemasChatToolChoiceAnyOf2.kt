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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatToolChoice/anyOf/2.
 */
@Serializable(with = InlineComponentsSchemasChatToolChoiceAnyOf2.Serializer::class)
public sealed class InlineComponentsSchemasChatToolChoiceAnyOf2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `required`.
   */
  public data object Required : InlineComponentsSchemasChatToolChoiceAnyOf2() {
    public override val `value`: String = "required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatToolChoiceAnyOf2()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatToolChoiceAnyOf2 = when (value) {
      Required.value -> Required
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatToolChoiceAnyOf2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatToolChoiceAnyOf2",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatToolChoiceAnyOf2 = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatToolChoiceAnyOf2) {
      encoder.encodeString(value.value)
    }
  }
}
