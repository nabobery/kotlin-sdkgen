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
 * The color of the issue type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-type-webhook/properties/color
 */
@Serializable(with = InlineIssueTypeWebhookColorXee50ed8e.Serializer::class)
public sealed class InlineIssueTypeWebhookColorXee50ed8e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `gray`.
   */
  public data object Gray : InlineIssueTypeWebhookColorXee50ed8e() {
    public override val `value`: String = "gray"
  }

  /**
   * Documented value. Wire value: `blue`.
   */
  public data object Blue : InlineIssueTypeWebhookColorXee50ed8e() {
    public override val `value`: String = "blue"
  }

  /**
   * Documented value. Wire value: `green`.
   */
  public data object Green : InlineIssueTypeWebhookColorXee50ed8e() {
    public override val `value`: String = "green"
  }

  /**
   * Documented value. Wire value: `yellow`.
   */
  public data object Yellow : InlineIssueTypeWebhookColorXee50ed8e() {
    public override val `value`: String = "yellow"
  }

  /**
   * Documented value. Wire value: `orange`.
   */
  public data object Orange : InlineIssueTypeWebhookColorXee50ed8e() {
    public override val `value`: String = "orange"
  }

  /**
   * Documented value. Wire value: `red`.
   */
  public data object Red : InlineIssueTypeWebhookColorXee50ed8e() {
    public override val `value`: String = "red"
  }

  /**
   * Documented value. Wire value: `pink`.
   */
  public data object Pink : InlineIssueTypeWebhookColorXee50ed8e() {
    public override val `value`: String = "pink"
  }

  /**
   * Documented value. Wire value: `purple`.
   */
  public data object Purple : InlineIssueTypeWebhookColorXee50ed8e() {
    public override val `value`: String = "purple"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssueTypeWebhookColorXee50ed8e()

  public companion object {
    public fun fromValue(`value`: String): InlineIssueTypeWebhookColorXee50ed8e = when (value) {
      Gray.value -> Gray
      Blue.value -> Blue
      Green.value -> Green
      Yellow.value -> Yellow
      Orange.value -> Orange
      Red.value -> Red
      Pink.value -> Pink
      Purple.value -> Purple
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssueTypeWebhookColorXee50ed8e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineIssueTypeWebhookColorXee50ed8e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssueTypeWebhookColorXee50ed8e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssueTypeWebhookColorXee50ed8e) {
      encoder.encodeString(value.value)
    }
  }
}
