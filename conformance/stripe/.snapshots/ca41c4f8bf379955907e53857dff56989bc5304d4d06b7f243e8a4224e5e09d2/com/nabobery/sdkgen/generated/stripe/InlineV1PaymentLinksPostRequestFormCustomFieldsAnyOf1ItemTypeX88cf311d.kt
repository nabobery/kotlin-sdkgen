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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_fields/anyOf/0/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_fields/anyOf/0/items/properties/type
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemTypeX88cf311d.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemTypeX88cf311d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `dropdown`.
   */
  public data object Dropdown : InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemTypeX88cf311d() {
    public override val `value`: String = "dropdown"
  }

  /**
   * Documented value. Wire value: `numeric`.
   */
  public data object Numeric : InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemTypeX88cf311d() {
    public override val `value`: String = "numeric"
  }

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemTypeX88cf311d() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemTypeX88cf311d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemTypeX88cf311d = when (value) {
      Dropdown.value -> Dropdown
      Numeric.value -> Numeric
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemTypeX88cf311d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemTypeX88cf311d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemTypeX88cf311d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemTypeX88cf311d) {
      encoder.encodeString(value.value)
    }
  }
}
