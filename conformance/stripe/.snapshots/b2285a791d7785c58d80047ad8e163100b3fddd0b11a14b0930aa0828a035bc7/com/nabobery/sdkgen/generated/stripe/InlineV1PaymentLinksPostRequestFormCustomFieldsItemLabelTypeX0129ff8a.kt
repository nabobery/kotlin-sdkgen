package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_fields/items/properties/label/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_fields/items/properties/label/properties/type
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelTypeX0129ff8a.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelTypeX0129ff8a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelTypeX0129ff8a() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelTypeX0129ff8a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelTypeX0129ff8a = when (value) {
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelTypeX0129ff8a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelTypeX0129ff8a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelTypeX0129ff8a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelTypeX0129ff8a) {
      encoder.encodeString(value.value)
    }
  }
}
