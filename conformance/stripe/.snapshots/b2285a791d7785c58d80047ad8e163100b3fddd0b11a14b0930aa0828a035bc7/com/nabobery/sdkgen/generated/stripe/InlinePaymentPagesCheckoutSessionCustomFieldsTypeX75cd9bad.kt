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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_custom_fields/properties/type
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionCustomFieldsTypeX75cd9bad.Serializer::class)
public sealed class InlinePaymentPagesCheckoutSessionCustomFieldsTypeX75cd9bad {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `dropdown`.
   */
  public data object Dropdown : InlinePaymentPagesCheckoutSessionCustomFieldsTypeX75cd9bad() {
    public override val `value`: String = "dropdown"
  }

  /**
   * Documented value. Wire value: `numeric`.
   */
  public data object Numeric : InlinePaymentPagesCheckoutSessionCustomFieldsTypeX75cd9bad() {
    public override val `value`: String = "numeric"
  }

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlinePaymentPagesCheckoutSessionCustomFieldsTypeX75cd9bad() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentPagesCheckoutSessionCustomFieldsTypeX75cd9bad()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentPagesCheckoutSessionCustomFieldsTypeX75cd9bad = when (value) {
      Dropdown.value -> Dropdown
      Numeric.value -> Numeric
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionCustomFieldsTypeX75cd9bad> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentPagesCheckoutSessionCustomFieldsTypeX75cd9bad", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionCustomFieldsTypeX75cd9bad = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionCustomFieldsTypeX75cd9bad) {
      encoder.encodeString(value.value)
    }
  }
}
