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
 * The data type of the issue field.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-added/properties/issue_field/properties/field_t
 * ype
 */
@Serializable(with = InlineWebhookIssuesFieldAddedIssueFieldFieldTypeX6573fd28.Serializer::class)
public sealed class InlineWebhookIssuesFieldAddedIssueFieldFieldTypeX6573fd28 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineWebhookIssuesFieldAddedIssueFieldFieldTypeX6573fd28() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `date`.
   */
  public data object Date : InlineWebhookIssuesFieldAddedIssueFieldFieldTypeX6573fd28() {
    public override val `value`: String = "date"
  }

  /**
   * Documented value. Wire value: `single_select`.
   */
  public data object SingleSelect : InlineWebhookIssuesFieldAddedIssueFieldFieldTypeX6573fd28() {
    public override val `value`: String = "single_select"
  }

  /**
   * Documented value. Wire value: `multi_select`.
   */
  public data object MultiSelect : InlineWebhookIssuesFieldAddedIssueFieldFieldTypeX6573fd28() {
    public override val `value`: String = "multi_select"
  }

  /**
   * Documented value. Wire value: `number`.
   */
  public data object Number : InlineWebhookIssuesFieldAddedIssueFieldFieldTypeX6573fd28() {
    public override val `value`: String = "number"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesFieldAddedIssueFieldFieldTypeX6573fd28()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesFieldAddedIssueFieldFieldTypeX6573fd28 = when (value) {
      Text.value -> Text
      Date.value -> Date
      SingleSelect.value -> SingleSelect
      MultiSelect.value -> MultiSelect
      Number.value -> Number
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesFieldAddedIssueFieldFieldTypeX6573fd28> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesFieldAddedIssueFieldFieldTypeX6573fd28", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesFieldAddedIssueFieldFieldTypeX6573fd28 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesFieldAddedIssueFieldFieldTypeX6573fd28) {
      encoder.encodeString(value.value)
    }
  }
}
