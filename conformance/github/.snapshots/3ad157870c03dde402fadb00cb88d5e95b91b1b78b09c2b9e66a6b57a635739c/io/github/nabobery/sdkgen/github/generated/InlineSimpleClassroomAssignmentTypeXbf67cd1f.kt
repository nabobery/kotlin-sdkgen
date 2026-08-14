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
 * Whether it's a Group Assignment or Individual Assignment.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/simple-classroom-assignment/properties/type
 */
@Serializable(with = InlineSimpleClassroomAssignmentTypeXbf67cd1f.Serializer::class)
public sealed class InlineSimpleClassroomAssignmentTypeXbf67cd1f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineSimpleClassroomAssignmentTypeXbf67cd1f() {
    public override val `value`: String = "individual"
  }

  /**
   * Documented value. Wire value: `group`.
   */
  public data object Group : InlineSimpleClassroomAssignmentTypeXbf67cd1f() {
    public override val `value`: String = "group"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSimpleClassroomAssignmentTypeXbf67cd1f()

  public companion object {
    public fun fromValue(`value`: String): InlineSimpleClassroomAssignmentTypeXbf67cd1f = when (value) {
      Individual.value -> Individual
      Group.value -> Group
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSimpleClassroomAssignmentTypeXbf67cd1f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineSimpleClassroomAssignmentTypeXbf67cd1f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSimpleClassroomAssignmentTypeXbf67cd1f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSimpleClassroomAssignmentTypeXbf67cd1f) {
      encoder.encodeString(value.value)
    }
  }
}
