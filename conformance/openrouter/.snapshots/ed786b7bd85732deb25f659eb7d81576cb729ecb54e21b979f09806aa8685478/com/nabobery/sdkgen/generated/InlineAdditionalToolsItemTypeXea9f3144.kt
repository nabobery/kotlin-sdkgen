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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AdditionalToolsItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AdditionalToolsItem/properties/type
 */
@Serializable(with = InlineAdditionalToolsItemTypeXea9f3144.Serializer::class)
public sealed class InlineAdditionalToolsItemTypeXea9f3144 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `additional_tools`.
   */
  public data object AdditionalTools : InlineAdditionalToolsItemTypeXea9f3144() {
    public override val `value`: String = "additional_tools"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAdditionalToolsItemTypeXea9f3144()

  public companion object {
    public fun fromValue(`value`: String): InlineAdditionalToolsItemTypeXea9f3144 = when (value) {
      AdditionalTools.value -> AdditionalTools
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAdditionalToolsItemTypeXea9f3144> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAdditionalToolsItemTypeXea9f3144", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAdditionalToolsItemTypeXea9f3144 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAdditionalToolsItemTypeXea9f3144) {
      encoder.encodeString(value.value)
    }
  }
}
