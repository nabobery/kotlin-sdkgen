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
 * The mode of assigning new seats.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/copilot-organization-details/properties/seat_management_setting
 */
@Serializable(with = InlineCopilotOrganizationDetailsSeatManagementSettingXea4f7bdf.Serializer::class)
public sealed class InlineCopilotOrganizationDetailsSeatManagementSettingXea4f7bdf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assign_all`.
   */
  public data object AssignAll : InlineCopilotOrganizationDetailsSeatManagementSettingXea4f7bdf() {
    public override val `value`: String = "assign_all"
  }

  /**
   * Documented value. Wire value: `assign_selected`.
   */
  public data object AssignSelected : InlineCopilotOrganizationDetailsSeatManagementSettingXea4f7bdf() {
    public override val `value`: String = "assign_selected"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCopilotOrganizationDetailsSeatManagementSettingXea4f7bdf() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `unconfigured`.
   */
  public data object Unconfigured : InlineCopilotOrganizationDetailsSeatManagementSettingXea4f7bdf() {
    public override val `value`: String = "unconfigured"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCopilotOrganizationDetailsSeatManagementSettingXea4f7bdf()

  public companion object {
    public fun fromValue(`value`: String): InlineCopilotOrganizationDetailsSeatManagementSettingXea4f7bdf = when (value) {
      AssignAll.value -> AssignAll
      AssignSelected.value -> AssignSelected
      Disabled.value -> Disabled
      Unconfigured.value -> Unconfigured
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCopilotOrganizationDetailsSeatManagementSettingXea4f7bdf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCopilotOrganizationDetailsSeatManagementSettingXea4f7bdf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCopilotOrganizationDetailsSeatManagementSettingXea4f7bdf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCopilotOrganizationDetailsSeatManagementSettingXea4f7bdf) {
      encoder.encodeString(value.value)
    }
  }
}
