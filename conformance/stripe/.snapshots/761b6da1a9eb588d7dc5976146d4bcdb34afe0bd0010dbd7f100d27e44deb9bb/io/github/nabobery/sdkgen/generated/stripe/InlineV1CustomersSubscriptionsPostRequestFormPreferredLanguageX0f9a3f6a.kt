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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/bancontact/anyOf/0/properties/preferred_language.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/bancontact/anyOf/0/properties/preferred_language
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPreferredLanguageX0f9a3f6a.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormPreferredLanguageX0f9a3f6a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `de`.
   */
  public data object De : InlineV1CustomersSubscriptionsPostRequestFormPreferredLanguageX0f9a3f6a() {
    public override val `value`: String = "de"
  }

  /**
   * Documented value. Wire value: `en`.
   */
  public data object En : InlineV1CustomersSubscriptionsPostRequestFormPreferredLanguageX0f9a3f6a() {
    public override val `value`: String = "en"
  }

  /**
   * Documented value. Wire value: `fr`.
   */
  public data object Fr : InlineV1CustomersSubscriptionsPostRequestFormPreferredLanguageX0f9a3f6a() {
    public override val `value`: String = "fr"
  }

  /**
   * Documented value. Wire value: `nl`.
   */
  public data object Nl : InlineV1CustomersSubscriptionsPostRequestFormPreferredLanguageX0f9a3f6a() {
    public override val `value`: String = "nl"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersSubscriptionsPostRequestFormPreferredLanguageX0f9a3f6a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersSubscriptionsPostRequestFormPreferredLanguageX0f9a3f6a = when (value) {
      De.value -> De
      En.value -> En
      Fr.value -> Fr
      Nl.value -> Nl
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPreferredLanguageX0f9a3f6a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormPreferredLanguageX0f9a3f6a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPreferredLanguageX0f9a3f6a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPreferredLanguageX0f9a3f6a) {
      encoder.encodeString(value.value)
    }
  }
}
