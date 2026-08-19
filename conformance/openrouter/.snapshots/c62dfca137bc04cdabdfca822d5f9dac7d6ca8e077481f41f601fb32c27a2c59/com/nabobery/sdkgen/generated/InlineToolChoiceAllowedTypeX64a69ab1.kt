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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ToolChoiceAllowed/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ToolChoiceAllowed/properties/type
 */
@Serializable(with = InlineToolChoiceAllowedTypeX64a69ab1.Serializer::class)
public sealed class InlineToolChoiceAllowedTypeX64a69ab1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `allowed_tools`.
   */
  public data object AllowedTools : InlineToolChoiceAllowedTypeX64a69ab1() {
    public override val `value`: String = "allowed_tools"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineToolChoiceAllowedTypeX64a69ab1()

  public companion object {
    public fun fromValue(`value`: String): InlineToolChoiceAllowedTypeX64a69ab1 = when (value) {
      AllowedTools.value -> AllowedTools
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineToolChoiceAllowedTypeX64a69ab1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineToolChoiceAllowedTypeX64a69ab1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineToolChoiceAllowedTypeX64a69ab1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineToolChoiceAllowedTypeX64a69ab1) {
      encoder.encodeString(value.value)
    }
  }
}
