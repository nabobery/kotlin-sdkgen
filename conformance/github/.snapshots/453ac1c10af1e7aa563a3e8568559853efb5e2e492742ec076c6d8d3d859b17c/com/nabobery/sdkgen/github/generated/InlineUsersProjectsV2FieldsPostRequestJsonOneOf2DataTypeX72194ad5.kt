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
 * t/application~1json/schema/oneOf/1/properties/data_type
 */
@Serializable(with = InlineUsersProjectsV2FieldsPostRequestJsonOneOf2DataTypeX72194ad5.Serializer::class)
public sealed class InlineUsersProjectsV2FieldsPostRequestJsonOneOf2DataTypeX72194ad5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `single_select`.
   */
  public data object SingleSelect : InlineUsersProjectsV2FieldsPostRequestJsonOneOf2DataTypeX72194ad5() {
    public override val `value`: String = "single_select"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersProjectsV2FieldsPostRequestJsonOneOf2DataTypeX72194ad5()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersProjectsV2FieldsPostRequestJsonOneOf2DataTypeX72194ad5 = when (value) {
      SingleSelect.value -> SingleSelect
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineUsersProjectsV2FieldsPostRequestJsonOneOf2DataTypeX72194ad5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUsersProjectsV2FieldsPostRequestJsonOneOf2DataTypeX72194ad5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersProjectsV2FieldsPostRequestJsonOneOf2DataTypeX72194ad5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersProjectsV2FieldsPostRequestJsonOneOf2DataTypeX72194ad5) {
      encoder.encodeString(value.value)
    }
  }
}
