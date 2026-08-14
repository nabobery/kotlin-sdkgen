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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt/post/requestBody/content/appl
 * ication~1x-www-form-urlencoded/schema/properties/payment_method_details/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt/post/requestBody/content/appl
 * ication~1x-www-form-urlencoded/schema/properties/payment_method_details/properties/type
 */
@Serializable(with = InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsTypeX7ad2bf3a.Serializer::class)
public sealed class InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsTypeX7ad2bf3a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsTypeX7ad2bf3a() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsTypeX7ad2bf3a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsTypeX7ad2bf3a = when (value) {
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsTypeX7ad2bf3a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsTypeX7ad2bf3a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsTypeX7ad2bf3a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsRepob3f9PostRequestFormPaymentMethodDetailsTypeX7ad2bf3a) {
      encoder.encodeString(value.value)
    }
  }
}
