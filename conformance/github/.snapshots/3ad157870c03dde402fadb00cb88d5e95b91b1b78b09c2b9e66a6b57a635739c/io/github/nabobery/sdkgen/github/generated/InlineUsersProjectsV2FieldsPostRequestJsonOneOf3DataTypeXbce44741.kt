package io.github.nabobery.sdkgen.github.generated

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
 * t/application~1json/schema/oneOf/2/properties/data_type
 */
@Serializable(with = InlineUsersProjectsV2FieldsPostRequestJsonOneOf3DataTypeXbce44741.Serializer::class)
public sealed class InlineUsersProjectsV2FieldsPostRequestJsonOneOf3DataTypeXbce44741 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `iteration`.
   */
  public data object Iteration : InlineUsersProjectsV2FieldsPostRequestJsonOneOf3DataTypeXbce44741() {
    public override val `value`: String = "iteration"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersProjectsV2FieldsPostRequestJsonOneOf3DataTypeXbce44741()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersProjectsV2FieldsPostRequestJsonOneOf3DataTypeXbce44741 = when (value) {
      Iteration.value -> Iteration
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUsersProjectsV2FieldsPostRequestJsonOneOf3DataTypeXbce44741> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineUsersProjectsV2FieldsPostRequestJsonOneOf3DataTypeXbce44741", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersProjectsV2FieldsPostRequestJsonOneOf3DataTypeXbce44741 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersProjectsV2FieldsPostRequestJsonOneOf3DataTypeXbce44741) {
      encoder.encodeString(value.value)
    }
  }
}
