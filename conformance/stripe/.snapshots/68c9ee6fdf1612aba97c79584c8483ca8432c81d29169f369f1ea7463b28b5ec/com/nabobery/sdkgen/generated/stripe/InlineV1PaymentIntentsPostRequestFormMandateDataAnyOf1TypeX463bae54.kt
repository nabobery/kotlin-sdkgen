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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/mandate_data/anyOf/0/properties/customer_acceptance/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/mandate_data/anyOf/0/properties/customer_acceptance/properties/type
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1TypeX463bae54.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1TypeX463bae54 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `offline`.
   */
  public data object Offline : InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1TypeX463bae54() {
    public override val `value`: String = "offline"
  }

  /**
   * Documented value. Wire value: `online`.
   */
  public data object Online : InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1TypeX463bae54() {
    public override val `value`: String = "online"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1TypeX463bae54()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1TypeX463bae54 = when (value) {
      Offline.value -> Offline
      Online.value -> Online
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1TypeX463bae54> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1TypeX463bae54", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1TypeX463bae54 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1TypeX463bae54) {
      encoder.encodeString(value.value)
    }
  }
}
