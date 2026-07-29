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
 * The level of permission to grant the access token for viewing an organization's plan.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/organization_plan
 */
@Serializable(with = InlineAppPermissionsOrganizationPlanXfaea73bc.Serializer::class)
public sealed class InlineAppPermissionsOrganizationPlanXfaea73bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsOrganizationPlanXfaea73bc() {
    public override val `value`: String = "read"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsOrganizationPlanXfaea73bc()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsOrganizationPlanXfaea73bc = when (value) {
      Read.value -> Read
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsOrganizationPlanXfaea73bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsOrganizationPlanXfaea73bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsOrganizationPlanXfaea73bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsOrganizationPlanXfaea73bc) {
      encoder.encodeString(value.value)
    }
  }
}
