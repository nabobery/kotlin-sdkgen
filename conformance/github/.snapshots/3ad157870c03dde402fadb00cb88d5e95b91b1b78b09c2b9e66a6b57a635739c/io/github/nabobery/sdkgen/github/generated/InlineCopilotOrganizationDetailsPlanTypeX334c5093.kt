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
 * The Copilot plan of the organization, or the parent enterprise, when applicable.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-organization-details/properties/plan_type
 */
@Serializable(with = InlineCopilotOrganizationDetailsPlanTypeX334c5093.Serializer::class)
public sealed class InlineCopilotOrganizationDetailsPlanTypeX334c5093 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `business`.
   */
  public data object Business : InlineCopilotOrganizationDetailsPlanTypeX334c5093() {
    public override val `value`: String = "business"
  }

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineCopilotOrganizationDetailsPlanTypeX334c5093() {
    public override val `value`: String = "enterprise"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCopilotOrganizationDetailsPlanTypeX334c5093()

  public companion object {
    public fun fromValue(`value`: String): InlineCopilotOrganizationDetailsPlanTypeX334c5093 = when (value) {
      Business.value -> Business
      Enterprise.value -> Enterprise
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCopilotOrganizationDetailsPlanTypeX334c5093> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCopilotOrganizationDetailsPlanTypeX334c5093", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCopilotOrganizationDetailsPlanTypeX334c5093 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCopilotOrganizationDetailsPlanTypeX334c5093) {
      encoder.encodeString(value.value)
    }
  }
}
