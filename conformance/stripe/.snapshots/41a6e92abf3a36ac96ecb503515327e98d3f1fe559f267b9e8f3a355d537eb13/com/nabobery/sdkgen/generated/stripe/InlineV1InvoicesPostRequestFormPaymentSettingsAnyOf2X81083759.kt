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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/installm
 * ents/properties/plan/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/installm
 * ents/properties/plan/anyOf/1
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X81083759) {
      encoder.encodeString(value.value)
    }
  }
}
