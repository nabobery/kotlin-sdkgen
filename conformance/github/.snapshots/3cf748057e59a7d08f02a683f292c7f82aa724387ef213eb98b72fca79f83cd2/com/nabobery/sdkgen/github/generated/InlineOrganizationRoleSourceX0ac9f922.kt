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
 * Source answers the question, "where did this role come from?"
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-role/properties/source
 */
@Serializable(with = InlineOrganizationRoleSourceX0ac9f922.Serializer::class)
public sealed class InlineOrganizationRoleSourceX0ac9f922 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineOrganizationRoleSourceX0ac9f922() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Enterprise`.
   */
  public data object Enterprise : InlineOrganizationRoleSourceX0ac9f922() {
    public override val `value`: String = "Enterprise"
  }

  /**
   * Documented value. Wire value: `Predefined`.
   */
  public data object Predefined : InlineOrganizationRoleSourceX0ac9f922() {
    public override val `value`: String = "Predefined"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationRoleSourceX0ac9f922()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationRoleSourceX0ac9f922 = when (value) {
      Organization.value -> Organization
      Enterprise.value -> Enterprise
      Predefined.value -> Predefined
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrganizationRoleSourceX0ac9f922> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrganizationRoleSourceX0ac9f922", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationRoleSourceX0ac9f922 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationRoleSourceX0ac9f922) {
      encoder.encodeString(value.value)
    }
  }
}
