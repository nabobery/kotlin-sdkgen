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
 * The system role from which this role inherits permissions.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-role/properties/base_role
 */
@Serializable(with = InlineOrganizationRoleBaseRoleXfd6edbf1.Serializer::class)
public sealed class InlineOrganizationRoleBaseRoleXfd6edbf1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineOrganizationRoleBaseRoleXfd6edbf1() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `triage`.
   */
  public data object Triage : InlineOrganizationRoleBaseRoleXfd6edbf1() {
    public override val `value`: String = "triage"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineOrganizationRoleBaseRoleXfd6edbf1() {
    public override val `value`: String = "write"
  }

  /**
   * Documented value. Wire value: `maintain`.
   */
  public data object Maintain : InlineOrganizationRoleBaseRoleXfd6edbf1() {
    public override val `value`: String = "maintain"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineOrganizationRoleBaseRoleXfd6edbf1() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationRoleBaseRoleXfd6edbf1()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationRoleBaseRoleXfd6edbf1 = when (value) {
      Read.value -> Read
      Triage.value -> Triage
      Write.value -> Write
      Maintain.value -> Maintain
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrganizationRoleBaseRoleXfd6edbf1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrganizationRoleBaseRoleXfd6edbf1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationRoleBaseRoleXfd6edbf1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationRoleBaseRoleXfd6edbf1) {
      encoder.encodeString(value.value)
    }
  }
}
