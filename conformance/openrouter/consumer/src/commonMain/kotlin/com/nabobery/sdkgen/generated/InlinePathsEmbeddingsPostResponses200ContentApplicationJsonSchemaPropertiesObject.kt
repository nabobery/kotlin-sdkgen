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
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/responses/200/content/application~1json/schema/properties/objec
 * t.
 */
@Serializable(with = InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesObject
  .Serializer::class)
public sealed class InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesObject {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesObject() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesObject()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesObject = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesObject> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesObject", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesObject = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesObject) {
      encoder.encodeString(value.value)
    }
  }
}
