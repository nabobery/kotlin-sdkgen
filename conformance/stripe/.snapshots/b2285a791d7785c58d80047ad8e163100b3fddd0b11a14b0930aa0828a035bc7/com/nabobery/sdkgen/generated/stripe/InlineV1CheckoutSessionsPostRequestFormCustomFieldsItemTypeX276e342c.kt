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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_fields/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_fields/items/properties/type
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemTypeX276e342c.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemTypeX276e342c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `dropdown`.
   */
  public data object Dropdown : InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemTypeX276e342c() {
    public override val `value`: String = "dropdown"
  }

  /**
   * Documented value. Wire value: `numeric`.
   */
  public data object Numeric : InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemTypeX276e342c() {
    public override val `value`: String = "numeric"
  }

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemTypeX276e342c() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemTypeX276e342c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemTypeX276e342c = when (value) {
      Dropdown.value -> Dropdown
      Numeric.value -> Numeric
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemTypeX276e342c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemTypeX276e342c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemTypeX276e342c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemTypeX276e342c) {
      encoder.encodeString(value.value)
    }
  }
}
