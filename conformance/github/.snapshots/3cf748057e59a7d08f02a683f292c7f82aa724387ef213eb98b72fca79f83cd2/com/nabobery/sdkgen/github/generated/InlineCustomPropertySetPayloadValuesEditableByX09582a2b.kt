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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/custom-property-set-payload/properties/values_editable_by
 */
@Serializable(with = InlineCustomPropertySetPayloadValuesEditableByX09582a2b.Serializer::class)
public sealed class InlineCustomPropertySetPayloadValuesEditableByX09582a2b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `org_actors`.
   */
  public data object OrgActors : InlineCustomPropertySetPayloadValuesEditableByX09582a2b() {
    public override val `value`: String = "org_actors"
  }

  /**
   * Documented value. Wire value: `org_and_repo_actors`.
   */
  public data object OrgAndRepoActors : InlineCustomPropertySetPayloadValuesEditableByX09582a2b() {
    public override val `value`: String = "org_and_repo_actors"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomPropertySetPayloadValuesEditableByX09582a2b()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomPropertySetPayloadValuesEditableByX09582a2b = when (value) {
      OrgActors.value -> OrgActors
      OrgAndRepoActors.value -> OrgAndRepoActors
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCustomPropertySetPayloadValuesEditableByX09582a2b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCustomPropertySetPayloadValuesEditableByX09582a2b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomPropertySetPayloadValuesEditableByX09582a2b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomPropertySetPayloadValuesEditableByX09582a2b) {
      encoder.encodeString(value.value)
    }
  }
}
