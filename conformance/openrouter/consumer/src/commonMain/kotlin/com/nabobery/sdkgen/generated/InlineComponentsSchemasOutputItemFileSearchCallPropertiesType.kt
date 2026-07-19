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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemFileSearchCall/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputItemFileSearchCallPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputItemFileSearchCallPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file_search_call`.
   */
  public data object FileSearchCall : InlineComponentsSchemasOutputItemFileSearchCallPropertiesType() {
    public override val `value`: String = "file_search_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputItemFileSearchCallPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputItemFileSearchCallPropertiesType =
      when (value) {
      FileSearchCall.value -> FileSearchCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemFileSearchCallPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputItemFileSearchCallPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemFileSearchCallPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputItemFileSearchCallPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
