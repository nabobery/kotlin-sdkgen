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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-category-changed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-category-changed/properties/action
 */
@Serializable(with = InlineWebhookDiscussionCategoryChangedActionX49f2ffde.Serializer::class)
public sealed class InlineWebhookDiscussionCategoryChangedActionX49f2ffde {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `category_changed`.
   */
  public data object CategoryChanged : InlineWebhookDiscussionCategoryChangedActionX49f2ffde() {
    public override val `value`: String = "category_changed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDiscussionCategoryChangedActionX49f2ffde()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDiscussionCategoryChangedActionX49f2ffde = when (value) {
      CategoryChanged.value -> CategoryChanged
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDiscussionCategoryChangedActionX49f2ffde> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDiscussionCategoryChangedActionX49f2ffde", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionCategoryChangedActionX49f2ffde = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionCategoryChangedActionX49f2ffde) {
      encoder.encodeString(value.value)
    }
  }
}
