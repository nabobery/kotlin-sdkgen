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
 * Who can edit the values of the property
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/custom-property/properties/values_editable_by
 */
@Serializable(with = InlineCustomPropertyValuesEditableByX423c274f.Serializer::class)
public sealed class InlineCustomPropertyValuesEditableByX423c274f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `org_actors`.
   */
  public data object OrgActors : InlineCustomPropertyValuesEditableByX423c274f() {
    public override val `value`: String = "org_actors"
  }

  /**
   * Documented value. Wire value: `org_and_repo_actors`.
   */
  public data object OrgAndRepoActors : InlineCustomPropertyValuesEditableByX423c274f() {
    public override val `value`: String = "org_and_repo_actors"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomPropertyValuesEditableByX423c274f()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomPropertyValuesEditableByX423c274f = when (value) {
      OrgActors.value -> OrgActors
      OrgAndRepoActors.value -> OrgAndRepoActors
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomPropertyValuesEditableByX423c274f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCustomPropertyValuesEditableByX423c274f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomPropertyValuesEditableByX423c274f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomPropertyValuesEditableByX423c274f) {
      encoder.encodeString(value.value)
    }
  }
}
