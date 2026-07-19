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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatToolChoice/anyOf/0.
 */
@Serializable(with = InlineComponentsSchemasChatToolChoiceAnyOf0.Serializer::class)
public sealed class InlineComponentsSchemasChatToolChoiceAnyOf0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineComponentsSchemasChatToolChoiceAnyOf0() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatToolChoiceAnyOf0()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatToolChoiceAnyOf0 = when (value) {
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatToolChoiceAnyOf0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatToolChoiceAnyOf0",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatToolChoiceAnyOf0 = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatToolChoiceAnyOf0) {
      encoder.encodeString(value.value)
    }
  }
}
