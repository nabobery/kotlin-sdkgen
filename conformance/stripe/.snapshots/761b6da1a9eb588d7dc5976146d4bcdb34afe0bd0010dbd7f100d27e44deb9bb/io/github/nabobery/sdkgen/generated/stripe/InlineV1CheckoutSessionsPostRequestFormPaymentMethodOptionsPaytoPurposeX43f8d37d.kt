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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/purpose.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/purpose
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `dependant_support`.
   */
  public data object DependantSupport : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d() {
    public override val `value`: String = "dependant_support"
  }

  /**
   * Documented value. Wire value: `government`.
   */
  public data object Government : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d() {
    public override val `value`: String = "government"
  }

  /**
   * Documented value. Wire value: `loan`.
   */
  public data object Loan : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d() {
    public override val `value`: String = "loan"
  }

  /**
   * Documented value. Wire value: `mortgage`.
   */
  public data object Mortgage : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d() {
    public override val `value`: String = "mortgage"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `pension`.
   */
  public data object Pension : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d() {
    public override val `value`: String = "pension"
  }

  /**
   * Documented value. Wire value: `personal`.
   */
  public data object Personal : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d() {
    public override val `value`: String = "personal"
  }

  /**
   * Documented value. Wire value: `retail`.
   */
  public data object Retail : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d() {
    public override val `value`: String = "retail"
  }

  /**
   * Documented value. Wire value: `salary`.
   */
  public data object Salary : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d() {
    public override val `value`: String = "salary"
  }

  /**
   * Documented value. Wire value: `tax`.
   */
  public data object Tax : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d() {
    public override val `value`: String = "tax"
  }

  /**
   * Documented value. Wire value: `utility`.
   */
  public data object Utility : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d() {
    public override val `value`: String = "utility"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d = when (value) {
      Value.value -> Value
      DependantSupport.value -> DependantSupport
      Government.value -> Government
      Loan.value -> Loan
      Mortgage.value -> Mortgage
      Other.value -> Other
      Pension.value -> Pension
      Personal.value -> Personal
      Retail.value -> Retail
      Salary.value -> Salary
      Tax.value -> Tax
      Utility.value -> Utility
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoPurposeX43f8d37d) {
      encoder.encodeString(value.value)
    }
  }
}
