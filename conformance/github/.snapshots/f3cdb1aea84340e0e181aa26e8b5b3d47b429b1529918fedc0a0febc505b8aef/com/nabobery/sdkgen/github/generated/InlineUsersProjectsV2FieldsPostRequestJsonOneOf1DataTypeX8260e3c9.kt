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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1projectsV2~1{project_number}~1fields/post/requestBody/conten
 * t/application~1json/schema/oneOf/0/properties/data_type
 */
@Serializable(with = InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9.Serializer::class)
public sealed class InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `number`.
   */
  public data object Number : InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9() {
    public override val `value`: String = "number"
  }

  /**
   * Documented value. Wire value: `date`.
   */
  public data object Date : InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9() {
    public override val `value`: String = "date"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9 = when (value) {
      Text.value -> Text
      Number.value -> Number
      Date.value -> Date
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9) {
      encoder.encodeString(value.value)
    }
  }
}
