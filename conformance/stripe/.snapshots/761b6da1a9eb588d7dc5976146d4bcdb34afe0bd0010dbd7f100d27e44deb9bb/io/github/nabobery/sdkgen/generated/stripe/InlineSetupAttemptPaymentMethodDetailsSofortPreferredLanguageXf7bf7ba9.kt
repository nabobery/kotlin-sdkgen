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
 * Preferred language of the Sofort authorization page that the customer is redirected to.
 * Can be one of `en`, `de`, `fr`, or `nl`
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_attempt_payment_method_details_sofort/properties/preferred_lan
 * guage
 */
@Serializable(with = InlineSetupAttemptPaymentMethodDetailsSofortPreferredLanguageXf7bf7ba9.Serializer::class)
public sealed class InlineSetupAttemptPaymentMethodDetailsSofortPreferredLanguageXf7bf7ba9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `de`.
   */
  public data object De : InlineSetupAttemptPaymentMethodDetailsSofortPreferredLanguageXf7bf7ba9() {
    public override val `value`: String = "de"
  }

  /**
   * Documented value. Wire value: `en`.
   */
  public data object En : InlineSetupAttemptPaymentMethodDetailsSofortPreferredLanguageXf7bf7ba9() {
    public override val `value`: String = "en"
  }

  /**
   * Documented value. Wire value: `fr`.
   */
  public data object Fr : InlineSetupAttemptPaymentMethodDetailsSofortPreferredLanguageXf7bf7ba9() {
    public override val `value`: String = "fr"
  }

  /**
   * Documented value. Wire value: `nl`.
   */
  public data object Nl : InlineSetupAttemptPaymentMethodDetailsSofortPreferredLanguageXf7bf7ba9() {
    public override val `value`: String = "nl"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupAttemptPaymentMethodDetailsSofortPreferredLanguageXf7bf7ba9()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupAttemptPaymentMethodDetailsSofortPreferredLanguageXf7bf7ba9 = when (value) {
      De.value -> De
      En.value -> En
      Fr.value -> Fr
      Nl.value -> Nl
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSetupAttemptPaymentMethodDetailsSofortPreferredLanguageXf7bf7ba9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSetupAttemptPaymentMethodDetailsSofortPreferredLanguageXf7bf7ba9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupAttemptPaymentMethodDetailsSofortPreferredLanguageXf7bf7ba9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupAttemptPaymentMethodDetailsSofortPreferredLanguageXf7bf7ba9) {
      encoder.encodeString(value.value)
    }
  }
}
