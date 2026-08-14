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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-removed/properties/issue_field/properties/field
 * _type
 */
@Serializable(with = InlineWebhookIssuesFieldRemovedIssueFieldFieldTypeX5f0cb0e9.Serializer::class)
public sealed class InlineWebhookIssuesFieldRemovedIssueFieldFieldTypeX5f0cb0e9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineWebhookIssuesFieldRemovedIssueFieldFieldTypeX5f0cb0e9() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `date`.
   */
  public data object Date : InlineWebhookIssuesFieldRemovedIssueFieldFieldTypeX5f0cb0e9() {
    public override val `value`: String = "date"
  }

  /**
   * Documented value. Wire value: `single_select`.
   */
  public data object SingleSelect : InlineWebhookIssuesFieldRemovedIssueFieldFieldTypeX5f0cb0e9() {
    public override val `value`: String = "single_select"
  }

  /**
   * Documented value. Wire value: `multi_select`.
   */
  public data object MultiSelect : InlineWebhookIssuesFieldRemovedIssueFieldFieldTypeX5f0cb0e9() {
    public override val `value`: String = "multi_select"
  }

  /**
   * Documented value. Wire value: `number`.
   */
  public data object Number : InlineWebhookIssuesFieldRemovedIssueFieldFieldTypeX5f0cb0e9() {
    public override val `value`: String = "number"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesFieldRemovedIssueFieldFieldTypeX5f0cb0e9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesFieldRemovedIssueFieldFieldTypeX5f0cb0e9 = when (value) {
      Text.value -> Text
      Date.value -> Date
      SingleSelect.value -> SingleSelect
      MultiSelect.value -> MultiSelect
      Number.value -> Number
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesFieldRemovedIssueFieldFieldTypeX5f0cb0e9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesFieldRemovedIssueFieldFieldTypeX5f0cb0e9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesFieldRemovedIssueFieldFieldTypeX5f0cb0e9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesFieldRemovedIssueFieldFieldTypeX5f0cb0e9) {
      encoder.encodeString(value.value)
    }
  }
}
