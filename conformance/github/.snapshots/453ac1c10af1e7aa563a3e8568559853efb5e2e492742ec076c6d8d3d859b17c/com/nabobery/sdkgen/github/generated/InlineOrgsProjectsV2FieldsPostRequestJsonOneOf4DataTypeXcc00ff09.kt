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
 * ication~1json/schema/oneOf/3/properties/data_type
 */
@Serializable(with = InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4DataTypeXcc00ff09.Serializer::class)
public sealed class InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4DataTypeXcc00ff09 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `iteration`.
   */
  public data object Iteration : InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4DataTypeXcc00ff09() {
    public override val `value`: String = "iteration"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4DataTypeXcc00ff09()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4DataTypeXcc00ff09 = when (value) {
      Iteration.value -> Iteration
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4DataTypeXcc00ff09> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4DataTypeXcc00ff09", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4DataTypeXcc00ff09 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4DataTypeXcc00ff09) {
      encoder.encodeString(value.value)
    }
  }
}
