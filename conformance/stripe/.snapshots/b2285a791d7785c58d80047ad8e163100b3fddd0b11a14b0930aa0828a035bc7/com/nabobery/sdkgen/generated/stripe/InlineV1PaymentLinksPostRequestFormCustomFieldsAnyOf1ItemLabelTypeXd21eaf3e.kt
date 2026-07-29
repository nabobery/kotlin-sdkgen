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
 * orm-urlencoded/schema/properties/custom_fields/anyOf/0/items/properties/label/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_fields/anyOf/0/items/properties/label/properties/type
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemLabelTypeXd21eaf3e.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemLabelTypeXd21eaf3e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemLabelTypeXd21eaf3e() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemLabelTypeXd21eaf3e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemLabelTypeXd21eaf3e = when (value) {
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemLabelTypeXd21eaf3e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemLabelTypeXd21eaf3e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemLabelTypeXd21eaf3e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemLabelTypeXd21eaf3e) {
      encoder.encodeString(value.value)
    }
  }
}
