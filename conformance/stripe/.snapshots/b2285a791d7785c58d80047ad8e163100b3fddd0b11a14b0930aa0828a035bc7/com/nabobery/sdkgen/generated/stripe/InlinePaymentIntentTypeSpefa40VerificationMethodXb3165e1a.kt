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
 * Bank account verification method. The default value is `automatic`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_type_specific_payment_method_options_client/propertie
 * s/verification_method
 */
@Serializable(with = InlinePaymentIntentTypeSpefa40VerificationMethodXb3165e1a.Serializer::class)
public sealed class InlinePaymentIntentTypeSpefa40VerificationMethodXb3165e1a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlinePaymentIntentTypeSpefa40VerificationMethodXb3165e1a() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `instant`.
   */
  public data object Instant : InlinePaymentIntentTypeSpefa40VerificationMethodXb3165e1a() {
    public override val `value`: String = "instant"
  }

  /**
   * Documented value. Wire value: `microdeposits`.
   */
  public data object Microdeposits : InlinePaymentIntentTypeSpefa40VerificationMethodXb3165e1a() {
    public override val `value`: String = "microdeposits"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentIntentTypeSpefa40VerificationMethodXb3165e1a()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentIntentTypeSpefa40VerificationMethodXb3165e1a = when (value) {
      Automatic.value -> Automatic
      Instant.value -> Instant
      Microdeposits.value -> Microdeposits
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentIntentTypeSpefa40VerificationMethodXb3165e1a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentIntentTypeSpefa40VerificationMethodXb3165e1a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentIntentTypeSpefa40VerificationMethodXb3165e1a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentTypeSpefa40VerificationMethodXb3165e1a) {
      encoder.encodeString(value.value)
    }
  }
}
