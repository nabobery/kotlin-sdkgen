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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1collaborators~1{actor_type}~1{acto
 * r_identifier}/delete/parameters/2/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1collaborators~1{actor_type}~1{acto
 * r_identifier}/delete/parameters/2/schema
 */
@Serializable(with = InlineOrgsCopilotSpacesCollaboratorsDeleteParameterXbeb3e54c.Serializer::class)
public sealed class InlineOrgsCopilotSpacesCollaboratorsDeleteParameterXbeb3e54c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineOrgsCopilotSpacesCollaboratorsDeleteParameterXbeb3e54c() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Team`.
   */
  public data object Team : InlineOrgsCopilotSpacesCollaboratorsDeleteParameterXbeb3e54c() {
    public override val `value`: String = "Team"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCopilotSpacesCollaboratorsDeleteParameterXbeb3e54c()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCopilotSpacesCollaboratorsDeleteParameterXbeb3e54c = when (value) {
      User.value -> User
      Team.value -> Team
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsCopilotSpacesCollaboratorsDeleteParameterXbeb3e54c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesCollaboratorsDeleteParameterXbeb3e54c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesCollaboratorsDeleteParameterXbeb3e54c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesCollaboratorsDeleteParameterXbeb3e54c) {
      encoder.encodeString(value.value)
    }
  }
}
