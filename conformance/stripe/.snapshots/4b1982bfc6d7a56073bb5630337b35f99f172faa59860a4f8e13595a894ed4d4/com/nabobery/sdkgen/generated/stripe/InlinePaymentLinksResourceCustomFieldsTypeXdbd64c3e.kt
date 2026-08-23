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
 * The type of the field.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_custom_fields/properties/type
 */
@Serializable(with = InlinePaymentLinksResourceCustomFieldsTypeXdbd64c3e.Serializer::class)
public sealed class InlinePaymentLinksResourceCustomFieldsTypeXdbd64c3e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `dropdown`.
   */
  public data object Dropdown : InlinePaymentLinksResourceCustomFieldsTypeXdbd64c3e() {
    public override val `value`: String = "dropdown"
  }

  /**
   * Documented value. Wire value: `numeric`.
   */
  public data object Numeric : InlinePaymentLinksResourceCustomFieldsTypeXdbd64c3e() {
    public override val `value`: String = "numeric"
  }

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlinePaymentLinksResourceCustomFieldsTypeXdbd64c3e() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentLinksResourceCustomFieldsTypeXdbd64c3e()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentLinksResourceCustomFieldsTypeXdbd64c3e = when (value) {
      Dropdown.value -> Dropdown
      Numeric.value -> Numeric
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinksResourceCustomFieldsTypeXdbd64c3e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentLinksResourceCustomFieldsTypeXdbd64c3e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceCustomFieldsTypeXdbd64c3e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinksResourceCustomFieldsTypeXdbd64c3e) {
      encoder.encodeString(value.value)
    }
  }
}
