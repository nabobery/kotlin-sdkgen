package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The type of items in the value list. One of `card_fingerprint`, `card_bin`, `crypto_fingerprint`, `email`,
 * `ip_address`, `country`, `string`, `case_sensitive_string`, `customer_id`, `account`, `sepa_debit_fingerprint`, or
 * `us_bank_account_fingerprint`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/radar.value_list/properties/item_type
 */
@Serializable(with = InlineRadarValueListItemTypeX23418d3e.Serializer::class)
public sealed class InlineRadarValueListItemTypeX23418d3e {
  public abstract val `value`: kotlin.String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineRadarValueListItemTypeX23418d3e() {
    public override val `value`: kotlin.String = "account"
  }

  /**
   * Documented value. Wire value: `card_bin`.
   */
  public data object CardBin : InlineRadarValueListItemTypeX23418d3e() {
    public override val `value`: kotlin.String = "card_bin"
  }

  /**
   * Documented value. Wire value: `card_fingerprint`.
   */
  public data object CardFingerprint : InlineRadarValueListItemTypeX23418d3e() {
    public override val `value`: kotlin.String = "card_fingerprint"
  }

  /**
   * Documented value. Wire value: `case_sensitive_string`.
   */
  public data object CaseSensitiveString : InlineRadarValueListItemTypeX23418d3e() {
    public override val `value`: kotlin.String = "case_sensitive_string"
  }

  /**
   * Documented value. Wire value: `country`.
   */
  public data object Country : InlineRadarValueListItemTypeX23418d3e() {
    public override val `value`: kotlin.String = "country"
  }

  /**
   * Documented value. Wire value: `crypto_fingerprint`.
   */
  public data object CryptoFingerprint : InlineRadarValueListItemTypeX23418d3e() {
    public override val `value`: kotlin.String = "crypto_fingerprint"
  }

  /**
   * Documented value. Wire value: `customer_id`.
   */
  public data object CustomerId : InlineRadarValueListItemTypeX23418d3e() {
    public override val `value`: kotlin.String = "customer_id"
  }

  /**
   * Documented value. Wire value: `email`.
   */
  public data object Email : InlineRadarValueListItemTypeX23418d3e() {
    public override val `value`: kotlin.String = "email"
  }

  /**
   * Documented value. Wire value: `ip_address`.
   */
  public data object IpAddress : InlineRadarValueListItemTypeX23418d3e() {
    public override val `value`: kotlin.String = "ip_address"
  }

  /**
   * Documented value. Wire value: `sepa_debit_fingerprint`.
   */
  public data object SepaDebitFingerprint : InlineRadarValueListItemTypeX23418d3e() {
    public override val `value`: kotlin.String = "sepa_debit_fingerprint"
  }

  /**
   * Documented value. Wire value: `string`.
   */
  public data object String : InlineRadarValueListItemTypeX23418d3e() {
    public override val `value`: kotlin.String = "string"
  }

  /**
   * Documented value. Wire value: `us_bank_account_fingerprint`.
   */
  public data object UsBankAccountFingerprint : InlineRadarValueListItemTypeX23418d3e() {
    public override val `value`: kotlin.String = "us_bank_account_fingerprint"
  }

  public data class SdkUnknown(
    public override val `value`: kotlin.String,
  ) : InlineRadarValueListItemTypeX23418d3e()

  public companion object {
    public fun fromValue(`value`: kotlin.String): InlineRadarValueListItemTypeX23418d3e = when (value) {
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

  internal object Serializer : KSerializer<InlineRadarValueListItemTypeX23418d3e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineRadarValueListItemTypeX23418d3e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRadarValueListItemTypeX23418d3e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRadarValueListItemTypeX23418d3e) {
      encoder.encodeString(value.value)
    }
  }
}
