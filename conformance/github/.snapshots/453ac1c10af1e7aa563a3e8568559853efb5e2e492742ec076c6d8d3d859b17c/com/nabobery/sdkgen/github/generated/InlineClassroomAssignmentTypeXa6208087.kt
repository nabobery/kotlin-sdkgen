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
 * Whether it's a group assignment or individual assignment.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/classroom-assignment/properties/type
 */
@Serializable(with = InlineClassroomAssignmentTypeXa6208087.Serializer::class)
public sealed class InlineClassroomAssignmentTypeXa6208087 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineClassroomAssignmentTypeXa6208087() {
    public override val `value`: String = "individual"
  }

  /**
   * Documented value. Wire value: `group`.
   */
  public data object Group : InlineClassroomAssignmentTypeXa6208087() {
    public override val `value`: String = "group"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineClassroomAssignmentTypeXa6208087()

  public companion object {
    public fun fromValue(`value`: String): InlineClassroomAssignmentTypeXa6208087 = when (value) {
      Individual.value -> Individual
      Group.value -> Group
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineClassroomAssignmentTypeXa6208087> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineClassroomAssignmentTypeXa6208087", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineClassroomAssignmentTypeXa6208087 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineClassroomAssignmentTypeXa6208087) {
      encoder.encodeString(value.value)
    }
  }
}
