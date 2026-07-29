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
 * The type of the label.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_custom_fields_label/properties/type
 */
@Serializable(with = InlinePaymentLinksResourceCustomFieldsLabelTypeXec245100.Serializer::class)
public sealed class InlinePaymentLinksResourceCustomFieldsLabelTypeXec245100 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlinePaymentLinksResourceCustomFieldsLabelTypeXec245100() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentLinksResourceCustomFieldsLabelTypeXec245100()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentLinksResourceCustomFieldsLabelTypeXec245100 = when (value) {
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentLinksResourceCustomFieldsLabelTypeXec245100> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentLinksResourceCustomFieldsLabelTypeXec245100", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceCustomFieldsLabelTypeXec245100 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinksResourceCustomFieldsLabelTypeXec245100) {
      encoder.encodeString(value.value)
    }
  }
}
