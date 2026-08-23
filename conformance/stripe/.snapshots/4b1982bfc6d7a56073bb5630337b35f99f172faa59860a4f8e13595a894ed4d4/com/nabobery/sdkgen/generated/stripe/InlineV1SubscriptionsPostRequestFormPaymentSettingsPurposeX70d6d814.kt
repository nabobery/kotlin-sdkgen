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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_optio
 * ns/properties/purpose.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_optio
 * ns/properties/purpose
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `dependant_support`.
   */
  public data object DependantSupport : InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814() {
    public override val `value`: String = "dependant_support"
  }

  /**
   * Documented value. Wire value: `government`.
   */
  public data object Government : InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814() {
    public override val `value`: String = "government"
  }

  /**
   * Documented value. Wire value: `loan`.
   */
  public data object Loan : InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814() {
    public override val `value`: String = "loan"
  }

  /**
   * Documented value. Wire value: `mortgage`.
   */
  public data object Mortgage : InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814() {
    public override val `value`: String = "mortgage"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `pension`.
   */
  public data object Pension : InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814() {
    public override val `value`: String = "pension"
  }

  /**
   * Documented value. Wire value: `personal`.
   */
  public data object Personal : InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814() {
    public override val `value`: String = "personal"
  }

  /**
   * Documented value. Wire value: `retail`.
   */
  public data object Retail : InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814() {
    public override val `value`: String = "retail"
  }

  /**
   * Documented value. Wire value: `salary`.
   */
  public data object Salary : InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814() {
    public override val `value`: String = "salary"
  }

  /**
   * Documented value. Wire value: `tax`.
   */
  public data object Tax : InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814() {
    public override val `value`: String = "tax"
  }

  /**
   * Documented value. Wire value: `utility`.
   */
  public data object Utility : InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814() {
    public override val `value`: String = "utility"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814 = when (value) {
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

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsPurposeX70d6d814) {
      encoder.encodeString(value.value)
    }
  }
}
