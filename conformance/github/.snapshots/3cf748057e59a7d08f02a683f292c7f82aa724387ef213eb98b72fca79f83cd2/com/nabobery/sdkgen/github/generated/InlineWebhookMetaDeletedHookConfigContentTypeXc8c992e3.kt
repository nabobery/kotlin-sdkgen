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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-meta-deleted/properties/hook/properties/config/properties/co
 * ntent_type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-meta-deleted/properties/hook/properties/config/properties/co
 * ntent_type
 */
@Serializable(with = InlineWebhookMetaDeletedHookConfigContentTypeXc8c992e3.Serializer::class)
public sealed class InlineWebhookMetaDeletedHookConfigContentTypeXc8c992e3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `json`.
   */
  public data object Json : InlineWebhookMetaDeletedHookConfigContentTypeXc8c992e3() {
    public override val `value`: String = "json"
  }

  /**
   * Documented value. Wire value: `form`.
   */
  public data object Form : InlineWebhookMetaDeletedHookConfigContentTypeXc8c992e3() {
    public override val `value`: String = "form"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMetaDeletedHookConfigContentTypeXc8c992e3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMetaDeletedHookConfigContentTypeXc8c992e3 = when (value) {
      Json.value -> Json
      Form.value -> Form
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookMetaDeletedHookConfigContentTypeXc8c992e3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMetaDeletedHookConfigContentTypeXc8c992e3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMetaDeletedHookConfigContentTypeXc8c992e3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMetaDeletedHookConfigContentTypeXc8c992e3) {
      encoder.encodeString(value.value)
    }
  }
}
