package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/footer/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/footer/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormInvoiceSettingsFooterAnyOf2Xcfec1a81) {
      encoder.encodeString(value.value)
    }
  }
}
