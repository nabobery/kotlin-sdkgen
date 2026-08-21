package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The field's data type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1fields/post/requestBody/content/appl
 * ication~1json/schema/oneOf/1/properties/data_type
 */
@Serializable(with = InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2DataTypeXbc7f0bfd.Serializer::class)
public sealed class InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2DataTypeXbc7f0bfd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2DataTypeXbc7f0bfd() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `number`.
   */
  public data object Number : InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2DataTypeXbc7f0bfd() {
    public override val `value`: String = "number"
  }

  /**
   * Documented value. Wire value: `date`.
   */
  public data object Date : InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2DataTypeXbc7f0bfd() {
    public override val `value`: String = "date"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2DataTypeXbc7f0bfd()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2DataTypeXbc7f0bfd = when (value) {
      Text.value -> Text
      Number.value -> Number
      Date.value -> Date
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2DataTypeXbc7f0bfd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2DataTypeXbc7f0bfd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2DataTypeXbc7f0bfd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2DataTypeXbc7f0bfd) {
      encoder.encodeString(value.value)
    }
  }
}
