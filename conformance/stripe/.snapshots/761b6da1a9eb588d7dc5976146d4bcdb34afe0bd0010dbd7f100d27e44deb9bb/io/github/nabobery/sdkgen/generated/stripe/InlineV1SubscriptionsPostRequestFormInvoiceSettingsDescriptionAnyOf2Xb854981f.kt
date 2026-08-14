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
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/description/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/invoice_settings/properties/description/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormInvoiceSettingsDescriptionAnyOf2Xb854981f) {
      encoder.encodeString(value.value)
    }
  }
}
