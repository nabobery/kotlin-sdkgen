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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/fpx/properties/bank.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/fpx/properties/bank
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `affin_bank`.
   */
  public data object AffinBank : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "affin_bank"
  }

  /**
   * Documented value. Wire value: `agrobank`.
   */
  public data object Agrobank : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "agrobank"
  }

  /**
   * Documented value. Wire value: `alliance_bank`.
   */
  public data object AllianceBank : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "alliance_bank"
  }

  /**
   * Documented value. Wire value: `ambank`.
   */
  public data object Ambank : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "ambank"
  }

  /**
   * Documented value. Wire value: `bank_islam`.
   */
  public data object BankIslam : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "bank_islam"
  }

  /**
   * Documented value. Wire value: `bank_muamalat`.
   */
  public data object BankMuamalat : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "bank_muamalat"
  }

  /**
   * Documented value. Wire value: `bank_of_china`.
   */
  public data object BankOfChina : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "bank_of_china"
  }

  /**
   * Documented value. Wire value: `bank_rakyat`.
   */
  public data object BankRakyat : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "bank_rakyat"
  }

  /**
   * Documented value. Wire value: `bsn`.
   */
  public data object Bsn : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "bsn"
  }

  /**
   * Documented value. Wire value: `cimb`.
   */
  public data object Cimb : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "cimb"
  }

  /**
   * Documented value. Wire value: `deutsche_bank`.
   */
  public data object DeutscheBank : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "deutsche_bank"
  }

  /**
   * Documented value. Wire value: `hong_leong_bank`.
   */
  public data object HongLeongBank : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "hong_leong_bank"
  }

  /**
   * Documented value. Wire value: `hsbc`.
   */
  public data object Hsbc : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "hsbc"
  }

  /**
   * Documented value. Wire value: `kfh`.
   */
  public data object Kfh : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "kfh"
  }

  /**
   * Documented value. Wire value: `maybank2e`.
   */
  public data object Maybank2e : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "maybank2e"
  }

  /**
   * Documented value. Wire value: `maybank2u`.
   */
  public data object Maybank2u : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "maybank2u"
  }

  /**
   * Documented value. Wire value: `ocbc`.
   */
  public data object Ocbc : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "ocbc"
  }

  /**
   * Documented value. Wire value: `pb_enterprise`.
   */
  public data object PbEnterprise : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "pb_enterprise"
  }

  /**
   * Documented value. Wire value: `public_bank`.
   */
  public data object PublicBank : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "public_bank"
  }

  /**
   * Documented value. Wire value: `rhb`.
   */
  public data object Rhb : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "rhb"
  }

  /**
   * Documented value. Wire value: `standard_chartered`.
   */
  public data object StandardChartered : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "standard_chartered"
  }

  /**
   * Documented value. Wire value: `uob`.
   */
  public data object Uob : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d() {
    public override val `value`: String = "uob"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d = when (value) {
      AffinBank.value -> AffinBank
      Agrobank.value -> Agrobank
      AllianceBank.value -> AllianceBank
      Ambank.value -> Ambank
      BankIslam.value -> BankIslam
      BankMuamalat.value -> BankMuamalat
      BankOfChina.value -> BankOfChina
      BankRakyat.value -> BankRakyat
      Bsn.value -> Bsn
      Cimb.value -> Cimb
      DeutscheBank.value -> DeutscheBank
      HongLeongBank.value -> HongLeongBank
      Hsbc.value -> Hsbc
      Kfh.value -> Kfh
      Maybank2e.value -> Maybank2e
      Maybank2u.value -> Maybank2u
      Ocbc.value -> Ocbc
      PbEnterprise.value -> PbEnterprise
      PublicBank.value -> PublicBank
      Rhb.value -> Rhb
      StandardChartered.value -> StandardChartered
      Uob.value -> Uob
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataFpxBankX3916504d) {
      encoder.encodeString(value.value)
    }
  }
}
