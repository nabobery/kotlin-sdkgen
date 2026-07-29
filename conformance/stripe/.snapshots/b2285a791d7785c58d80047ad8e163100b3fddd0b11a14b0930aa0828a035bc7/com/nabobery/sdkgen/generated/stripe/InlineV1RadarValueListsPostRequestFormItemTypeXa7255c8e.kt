package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Type of the items in the value list. One of `card_fingerprint`, `card_bin`, `crypto_fingerprint`, `email`,
 * `ip_address`, `country`, `string`, `case_sensitive_string`, `customer_id`, `account`, `sepa_debit_fingerprint`, or
 * `us_bank_account_fingerprint`. Use `string` if the item type is unknown or mixed.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1value_lists/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/item_type
 */
@Serializable(with = InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e.Serializer::class)
public sealed class InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e {
  public abstract val `value`: kotlin.String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e() {
    public override val `value`: kotlin.String = "account"
  }

  /**
   * Documented value. Wire value: `card_bin`.
   */
  public data object CardBin : InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e() {
    public override val `value`: kotlin.String = "card_bin"
  }

  /**
   * Documented value. Wire value: `card_fingerprint`.
   */
  public data object CardFingerprint : InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e() {
    public override val `value`: kotlin.String = "card_fingerprint"
  }

  /**
   * Documented value. Wire value: `case_sensitive_string`.
   */
  public data object CaseSensitiveString : InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e() {
    public override val `value`: kotlin.String = "case_sensitive_string"
  }

  /**
   * Documented value. Wire value: `country`.
   */
  public data object Country : InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e() {
    public override val `value`: kotlin.String = "country"
  }

  /**
   * Documented value. Wire value: `crypto_fingerprint`.
   */
  public data object CryptoFingerprint : InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e() {
    public override val `value`: kotlin.String = "crypto_fingerprint"
  }

  /**
   * Documented value. Wire value: `customer_id`.
   */
  public data object CustomerId : InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e() {
    public override val `value`: kotlin.String = "customer_id"
  }

  /**
   * Documented value. Wire value: `email`.
   */
  public data object Email : InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e() {
    public override val `value`: kotlin.String = "email"
  }

  /**
   * Documented value. Wire value: `ip_address`.
   */
  public data object IpAddress : InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e() {
    public override val `value`: kotlin.String = "ip_address"
  }

  /**
   * Documented value. Wire value: `sepa_debit_fingerprint`.
   */
  public data object SepaDebitFingerprint : InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e() {
    public override val `value`: kotlin.String = "sepa_debit_fingerprint"
  }

  /**
   * Documented value. Wire value: `string`.
   */
  public data object String : InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e() {
    public override val `value`: kotlin.String = "string"
  }

  /**
   * Documented value. Wire value: `us_bank_account_fingerprint`.
   */
  public data object UsBankAccountFingerprint : InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e() {
    public override val `value`: kotlin.String = "us_bank_account_fingerprint"
  }

  public data class SdkUnknown(
    public override val `value`: kotlin.String,
  ) : InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e()

  public companion object {
    public fun fromValue(`value`: kotlin.String): InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e = when (value) {
      Account.value -> Account
      CardBin.value -> CardBin
      CardFingerprint.value -> CardFingerprint
      CaseSensitiveString.value -> CaseSensitiveString
      Country.value -> Country
      CryptoFingerprint.value -> CryptoFingerprint
      CustomerId.value -> CustomerId
      Email.value -> Email
      IpAddress.value -> IpAddress
      SepaDebitFingerprint.value -> SepaDebitFingerprint
      String.value -> String
      UsBankAccountFingerprint.value -> UsBankAccountFingerprint
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e) {
      encoder.encodeString(value.value)
    }
  }
}
