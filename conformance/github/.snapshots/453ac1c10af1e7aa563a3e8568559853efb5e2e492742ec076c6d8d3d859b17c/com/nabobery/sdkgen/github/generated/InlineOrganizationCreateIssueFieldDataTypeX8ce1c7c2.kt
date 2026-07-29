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
 * The data type of the issue field.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-create-issue-field/properties/data_type
 */
@Serializable(with = InlineOrganizationCreateIssueFieldDataTypeX8ce1c7c2.Serializer::class)
public sealed class InlineOrganizationCreateIssueFieldDataTypeX8ce1c7c2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineOrganizationCreateIssueFieldDataTypeX8ce1c7c2() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `date`.
   */
  public data object Date : InlineOrganizationCreateIssueFieldDataTypeX8ce1c7c2() {
    public override val `value`: String = "date"
  }

  /**
   * Documented value. Wire value: `single_select`.
   */
  public data object SingleSelect : InlineOrganizationCreateIssueFieldDataTypeX8ce1c7c2() {
    public override val `value`: String = "single_select"
  }

  /**
   * Documented value. Wire value: `multi_select`.
   */
  public data object MultiSelect : InlineOrganizationCreateIssueFieldDataTypeX8ce1c7c2() {
    public override val `value`: String = "multi_select"
  }

  /**
   * Documented value. Wire value: `number`.
   */
  public data object Number : InlineOrganizationCreateIssueFieldDataTypeX8ce1c7c2() {
    public override val `value`: String = "number"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationCreateIssueFieldDataTypeX8ce1c7c2()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationCreateIssueFieldDataTypeX8ce1c7c2 = when (value) {
      Text.value -> Text
      Date.value -> Date
      SingleSelect.value -> SingleSelect
      MultiSelect.value -> MultiSelect
      Number.value -> Number
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrganizationCreateIssueFieldDataTypeX8ce1c7c2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrganizationCreateIssueFieldDataTypeX8ce1c7c2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationCreateIssueFieldDataTypeX8ce1c7c2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationCreateIssueFieldDataTypeX8ce1c7c2) {
      encoder.encodeString(value.value)
    }
  }
}
