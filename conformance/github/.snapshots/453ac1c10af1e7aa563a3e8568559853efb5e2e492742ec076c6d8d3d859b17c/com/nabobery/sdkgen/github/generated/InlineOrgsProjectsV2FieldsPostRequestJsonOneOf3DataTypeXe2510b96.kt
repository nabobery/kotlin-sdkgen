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
 * ication~1json/schema/oneOf/2/properties/data_type
 */
@Serializable(with = InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3DataTypeXe2510b96.Serializer::class)
public sealed class InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3DataTypeXe2510b96 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `single_select`.
   */
  public data object SingleSelect : InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3DataTypeXe2510b96() {
    public override val `value`: String = "single_select"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3DataTypeXe2510b96()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3DataTypeXe2510b96 = when (value) {
      SingleSelect.value -> SingleSelect
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3DataTypeXe2510b96> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3DataTypeXe2510b96", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3DataTypeXe2510b96 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3DataTypeXe2510b96) {
      encoder.encodeString(value.value)
    }
  }
}
