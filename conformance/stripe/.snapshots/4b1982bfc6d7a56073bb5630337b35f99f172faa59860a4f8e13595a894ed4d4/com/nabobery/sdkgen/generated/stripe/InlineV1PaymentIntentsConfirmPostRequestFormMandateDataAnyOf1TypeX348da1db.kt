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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/mandate_data/anyOf/0/properties/customer_acceptance/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/mandate_data/anyOf/0/properties/customer_acceptance/properties/type
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1TypeX348da1db.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1TypeX348da1db {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `offline`.
   */
  public data object Offline : InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1TypeX348da1db() {
    public override val `value`: String = "offline"
  }

  /**
   * Documented value. Wire value: `online`.
   */
  public data object Online : InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1TypeX348da1db() {
    public override val `value`: String = "online"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1TypeX348da1db()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1TypeX348da1db = when (value) {
      Offline.value -> Offline
      Online.value -> Online
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1TypeX348da1db> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1TypeX348da1db", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1TypeX348da1db = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1TypeX348da1db) {
      encoder.encodeString(value.value)
    }
  }
}
