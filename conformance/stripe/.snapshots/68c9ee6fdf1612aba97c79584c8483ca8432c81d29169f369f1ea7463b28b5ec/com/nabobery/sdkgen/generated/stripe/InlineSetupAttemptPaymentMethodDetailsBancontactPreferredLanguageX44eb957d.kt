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
 * Preferred language of the Bancontact authorization page that the customer is redirected to.
 * Can be one of `en`, `de`, `fr`, or `nl`
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_attempt_payment_method_details_bancontact/properties/preferred
 * _language
 */
@Serializable(with = InlineSetupAttemptPaymentMethodDetailsBancontactPreferredLanguageX44eb957d.Serializer::class)
public sealed class InlineSetupAttemptPaymentMethodDetailsBancontactPreferredLanguageX44eb957d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `de`.
   */
  public data object De : InlineSetupAttemptPaymentMethodDetailsBancontactPreferredLanguageX44eb957d() {
    public override val `value`: String = "de"
  }

  /**
   * Documented value. Wire value: `en`.
   */
  public data object En : InlineSetupAttemptPaymentMethodDetailsBancontactPreferredLanguageX44eb957d() {
    public override val `value`: String = "en"
  }

  /**
   * Documented value. Wire value: `fr`.
   */
  public data object Fr : InlineSetupAttemptPaymentMethodDetailsBancontactPreferredLanguageX44eb957d() {
    public override val `value`: String = "fr"
  }

  /**
   * Documented value. Wire value: `nl`.
   */
  public data object Nl : InlineSetupAttemptPaymentMethodDetailsBancontactPreferredLanguageX44eb957d() {
    public override val `value`: String = "nl"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupAttemptPaymentMethodDetailsBancontactPreferredLanguageX44eb957d()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupAttemptPaymentMethodDetailsBancontactPreferredLanguageX44eb957d = when (value) {
      De.value -> De
      En.value -> En
      Fr.value -> Fr
      Nl.value -> Nl
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSetupAttemptPaymentMethodDetailsBancontactPreferredLanguageX44eb957d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSetupAttemptPaymentMethodDetailsBancontactPreferredLanguageX44eb957d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupAttemptPaymentMethodDetailsBancontactPreferredLanguageX44eb957d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupAttemptPaymentMethodDetailsBancontactPreferredLanguageX44eb957d) {
      encoder.encodeString(value.value)
    }
  }
}
