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
 * The type of dispute opened. Different case types may have varying fees and financial impact.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_payment_method_details_card/properties/case_type
 */
@Serializable(with = InlineDisputePaymentMethodDetailsCardCaseTypeX14cff061.Serializer::class)
public sealed class InlineDisputePaymentMethodDetailsCardCaseTypeX14cff061 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `block`.
   */
  public data object Block : InlineDisputePaymentMethodDetailsCardCaseTypeX14cff061() {
    public override val `value`: String = "block"
  }

  /**
   * Documented value. Wire value: `chargeback`.
   */
  public data object Chargeback : InlineDisputePaymentMethodDetailsCardCaseTypeX14cff061() {
    public override val `value`: String = "chargeback"
  }

  /**
   * Documented value. Wire value: `compliance`.
   */
  public data object Compliance : InlineDisputePaymentMethodDetailsCardCaseTypeX14cff061() {
    public override val `value`: String = "compliance"
  }

  /**
   * Documented value. Wire value: `inquiry`.
   */
  public data object Inquiry : InlineDisputePaymentMethodDetailsCardCaseTypeX14cff061() {
    public override val `value`: String = "inquiry"
  }

  /**
   * Documented value. Wire value: `resolution`.
   */
  public data object Resolution : InlineDisputePaymentMethodDetailsCardCaseTypeX14cff061() {
    public override val `value`: String = "resolution"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDisputePaymentMethodDetailsCardCaseTypeX14cff061()

  public companion object {
    public fun fromValue(`value`: String): InlineDisputePaymentMethodDetailsCardCaseTypeX14cff061 = when (value) {
      Block.value -> Block
      Chargeback.value -> Chargeback
      Compliance.value -> Compliance
      Inquiry.value -> Inquiry
      Resolution.value -> Resolution
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineDisputePaymentMethodDetailsCardCaseTypeX14cff061> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineDisputePaymentMethodDetailsCardCaseTypeX14cff061", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDisputePaymentMethodDetailsCardCaseTypeX14cff061 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDisputePaymentMethodDetailsCardCaseTypeX14cff061) {
      encoder.encodeString(value.value)
    }
  }
}
